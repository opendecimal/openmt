package com.opendecimal.openmt.model;

import java.util.List;

public class Sequence {

    private boolean isRequired;

    private SequenceName sequenceName;

    private List<Element> elementList;

    private List<Sequence> subSequenceList;

    private Sequence parentSequence;

    private Integer sequenceIndex;

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public SequenceName getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(SequenceName sequenceName) {
        this.sequenceName = sequenceName;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    public List<Sequence> getSubSequenceList() {
        return subSequenceList;
    }

    public void setSubSequenceList(List<Sequence> subSequenceList) {
        this.subSequenceList = subSequenceList;
    }

    public Sequence getParentSequence() {
        return parentSequence;
    }

    public void setParentSequence(Sequence parentSequence) {
        this.parentSequence = parentSequence;
    }

    public Integer getSequenceIndex() {
        return sequenceIndex;
    }

    public void setSequenceIndex(Integer sequenceIndex) {
        this.sequenceIndex = sequenceIndex;
    }
}
