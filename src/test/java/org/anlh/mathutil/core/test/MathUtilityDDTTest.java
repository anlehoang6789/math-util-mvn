/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.anlh.mathutil.core.test;

import org.anlh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author localboss
 */
public class MathUtilityDDTTest {
    
   public static Object[][] initTestData(){
       
       Integer testData[][] = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {5, 120}};
                               //n  expected
                               //c0  c1
       return testData;
   }
    //Nhồi data ở trên vào trong hàm assertEquals(expected-cột 1, getF(cột 0));
   
   @ParameterizedTest 
   @MethodSource("initTestData")
   public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
       assertEquals(expected, MathUtility.getFactorial(n));
   }
}

//Kĩ thuật DDT - Data Driven Testing - tách data kiểm thử ra khỏi 
//câu lệnh assert() cho dễ theo dõi, dễ bảo trì các bộ TEST CASE, CÁC BỘ TEST DATA

//THƯỜNG DÙNG MẢNG 2 CHIỀU ĐỂ CHỨA BỘ TEST
//mảng 2 chiều gồm: các input và expected
//các unit test framework tự động biết cách trích từng gặp
// INPUT/EXPECTED ở trong mảng ra rồi nhồi vào trong hàm so sánh

//Mảng dữ liệu test case phải là public static - Quy ước