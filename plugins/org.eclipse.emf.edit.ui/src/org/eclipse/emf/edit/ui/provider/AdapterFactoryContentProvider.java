/**
 * <copyright> 
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AdapterFactoryContentProvider.java,v 1.3 2004/04/05 18:35:05 davidms Exp $
 */
package org.eclipse.emf.edit.ui.provider;


import java.util.Collections;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.swt.widgets.Display;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.IViewerNotification;


/**
 * This content provider wraps an AdapterFactory 
 * and it delegates its JFace provider interfaces to corresponding adapter-implemented item provider interfaces.
 * All method calls to the various structured content provider interfaces 
 * are delegated to interfaces implemented by the adapters generated by the AdapterFactory.
 * {@link org.eclipse.jface.viewers.IStructuredContentProvider} is delegated to 
 * {@link IStructuredItemContentProvider}; {@link ITreeContentProvider} is delegated 
 * to {@link ITreeItemContentProvider};
 * and {@link IPropertySourceProvider} to {@link IItemPropertySource}.
 */
public class AdapterFactoryContentProvider 
  implements 
    ITreeContentProvider, 
    IPropertySourceProvider,
    INotifyChangedListener
{
  /**
   * This keeps track of the one factory we are using.  
   * Use a {@link org.eclipse.emf.edit.provider.ComposedAdapterFactory} if adapters 
   * from more the one factory are involved in the model.
   */
  protected AdapterFactory adapterFactory;

  /**
   * This keeps track of the one viewer using this content provider.
   */
  protected Viewer viewer;

  private static final Class IStructuredItemContentProviderClass = IStructuredItemContentProvider.class;
  private static final Class ITreeItemContentProviderClass = ITreeItemContentProvider.class;
  private static final Class IItemPropertySourceClass = IItemPropertySource.class;

  /**
   * This constructs an instance that wraps this factory.
   * The factory should yield adapters that implement the various IItemContentProvider interfaces.
   */
  public AdapterFactoryContentProvider(AdapterFactory adapterFactory)
  {
    this.adapterFactory = adapterFactory;

    if (adapterFactory instanceof IChangeNotifier)
    {
      ((IChangeNotifier)adapterFactory).addListener(this);
    }
  }

  /**
   * This sets the wrapped factory.
   */
  public void setAdapterFactory(AdapterFactory adapterFactory)
  {
    if (this.adapterFactory instanceof IChangeNotifier)
    {
      ((IChangeNotifier)this.adapterFactory).removeListener(this);
    }

    if (adapterFactory instanceof IChangeNotifier)
    {
      ((IChangeNotifier)adapterFactory).addListener(this);
    }

    this.adapterFactory = adapterFactory;
  }

  /**
   * This returns the wrapped factory.
   */
  public AdapterFactory getAdapterFactory()
  {
    return adapterFactory;
  }

  /**
   * The given Viewer will start (oldInput == null) or stop (newInput == null) listening for domain events.
   */
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
  {
    // If there was no old input, then we must be providing content for this part for the first time...
    //
    this.viewer = viewer;
  }

  /**
   * This implements {@link org.eclipse.jface.viewers.IStructuredContentProvider}.getElements to 
   * forward the call to an object that implements 
   * (@link org.eclipse.emf.edit.provider.IStructuredItemContentProvider#getElements IStructuredItemContentProvider.getElements}.
   */
  public Object [] getElements(Object object)
  {
    // Get the adapter from the factory.
    //
    IStructuredItemContentProvider structuredItemContentProvider = 
      (IStructuredItemContentProvider)adapterFactory.adapt(object, IStructuredItemContentProviderClass);

    // Either delegate the call or return nothing.
    //
    return 
      (structuredItemContentProvider != null ? 
        structuredItemContentProvider.getElements(object) : 
        Collections.EMPTY_LIST).toArray();
  }

  /**
   * This implements {@link ITreeContentProvider}.getChildren to forward the call to an object that implements 
   * {@link org.eclipse.emf.edit.provider.ITreeItemContentProvider#getChildren ITreeItemContentProvider.getChildren}.
   */
  public Object [] getChildren(Object object)
  {
    // Get the adapter from the factory.
    //
    ITreeItemContentProvider treeItemContentProvider = 
      (ITreeItemContentProvider)adapterFactory.adapt(object, ITreeItemContentProviderClass);

    // Either delegate the call or return nothing.
    //
    return
      (treeItemContentProvider != null ?
        treeItemContentProvider.getChildren(object) :
        Collections.EMPTY_LIST).toArray();
  }

  /**
   * This implements {@link ITreeContentProvider}.hasChildren to forward the call to an object that implements 
   * {@link org.eclipse.emf.edit.provider.ITreeItemContentProvider#hasChildren ITreeItemContentProvider.hasChildren}.
   */
  public boolean hasChildren(Object object)
  {
    // Get the adapter from the factory.
    //
    ITreeItemContentProvider treeItemContentProvider = 
      (ITreeItemContentProvider)adapterFactory.adapt(object, ITreeItemContentProviderClass);

    // Either delegate the call or return nothing.
    //
    return 
      treeItemContentProvider != null  && 
        treeItemContentProvider.hasChildren(object);
  }

  /**
   * This implements {@link ITreeContentProvider}.getParent to forward the call to an object that implements 
   * {@link org.eclipse.emf.edit.provider.ITreeItemContentProvider#getParent ITreeItemContentProvider.getParent}.
   */
  public Object getParent(Object object)
  {
    // Get the adapter from the factory.
    //
    ITreeItemContentProvider treeItemContentProvider = 
      (ITreeItemContentProvider)adapterFactory.adapt(object, ITreeItemContentProviderClass);

    // Either delegate the call or return nothing.
    //
    return 
      treeItemContentProvider != null ?
        treeItemContentProvider.getParent(object) :
        null;
  }

  /**
   * This discards the content provider and removes this as a listener to the {@link #adapterFactory}.
   */
  public void dispose()
  {
    if (adapterFactory instanceof IChangeNotifier)
    {
      ((IChangeNotifier)adapterFactory).removeListener(this);
    }
    viewer = null;
  }

  /**
   * This implements {@link IPropertySourceProvider}.getPropertySource to forward the call to an object that implements
   * {@link org.eclipse.emf.edit.provider.IItemPropertySource}.
   */
  public IPropertySource getPropertySource(Object object)
  {
    if (object instanceof IPropertySource)
    {
      return (IPropertySource)object;
    }
    else
    {
      IItemPropertySource itemPropertySource =
        (IItemPropertySource)
          (object instanceof EObject && ((EObject)object).eClass() == null ?
            null :
            adapterFactory.adapt(object, IItemPropertySourceClass));
  
      return 
        itemPropertySource != null ?  createPropertySource(object, itemPropertySource) : null;
    }
  }

  protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource)
  {
    return new PropertySource(object, itemPropertySource);
  }

  public void notifyChanged(Notification notification)
  {
    if (viewer != null && viewer.getControl() != null && !viewer.getControl().isDisposed())
    {
      // If the notification is an IViewerNotification, it specifies how ViewerRefresh should behave.  Otherwise fall
      // back to NotifyChangedToViewerRefresh, which determines how to refresh the viewer directly from the model
      // notification.
      //
      if (notification instanceof IViewerNotification)
      {
        ViewerRefresh viewerRefresh = new ViewerRefresh(viewer, (IViewerNotification)notification);

        Display d = viewer.getControl().getDisplay();
        if (d != Display.getCurrent())
        {
          d.asyncExec(viewerRefresh);
        }
        else
        {
          viewerRefresh.run();
        }
      }
      else
      {
        NotifyChangedToViewerRefresh.handleNotifyChanged(
          viewer,
          notification.getNotifier(),
          notification.getEventType(),
          notification.getFeature(),
          notification.getOldValue(),
          notification.getNewValue(),
          notification.getPosition());
      }
    }
  }

  /**
   * A runnable class that efficiently updates a {@link org.eclipse.jface.viewers.Viewer} via standard APIs, based on
   * an {@link org.eclipse.emf.edit.provider.IViewerNotification} from the model's item providers.
   */
  public static class ViewerRefresh implements Runnable
  {
    Viewer viewer;
    IViewerNotification notification;

    public ViewerRefresh(Viewer viewer, IViewerNotification notification)
    {
      this.viewer = viewer;
      this.notification = notification;
    }

    public void run()
    {
      // Never update the viewer on a resolve.
      //
      if (notification.getEventType() == Notification.RESOLVE) return;

      Object element = notification.getElement();

      if (viewer instanceof StructuredViewer)
      {
        StructuredViewer structuredViewer = (StructuredViewer)viewer;

        if (element != null)
        {
          if (notification.isContentRefresh())
          {
            structuredViewer.refresh(element, notification.isLabelUpdate());
          }
          else if (notification.isLabelUpdate())
          {
            structuredViewer.update(element, null);
          }
        }
        else
        {
          structuredViewer.refresh(notification.isLabelUpdate());
        }
      }
      else
      {
        viewer.refresh();
      }
    }
  }
}
