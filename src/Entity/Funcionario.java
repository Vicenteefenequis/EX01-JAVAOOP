package Entity;

import Enums.TipoDeDocumento;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String numeroDocumento;
    private TipoDeDocumento documento;

    public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumento) {
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
        this.documento = documento;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return nome.equals(that.nome) && numeroDocumento.equals(that.numeroDocumento) && documento == that.documento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroDocumento, documento);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", documento=" + documento +
                '}';
    }
}
