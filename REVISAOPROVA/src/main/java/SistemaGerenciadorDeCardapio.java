import java.util.List;

public interface SistemaGerenciadorDeCardapio {
    public void cadastrarItemNoCardapio(ItemDeCardapio item) throws ItemJaExisteException;
    public List<ItemDeCardapio> pesquisaItensDoTipo(TipoItem tipo);
    public ItemDeCardapio pesquisaItemDoCardapio(String codigo) throws
            ItemNaoExisteException;
    public boolean existeItemComNome(String nome);
    public List<ItemDeCardapio> pesquisaItensPeloNome(String nomeItem);
    public int pesquisaQuantidadeDeItensDoTipo(TipoItem tipo);

}
