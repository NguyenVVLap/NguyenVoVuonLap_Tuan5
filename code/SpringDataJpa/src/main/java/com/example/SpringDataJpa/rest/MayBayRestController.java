package com.example.SpringDataJpa.rest;

import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.service.MayBayService;
import com.example.SpringDataJpa.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/countnvwithmb")
    public List<HashMap<String, Object>> cau16() {
        List<Object[]> objs = mayBayService.getMayBayAndCountNV();
        List<HashMap<String, Object>> result = new ArrayList<>();
        for (Object[] obj: objs) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("Mã số", obj[0]);
            map.put("Loại", obj[1]);
            map.put("Tổng số phi công có thể lái", obj[2]);
            result.add(map);
        }
        return result;
    }
}
