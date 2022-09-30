package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    public List<ChuyenBay> findByGaDen(String gaDen);

    @Query(value = "select * from chuyenbay where dodai < 10000 and dodai > 8000", nativeQuery = true)
    public List<ChuyenBay> findByDoDaiUnder10000Above8000();

    @Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
    public List<ChuyenBay> findBySaiGonToBuonMeThuoc();

    @Query(value = "select count(*) from chuyenbay where GaDi = 'SGN'", nativeQuery = true)
    public int countChuyenBayFromSaiGon();

    @Query(value = "select * from chuyenbay where DoDai < (select TamBay from maybay where Loai = 'Airbus A320')",nativeQuery = true)
    public List<ChuyenBay> getChuyenBayByLoaiMayBayAirbusA320();

    @Query(value = "select * from chuyenbay where GaDen in  (select GaDi from chuyenbay ) and ( GaDi in  (select GaDen from chuyenbay ))",nativeQuery = true)
    public List<ChuyenBay> getChuyenBayForAToBToA();

    @Query(value = "select GaDi, count(GaDi) from chuyenbay group by GaDi", nativeQuery = true)
    public List<Object[]> countChuyenBayByGaDi();

    @Query(value = "SELECT chuyenbay.GaDi, SUM(chuyenbay.ChiPhi) as total FROM chuyenbay GROUP BY (chuyenbay.GaDi)",nativeQuery = true)
    public List<Object[]> sumChiPhiByGadi();

    @Query(value = "select * from chuyenbay where GioDi <'12:00:00'",nativeQuery = true)
    public List<ChuyenBay> getCBBefore12h();

    @Query(value = "select GaDi,COUNT(GaDi) from chuyenbay where GioDi <'12:00:00' group by GaDi",nativeQuery = true)
    public List<Object[]> countCBByGadiBefore12h();

    @Query(value = "select * from chuyenbay where chuyenbay.DoDai < ( select max(maybay.TamBay) from maybay where maybay.Loai like '%Boeing%' )",nativeQuery = true)
    public List<ChuyenBay> getCBByLoaiMBBoeing();
}
