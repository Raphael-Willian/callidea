package br.com.callidea.adapters.controller;

import br.com.callidea.adapters.controller.dto.CreateResolutionRequest;
import br.com.callidea.adapters.controller.dto.CreateResolutionResponse;
import br.com.callidea.adapters.controller.dto.SearchResolutionByIdResponse;
import br.com.callidea.application.usecase.CreateResolutionUsecase;
import br.com.callidea.application.usecase.SearchResolutionByIdUsecase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/resolutions")
public class ResolutionController {

    private final CreateResolutionUsecase createResolutionUsecase;
    private final SearchResolutionByIdUsecase searchResolutionByIdUsecase;

    public ResolutionController(CreateResolutionUsecase createResolutionUsecase, SearchResolutionByIdUsecase searchResolutionByIdUsecase) {
        this.createResolutionUsecase =createResolutionUsecase;
        this.searchResolutionByIdUsecase = searchResolutionByIdUsecase;
    }

    @PostMapping()
    public ResponseEntity<CreateResolutionResponse> createResolution(@RequestBody CreateResolutionRequest request) {
        CreateResolutionResponse call = createResolutionUsecase.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(call);
    }

    @GetMapping("${id}")
    public ResponseEntity<SearchResolutionByIdResponse> searchResolution(@RequestParam UUID idRequest) {
        SearchResolutionByIdResponse call = searchResolutionByIdUsecase.findById(idRequest);
        return ResponseEntity.status(HttpStatus.OK).body(call);
    }

}
