public class ItemDeCardapio {
    private String codigo;
    private TipoItem tipo;
    private String nome;
    private double valor;
    public ItemDeCardapio(String codigo, TipoItem tipo, String nome, double valor) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
        this.valor = valor;
    }

    public ItemDeCardapio() {
        this("",TipoItem.GERAL, "",0.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public TipoItem getTipo(){
        return this.tipo;
    }


    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }
//Demais métodos da classe por aqui …

}
