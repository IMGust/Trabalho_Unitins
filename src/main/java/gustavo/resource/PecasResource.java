package gustavo.resource;


import gustavo.dto.PecasDTO;
import gustavo.dto.PecasResponseDto;
import gustavo.model.BlocoPeca;
import gustavo.model.Pecas;
import gustavo.services.PecasContract;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/ferramentas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PecasResource {

            @Inject
            PecasContract service;

    @POST

    public PecasResponseDto incluir(PecasDTO pecas) {
                  return service.create(pecas);
            }

    @GET
    public List<PecasResponseDto> obter(){
       return service.listAllPecas();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id){
           service.delete(id);
                }




    @PUT
    @Path("{id}")
    @Transactional
    public void atualizar(Long id, PecasDTO pecas){

            service.update(id,pecas);


    }
@GET
@Path("/id/{id}")
    public PecasResponseDto buscarPorId(long id){
        return service.findById(id);

    }

@GET
    @Path("/buscar{nome}")
public List<Pecas> findByName(String nome){
        return service.findByName(nome);
}

}