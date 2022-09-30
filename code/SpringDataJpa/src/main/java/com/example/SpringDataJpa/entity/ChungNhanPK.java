package com.example.SpringDataJpa.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class ChungNhanPK implements Serializable {
    private String nhanVien;
    private int mayBay;

}
