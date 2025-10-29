package com.example.testkiemthu.phan1;

import java.util.List;

public class TinhTongSoNguyen {
    public static int sum(int[] arr) throws IllegalAccessException {
        int total = 0;
        for(int n : arr) {
            if(n < 1 || n > 1000) {
                throw new IllegalAccessException("Khong duoc vuot be hon 1 va nho hon 1000:" + n);
            }
            total = total + n;
        }
        return total;
    }
}
