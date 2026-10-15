package suzuki.aos.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import suzuki.aos.demo.dto.TreinoDTO;
import suzuki.aos.demo.mapper.Treinomapper;
import suzuki.aos.demo.repository.TreinoRepository;

// @Service registra essa classe como componente de serviço no Spring
// É aqui que fica a lógica de negócio da aplicação
@Service
public class TreinoService {

    private final TreinoRepository treinoRepository;

    // Injeção de dependência via construtor: o Spring injeta o repositório automaticamente
    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

}
