package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    public List<NhanVien> findNhanVienLuongUnder10000();
    public int sumLuongForAllNhanVien();
    public List<String> findNhanVienDriveMayBayBoeing();
    public List<NhanVien> findNhanVienDriveMayBayId747();
    public List<String> findNhanVienDriveMayBayBoeingAndAirbus();
    public List<String> getTenNVByLoaiMBBoeing();
    public List<String> getMaNVDrive3LoaiMB();
    public List<Object[]> getMaNVAndMaxTamBayOfNVDrive3LoaiMB();
    public List<Object[]> getMaNVAndCountLoaiMB();
    public List<Object[]> getNVNotPhiCong();
    public List<String> getMaNVLuongMax();
    public int sumLuongPhiCong();

}
