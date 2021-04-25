package Entity;

import Enums.Cargo;
import Enums.Status;

import java.util.Date;

public class Contratacao {
    private Date datai;
    private Cargo cargo;
    private Status status;
    private Funcionario funcionario;
    private Projeto projeto;

    public Contratacao(Date datai, Cargo cargo, Funcionario funcionario, Projeto projeto) {
        this.datai = datai;
        this.cargo = cargo;
        this.status = Status.PENDENTE;
        this.funcionario = funcionario;
        this.projeto = projeto;
        projeto.adicionarContratacao(this);
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public Status getStatus() {
        return this.status;
    }

    public void contratar() {
        this.status = Status.CONTRATADO;
    }

    public void demitir() {
        if (this.status == Status.CONTRATADO) {
            this.status = Status.DEMITIDO;
            this.projeto.removerContratacao(this);
        }
    }

    public void pendente() {
        this.status = Status.PENDENTE;
    }


}
