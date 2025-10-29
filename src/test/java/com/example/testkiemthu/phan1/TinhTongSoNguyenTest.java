package com.example.testkiemthu.phan1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoNguyenTest {
    @Test
    void testValidArray() throws IllegalAccessException {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testTrongArray() throws IllegalAccessException {
        int[] arr = {};
        assertEquals(0, TinhTongSoNguyen.sum(arr));
    }

    @Test
    void test1GiaTriArray() throws IllegalAccessException {
        int[] arr = {500};
        assertEquals(500, TinhTongSoNguyen.sum(arr));
    }

    // Phân vùng không hợp lệ
    @Test
    void testValueBelowRange() {
        int[] arr = {0, 5, 10};
        assertThrows(IllegalAccessException.class, () -> TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testGiaTriCanBienArray() throws IllegalAccessException {
        int[] arr = {1, 999, 1001};
        assertThrows(IllegalAccessException.class, () -> TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testGiaTriBienArray1() throws IllegalAccessException {
        int[] arr = {1};
        assertEquals(1, TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testGiaTriBienArray2() throws IllegalAccessException {
        int[] arr = {1000};
        assertEquals(1000, TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testGiaTriBienKetHopArray3() throws IllegalAccessException {
        int[] arr = {1, 1000};
        assertEquals(1001, TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testBelowLowerBoundary() {
        int[] arr = {0};
        assertThrows(IllegalAccessException.class, () -> TinhTongSoNguyen.sum(arr));
    }

    @Test
    void testAboveUpperBoundary() {
        int[] arr = {1001};
        assertThrows(IllegalAccessException.class, () -> TinhTongSoNguyen.sum(arr));
    }
}