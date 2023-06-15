/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.anlh.mathutil.core.test;

import static org.anlh.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author localboss
 */
public class MathUtilityTest {

    //test ngoại lệ thì sao?
    @Test //(expected = ten-ngoai-le.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //assertThrows(expectedType,    executable);
        //                              đoạn code gây ra ngoại lệ
        //            ngoại lệ cần bắt 
        //                              đưa 1 object chứa đoạn code gây ra ngoại lệ
        //                              lambda expression đưa vào
        
//        org.junit.jupiter.api.function.Executable ex = new org.junit.jupiter.api.function.Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        org.junit.jupiter.api.function.Executable exLambda = ()-> getFactorial(-5);
        assertThrows(IllegalArgumentException.class, ()->getFactorial(-5));
    }

    @Test
    public void testFactorialGivenRightArguementReturnsWell() {
//        assertEquals(70, 70);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
    }

}
