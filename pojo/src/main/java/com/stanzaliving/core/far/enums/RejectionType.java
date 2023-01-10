package com.stanzaliving.core.far.enums;

/**
 * @author nipunaggarwal
 * 
 */
public enum RejectionType {
    DAMAGED("Damaged"), OTHER("Other");

    private String label;

    RejectionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
