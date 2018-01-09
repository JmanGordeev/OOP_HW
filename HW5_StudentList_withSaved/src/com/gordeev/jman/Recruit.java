package com.gordeev.jman;

public interface Recruit {

    static void getRecruiter(Group a) {
        for (Student student : a.getStudents()) {
            if (student != null && student.getAge() <= 18 && student.isSex()) {
                System.out.println(student);
            }
        }
    }
}
