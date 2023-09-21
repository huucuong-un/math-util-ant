/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.hucun.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ASUS
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Chuẩn bị data, mảng 2 chiều vì nó có n đưa vào và expected
    // và có nhiều cp85 như thế [7]
    //mảng 2 chiều [7][2]
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20 , 25 };
        int b[][] = {
                        {1, 0},
                        {1, 1},
                        {2, 2},
                        {6, 3},
                        {24, 4},
                        {120, 5},
                        {720, 6}
                    };
        return new Integer[][] {
                        {1, 0},
                        {1, 1},
                        {2, 2},
                        {6, 3},
                        {24, 4},
                        {120, 5},
                        {720, 6}
                    };
        //xài Wrapper Class nếu chơi với số
    }
    
    
    //SAu khi có bộ data qua mảng 2 chiều, JUnit sẽ tự lặp for
    //để lôi từng cặp data (1,0), ...
    //nhồi cặp này vào trong hàm so sánh..
    //nhưng nhồi = cách nào, gán value này vào biến nào đó
    //gán vào biến - tham số hóa parameterized
    //TA SẼ MAP/ÁNH XẠ 2 CỘT ỨNG VỚI 2 BIẾN: Cột 0 - Expected
    //                                       Cột 1- n đưa vào getF()
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //test thoai vì đã có các test case và data
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, n, MathUtil.getFactorial(n));
    }
    
    
    
    

    
}
//CLASS NÀY SẼ CHƯA CODE DÙNG ĐỂ TEST CODE CHÍNH BÊN CLASS MATHUTIL
//CLASS NÀY SẼ CHU7A1A71 CODE DÙNG ĐỂ TEST HÀM getF() coi hàm chạy đúng khong
//code để test code khác gọi là: TEST SCRIPT
//Trong script sẽ có những tính huống xài app, đưa data cụ thể vào
//chờ xẽm hàm xử lí kết quả có như kì vọng hay không?
//Một Test Script sẽ chứ nhiều Test Cases
//                              Mội Test Cases ứng với 1 tình huống xài hàm
//lệnh so sánh giá trị, lệnh gọi hàm đc lặp đi lặp lại với mỗi bộ test cases
// Assert.assertEquals(24, MathUtil.getFactorial(4));
//Cũng hàm này, lệnh này nhưng nó phải viết lại cho các bộ
//data sau

//Expected  n
//1         0
//1         1
//6         3
//24        4
//120       5
//720       6

//[7][2]


//Có cách nào kiểu thay 2 con số trong lenhj65 so sánh = ??? nào đó
// Assert.assertEquals(???, MathUtil.getFactorial(???));


//nếu ta tách được toàn bợ data trong các câu lệnh so sánh ở trên //
//ra 1 chỗ riêng biệt như hàng cột ở trên, sau đó
//ta chỉ việc pick/tỉa/lấy data này nạp dần vào/nhồi dần vào cái lện
//gọi hàm, ta sẽ đạt đc:
// - Code gọn gàng hơn không bị trùng lặp
// - Nhìn tổng quan biết có bao nhiêu test case và liệu rằng chúng đã
// đủ hay chưa


//Kĩ thuật viết test script (câu lệnh test) mà tách biệt data ra khỏi
//lệnh so sánh đc gọi bằng những tên sau
//

//  - PARAMETERIZED - THAM SỐ HÓA, BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI 
// TÊN BIẾN, LÁT HOII62 NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH

// - DDT - DATA DRIVEN TESTING VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA
// JUNIT FW HỖ TRỢ SẴN TA VỤ TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA
// NHỒI VÀO HÀM TƯƠNG ỨNG


//ĐỂ CHƠI VỚI DDT, TA CẦN
//- Tách data ra 1 chỗ - MẢNG   
//- Map cái data này vào các biến tương ứng
//- Nhồi các biến tường ứng này vào câu lệnh so sánh/gọi hàm
