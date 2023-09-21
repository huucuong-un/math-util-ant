/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hucun.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

//CLASS NAY DEV SE VIET NHUNG CAU LENH DUNG DE TEST HAM CUA CODE CHINH
//VIEC VIET CODE DE TEST CODE GOI LA UNIT TESTING
//DOAN CODE DUNG DE TEST CODE CHINH GOI LA TEST SCRIPT
//MUON TEST THI PHAI PHAC THAO CAC TEST CASE
public class MathUtilTest {

     @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowException() {
        //Test case số #6: đưa data cà chớn
         System.out.println("Hope to see the Exception | IllegalArgumentException");
        MathUtil.getFactorial(-5);
    }
    
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        //Test case số #4: n = 3, hi vọng hàm trả về 6, thực tế hàm trả về mấy đoán xem ?
                Assert.assertEquals(6, MathUtil.getFactorial(3));


        //Test case số #5: n = 4, hi vọng hàm trả về 24, thực tế hàm trả về mấy đoán xem ?
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //Test case số #6: n = 5, hi vọng hàm trả về 120, thực tế hàm trả về mấy đoán xem ?
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case số #1: n = 0, hi vọng hàm trả về 1, thực tế hàm trả về mấy đoán xem ?
        long expected = 1;
        //long actual = ?? hàm chạy đi thì mới biêt
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        //Test case số #2: n = 1, hi vọng hàm trả về 1, thực tế hàm trả về mấy đoán xem ?
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        //Test case số #2: n = 2, hi vọng hàm trả về 2, thực tế hàm trả về mấy đoán xem ?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }

    @Test
    public void tryJUnitComparison() {
        //hàm này để thử nghiệm việc so sánh expected vs. actual
        Assert.assertEquals(100, 100);

    }

}
