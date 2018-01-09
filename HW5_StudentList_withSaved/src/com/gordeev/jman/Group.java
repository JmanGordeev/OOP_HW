package com.gordeev.jman;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Group {

    private static String nameGroup;
    private Student[] students = new Student[10];
    private int count = 0;

    Group(String nameGroup) {
        setNameGroup(nameGroup);
    }

    public Group() {
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    private String getNameGroup() {
        return nameGroup;
    }

    private void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    private void setCount() {
        this.count = 0;
    }

    void addStudent() {

        Scanner sc = new Scanner(System.in);
        String in;

        System.out.println("places in a group " + (10 - count));


        try {
            if (count > 9) {
                throw new MyException();
            } else {
                System.out.println("Enter new student" + (count + 1) + "  'name lastName age sex (M_true/W_false) ration' ");
            }
        } catch (MyException e) {
            System.out.println(e.getLocalizedMessage());
            Start.start();
        }


        in = sc.nextLine();
        String[] a = in.split(" ");

        Student student = studentScan(in);

        for (Student s : students) {

            if (!in.isEmpty() && a.length == 5 && students[count] == null) {
                this.students[count] = student;
                count++;
                Start.start();
                return;
            }
        }
    }

    void deleteStudent(String lastName) {
        boolean switchIf = true;

        System.out.println("deleting " + lastName + "..........");
        for (int i = 0; i < students.length; i++) {
            if (!(students[i] == null) && students[i].getLastName().equalsIgnoreCase(lastName)) {
                students[i] = null;
                System.out.println("...OK!");
                count--;
                switchIf = false;
            }
        }
        if (switchIf) {
            System.out.println("..........there is no such student");
        }


        Start.start();
    }

    String searchStudent(String lastName) {
        String result = "";
        boolean switchIf = true;

        System.out.println("search " + lastName + "..........");
        for (Student student : students) {
            if ((!(student == null)) && student.getLastName().equals(lastName)) {
                result = student.toString();
                switchIf = false;
            }
        }
        if (switchIf) {
            result = "..........there is no such student";
        }
        return result;
    }

    public void sortStudents() {

        Arrays.sort(students, (a, b) -> CheckedOnNull.NoNull(a, b) != CheckedOnNull.NOT_NULL ? CheckedOnNull.NoNull(a, b) : a.getLastName().compareTo(b.getLastName()));

    }

    public void sortStudentsAge() {

        Arrays.sort(students, (a, b) -> CheckedOnNull.NoNull(a, b) != CheckedOnNull.NOT_NULL ? CheckedOnNull.NoNull(a, b) : a.getAge() > b.getAge() ? 1 : -1);
        for (Student student : students) {
            System.out.println(student);
        }

    }

    public void sortStudentsRate() {

        Arrays.sort(students, (a, b) -> CheckedOnNull.NoNull(a, b) != CheckedOnNull.NOT_NULL ? CheckedOnNull.NoNull(a, b) : a.getRate() > b.getRate() ? 1 : -1);
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Override
    public String toString() {
        sortStudents();
        StringBuilder out = new StringBuilder();
        for (Student student : students) {
            if (student != null) {
                out.append(student.toString()).append("\n");
            }
        }
        return out.toString();
    }

    private Student studentScan(String a) {
        Student student = null;
        try {
            String[] b = a.split(" ");
            student = new Student();
            student.setName(b[0]);
            student.setLastName(b[1]);
            student.setAge(Integer.parseInt(b[2]));
            student.setSex((b[3].equalsIgnoreCase("m") ? true : false));
            student.setRate(Double.parseDouble(b[4]));
            return student;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Something went wrong >_<");
        }
        return student;
    }

    public void saveStudent() {

        try (PrintWriter writerList = new PrintWriter("list.txt")) {
            for (Student s : students) {
                if (s != null) {
                    writerList.println(s);
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR!!");
        }

    }

    public void loadList() {

        try (BufferedReader reader = new BufferedReader(new FileReader("list.txt"))) {
            String read;

            while ((read = reader.readLine()) != null) {

                students[count] = studentScan(read);
                count++;

            }


        } catch (FileNotFoundException e) {
            System.out.println("ERROR!! File Not Found!!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

class MyException extends Exception {
    @Override
    public String getLocalizedMessage() {
        return " there is no place, press enter o_O";
    }
}
