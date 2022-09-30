package com.example.SpringDataJpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "MaMB")
    private int maMB;
    @Column(name = "Loai")
    private String loai;
    @Column(name = "TamBay")
    private int tamBay;
}
