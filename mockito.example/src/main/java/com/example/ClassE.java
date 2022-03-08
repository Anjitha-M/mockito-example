package com.example;
import java.util.Map;
public class ClassE extends ClassB {
    ClassD classD;
    ClassE(Object script, Map stepConfig){
        super(script, stepConfig);
        this.classD =new ClassD(script);
    }

    ClassE(Object script, Map stepConfig, ClassD classD){
        super(script, stepConfig);
        this.classD =classD;
    }

    String newMethod() {
        String flagVar = classD.callMethodFromClassD();
        System.out.println("Hey I am in E's method");
        return flagVar;
    }
    
}
