/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.ide.common.client.testscenarios.fixtures;

import org.drools.ide.common.client.modeldriven.brl.PortableObject;

import java.util.ArrayList;
import java.util.List;

public class FieldData
    implements
    PortableObject {

    /**
     * the name of the field
     */
    private String          name;

    /**
     * The value of the field to be set to. This will either be a literal value
     * (which will be coerced by MVEL). Or if it starts with an "=" then it is
     * an EL that will be evaluated to yield a value.
     */
    private String          value               = "";
    private long            nature;
    /**
     * This is used only when action is first created. This means that there is
     * no value yet for the constraint.
     */
    public static final int TYPE_UNDEFINED      = 0;

    /**
     * This may be string, or number, anything really.
     */
    public static final int TYPE_LITERAL        = 1;

    /**
     * This is when it is set to a valid previously bound variable.
     */
    public static final int TYPE_VARIABLE       = 2;

    /**
     * This is for a "formula" that calculates a value.
     */
    public static final int TYPE_FORMULA        = 3;

    /**
     * This is not used yet. ENUMs are not suitable for business rules until we
     * can get data driven non code enums.
     */
    public static final int TYPE_ENUM           = 4;

    /**
     * The fieldName and fieldBinding is not used in the case of a predicate.
     */
    public static final int TYPE_PREDICATE      = 5;
    /*
     * The field is a collection and user has selected the guided list widget
     */
    public static final int TYPE_COLLECTION     = 6;
    /*
     * In case the nature is set to TYPE_COLLECTION, collectionFactList may
     * contain the list of factData
     */
    public List<FieldData>  collectionFieldList = null;

    public String           collectionType;

    public long getNature() {
        return this.nature;
    }

    public void setNature(long l,
                          String collectionType) {
        this.nature = l;
        if ( this.nature == TYPE_COLLECTION ) {
            collectionFieldList = new ArrayList<FieldData>();
            this.collectionType = collectionType;
        }
    }

    public FieldData() {
    }

    public FieldData(String name,
                     String value) {
        this.setName( name );
        this.setValue( value );
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setNature(long nature) {
        this.nature = nature;
    }

}
