package com.stackroute;

import java.util.Comparator;

public class student {


    private int id;
    private String name;
    private int age;

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    class StudentSorter implements Comparator<student> {

//    Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

        @Override
        public int compare(student student1, student student2) {
            if (student1.getAge() == student2.getAge()) {
                if (student1.getName().equals(student2.getName()))
                    return student2.getId() - student1.getId();
                else
                    return student2.getName().compareTo(student1.getName());
            } else {
                return student2.getAge() - student1.getAge();
            }
        }
    }
}
