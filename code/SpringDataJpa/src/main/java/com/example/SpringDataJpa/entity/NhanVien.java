package com.example.SpringDataJpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="nhanvien")
public class NhanVien {
    @Id
    @Column(name = "MaNV")
    private String maNV;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Luong")
    private int luong;
}
