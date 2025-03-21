package gustavo.dto;

import gustavo.model.BlocoPeca;
import gustavo.model.Pecas;

public record PecasResponseDto
        (
        Long id,
        String nome,
        BlocoPeca peca) {

    public static  PecasResponseDto valueof(Pecas pecas){
        if(pecas == null)
                return null;
        return new PecasResponseDto(pecas.getId(), pecas.getNome(), pecas.getBlocopeca());
    }





}
