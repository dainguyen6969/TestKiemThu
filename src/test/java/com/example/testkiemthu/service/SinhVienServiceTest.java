package com.example.testkiemthu.service;

import com.example.testkiemthu.model.SinhVien;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private final SinhVienService svs = new SinhVienService();

    @Test
    public void testSuaSinhVienHopLe() {
        SinhVien sinhVien = new SinhVien("TH01", "Dai", 18, 7.5f, 5, "CNTT");
        assertTrue(svs.updateSinhVien(sinhVien));
    }

    @Test
    public void testSuaSinhVienTrong() {
        SinhVien sinhVien = new SinhVien("TH01", "", 18, 7.5f, 5, "CNTT");
        assertFalse(svs.updateSinhVien(sinhVien));
    }

    @Test
    public void testSuaSinhVienKhongHopLe() {
        SinhVien sinhVien = new SinhVien("TH01", "Dai", 18, -7.5f, 5, "CNTT");
        assertFalse(svs.updateSinhVien(sinhVien));
    }

    @Test
    public void testSuaSinhVienBang10() {
        SinhVien sinhVien = new SinhVien("TH01", "Dai", 18, 10f, 5, "CNTT");
        assertTrue(svs.updateSinhVien(sinhVien));
    }

    @Test
    public void testSuaSinhVienBang0() {
        SinhVien sinhVien = new SinhVien("TH01", "Dai", 18, 0.0f, 5, "CNTT");
        assertTrue(svs.updateSinhVien(sinhVien));
    }

    @Test
    public void testSuaSinhVienDiemAm() {
        SinhVien sinhVien = new SinhVien("TH01", "Dai", 18, -1.0f, 5, "CNTT");
        assertFalse(svs.updateSinhVien(sinhVien));
    }

    @Test
    public void testSuaSinhVienLonHon10() {
        SinhVien sinhVien = new SinhVien("TH01", "Dai", 18, 10.5f, 5, "CNTT");
        assertFalse(svs.updateSinhVien(sinhVien));
    }
}