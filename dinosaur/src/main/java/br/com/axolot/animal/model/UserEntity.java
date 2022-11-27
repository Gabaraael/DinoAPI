package br.com.axolot.animal.model;

import javax.persistence.*;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Builder
@Table(name = "USER")
public class UserEntity {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;
    
}
