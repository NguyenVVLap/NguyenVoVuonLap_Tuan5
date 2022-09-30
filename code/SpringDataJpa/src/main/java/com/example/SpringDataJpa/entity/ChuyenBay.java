package com.example.SpringDataJpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "MaCB")
    private String maCB;
    @Column(name = "GaDi")
    private String gaDi;
    @Column(name = "GaDen")
    private String gaDen;
    @Column(name = "DoDai")
    private int doDai;
    @Column(name = "GioDi")
    private Date gioDi;
    @Column(name = "GioDen")
    private Date gioDen;
    @Column(name = "ChiPhi")
    private int chiPhi;

}
