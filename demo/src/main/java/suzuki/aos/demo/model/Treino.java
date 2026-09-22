package suzuki.aos.demo.model;

import jakarta.persistence.*;

@Entity

@Table(name = "treino")

public class Treino {

  
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
    @Column(nullable = false, length = 100)
    private String exercicio;

    @Column(nullable = false, length = 255)
    private int series;

    @Column(nullable = false)
    private double repeticoes;

    @Column(length = 100)
    private String grupoMuscular;

    // Construtor vazio obrigatório pelo JPA para instanciar a entidade internamente
    public Treino() {
    }

    // Construtor usado ao criar um produto novo (sem ID, pois o banco gera)
    public Treino(String exercicio, int series, double repeticoes, String grupoMuscular) {
        this.exercicio = exercicio;
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

    public int getSeries() {
        return series;
    }

    public double getRepeticoes() {
        return repeticoes;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setRepeticoes(double repeticoes) {
        this.repeticoes = repeticoes;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }
}