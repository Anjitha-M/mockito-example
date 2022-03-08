package com.example;


import java.util.Map;

class ClassC {
    protected final Object script;
    protected final Map stepConfig;
    protected final ClassD classD;

    ClassC( Object script, Map stepConfig){

        this.script = script;
        this.stepConfig = stepConfig;
        this.classD = new ClassD(script);

    }
}