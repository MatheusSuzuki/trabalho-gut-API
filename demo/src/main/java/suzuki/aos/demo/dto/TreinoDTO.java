package com.aos.productsapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

//@Schema documenta essa classe na interface swagger
@Schema(description = "Product data transfer object")
public class ProductDTO {

    // READ_ONLY indica ao swagger que o cliente nao envia o ID, apenas recebe
    @Schema(description = "Unique identifier of the product", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    // @NotBlank impede que o campo seja vazio ou tenha so espacos
    // @Size limita os tamanhos minimo e maximo do campo
    @NotBlank(message = "Coloque o exercicio")
    @Size(min = 2, max = 100, message = "Nome do exercicio deve conter de 2 a 100 caracteres")
    @Schema(description = "Exercicio de peito", example = "Supino")
    private String exercicios;

    @NotBlank(message = "Coloque a quantidade de series")
    @Size(max = 100, message = "Descricao deve ter no maximo 100 caracteres")
    @Schema(description = "4 series", example = "Supino inclinado")
    private Integer series;

    // @Positive garante que o valor enviado seja maior que zero
    @Positive(message = "Quantidade de repeticoes deve ser maior que zero")
    @Schema(description = "Quantidade de repeticoes", example = "8 repeticoes")
    private Double repeticoes

    // @PositiveOrZero aceita zero ou qualquer numero positivo
    @PositiveOrZero(message = "numero de exercicios para o grupo muscular deve ser maior que zero")
    @Schema(description = "exercicios para o grupo musculau", example = "4")
    private int grupoMuscular;

    // Construtor usado pelo ProductMapper para montar o DTO a partir da entidade
    public ProductDTO(Long id, String name, String descripton, double value, int quantity) {
        this.id = id;
        this.exercicios = exercicios;
        this.series = series;
        this.repeticoes = repeticoes;
        this.grupoMuscular = grupoMuscular;
    }

    public Long getId() {
        return id;
    }

    public String getExercicio() {
        return exercicio;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
