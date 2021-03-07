package com.company.overloading;

public class OverloadingExample {

    // overloaded methods
    void show(int a, int b) {
        System.out.println("First : " + a + " second : " + b);
    }

    void show(long a, long b) {
        System.out.println("First : " + a + " second : " + b);
    }

    void show(String a, String b) {
        System.out.println("First : " + a + " second : " + b);
    }

    // overloaded methods param revers

    void concat(String a, int b) {
        System.out.println("First : " + a + " second : " + b);
    }

    // you cant do that
//    void concat(String a, int b) {
//        System.out.println("First : " + a + " second : " + b);
//    }

    //but you can do this
    void concat(int a, String b) {
        System.out.println("First : " + a + " second : " + b);
    }

    //overloading by return type

    int sum(int a, int b) {
        return a + b;
    }

    //you cant do that
//    String sum(int a, int b) {
//        return String.valueOf(a + b);
//    }

    //only
    String sum(String a, String b) {
        return a + b;
    }

    //overloaded methods can have different access modifiers

    public int add(int a, int b) {
        return a + b;
    }

    private String add(String a, String b) {
        return a + b;
    }

    protected long add(Long a, Long b) {
        return a + b;
    }

    //overloaded methods IS WHEN THEY HAVE SAME NAME AND DIFFERENT LIST OF PARAMETERS
}

class Test {
    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.show(1, 1);
        example.show(1L, 1L);
        example.show("1", "1");

        //same
        example.concat(1, "1");
        example.concat("1", 1);

    }
}
