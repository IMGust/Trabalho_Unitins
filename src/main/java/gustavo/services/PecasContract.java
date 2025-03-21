package gustavo.services;

import gustavo.dto.PecasDTO;
import gustavo.dto.PecasResponseDto;
import gustavo.model.BlocoPeca;
import gustavo.model.Pecas;

import java.util.List;

public interface PecasContract {
    //POST
    public PecasResponseDto create(PecasDTO pecas);
    //GET(findAll)
    List<PecasResponseDto> listAllPecas();
    //PUT
    void update(Long id, PecasDTO pecas);
    //DELETE
    void delete(Long id);
    //Achar por id
    PecasResponseDto findById(long id);
    public List<Pecas> findByName(String nome);




}
