package com.example;

import java.util.Map;

class ClassA extends ClassB {
    ClassA(Object script, Map stepConfig){
        super(script, stepConfig);
    }
    String callMethodFromClassA(){
        return classD.callMethodFromClassD();
    }
//    String callMethodFromD = classD.callMethodFromClassD();
    String newMethod() {
        String flagVar = classD.callMethodFromClassD();
        System.out.println("Hey I am in A's method");
        return flagVar;
    }
}