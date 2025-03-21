package gustavo.model;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BlocoConverter implements AttributeConverter<BlocoPeca, Integer> {

@Override
    public Integer convertToDatabaseColumn(BlocoPeca peca){
        return peca == null ? null:peca.getID();


}

@Override
    public  BlocoPeca convertToEntityAttribute(Integer id){
                return BlocoPeca.valueOf(id);


}




}
