package br.com.axolot.animal.repository;

import br.com.axolot.animal.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Override
    public ArrayList<UserEntity> findAll();


}
