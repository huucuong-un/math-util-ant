/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hucun.mathutil.main;

import com.hucun.mathutil.core.MathUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        System.out.println("This jar file is built based ANT co-operating  with JUnit");
        System.out.println("Moreover, this message comes from a US-BUILT'S JAR FILE");
        tryTDDFirst();
        System.out.println("Ahihi ");
        
    
    }

    //hàm này đc viết ra để dùng thử kĩ thuật viết code kiểu TDD
    public static void tryTDDFirst() {

        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm)
        long expected = 1;
        long actual = MathUtil.getFactorial(1);

        //so sánh expected vs. actual coi chúng nó giống nhau không?
        //giống -> hàm đúng với case đang test
        //sai -> bug rồi !!!với casae đang teest
        //TEST CASE LÀ GÌ?
        // LÀ 1 TÌNH HUỐNG XÀI APP/KIỂM THỬ APP/ KIỂM THỬ TÍNH NĂNG/MÀN HINH2
        //TEST Case là tình huống kiểm thử app/chức năng mà khi đó ta phải:
        // - đưa vào data giả/mẫu/test,
        //- đưa giá trị kì vọng ta mong chờ app trả ra
        //sau đó chờ hàm/tính năng
        //xử lí xong trả ra kết quả
        //vca2 ta nhìn kết quả và ta so sánh với kì vọng trước đó!!
        //để kết luận hàm ổn/ tính năng ổn, TEST CASE PASSED
        //                                  TEST CASE FAILED
        System.out.println("Test 1! | Status:  "
                + "Expected: " + expected
                + " | Actual: " + actual);
    }

}
