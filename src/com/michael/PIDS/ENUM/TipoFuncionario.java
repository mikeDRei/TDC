package com.michael.PIDS.ENUM;

public enum TipoFuncionario {
    ADMINISTRADOR(1, "ADMIM"),
    AUXILIAR_ADMINISTRATIVO(2, "AUX_ADMIM");
    private Integer cod;
    private String descricao;

    private TipoFuncionario(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoFuncionario toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (TipoFuncionario x : TipoFuncionario.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id Invalido" + cod);
    }

}
