package br.com.axolot.animal.Dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DinoDto {
    
    private Integer life;

    private Integer attack;

    private String name;
}
