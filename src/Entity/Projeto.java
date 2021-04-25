package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Projeto {
    private String nome;
    private Date dt_inicio;
    private Date dt_termino;
    private List<Contratacao> listContratacao = new ArrayList<>();


    public Projeto(String nome, Date dt_inicio, Date dt_termino) {
        this.nome = nome;
        this.dt_inicio = dt_inicio;
        this.dt_termino = dt_termino;
    }

    public boolean adicionarContratacao(Contratacao contratacao) {
        if (contratacao != null && !this.listContratacao.contains(contratacao)) {
            this.listContratacao.add(contratacao);
            return true;
        }
        return false;
    }

    public boolean removerContratacao(Contratacao contratacao) {
        if (contratacao != null && this.listContratacao.size() > 0 && this.listContratacao.contains(contratacao)) {
            this.listContratacao.remove(contratacao);
            return true;
        }
        return false;
    }

    public void listarContratacao() {
        System.out.println("***Contratações***");
        if (this.listContratacao.isEmpty()) {
            System.out.println(this.nome + "nao tem nenhum contratado");
        }
        System.out.println("Projeto:");
        System.out.println("\t"+this.nome);
        System.out.println("Funcionario(s):");
        for (Contratacao contratacao : this.listContratacao) {
            System.out.println( "\t" + contratacao.getFuncionario().getNome() + "[Status: " + contratacao.getStatus() + "]");
        }
        System.out.println("\n");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Projeto)) return false;
        Projeto projeto = (Projeto) o;
        return nome.equals(projeto.nome) && dt_inicio.equals(projeto.dt_inicio) && dt_termino.equals(projeto.dt_termino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dt_inicio, dt_termino);
    }
}
