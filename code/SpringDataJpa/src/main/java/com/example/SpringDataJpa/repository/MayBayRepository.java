package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
    @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
    public List<MayBay> findMayBayTamBayLonHon10000();

    @Query(value = "select count(*) from maybay where Loai like '%Boeing%'", nativeQuery = true)
    public int countMayBayByLoaiBoeing();

    @Query(value = "SELECT maybay.mamb FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE nhanvien.ten like 'Nguyen%' " +
            "GROUP by maybay.mamb;", nativeQuery = true)
    public List<String> findMaMBDriveByNhanVienFirstNameNguyen();

    @Query(value = "select Loai from maybay where TamBay < (select DoDai from chuyenbay where MaCB = 'VN280')",nativeQuery = true)
    public List<String> getLoaiByMaCBVN280();

    @Query(value = "SELECT maybay.MaMB, maybay.Loai, count( nhanvien.MaNV) "
            + "FROM chungnhan INNER JOIN "
            + "maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN "
            + "nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "GROUP BY maybay.MaMB, maybay.Loai",nativeQuery = true)
    public List<Object[]> getMayBayAndCountNV();
}
