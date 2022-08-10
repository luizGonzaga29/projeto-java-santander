package constBanco;

public enum TipoConta {

    CONTACORRENTE("ContaCorrente"),
    CONTAPOUPANCA("ContaPoupança");
    

    private String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
