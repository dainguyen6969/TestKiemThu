package com.example.testkiemthu.service;

import com.example.testkiemthu.model.SinhVien;


public class SinhVienService {
    public Boolean updateSinhVien(SinhVien sinhVien) {
        if(sinhVien == null) {
            return false;
        }

        if(deTrong(sinhVien.getMaSV()) ||
            deTrong(sinhVien.getChuyenNghanh()) ||
            deTrong(sinhVien.getTen())) {
            return false;
        }

        if(sinhVien.getDiemTrungBinh() < 0 || sinhVien.getDiemTrungBinh() > 10) {
            return false;
        }

        return true;
    }
    private Boolean deTrong(String s) {
        return s == null || s.trim().isEmpty();
    }

}
