package org.example;

public class ServicoRenovacao implements IServico {
    public String executar() {
        return "Renovação efetuada com sucesso.";
    }

    public String cancelar() {
        return "Renovação cancelada.";
    }
}