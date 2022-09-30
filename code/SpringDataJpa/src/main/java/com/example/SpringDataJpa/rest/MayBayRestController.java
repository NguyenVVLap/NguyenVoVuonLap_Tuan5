package com.example.SpringDataJpa.rest;

import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.service.MayBayService;
import com.example.SpringDataJpa.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/maybay")
@RestController
public class MayBayRestController {
    @Autowired
    private MayBayService mayBayService;

    @GetMapping("/tambayhon10000")
    public List<MayBay> getChuyenBayDaLat() {
        return mayBayService.findMayBayTamBayLonHon10000();
    }

    @GetMapping("/countmbboeing")
    public int cau7() {
        return mayBayService.countMayBayByLoaiBoeing();
    }

    @GetMapping("/nvhonguyendrive")
    public List<String> cau11() {
        return mayBayService.findMaMBDriveByNhanVienFirstNameNguyen();
    }

    @GetMapping("/bymachuyenbay")
    public List<String> cau13() {
        return mayBayService.getLoaiByMaCBVN280();
    }
}
