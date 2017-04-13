package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        StudentClass st=new StudentClass();
        StudentClass st1=new StudentClass();
        System.out.println(st.username);
        System.out.println(st.rollnumber);
        st1.username="ssuet";
        st1.rollnumber=101;
        System.out.println(st1.username);
        System.out.println(st1.rollnumber);
    }
}
