package br.com.axolot.animal.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Table(name = "DINOSAUR")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "DINOSAUR_ID")
    private Long id;

    @JoinColumn(name = "NAME")
    private String name;

    @JoinColumn(name = "SUPERORDER")
    private String superOrder;

    @JoinColumn(name = "ORDER")
    private String order;

    @JoinColumn(name = "SUBORDER")
    private String subOrder;

    @JoinColumn(name = "INFRAORDER")
    private String infraOrder;

    @JoinColumn(name = "PAVORDER")
    private String pavOrder;

    @JoinColumn(name = "FAMILY")
    private String family;

    @JoinColumn(name = "SPECIE")
    private String specie;

    @JoinColumn(name = "GEOLOGICTIMESCALE")
    private String geologicTimeScale;
    
}
