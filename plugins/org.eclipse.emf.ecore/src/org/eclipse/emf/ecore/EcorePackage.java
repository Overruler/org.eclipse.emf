/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EcorePackage.java,v 1.6 2005/06/22 20:00:41 davidms Exp $
 */
package org.eclipse.emf.ecore;



/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent 
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each interface,</li>
 *   <li>each operation of each class or interface,</li>
 *   <li>each enum,</li>
 *   <li>each literal of each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecore.EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface EcorePackage extends EPackage
{
  /**
   * The package name.
   * @generated
   */
  String eNAME = "ecore";

  /**
   * The package namespace URI.
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/emf/2002/Ecore";

  /**
   * The package namespace name.
   * @generated
   */
  String eNS_PREFIX = "ecore";

  /**
   * The singleton instance of the package.
   * @generated
   */
  EcorePackage eINSTANCE = org.eclipse.emf.ecore.impl.EcorePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EObjectImpl <em>EObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EObjectImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEObject()
   * @generated
   */
  int EOBJECT = 10;

  /**
   * The number of structural features of the the '<em>EObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EModelElementImpl <em>EModel Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EModelElementImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEModelElement()
   * @generated
   */
  int EMODEL_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_ELEMENT__EANNOTATIONS = EOBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the the '<em>EModel Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_ELEMENT_FEATURE_COUNT = EOBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.ENamedElementImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getENamedElement()
   * @generated
   */
  int ENAMED_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_ELEMENT__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_ELEMENT__NAME = EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the the '<em>ENamed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_ELEMENT_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EStructuralFeatureImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEStructuralFeature()
   * @generated
   */
  int ESTRUCTURAL_FEATURE = 15;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EAttributeImpl <em>EAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EAttributeImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEAttribute()
   * @generated
   */
  int EATTRIBUTE = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EClassImpl <em>EClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EClassImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEClass()
   * @generated
   */
  int ECLASS = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.ETypedElementImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getETypedElement()
   * @generated
   */
  int ETYPED_ELEMENT = 16;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EDataTypeImpl <em>EData Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EDataTypeImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEDataType()
   * @generated
   */
  int EDATA_TYPE = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EEnumImpl <em>EEnum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EEnumImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEEnum()
   * @generated
   */
  int EENUM = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EEnumLiteralImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEEnumLiteral()
   * @generated
   */
  int EENUM_LITERAL = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EFactoryImpl <em>EFactory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EFactoryImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEFactory()
   * @generated
   */
  int EFACTORY = 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EOperationImpl <em>EOperation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EOperationImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEOperation()
   * @generated
   */
  int EOPERATION = 11;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EPackageImpl <em>EPackage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EPackageImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEPackage()
   * @generated
   */
  int EPACKAGE = 12;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EParameterImpl <em>EParameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EParameterImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEParameter()
   * @generated
   */
  int EPARAMETER = 13;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EReferenceImpl <em>EReference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EReferenceImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEReference()
   * @generated
   */
  int EREFERENCE = 14;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__NAME = ENAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__ORDERED = ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__UNIQUE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__LOWER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__UPPER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__MANY = ENAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__REQUIRED = ENAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT__ETYPE = ENAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the the '<em>ETyped Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPED_ELEMENT_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__NAME = ETYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__ORDERED = ETYPED_ELEMENT__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__UNIQUE = ETYPED_ELEMENT__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__MANY = ETYPED_ELEMENT__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__REQUIRED = ETYPED_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__ETYPE = ETYPED_ELEMENT__ETYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__CHANGEABLE = ETYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__VOLATILE = ETYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__TRANSIENT = ETYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = ETYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__DEFAULT_VALUE = ETYPED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__UNSETTABLE = ETYPED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__DERIVED = ETYPED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the the '<em>EStructural Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__NAME = ESTRUCTURAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__MANY = ESTRUCTURAL_FEATURE__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__ID = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__EATTRIBUTE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the the '<em>EAttribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EAnnotationImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEAnnotation()
   * @generated
   */
  int EANNOTATION = 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION__SOURCE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Details</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION__DETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EModel Element</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION__EMODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION__CONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION__REFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the the '<em>EAnnotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EANNOTATION_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EClassifierImpl <em>EClassifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EClassifierImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEClassifier()
   * @generated
   */
  int ECLASSIFIER = 3;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER__NAME = ENAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER__INSTANCE_CLASS_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER__INSTANCE_CLASS = ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER__DEFAULT_VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER__EPACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the the '<em>EClassifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__NAME = ECLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EPACKAGE = ECLASSIFIER__EPACKAGE;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__ABSTRACT = ECLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__INTERFACE = ECLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__ESUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EOPERATIONS = ECLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EALL_ATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>EAll References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EALL_REFERENCES = ECLASSIFIER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>EReferences</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EREFERENCES = ECLASSIFIER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>EAttributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EALL_CONTAINMENTS = ECLASSIFIER_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EALL_OPERATIONS = ECLASSIFIER_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EALL_STRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EALL_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>EID Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__EID_ATTRIBUTE = ECLASSIFIER_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS__ESTRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the the '<em>EClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__NAME = ECLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__EPACKAGE = ECLASSIFIER__EPACKAGE;

  /**
   * The feature id for the '<em><b>Serializable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE__SERIALIZABLE = ECLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the the '<em>EData Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__EANNOTATIONS = EDATA_TYPE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__NAME = EDATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__INSTANCE_CLASS_NAME = EDATA_TYPE__INSTANCE_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__INSTANCE_CLASS = EDATA_TYPE__INSTANCE_CLASS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__DEFAULT_VALUE = EDATA_TYPE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__EPACKAGE = EDATA_TYPE__EPACKAGE;

  /**
   * The feature id for the '<em><b>Serializable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__SERIALIZABLE = EDATA_TYPE__SERIALIZABLE;

  /**
   * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM__ELITERALS = EDATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the the '<em>EEnum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_LITERAL__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_LITERAL__NAME = ENAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_LITERAL__VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_LITERAL__INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EEnum</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_LITERAL__EENUM = ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the the '<em>EEnum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EENUM_LITERAL_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFACTORY__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFACTORY__EPACKAGE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the the '<em>EFactory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFACTORY_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__NAME = ETYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__ORDERED = ETYPED_ELEMENT__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__UNIQUE = ETYPED_ELEMENT__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__MANY = ETYPED_ELEMENT__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__REQUIRED = ETYPED_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__ETYPE = ETYPED_ELEMENT__ETYPE;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__EPARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EExceptions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION__EEXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the the '<em>EOperation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOPERATION_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__NAME = ENAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__NS_URI = ENAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__NS_PREFIX = ENAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__EFACTORY_INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__ECLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__ESUBPACKAGES = ENAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE__ESUPER_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the the '<em>EPackage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__NAME = ETYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__ORDERED = ETYPED_ELEMENT__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__UNIQUE = ETYPED_ELEMENT__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__MANY = ETYPED_ELEMENT__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__REQUIRED = ETYPED_ELEMENT__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__ETYPE = ETYPED_ELEMENT__ETYPE;

  /**
   * The feature id for the '<em><b>EOperation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__EOPERATION = ETYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the the '<em>EParameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__NAME = ESTRUCTURAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__MANY = ESTRUCTURAL_FEATURE__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

  /**
   * The feature id for the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__CONTAINMENT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__CONTAINER = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__RESOLVE_PROXIES = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>EOpposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__EOPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>EReference Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE__EREFERENCE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the the '<em>EReference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEStringToStringMapEntry()
   * @generated
   */
  int ESTRING_TO_STRING_MAP_ENTRY = 17;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the the '<em>EString To String Map Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '<em>EBig Decimal</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigDecimal
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEBigDecimal()
   * @generated
   */
  int EBIG_DECIMAL = 18;

  /**
   * The meta object id for the '<em>EBig Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEBigInteger()
   * @generated
   */
  int EBIG_INTEGER = 19;

  /**
   * The meta object id for the '<em>EE List</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.EList
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEEList()
   * @generated
   */
  int EE_LIST = 31;

  /**
   * The meta object id for the '<em>EResource</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.resource.Resource
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEResource()
   * @generated
   */
  int ERESOURCE = 44;

  /**
   * The meta object id for the '<em>EResource Set</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.resource.ResourceSet
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEResourceSet()
   * @generated
   */
  int ERESOURCE_SET = 45;

  /**
   * The meta object id for the '<em>EBoolean Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Boolean
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEBooleanObject()
   * @generated
   */
  int EBOOLEAN_OBJECT = 21;

  /**
   * The meta object id for the '<em>ECharacter Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Character
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getECharacterObject()
   * @generated
   */
  int ECHARACTER_OBJECT = 26;

  /**
   * The meta object id for the '<em>EDate</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Date
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEDate()
   * @generated
   */
  int EDATE = 27;

  /**
   * The meta object id for the '<em>EDiagnostic Chain</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.DiagnosticChain
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEDiagnosticChain()
   * @generated
   */
  int EDIAGNOSTIC_CHAIN = 28;

  /**
   * The meta object id for the '<em>EDouble Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Double
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEDoubleObject()
   * @generated
   */
  int EDOUBLE_OBJECT = 30;

  /**
   * The meta object id for the '<em>EFloat Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Float
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEFloatObject()
   * @generated
   */
  int EFLOAT_OBJECT = 36;

  /**
   * The meta object id for the '<em>EInteger Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Integer
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEIntegerObject()
   * @generated
   */
  int EINTEGER_OBJECT = 38;

  /**
   * The meta object id for the '<em>EBoolean</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEBoolean()
   * @generated
   */
  int EBOOLEAN = 20;

  /**
   * The meta object id for the '<em>EByte Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Byte
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEByteObject()
   * @generated
   */
  int EBYTE_OBJECT = 24;

  /**
   * The meta object id for the '<em>EByte</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEByte()
   * @generated
   */
  int EBYTE = 22;

  /**
   * The meta object id for the '<em>EByte Array</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEByteArray()
   * @generated
   */
  int EBYTE_ARRAY = 23;

  /**
   * The meta object id for the '<em>EChar</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEChar()
   * @generated
   */
  int ECHAR = 25;

  /**
   * The meta object id for the '<em>EDouble</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEDouble()
   * @generated
   */
  int EDOUBLE = 29;

  /**
   * The meta object id for the '<em>EFloat</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEFloat()
   * @generated
   */
  int EFLOAT = 35;

  /**
   * The meta object id for the '<em>EInt</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEInt()
   * @generated
   */
  int EINT = 37;

  /**
   * The meta object id for the '<em>EJava Class</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Class
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEJavaClass()
   * @generated
   */
  int EJAVA_CLASS = 39;

  /**
   * The meta object id for the '<em>EJava Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEJavaObject()
   * @generated
   */
  int EJAVA_OBJECT = 40;

  /**
   * The meta object id for the '<em>ELong Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Long
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getELongObject()
   * @generated
   */
  int ELONG_OBJECT = 42;

  /**
   * The meta object id for the '<em>EMap</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Map
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEMap()
   * @generated
   */
  int EMAP = 43;

  /**
   * The meta object id for the '<em>EShort Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Short
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEShortObject()
   * @generated
   */
  int ESHORT_OBJECT = 47;

  /**
   * The meta object id for the '<em>ELong</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getELong()
   * @generated
   */
  int ELONG = 41;

  /**
   * The meta object id for the '<em>EShort</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEShort()
   * @generated
   */
  int ESHORT = 46;

  /**
   * The meta object id for the '<em>ETree Iterator</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.TreeIterator
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getETreeIterator()
   * @generated
   */
  int ETREE_ITERATOR = 49;


  /**
   * The meta object id for the '<em>EFeature Map Entry</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEFeatureMapEntry()
   * @generated
   */
  int EFEATURE_MAP_ENTRY = 34;


  /**
   * The meta object id for the '<em>EEnumerator</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Enumerator
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEEnumerator()
   * @generated
   */
  int EENUMERATOR = 32;


  /**
   * The meta object id for the '<em>EFeature Map</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.util.FeatureMap
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEFeatureMap()
   * @generated
   */
  int EFEATURE_MAP = 33;

  /**
   * The meta object id for the '<em>EString</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.ecore.impl.EcorePackageImpl#getEString()
   * @generated
   */
  int ESTRING = 48;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EAttribute <em>EAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute</em>'.
   * @see org.eclipse.emf.ecore.EAttribute
   * @generated
   */
  EClass getEAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EAttribute#isID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see org.eclipse.emf.ecore.EAttribute#isID()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_ID();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.EAttribute#getEAttributeType <em>EAttribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EAttribute Type</em>'.
   * @see org.eclipse.emf.ecore.EAttribute#getEAttributeType()
   * @see #getEAttribute()
   * @generated
   */
  EReference getEAttribute_EAttributeType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EAnnotation <em>EAnnotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAnnotation</em>'.
   * @see org.eclipse.emf.ecore.EAnnotation
   * @generated
   */
  EClass getEAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EAnnotation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.eclipse.emf.ecore.EAnnotation#getSource()
   * @see #getEAnnotation()
   * @generated
   */
  EAttribute getEAnnotation_Source();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.ecore.EAnnotation#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Details</em>'.
   * @see org.eclipse.emf.ecore.EAnnotation#getDetails()
   * @see #getEAnnotation()
   * @generated
   */
  EReference getEAnnotation_Details();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EAnnotation#getEModelElement <em>EModel Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>EModel Element</em>'.
   * @see org.eclipse.emf.ecore.EAnnotation#getEModelElement()
   * @see #getEAnnotation()
   * @generated
   */
  EReference getEAnnotation_EModelElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EAnnotation#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.emf.ecore.EAnnotation#getContents()
   * @see #getEAnnotation()
   * @generated
   */
  EReference getEAnnotation_Contents();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EAnnotation#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>References</em>'.
   * @see org.eclipse.emf.ecore.EAnnotation#getReferences()
   * @see #getEAnnotation()
   * @generated
   */
  EReference getEAnnotation_References();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass</em>'.
   * @see org.eclipse.emf.ecore.EClass
   * @generated
   */
  EClass getEClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EClass#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.eclipse.emf.ecore.EClass#isAbstract()
   * @see #getEClass()
   * @generated
   */
  EAttribute getEClass_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EClass#isInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface</em>'.
   * @see org.eclipse.emf.ecore.EClass#isInterface()
   * @see #getEClass()
   * @generated
   */
  EAttribute getEClass_Interface();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getESuperTypes <em>ESuper Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>ESuper Types</em>'.
   * @see org.eclipse.emf.ecore.EClass#getESuperTypes()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_ESuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EClass#getEOperations <em>EOperations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>EOperations</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEOperations()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EOperations();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAllAttributes <em>EAll Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll Attributes</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAllAttributes()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAllAttributes();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAllReferences <em>EAll References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll References</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAllReferences()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAllReferences();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEReferences <em>EReferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EReferences</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEReferences()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EReferences();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAttributes <em>EAttributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAttributes</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAttributes()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAttributes();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAllContainments <em>EAll Containments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll Containments</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAllContainments()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAllContainments();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAllOperations <em>EAll Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll Operations</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAllOperations()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAllOperations();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll Structural Features</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAllStructuralFeatures()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAllStructuralFeatures();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EClass#getEAllSuperTypes <em>EAll Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EAll Super Types</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEAllSuperTypes()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EAllSuperTypes();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.EClass#getEIDAttribute <em>EID Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EID Attribute</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEIDAttribute()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EIDAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
   * @see org.eclipse.emf.ecore.EClass#getEStructuralFeatures()
   * @see #getEClass()
   * @generated
   */
  EReference getEClass_EStructuralFeatures();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EDataType <em>EData Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EData Type</em>'.
   * @see org.eclipse.emf.ecore.EDataType
   * @generated
   */
  EClass getEDataType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EDataType#isSerializable <em>Serializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Serializable</em>'.
   * @see org.eclipse.emf.ecore.EDataType#isSerializable()
   * @see #getEDataType()
   * @generated
   */
  EAttribute getEDataType_Serializable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EEnum <em>EEnum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EEnum</em>'.
   * @see org.eclipse.emf.ecore.EEnum
   * @generated
   */
  EClass getEEnum();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EEnum#getELiterals <em>ELiterals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>ELiterals</em>'.
   * @see org.eclipse.emf.ecore.EEnum#getELiterals()
   * @see #getEEnum()
   * @generated
   */
  EReference getEEnum_ELiterals();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EEnumLiteral <em>EEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EEnum Literal</em>'.
   * @see org.eclipse.emf.ecore.EEnumLiteral
   * @generated
   */
  EClass getEEnumLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EEnumLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.ecore.EEnumLiteral#getValue()
   * @see #getEEnumLiteral()
   * @generated
   */
  EAttribute getEEnumLiteral_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EEnumLiteral#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance</em>'.
   * @see org.eclipse.emf.ecore.EEnumLiteral#getInstance()
   * @see #getEEnumLiteral()
   * @generated
   */
  EAttribute getEEnumLiteral_Instance();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>EEnum</em>'.
   * @see org.eclipse.emf.ecore.EEnumLiteral#getEEnum()
   * @see #getEEnumLiteral()
   * @generated
   */
  EReference getEEnumLiteral_EEnum();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EFactory <em>EFactory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EFactory</em>'.
   * @see org.eclipse.emf.ecore.EFactory
   * @generated
   */
  EClass getEFactory();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.EFactory#getEPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EPackage</em>'.
   * @see org.eclipse.emf.ecore.EFactory#getEPackage()
   * @see #getEFactory()
   * @generated
   */
  EReference getEFactory_EPackage();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EClassifier <em>EClassifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClassifier</em>'.
   * @see org.eclipse.emf.ecore.EClassifier
   * @generated
   */
  EClass getEClassifier();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EClassifier#getInstanceClassName <em>Instance Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Class Name</em>'.
   * @see org.eclipse.emf.ecore.EClassifier#getInstanceClassName()
   * @see #getEClassifier()
   * @generated
   */
  EAttribute getEClassifier_InstanceClassName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EClassifier#getInstanceClass <em>Instance Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Class</em>'.
   * @see org.eclipse.emf.ecore.EClassifier#getInstanceClass()
   * @see #getEClassifier()
   * @generated
   */
  EAttribute getEClassifier_InstanceClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EClassifier#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see org.eclipse.emf.ecore.EClassifier#getDefaultValue()
   * @see #getEClassifier()
   * @generated
   */
  EAttribute getEClassifier_DefaultValue();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EClassifier#getEPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>EPackage</em>'.
   * @see org.eclipse.emf.ecore.EClassifier#getEPackage()
   * @see #getEClassifier()
   * @generated
   */
  EReference getEClassifier_EPackage();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EModel Element</em>'.
   * @see org.eclipse.emf.ecore.EModelElement
   * @generated
   */
  EClass getEModelElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>EAnnotations</em>'.
   * @see org.eclipse.emf.ecore.EModelElement#getEAnnotations()
   * @see #getEModelElement()
   * @generated
   */
  EReference getEModelElement_EAnnotations();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamed Element</em>'.
   * @see org.eclipse.emf.ecore.ENamedElement
   * @generated
   */
  EClass getENamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ENamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.ecore.ENamedElement#getName()
   * @see #getENamedElement()
   * @generated
   */
  EAttribute getENamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EObject <em>EObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EObject</em>'.
   * @see org.eclipse.emf.ecore.EObject
   * @generated
   */
  EClass getEObject();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EOperation <em>EOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EOperation</em>'.
   * @see org.eclipse.emf.ecore.EOperation
   * @generated
   */
  EClass getEOperation();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EOperation#getEContainingClass <em>EContaining Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>EContaining Class</em>'.
   * @see org.eclipse.emf.ecore.EOperation#getEContainingClass()
   * @see #getEOperation()
   * @generated
   */
  EReference getEOperation_EContainingClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EOperation#getEParameters <em>EParameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>EParameters</em>'.
   * @see org.eclipse.emf.ecore.EOperation#getEParameters()
   * @see #getEOperation()
   * @generated
   */
  EReference getEOperation_EParameters();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EOperation#getEExceptions <em>EExceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>EExceptions</em>'.
   * @see org.eclipse.emf.ecore.EOperation#getEExceptions()
   * @see #getEOperation()
   * @generated
   */
  EReference getEOperation_EExceptions();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage</em>'.
   * @see org.eclipse.emf.ecore.EPackage
   * @generated
   */
  EClass getEPackage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EPackage#getNsURI <em>Ns URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns URI</em>'.
   * @see org.eclipse.emf.ecore.EPackage#getNsURI()
   * @see #getEPackage()
   * @generated
   */
  EAttribute getEPackage_NsURI();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EPackage#getNsPrefix <em>Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Prefix</em>'.
   * @see org.eclipse.emf.ecore.EPackage#getNsPrefix()
   * @see #getEPackage()
   * @generated
   */
  EAttribute getEPackage_NsPrefix();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EFactory Instance</em>'.
   * @see org.eclipse.emf.ecore.EPackage#getEFactoryInstance()
   * @see #getEPackage()
   * @generated
   */
  EReference getEPackage_EFactoryInstance();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EPackage#getEClassifiers <em>EClassifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
   * @see org.eclipse.emf.ecore.EPackage#getEClassifiers()
   * @see #getEPackage()
   * @generated
   */
  EReference getEPackage_EClassifiers();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EPackage#getESubpackages <em>ESubpackages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>ESubpackages</em>'.
   * @see org.eclipse.emf.ecore.EPackage#getESubpackages()
   * @see #getEPackage()
   * @generated
   */
  EReference getEPackage_ESubpackages();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EPackage#getESuperPackage <em>ESuper Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>ESuper Package</em>'.
   * @see org.eclipse.emf.ecore.EPackage#getESuperPackage()
   * @see #getEPackage()
   * @generated
   */
  EReference getEPackage_ESuperPackage();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EParameter <em>EParameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EParameter</em>'.
   * @see org.eclipse.emf.ecore.EParameter
   * @generated
   */
  EClass getEParameter();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EParameter#getEOperation <em>EOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>EOperation</em>'.
   * @see org.eclipse.emf.ecore.EParameter#getEOperation()
   * @see #getEParameter()
   * @generated
   */
  EReference getEParameter_EOperation();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EReference <em>EReference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference</em>'.
   * @see org.eclipse.emf.ecore.EReference
   * @generated
   */
  EClass getEReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EReference#isContainment <em>Containment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Containment</em>'.
   * @see org.eclipse.emf.ecore.EReference#isContainment()
   * @see #getEReference()
   * @generated
   */
  EAttribute getEReference_Containment();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EReference#isContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container</em>'.
   * @see org.eclipse.emf.ecore.EReference#isContainer()
   * @see #getEReference()
   * @generated
   */
  EAttribute getEReference_Container();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EReference#isResolveProxies <em>Resolve Proxies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolve Proxies</em>'.
   * @see org.eclipse.emf.ecore.EReference#isResolveProxies()
   * @see #getEReference()
   * @generated
   */
  EAttribute getEReference_ResolveProxies();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.EReference#getEOpposite <em>EOpposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EOpposite</em>'.
   * @see org.eclipse.emf.ecore.EReference#getEOpposite()
   * @see #getEReference()
   * @generated
   */
  EReference getEReference_EOpposite();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.EReference#getEReferenceType <em>EReference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EReference Type</em>'.
   * @see org.eclipse.emf.ecore.EReference#getEReferenceType()
   * @see #getEReference()
   * @generated
   */
  EReference getEReference_EReferenceType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.EStructuralFeature <em>EStructural Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EStructural Feature</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature
   * @generated
   */
  EClass getEStructuralFeature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#isTransient <em>Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transient</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#isTransient()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_Transient();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#isVolatile <em>Volatile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volatile</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#isVolatile()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_Volatile();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#isChangeable <em>Changeable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Changeable</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#isChangeable()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_Changeable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value Literal</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#getDefaultValueLiteral()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_DefaultValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#getDefaultValue()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#isUnsettable <em>Unsettable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unsettable</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#isUnsettable()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_Unsettable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EStructuralFeature#isDerived <em>Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Derived</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#isDerived()
   * @see #getEStructuralFeature()
   * @generated
   */
  EAttribute getEStructuralFeature_Derived();

  /**
   * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>EContaining Class</em>'.
   * @see org.eclipse.emf.ecore.EStructuralFeature#getEContainingClass()
   * @see #getEStructuralFeature()
   * @generated
   */
  EReference getEStructuralFeature_EContainingClass();

  /**
   * @deprecated
   * replaced by getETypedElement_Unique()
   */
  EAttribute getEStructuralFeature_Unique();

  /**
   * @deprecated
   * replaced by getETypedElement_LowerBound()
   */
  EAttribute getEStructuralFeature_LowerBound();

  /**
   * @deprecated
   * replaced by getETypedElement_UpperBound()
   */
  EAttribute getEStructuralFeature_UpperBound();

  /**
   * @deprecated
   * replaced by getETypedElement_Many()
   */
  EAttribute getEStructuralFeature_Many();

  /**
   * @deprecated
   * replaced by getETypedElement_Required()
   */
  EAttribute getEStructuralFeature_Required();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.ecore.ETypedElement <em>ETyped Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETyped Element</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement
   * @generated
   */
  EClass getETypedElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ETypedElement#isOrdered <em>Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordered</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#isOrdered()
   * @see #getETypedElement()
   * @generated
   */
  EAttribute getETypedElement_Ordered();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ETypedElement#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#isUnique()
   * @see #getETypedElement()
   * @generated
   */
  EAttribute getETypedElement_Unique();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ETypedElement#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#getLowerBound()
   * @see #getETypedElement()
   * @generated
   */
  EAttribute getETypedElement_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ETypedElement#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#getUpperBound()
   * @see #getETypedElement()
   * @generated
   */
  EAttribute getETypedElement_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ETypedElement#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#isMany()
   * @see #getETypedElement()
   * @generated
   */
  EAttribute getETypedElement_Many();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.ETypedElement#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#isRequired()
   * @see #getETypedElement()
   * @generated
   */
  EAttribute getETypedElement_Required();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.ecore.ETypedElement#getEType <em>EType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EType</em>'.
   * @see org.eclipse.emf.ecore.ETypedElement#getEType()
   * @see #getETypedElement()
   * @generated
   */
  EReference getETypedElement_EType();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EString To String Map Entry</em>'.
   * @see java.util.Map.Entry
   * @model keyType="java.lang.String"
   *        valueType="java.lang.String"
   * @generated
   */
  EClass getEStringToStringMapEntry();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getEStringToStringMapEntry()
   * @generated
   */
  EAttribute getEStringToStringMapEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getEStringToStringMapEntry()
   * @generated
   */
  EAttribute getEStringToStringMapEntry_Value();

  /**
   * Returns the meta object for data type '{@link java.math.BigDecimal <em>EBig Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EBig Decimal</em>'.
   * @see java.math.BigDecimal
   * @model instanceClass="java.math.BigDecimal"
   * @generated
   */
  EDataType getEBigDecimal();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>EBig Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EBig Integer</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   * @generated
   */
  EDataType getEBigInteger();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EE List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EE List</em>'.
   * @see org.eclipse.emf.common.util.EList
   * @model instanceClass="org.eclipse.emf.common.util.EList" serializable="false"
   * @generated
   */
  EDataType getEEList();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>EResource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EResource</em>'.
   * @see org.eclipse.emf.ecore.resource.Resource
   * @model instanceClass="org.eclipse.emf.ecore.resource.Resource" serializable="false"
   * @generated
   */
  EDataType getEResource();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>EResource Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EResource Set</em>'.
   * @see org.eclipse.emf.ecore.resource.ResourceSet
   * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet" serializable="false"
   * @generated
   */
  EDataType getEResourceSet();

  /**
   * Returns the meta object for data type '{@link java.lang.Boolean <em>EBoolean Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EBoolean Object</em>'.
   * @see java.lang.Boolean
   * @model instanceClass="java.lang.Boolean"
   * @generated
   */
  EDataType getEBooleanObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Character <em>ECharacter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ECharacter Object</em>'.
   * @see java.lang.Character
   * @model instanceClass="java.lang.Character"
   * @generated
   */
  EDataType getECharacterObject();

  /**
   * Returns the meta object for data type '{@link java.util.Date <em>EDate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EDate</em>'.
   * @see java.util.Date
   * @model instanceClass="java.util.Date"
   * @generated
   */
  EDataType getEDate();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.DiagnosticChain <em>EDiagnostic Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EDiagnostic Chain</em>'.
   * @see org.eclipse.emf.common.util.DiagnosticChain
   * @model instanceClass="org.eclipse.emf.common.util.DiagnosticChain" serializable="false"
   * @generated
   */
  EDataType getEDiagnosticChain();

  /**
   * Returns the meta object for data type '{@link java.lang.Double <em>EDouble Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EDouble Object</em>'.
   * @see java.lang.Double
   * @model instanceClass="java.lang.Double"
   * @generated
   */
  EDataType getEDoubleObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Float <em>EFloat Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EFloat Object</em>'.
   * @see java.lang.Float
   * @model instanceClass="java.lang.Float"
   * @generated
   */
  EDataType getEFloatObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EInteger Object</em>'.
   * @see java.lang.Integer
   * @model instanceClass="java.lang.Integer"
   * @generated
   */
  EDataType getEIntegerObject();

  /**
   * Returns the meta object for data type '<em>EBoolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EBoolean</em>'.
   * @model instanceClass="boolean"
   * @generated
   */
  EDataType getEBoolean();

  /**
   * Returns the meta object for data type '{@link java.lang.Byte <em>EByte Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EByte Object</em>'.
   * @see java.lang.Byte
   * @model instanceClass="java.lang.Byte"
   * @generated
   */
  EDataType getEByteObject();

  /**
   * Returns the meta object for data type '<em>EByte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EByte</em>'.
   * @model instanceClass="byte"
   * @generated
   */
  EDataType getEByte();

  /**
   * Returns the meta object for data type '<em>EByte Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EByte Array</em>'.
   * @model instanceClass="byte[]"
   * @generated
   */
  EDataType getEByteArray();

  /**
   * Returns the meta object for data type '<em>EChar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EChar</em>'.
   * @model instanceClass="char"
   * @generated
   */
  EDataType getEChar();

  /**
   * Returns the meta object for data type '<em>EDouble</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EDouble</em>'.
   * @model instanceClass="double"
   * @generated
   */
  EDataType getEDouble();

  /**
   * Returns the meta object for data type '<em>EFloat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EFloat</em>'.
   * @model instanceClass="float"
   * @generated
   */
  EDataType getEFloat();

  /**
   * Returns the meta object for data type '<em>EInt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EInt</em>'.
   * @model instanceClass="int"
   * @generated
   */
  EDataType getEInt();

  /**
   * Returns the meta object for data type '{@link java.lang.Class <em>EJava Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EJava Class</em>'.
   * @see java.lang.Class
   * @model instanceClass="java.lang.Class"
   * @generated
   */
  EDataType getEJavaClass();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>EJava Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EJava Object</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object" serializable="false"
   * @generated
   */
  EDataType getEJavaObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Long <em>ELong Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ELong Object</em>'.
   * @see java.lang.Long
   * @model instanceClass="java.lang.Long"
   * @generated
   */
  EDataType getELongObject();

  /**
   * Returns the meta object for data type '{@link java.util.Map <em>EMap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EMap</em>'.
   * @see java.util.Map
   * @model instanceClass="java.util.Map" serializable="false"
   * @generated
   */
  EDataType getEMap();

  /**
   * Returns the meta object for data type '{@link java.lang.Short <em>EShort Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EShort Object</em>'.
   * @see java.lang.Short
   * @model instanceClass="java.lang.Short"
   * @generated
   */
  EDataType getEShortObject();

  /**
   * Returns the meta object for data type '<em>ELong</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ELong</em>'.
   * @model instanceClass="long"
   * @generated
   */
  EDataType getELong();

  /**
   * Returns the meta object for data type '<em>EShort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EShort</em>'.
   * @model instanceClass="short"
   * @generated
   */
  EDataType getEShort();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.TreeIterator <em>ETree Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ETree Iterator</em>'.
   * @see org.eclipse.emf.common.util.TreeIterator
   * @model instanceClass="org.eclipse.emf.common.util.TreeIterator" serializable="false"
   * @generated
   */
  EDataType getETreeIterator();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap.Entry <em>EFeature Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EFeature Map Entry</em>'.
   * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
   * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap$Entry"
   * @generated
   */
  EDataType getEFeatureMapEntry();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>EEnumerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EEnumerator</em>'.
   * @see org.eclipse.emf.common.util.Enumerator
   * @model instanceClass="org.eclipse.emf.common.util.Enumerator" serializable="false"
   * @generated
   */
  EDataType getEEnumerator();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap <em>EFeature Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EFeature Map</em>'.
   * @see org.eclipse.emf.ecore.util.FeatureMap
   * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap" serializable="false"
   * @generated
   */
  EDataType getEFeatureMap();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EString</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   * @generated
   */
  EDataType getEString();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EcoreFactory getEcoreFactory();

  boolean _INTERNAL_BOOTSTRAP = org.eclipse.emf.ecore.impl.EcorePackageImpl.internalBootstrap();

} //EcorePackage
