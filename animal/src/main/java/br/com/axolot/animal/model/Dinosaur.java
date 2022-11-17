package br.com.axolot.animal.model;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Dinosaur{

    @Id
    private Long id;

    @JoinColumn(name = "DES_NAME")
    private String name;

    @JoinColumn(name = "DES_LIFE")
    private Integer life;

    @JoinColumn(name = "DES_ATTACK")
    private Integer attack;
    
}
