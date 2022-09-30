package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.MayBay;

import java.util.List;

public interface MayBayService {
    public List<MayBay> findMayBayTamBayLonHon10000();
    public int countMayBayByLoaiBoeing();
    public List<String> findMaMBDriveByNhanVienFirstNameNguyen();
    public List<String> getLoaiByMaCBVN280();
    public List<Object[]> getMayBayAndCountNV();


}
