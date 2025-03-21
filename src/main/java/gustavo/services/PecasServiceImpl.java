package gustavo.services;

import gustavo.dto.PecasDTO;
import gustavo.dto.PecasResponseDto;
import gustavo.model.BlocoPeca;
import gustavo.respository.PecasRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import gustavo.model.Pecas;

import java.util.List;

@ApplicationScoped
public class PecasServiceImpl implements PecasContract{
    @Inject
PecasRepository repository;


    @Override
    @Transactional
    //POST
    public PecasResponseDto create(PecasDTO pecas) {
        Pecas pecas1 = new Pecas();
        pecas1.setNome(pecas.nome());
        pecas1.setPreco(pecas.preco());

        pecas1.setBlocopeca(BlocoPeca.valueOf(pecas.idBloco()));

            //Realizando inclusão

        repository.persist(pecas1);
        return PecasResponseDto.valueof(pecas1);


    }
    //GET
@Override
 public List<PecasResponseDto> listAllPecas(){
     return repository.findAll().stream().map(e -> PecasResponseDto.valueof(e)).toList();
}

//PUT
@Override
@Transactional
    public void update(Long id , PecasDTO pecas){
      Pecas pecas1 =  repository.findById(id);
      pecas1.setNome(pecas.nome());
      pecas1.setPreco(pecas.preco());
pecas1.setBlocopeca(BlocoPeca.valueOf(pecas.idBloco()));
}

//DELETE
@Override
    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
}



@Override
public PecasResponseDto findById(long id) {
return PecasResponseDto.valueof(repository.findById(id));
}

@Override
public List<Pecas> findByName(String nome){
   return repository.find("LOWER(nome) LIKE LOWER(?1)", "%" + nome + "%").list();
}


}
