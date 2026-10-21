package com.aos.productsapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

// @Schema serve para documentar a classe no Swagger
@Schema(description = "Dados do exercicio")
public class ProductDTO {

    // O cliente apenas recebe o ID
    @Schema(description = "ID do exercicio", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    // Impede que o nome fique vazio
    @NotBlank(message = "Coloque o nome do exercicio")
    @Size(min = 2, max = 100, message = "O nome deve ter de 2 a 100 caracteres")
    @Schema(description = "Nome do exercicio", example = "Supino")
    private String exercicios;

    // Quantidade de series do exercicio
    @Positive(message = "As series devem ser maior que zero")
    @Schema(description = "Quantidade de series", example = "4")
    private Integer series;

    // Quantidade de repeticoes
    @Positive(message = "As repeticoes devem ser maior que zero")
    @Schema(description = "Quantidade de repeticoes", example = "8")
    private Integer repeticoes;

    // Aceita zero ou numeros positivos
    @PositiveOrZero(message = "O grupo muscular nao pode ser negativo")
    @Schema(description = "Grupo muscular", example = "4")
    private int grupoMuscular;

    // Construtor do DTO
    public ProductDTO(Long id, String exercicios, Integer series,
                      Integer repeticoes, int grupoMuscular) {
        this.id = id;
        this.exercicios = exercicios;
        this.series = series;
        this.repeticoes = repeticoes;
        this.grupoMuscular = grupoMuscular;
    }

    public Long getId() {
        return id;
    }

    public String getExercicios() {
        return exercicios;
    }

    public Integer getSeries() {
        return series;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public int getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setExercicios(String exercicios) {
        this.exercicios = exercicios;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }

    public void setGrupoMuscular(int grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }
}
