package br.com.axolot.animal.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.axolot.animal.model.DinosaurEntity;

@Repository
public interface DinoRepository extends JpaRepository<DinosaurEntity, Long> {

    @Override
    public ArrayList<DinosaurEntity> findAll();


}
