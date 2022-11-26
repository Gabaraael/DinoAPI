package br.com.axolot.animal.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Table(name = "DINOSAUR")
public class DinosaurEntity {

    @Id
    @Column(name = "DINOSAUR_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SUPERORDER")
    private String superOrder;

    // ORDEM É UMA PALAVRA RESERVADA, BICHOS
//    @Column(name = "ORDER")
//    private String order;

    @Column(name = "SUBORDER")
    private String subOrder;

    @Column(name = "INFRAORDER")
    private String infraOrder;

    @Column(name = "PAVORDER")
    private String pavOrder;

    @Column(name = "FAMILY")
    private String family;

    @Column(name = "SPECIE")
    private String specie;

    @Column(name = "GEOLOGICTIMESCALE")
    private String geologicTimeScale;
    
}
