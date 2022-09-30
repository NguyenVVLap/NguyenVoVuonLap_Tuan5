package com.example.SpringDataJpa;


import com.example.SpringDataJpa.entity.ChuyenBay;
import com.example.SpringDataJpa.entity.MayBay;
import com.example.SpringDataJpa.entity.NhanVien;
import com.example.SpringDataJpa.service.ChuyenBayService;
import com.example.SpringDataJpa.service.MayBayService;
import com.example.SpringDataJpa.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	ChuyenBayService chuyenBayService;

	@Autowired
	MayBayService mayBayService;

	@Autowired
	NhanVienService nhanVienService;


	//1. Cho biết các chuyến bay đi Đà Lạt (DAD).
	@Test
	void testCau1() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findByGaDen("DAD");
		System.out.println("- Các chuyến bay đi Đà Lạt (DAD):");
		for (ChuyenBay cb: chuyenBays) {
			System.out.println(cb);
		}
	}

	//2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Test
	void testCau2() {
		List<MayBay> mayBays = mayBayService.findMayBayTamBayLonHon10000();
		System.out.println("- Máy bay có tầm bay lớn hơn 10,000km:");
		for (MayBay mb: mayBays) {
			System.out.println(mb);
		}
	}

	//3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@Test
	void testCau3() {
		List<NhanVien> nhanViens = nhanVienService.findNhanVienLuongUnder10000();
		System.out.println("- Các nhân viên có lương nhỏ hơn 10,000:");
		for (NhanVien nv: nhanViens) {
			System.out.println(nv);
		}
	}

	//4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
	@Test
	void testCau4() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findByDoDaiUnder10000Above8000();
		System.out.println("- Các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km:");
		for (ChuyenBay cb: chuyenBays) {
			System.out.println(cb);
		}
	}

	//5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@Test
	void testCau5() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findBySaiGonToBuonMeThuoc() ;
		System.out.println("- Các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV):");
		for (ChuyenBay cb: chuyenBays) {
			System.out.println(cb);
		}
	}

	//6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@Test
	void testCau6() {
		int count = chuyenBayService.countChuyenBayFromSaiGon() ;
		System.out.println("- Số chuyến bay xuất phát từ Sài Gòn (SGN): " + count);
	}

	//7. Có bao nhiêu loại máy bay Boeing.
	@Test
	void testCau7() {
		int count = mayBayService.countMayBayByLoaiBoeing();
		System.out.println("- Số máy bay loại Boeing: " + count);
	}

	//8. Cho biết tổng số lương phải trả cho các nhân viên.
	@Test
	void testCau8() {
		int luong = nhanVienService.sumLuongForAllNhanVien();
		System.out.println("- Tổng số lương phải trả cho các nhân viên: " + luong);
	}

	//9. Cho biết mã số của các phi công lái máy báy Boeing.
	@Test
	void testCau9() {
		List<String> listMaNV = nhanVienService.findNhanVienDriveMayBayBoeing();
		System.out.println("- Mã số của các phi công lái máy báy Boeing: ");
		for (String msnv: listMaNV) {
			System.out.println(msnv);
		}
	}

	//10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@Test
	void testCau10() {
		List<NhanVien> listNV = nhanVienService.findNhanVienDriveMayBayId747();
		System.out.println("- Các nhân viên có thể lái máy bay có mã số 747: ");
		for (NhanVien nv: listNV) {
			System.out.println(nv);
		}
	}

	//11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@Test
	void testCau11() {
		List<String> listMaMB = mayBayService.findMaMBDriveByNhanVienFirstNameNguyen();
		System.out.println("- Mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái: ");
		for (String ma: listMaMB) {
			System.out.println(ma);
		}
	}

	//12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@Test
	void testCau12() {
		List<String> listMaNV = nhanVienService.findNhanVienDriveMayBayBoeingAndAirbus();
		System.out.println("- Mã số của các phi công vừa lái được Boeing vừa lái được Airbus: ");
		for (String ma: listMaNV) {
			System.out.println(ma);
		}
	}

	//13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
	@Test
	void testCau13() {
		List<String> listLoaiMB = mayBayService.getLoaiByMaCBVN280();
		System.out.println("- Các loại máy bay có thể thực hiện chuyến bay VN280: ");
		for (String loai: listLoaiMB) {
			System.out.println(loai);
		}
	}

	//14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.
	@Test
	void testCau14() {
		List<ChuyenBay> listCB = chuyenBayService.getChuyenBayByLoaiMayBayAirbusA320();
		System.out.println("- Các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320: ");
		for (ChuyenBay cb: listCB) {
			System.out.println(cb);
		}
	}

	//15. Cho biết tên của các phi công lái máy bay Boeing.
	@Test
	void testCau15() {
		List<String> listTen = nhanVienService.getTenNVByLoaiMBBoeing();
		System.out.println("- Tên của các phi công lái máy bay Boeing: ");
		for (String ten: listTen) {
			System.out.println(ten);
		}
	}

	//16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
	@Test
	void testCau16() {
		List<Object[]> objs = mayBayService.getMayBayAndCountNV();
		for (Object[] obj: objs) {
			System.out.println("- Mã số: " + obj[0] + ", Loại: " + obj[1] + ", Tổng số phi công có thể lái: " + obj[2]);
		}
	}

	//17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
	@Test
	void testCau17() {
		List<ChuyenBay> listCB = chuyenBayService.getChuyenBayForAToBToA();
		System.out.println("- Các đường bay cho khách đi thẳng từ ga A đến ga B rồi quay trở về ga A: ");
		for (ChuyenBay cb: listCB) {
			System.out.println(cb);
		}
	}

	//18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
	@Test
	void testCau18() {
		List<Object[]> objs = chuyenBayService.countChuyenBayByGaDi();
		for (Object[] obj: objs) {
			System.out.println("- Ga đi: " + obj[0] + ", Số chuyến bay: " + obj[1]);
		}
	}

	//19. Với mỗi ga có chuyến  bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.
	@Test
	void testCau19() {
		List<Object[]> objs = chuyenBayService.sumChiPhiByGadi();
		for (Object[] obj: objs) {
			System.out.println("- Ga đi: " + obj[0] + ", Tổng chi phí: " + obj[1]);
		}
	}

	//20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00.
	@Test
	void testCau20() {
		List<ChuyenBay> listCB = chuyenBayService.getCBBefore12h();
		System.out.println("- Các chuyến bay có thể khởi hành trước 12:00: ");
		for (ChuyenBay cb: listCB) {
			System.out.println(cb);
		}
	}

	//21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
	@Test
	void testCau21() {
		List<Object[]> objs = chuyenBayService.countCBByGadiBefore12h();
		for (Object[] obj: objs) {
			System.out.println("- Ga đi: " + obj[0] + ", Số chuyến bay trước 12h: " + obj[1]);
		}
	}

	//22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay.
	@Test
	void testCau22() {
		List<String> listMaNV = nhanVienService.getMaNVDrive3LoaiMB();
		System.out.println("- Mã số của các phi công chỉ lái được 3 loại máy bay: ");
		for (String maNV: listMaNV) {
			System.out.println(maNV);
		}
	}

	//23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
	@Test
	void testCau23() {
		List<Object[]> objs = nhanVienService.getMaNVAndMaxTamBayOfNVDrive3LoaiMB();
		System.out.println("- Phi công có thể lái nhiều hơn 3 loại máy bay: ");
		for (Object[] obj: objs) {
			System.out.println("Mã NV: " + obj[0] + ", Tầm bay lớn nhất: " + obj[1]);
		}
	}

	//24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
	@Test
	void testCau24() {
		List<Object[]> objs = nhanVienService.getMaNVAndCountLoaiMB();
		for (Object[] obj: objs) {
			System.out.println("- Mã NV: " + obj[0] + ", Tổng loại máy bay có thể lái: " + obj[1]);
		}
	}

	//25. Tìm các nhân viên không phải là phi công.
	@Test
	void testCau25() {
		List<Object[]> objs = nhanVienService.getNVNotPhiCong();
		System.out.println("- Các nhân viên không phải là phi công: ");
		for (Object[] obj: objs) {
			System.out.println("Mã NV: " + obj[0] + ", Tên NV: " + obj[1] + ", Lương: " + obj[2]);
		}
	}

	//26. Cho biết mã số của các nhân viên có lương cao nhất.
	@Test
	void testCau26() {
		List<String> listMaNV = nhanVienService.getMaNVLuongMax();
		System.out.println("- Mã số của các nhân viên có lương cao nhất: ");
		for (String maNV: listMaNV) {
			System.out.println(maNV);
		}
	}

	//27. Cho biết tổng số lương phải trả cho các phi công.
	@Test
	void testCau27() {
		int luong = nhanVienService.sumLuongPhiCong();
		System.out.println("- Tổng số lương phải trả cho các phi công: " + luong);
	}

	//28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.
	@Test
	void testCau28() {
		List<ChuyenBay> listCB = chuyenBayService.getCBByLoaiMBBoeing();
		System.out.println("- Các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing: ");
		for (ChuyenBay cb: listCB) {
			System.out.println(cb);
		}
	}


}
