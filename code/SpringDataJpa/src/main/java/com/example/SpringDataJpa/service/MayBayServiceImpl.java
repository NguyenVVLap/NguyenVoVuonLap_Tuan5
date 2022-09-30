package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.repository.MayBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayServiceImpl implements  MayBayService{
    @Autowired
    private MayBayRepository mayBayRepository;


    @Override
    public List<MayBay> findMayBayTamBayLonHon10000() {
        return mayBayRepository.findMayBayTamBayLonHon10000();
    }

    @Override
    public int countMayBayByLoaiBoeing() {
        return mayBayRepository.countMayBayByLoaiBoeing();
    }

    @Override
    public List<String> findMaMBDriveByNhanVienFirstNameNguyen() {
        return mayBayRepository.findMaMBDriveByNhanVienFirstNameNguyen();
    }

    @Override
    public List<String> getLoaiByMaCBVN280() {
        return mayBayRepository.getLoaiByMaCBVN280();
    }

    @Override
    public List<Object[]> getMayBayAndCountNV() {
        return mayBayRepository.getMayBayAndCountNV();
    }
}
