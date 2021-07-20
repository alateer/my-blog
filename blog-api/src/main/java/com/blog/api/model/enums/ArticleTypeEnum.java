package com.blog.api.model.enums;

public enum ArticleTypeEnum {

    ORIGINAL("原创", 1),

    REPRINT("转载", 0);

    private String notes;
    private int flags;

    public String getNotes() {
        return notes;
    }

    public int getFlags() {
        return flags;
    }

    ArticleTypeEnum(String notes, int flags) {
        this.notes = notes;
        this.flags = flags;
    }
}
