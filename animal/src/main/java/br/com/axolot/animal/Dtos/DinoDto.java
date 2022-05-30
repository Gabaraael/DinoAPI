package br.com.axolot.animal.Dtos;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class DinoDto {

    @Getter
    @Setter
    private Integer life;

    @Getter
    @Setter
    private Integer attack;

    @Getter
    @Setter
    private String name;
}
