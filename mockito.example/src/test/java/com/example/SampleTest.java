package com.example;

import static org.assertj.core.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.HashMap;
import java.util.Map;

public class SampleTest {
    
    @Mock ClassD classDMock;
    @InjectMocks ClassA ClassAInjected;

    Object script;
    Map <String, Integer> someMap = new HashMap<>();
    //add values in someMap


    @Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
        this.script="this is a string";

	}

    @Test
	public void testMockMethod(){
        ClassD classD = mock(ClassD.class);
        String someString = "method from ClassD was MOCKED";
        ClassA classA = new ClassA(script, someMap);
//        ReflectionTestUtils.setField(classA, "classD", classD);
        when(classD.callMethodFromClassD()).thenReturn(someString);
        String outPutVal = classA.newMethod();
        System.out.println(outPutVal);
    }

    @Test
    public void testMockAnnotation(){
        String someString = "method from ClassD was MOCKED";
        when(classDMock.callMethodFromClassD()).thenReturn(someString);
        String outPutVal = ClassAInjected.newMethod();
        System.out.println(outPutVal);
    }

    @Test
    public void testClassWithConstructor(){
        ClassD classD = mock(ClassD.class);
        String someString = "method from ClassD was MOCKED";
        ClassE classE = new ClassE(script, someMap, classD);
        when(classD.callMethodFromClassD()).thenReturn(someString);
        String outPutVal = classE.newMethod();
        System.out.println(outPutVal);
    }

}
