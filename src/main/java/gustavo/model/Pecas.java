package gustavo.model;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pecas")
public class Pecas  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private int preco;

    private BlocoPeca blocopeca;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BlocoPeca getBlocopeca() {
        return blocopeca;
    }

    public void setBlocopeca(BlocoPeca blocopeca) {
        this.blocopeca = blocopeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco; }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pecas pecas = (Pecas) o;
        return preco == pecas.preco && Objects.equals(nome, pecas.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }













}
