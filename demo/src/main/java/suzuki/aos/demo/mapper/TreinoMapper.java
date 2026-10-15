package suzuki.aos.demo.mapper;

import suzuki.aos.demo.dto.TreinoDTO;
import suzuki.aos.demo.model.Treino;

// Classe utilitária com métodos estáticos — não deve ser instanciada
public class Treinomapper {

    private Treinomapper() {}

    // Converte uma entidade Treino em DTO para ser enviado como resposta da API
    public static TreinoDTO toDTO(Treino treino) {
        return new TreinoDTO(
                treino.getId(),
                treino.getExercicio(),
                treino.getSeries(),
                treino.getRepeticoes(),
                treino.getGrupoMuscular(),
                treino.getFeitoHoje()
        );
    }

    // Converte um DTO recebido na requisição em entidade para ser salva no banco
    // O ID não é passado pois ainda não existe — o banco vai gerar na hora do save
    public static Treino toEntity(TreinoDTO treinoDTO) {
        return new Treino(
                treinoDTO.getExercicio(),
                treinoDTO.getSeries(),
                treinoDTO.getRepeticoes(),
                treinoDTO.getGrupoMuscular()
        );
    }
}
