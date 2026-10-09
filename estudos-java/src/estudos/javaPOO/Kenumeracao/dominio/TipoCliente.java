package estudos.javaPOO.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "PF"),
    PESSOA_JURIDICA(2, "PJ");
    private String nomeRelatorio;
    private final int VALOR;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClienteNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : TipoCliente.values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor(){
        return VALOR;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }
}
