package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements  NhanVienService{
    @Autowired
    private NhanVienRepository nhanVienRepository;


    @Override
    public List<NhanVien> findNhanVienLuongUnder10000() {
        return nhanVienRepository.findNhanVienLuongUnder10000();
    }

    @Override
    public int sumLuongForAllNhanVien() {
        return nhanVienRepository.sumLuongForAllNhanVien();
    }

    @Override
    public List<String> findNhanVienDriveMayBayBoeing() {
        return nhanVienRepository.findNhanVienDriveMayBayBoeing();
    }

    @Override
    public List<NhanVien> findNhanVienDriveMayBayId747() {
        return nhanVienRepository.findNhanVienDriveMayBayId747();
    }

    @Override
    public List<String> findNhanVienDriveMayBayBoeingAndAirbus() {
        return nhanVienRepository.findNhanVienDriveMayBayBoeingAndAirbus();
    }

    @Override
    public List<String> getTenNVByLoaiMBBoeing() {
        return nhanVienRepository.getTenNVByLoaiMBBoeing();
    }

    @Override
    public List<String> getMaNVDrive3LoaiMB() {
        return nhanVienRepository.getMaNVDrive3LoaiMB();
    }

    @Override
    public List<Object[]> getMaNVAndMaxTamBayOfNVDrive3LoaiMB() {
        return nhanVienRepository.getMaNVAndMaxTamBayOfNVDrive3LoaiMB();
    }

    @Override
    public List<Object[]> getMaNVAndCountLoaiMB() {
        return nhanVienRepository.getMaNVAndCountLoaiMB();
    }

    @Override
    public List<Object[]> getNVNotPhiCong() {
        return nhanVienRepository.getNVNotPhiCong();
    }

    @Override
    public List<String> getMaNVLuongMax() {
        return nhanVienRepository.getMaNVLuongMax();
    }

    @Override
    public int sumLuongPhiCong() {
        return nhanVienRepository.sumLuongPhiCong();
    }
}
