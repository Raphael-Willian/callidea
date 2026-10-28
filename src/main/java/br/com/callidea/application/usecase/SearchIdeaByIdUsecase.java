package br.com.callidea.application.usecase;

import br.com.callidea.adapters.controller.dto.SearchIdeaResponse;
import br.com.callidea.domain.entity.Ideas;
import br.com.callidea.domain.repository.IdeaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * As verificações que fazem parte dos casos de uso, serão implementadas nas próximas etapas do desenvolvimento.
 */
@Service
public class SearchIdeaByIdUsecase {

    private IdeaRepository ideaRepository;

    public SearchIdeaByIdUsecase(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    public SearchIdeaResponse searchById(UUID idIdea) {

        Ideas findIdea = ideaRepository.findById(idIdea);

        return new SearchIdeaResponse(findIdea);

    }

}
