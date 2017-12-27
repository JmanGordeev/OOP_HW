package com.gordeev.jman;

public interface CheckedOnNull {

    int NOT_NULL = 7;

    static int NoNull(Object a, Object b) {

        if (a == null && b != null) {
            return -1;
        }
        if (a != null && b == null) {
            return 1;
        }
        if (b == null && a == null) {
            return 0;
        }
        return NOT_NULL;

    }
}
