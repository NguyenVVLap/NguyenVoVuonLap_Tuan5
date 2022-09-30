package com.example.SpringDataJpa.rest;

import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
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

    @GetMapping("/tongluong")
    public int cau8() {
        return nhanVienService.sumLuongForAllNhanVien();
    }

    @GetMapping("/driveboeing")
    public List<String> cau9() {
        return nhanVienService.findNhanVienDriveMayBayBoeing();
    }

    @GetMapping("/drivembid747")
    public List<NhanVien> cau10() {
        return nhanVienService.findNhanVienDriveMayBayId747();
    }

    @GetMapping("/drivembboeingandairbus")
    public List<String> cau12() {
        return nhanVienService.findNhanVienDriveMayBayBoeingAndAirbus();
    }

    @GetMapping("/loaimbboeing")
    public List<String> cau15() {
        return nhanVienService.getTenNVByLoaiMBBoeing();
    }

    @GetMapping("/lai3loaimb")
    public List<String> cau22() {
        return nhanVienService.getMaNVDrive3LoaiMB();
    }

    @GetMapping("/maandtambaymaxnvlai3loaimb")
    public List<HashMap<String, Object>> cau23() {
        List<Object[]> objs = nhanVienService.getMaNVAndMaxTamBayOfNVDrive3LoaiMB();
        List<HashMap<String, Object>> result = new ArrayList<>();
        for (Object[] obj: objs) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("Mã NV", obj[0]);
            map.put("Tầm bay lớn nhất", obj[1]);
            result.add(map);
        }
        return result;
    }

    @GetMapping("/demloaimaybaylaitheomanv")
    public List<HashMap<String, Object>> cau24() {
        List<Object[]> objs = nhanVienService.getMaNVAndCountLoaiMB();
        List<HashMap<String, Object>> result = new ArrayList<>();
        for (Object[] obj: objs) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("Mã NV", obj[0]);
            map.put("Tổng loại máy bay có thể lái", obj[1]);
            result.add(map);
        }
        return result;
    }

    @GetMapping("/notphicong")
    public List<HashMap<String, Object>> cau25() {
        List<Object[]> objs = nhanVienService.getNVNotPhiCong();
        List<HashMap<String, Object>> result = new ArrayList<>();
        for (Object[] obj: objs) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("Mã NV", obj[0]);
            map.put("Tên NV", obj[1]);
            map.put("Lương", obj[2]);
            result.add(map);
        }
        return result;
    }


}
