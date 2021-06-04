package ru.msin87.teledom.dom.utils;

public enum StickinessType {
    PINNED,
    UNPINNED;
    public static StickinessType fromString(String s){
        switch (s){
            case "PINNED":
                return PINNED;
            default:
            case "UNPINNED":
                return UNPINNED;

        }
    }
}
