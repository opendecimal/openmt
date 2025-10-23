package com.opendecimal.openmt.model;

import java.util.List;

public class Element {

    private boolean isRequired;

    private ElementTag tag;

    private List<ElementField> fieldList;

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public ElementTag getTag() {
        return tag;
    }

    public void setTag(ElementTag tag) {
        this.tag = tag;
    }

    public List<ElementField> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<ElementField> fieldList) {
        this.fieldList = fieldList;
    }
}
