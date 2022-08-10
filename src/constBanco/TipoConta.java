package constBanco;

public enum TipoConta {

    CONTACORRENTE("ContaCorrente"),
    CONTAPOUPANCA("ContaPoupan�a");
    

    private String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
