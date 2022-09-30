package com.example.SpringDataJpa.service;

import com.example.SpringDataJpa.entity.ChuyenBay;
import com.example.SpringDataJpa.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

    @Override
    public List<ChuyenBay> findAll() {
        return chuyenBayRepository.findAll();
    }

    @Override
    public List<ChuyenBay> findByGaDen(String gaDen) {
        return chuyenBayRepository.findByGaDen(gaDen);
    }

    @Override
    public List<ChuyenBay> findByDoDaiUnder10000Above8000() {
        return chuyenBayRepository.findByDoDaiUnder10000Above8000();
    }

    @Override
    public List<ChuyenBay> findBySaiGonToBuonMeThuoc() {
        return chuyenBayRepository.findBySaiGonToBuonMeThuoc();
    }

    @Override
    public int countChuyenBayFromSaiGon() {
        return chuyenBayRepository.countChuyenBayFromSaiGon();
    }

    @Override
    public List<ChuyenBay> getChuyenBayByLoaiMayBayAirbusA320() {
        return chuyenBayRepository.getChuyenBayByLoaiMayBayAirbusA320();
    }

    @Override
    public List<ChuyenBay> getChuyenBayForAToBToA() {
        return chuyenBayRepository.getChuyenBayForAToBToA();
    }

    @Override
    public List<Object[]> countChuyenBayByGaDi() {
        return chuyenBayRepository.countChuyenBayByGaDi();
    }

    @Override
    public List<Object[]> sumChiPhiByGadi() {
        return chuyenBayRepository.sumChiPhiByGadi();
    }

    @Override
    public List<Object[]> countCBByGadiBefore12h() {
        return chuyenBayRepository.countCBByGadiBefore12h();
    }

    @Override
    public List<ChuyenBay> getCBByLoaiMBBoeing() {
        return chuyenBayRepository.getCBByLoaiMBBoeing();
    }

    @Override
    public List<ChuyenBay> getCBBefore12h() {
        return chuyenBayRepository.getCBBefore12h();
    }
}
