/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anlh.mathutil.core;

/**
 *
 * @author localboss
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm tính n! = 1.2.3....n
    //0! = 1! = 1
    //ko có giai thừa âm
    //21! vượt kiểu long, vượt quá 18 con số 0 => cài ràng buộc đầu vào cho hàm/method 
    //mình kh chấp nhận n > 20
    
    public static long getFactorial(int n){
        long product = 1; //tích ban đầu = 1
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 ..20, plz.");
        
        if(n == 0 || n == 1)
            return 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
        
    }
    //return sớm để hàm kh báo lỗi 
}
