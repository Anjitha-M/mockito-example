package com.example;


class ClassD {
    static protected Object script;
    ClassD(Object script){
        this.script = script;
    }
    String callMethodFromClassD(){
        return "method from class D called";
    }
}