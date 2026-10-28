package br.com.callidea.adapters.controller;

import br.com.callidea.adapters.controller.dto.CreateIdeaRequest;
import br.com.callidea.adapters.controller.dto.CreateIdeaResponse;
import br.com.callidea.adapters.controller.dto.SearchIdeaResponse;
import br.com.callidea.application.usecase.CreateIdeaUsecase;
import br.com.callidea.application.usecase.SearchIdeaByIdUsecase;
import br.com.callidea.domain.entity.Ideas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Adaptador de entrada (REST) — não conhece MongoDB, conhece apenas IdeaService.
 */
@RestController
@RequestMapping("/ideas")
public class IdeaController {

    private final CreateIdeaUsecase createIdeaUsecase;
    private final SearchIdeaByIdUsecase searchIdeaByIdUsecase;

    public IdeaController(CreateIdeaUsecase createIdeaUsecase, SearchIdeaByIdUsecase searchIdeaByIdUsecase) {
        this.createIdeaUsecase = createIdeaUsecase;
        this.searchIdeaByIdUsecase = searchIdeaByIdUsecase;
    }

    @PostMapping
    public ResponseEntity<CreateIdeaResponse> create(@RequestBody CreateIdeaRequest request) {
        CreateIdeaResponse call = createIdeaUsecase.createIdea(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(call);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SearchIdeaResponse> findById(@PathVariable UUID id) {
        SearchIdeaResponse call = searchIdeaByIdUsecase.searchById(id);
        return ResponseEntity.status(HttpStatus.OK).body(call);
    }
}
