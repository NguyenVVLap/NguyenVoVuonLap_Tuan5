package com.example.SpringDataJpa.rest;

import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/maybay")
@RestController
public class MayBayRestController {
    @Autowired
    MayBayService mayBayService;

    @GetMapping("/tambayhon10000")
    public List<MayBay> getChuyenBayDaLat() {
        return mayBayService.findMayBayTamBayLonHon10000();
    }
}
