package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.entity.ChungNhan;
import com.example.SpringDataJpa.entity.ChungNhanPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK> {

}
