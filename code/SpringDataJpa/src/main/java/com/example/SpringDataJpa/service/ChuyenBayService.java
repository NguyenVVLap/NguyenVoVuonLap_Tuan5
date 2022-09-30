package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.ChuyenBay;

import java.util.List;

public interface ChuyenBayService {
    public List<ChuyenBay> findAll();
    public List<ChuyenBay> findByGaDen(String gaDen);

    public List<ChuyenBay> findByDoDaiUnder10000Above8000();
    public List<ChuyenBay> findBySaiGonToBuonMeThuoc();
    public int countChuyenBayFromSaiGon();
    public List<ChuyenBay> getChuyenBayByLoaiMayBayAirbusA320();

    public List<ChuyenBay> getChuyenBayForAToBToA();
    public List<Object[]> countChuyenBayByGaDi();
    public List<Object[]> sumChiPhiByGadi();
    public List<ChuyenBay> getCBBefore12h();
    public List<Object[]> countCBByGadiBefore12h();
    public List<ChuyenBay> getCBByLoaiMBBoeing();
}
