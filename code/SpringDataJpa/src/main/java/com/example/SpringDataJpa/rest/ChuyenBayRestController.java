package com.example.SpringDataJpa.rest;

import com.example.SpringDataJpa.entity.ChuyenBay;
import com.example.SpringDataJpa.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chuyenbay")
public class ChuyenBayRestController {
    @Autowired
    ChuyenBayService chuyenBayService;

    @GetMapping("/didalat")
    public List<ChuyenBay> getChuyenBayDaLat() {
        return chuyenBayService.findByGaDen("DAD");
    }

    @GetMapping("/dodaiduoi10000tren8000")
    public List<ChuyenBay> cau4() {
        return chuyenBayService.findByDoDaiUnder10000Above8000();
    }
}
