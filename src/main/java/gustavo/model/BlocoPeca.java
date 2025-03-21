package gustavo.model;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum BlocoPeca {

    BLOCO_MOTOR(1, "Bloco_Motor"),
    BLOCO_CENTRO(2, "Bloco_Centro"),
    BLOCO_TRASEIRO(3, "Bloco_Traseiro");

    private final int ID;
private final String NOME;

BlocoPeca(int id, String nome){
    this.ID=id;
    this.NOME=nome;
}

    public int getID() {
        return ID;
    }

    public String getNome() {
        return NOME;
    }

public static BlocoPeca valueOf(Integer id){
    if(id == null){
        return null;
    }
      for(BlocoPeca b: BlocoPeca.values()){
                if(b.getID() == id){
                return b;
                }

      }
    return null;
}









}
