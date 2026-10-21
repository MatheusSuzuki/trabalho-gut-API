package com.treinos.api.controller;

import com.treinos.api.dto.TreinoDTO;
import com.treinos.api.mapper.TreinoMapper;
import com.treinos.api.model.Treino;
import com.treinos.api.service.TreinoService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treinos")
public class TreinoController {

    private final TreinoService service;
    private final TreinoMapper mapper;

    public TreinoController(TreinoService service, TreinoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<TreinoDTO> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TreinoDTO> buscar(@PathVariable Long id) {
        TreinoDTO treino = service.buscarPorId(id);

        if (treino == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(treino);
    }

    @PostMapping
    public TreinoDTO criar(@Valid @RequestBody TreinoDTO dto) {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TreinoDTO> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody TreinoDTO dto) {

        TreinoDTO treino = service.atualizar(id, dto);

        if (treino == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(treino);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean existe = service.deletar(id);

        if (!existe) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/concluir")
    public ResponseEntity<TreinoDTO> concluir(@PathVariable Long id) {
        TreinoDTO treino = service.concluir(id);

        if (treino == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(treino);
    }
}
