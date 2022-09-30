package com.example.SpringDataJpa.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "MaNV", nullable = false)
    private NhanVien nhanVien;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "MaMB", nullable = false)
    private MayBay mayBay;
}
