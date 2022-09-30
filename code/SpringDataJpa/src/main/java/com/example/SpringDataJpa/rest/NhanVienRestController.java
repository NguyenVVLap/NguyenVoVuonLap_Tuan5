package com.example.SpringDataJpa.rest;

import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienRestController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/luongduoi10000")
    public List<NhanVien> getNhanVienLuongUnder10000() {
        return nhanVienService.findNhanVienLuongUnder10000();
    }
}
