package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    @Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
    public List<NhanVien> findNhanVienLuongUnder10000();

    @Query(value = "select sum(luong) from nhanvien", nativeQuery = true)
    public int sumLuongForAllNhanVien();

    @Query(value = "SELECT nhanvien.manv FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE loai like '%Boeing%' " +
            "GROUP by nhanvien.manv;", nativeQuery = true)
    public List<String> findNhanVienDriveMayBayBoeing();

    @Query(value = "SELECT nhanvien.manv, nhanvien.ten, nhanvien.luong FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE maybay.mamb='747'" +
            "GROUP by nhanvien.manv;", nativeQuery = true)
    public List<NhanVien> findNhanVienDriveMayBayId747();

    @Query(value = "SELECT nhanvien.manv FROM " +
            "public.maybay inner join chungnhan on maybay.mamb=chungnhan.mamb " +
            "inner join nhanvien on chungnhan.manv=nhanvien.manv  " +
            "WHERE maybay.loai like '%Boeing%' or maybay.loai like '%Airbus%'" +
            "GROUP by nhanvien.manv;", nativeQuery = true)
    public List<String> findNhanVienDriveMayBayBoeingAndAirbus();

    @Query(value = "SELECT nhanvien.Ten "
            + "FROM maybay INNER JOIN "
            + "chungnhan ON maybay.MaMB = chungnhan.MaMB INNER JOIN "
            + "nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "where maybay.Loai like '%Boeing%' "
            + "GROUP BY nhanvien.Ten",nativeQuery = true)
    public List<String> getTenNVByLoaiMBBoeing();

    @Query(value = "SELECT chungnhan.MaNV FROM chungnhan GROUP BY(chungnhan.MaNV) HAVING COUNT(chungnhan.MaMB) = 3",nativeQuery = true)
    public List<String> getMaNVDrive3LoaiMB();

    @Query(value = "SELECT chungnhan.MaNV,MAX(maybay.TamBay) FROM chungnhan INNER JOIN maybay on maybay.MaMB = chungnhan.MaMB \r\n"
            + "GROUP BY(chungnhan.MaNV)\r\n"
            + "HAVING COUNT(chungnhan.MaMB) > 3 ",nativeQuery = true)
    public List<Object[]> getMaNVAndMaxTamBayOfNVDrive3LoaiMB();

    @Query(value = "SELECT MaNV, count(MaMB) FROM chungnhan "
            + "GROUP BY (MaNV) ",nativeQuery = true)
    public List<Object[]> getMaNVAndCountLoaiMB();

    @Query(value = "select nhanvien.MaNV, Ten, Luong from nhanvien full outer join " +
            "chungnhan on nhanvien.MaNV=chungnhan.MaNV " +
            "where chungnhan.MaNV is null",nativeQuery = true)
    public List<Object[]> getNVNotPhiCong();

    @Query(value = "select MaNV from nhanvien where luong = (select luong from nhanvien order by luong desc limit 1)", nativeQuery = true)
    public List<String> getMaNVLuongMax();

    @Query(value = "select sum(luong) from nhanvien " +
            "where manv in (select nhanvien.manv from nhanvien inner join " +
            "chungnhan on nhanvien.MaNV=chungnhan.MaNV " +
            "group by nhanvien.maNV)",nativeQuery = true)
    public int sumLuongPhiCong();
}


