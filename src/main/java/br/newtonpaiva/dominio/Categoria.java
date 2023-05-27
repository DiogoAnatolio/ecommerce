package br.newtonpaiva.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Objects;
@Entity

public class Categoria {
    @Id
    private Integer Id;

    private String nome;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(Id, categoria.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
