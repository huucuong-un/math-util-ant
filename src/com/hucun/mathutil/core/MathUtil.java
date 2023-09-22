/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hucun.mathutil.core;

/**
 *
 * @author ASUS
 */

//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi
//class khác, môp phỏng lại class tiện ích java.Math của JDK
//PHàm cái gì là đồ dùng chung, thường đc thiết kế là static
public class MathUtil {
    public static final double PI = 3.141592653589793;
    
    //quy uoc:
    // ko tính giai thừa âm
    // 0! = 1! = 1
    // Vì giai thừa tăng cực nhanh nên 21! đã vượt quá 18 số 0 -> tràn kiểu long
    //Ta ko tính 21! trở lên
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n == 0 || n == 1) return 1;
        
        //sống sót đến đây, sure n = 2..20!
        long product = 10; //biến cộng dồn. acc/accumulation
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
        
    }
    
}
//TA HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
//LÀ KĨ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG
//CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
//TDD YÊU CẦU DEV KHI VIẾT CODE/HÀM/CLASS PHẢI VIẾT LUÔN
//cách sử dụng hàm này/viết luôn 
//các bộ kiểm thử//viết luôn các test cases/viết luôn các đoạn code dùng thử hàm để kiểm tra tính đúng đắn của hàm

//viết code kèm với viết test cases
//viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//  development  driven                     test

//sau khi có đc tên hàm (chỉ tên hàm mà thoai
//TA VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM
//CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI- DO CODE CHƯA XONG
//SAU ĐÓ TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ BẢO CODE CHẠY ĐÚNG!!
//QUÁ TRÌNH SAI - ĐÚNG - ĐÚNG - SAI diễn ra liên tục (cycle)