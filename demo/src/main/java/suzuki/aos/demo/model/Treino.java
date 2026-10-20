package suzuki.aos.demo.model;

import jakarta.persistence.*;
// @Entity diz ao JPA que essa classe representa uma 
// tabela no banco de dados
@Entity
// Define o nome da tabela que sera criada/usada no banco
@Table(name = "treino")

public class Treino {

   // @ID marca esse campo como chave primaria da tabela
    @Id
    // @GeneratedValue com IDENTITY indica
    // geracao de valor do tipo identidade
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  // @Column configura a coluna: nullable = false significa que nao
    // pode ser nulo ( campo obrigatorio )
    @Column(nullable = false, length = 100)
    private String exercicio;

    @Column(nullable = false)
    private int series;

    @Column(nullable = false)
    private int repeticoes;

    @Column(length = 50)
    private String grupoMuscular;

    @Column(nullable = false)
    private boolean feitoHoje;

    // Construtor vazio obrigatório pelo JPA para instanciar a entidade internamente
    public Treino() {
    }

    // Construtor usado ao criar um produto novo (sem ID, pois o banco gera)
    public Treino(String exercicio, int series, int repeticoes, String grupoMuscular, boolean feitoHoje) {
        this.exercicio = exercicio;
        this.series = series;
        this.repeticoes = repeticoes;
        this.grupoMuscular = grupoMuscular;
        this.feitoHoje = feitoHoje;
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

    public int getRepeticoes() {
        return repeticoes;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }
    public boolean isFeitoHoje(){
        return feitoHoje;
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

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public void setFeitoHoje(boolean feitoHoje){
        this.feitoHoje = feitoHoje;
    }
}
