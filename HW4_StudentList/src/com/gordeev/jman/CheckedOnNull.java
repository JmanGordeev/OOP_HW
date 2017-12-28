package com.gordeev.jman;

public interface CheckedOnNull {

    int NOT_NULL = 5;

    static int NoNull(Student a, Student b) {

        if (a == null && b != null) {
            return 1;
        }
        if (a != null && b == null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return NOT_NULL;

    }
}
