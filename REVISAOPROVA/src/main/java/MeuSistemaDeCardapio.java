import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MeuSistemaDeCardapio implements SistemaGerenciadorDeCardapio {


    private HashMap<String, ItemDeCardapio> itensCardapioMap;




        public MeuSistemaDeCardapio() {
            this.itensCardapioMap = new HashMap<>();
        }



    public void cadastrarItemNoCardapio(ItemDeCardapio item) throws ItemJaExisteException {
       for (String key : this.itensCardapioMap.keySet()){
           if(this.itensCardapioMap.get(key).getCodigo().equals(item.getCodigo())){
               throw new ItemJaExisteException("O item já existe");
           }
       }
       this.itensCardapioMap.put(item.getCodigo(), item);


    }

    @Override
    public List<ItemDeCardapio> pesquisaItensDoTipo(TipoItem tipo) {
        return null;
    }

    @Override
    public ItemDeCardapio pesquisaItemDoCardapio(String codigo) throws ItemNaoExisteException {

        for(String key : this.itensCardapioMap.keySet()){
            if(this.itensCardapioMap.get(key).getCodigo().equals(codigo)){
                return this.itensCardapioMap.get(key);

            }
        } throw new ItemNaoExisteException("Item não achado!!");


    }

    @Override
    public boolean existeItemComNome(String nome) {
        return false;
    }

    @Override
    public List<ItemDeCardapio> pesquisaItensPeloNome(String nomeItem) {
        List<ItemDeCardapio> itensAchados = new ArrayList<>();
        for(String key: this.itensCardapioMap.keySet()){
            if (this.itensCardapioMap.get(key).getNome().startsWith(nomeItem)){
                itensAchados.add(itensCardapioMap.get(key));
            }
        } return itensAchados;
    }

    @Override
    public int pesquisaQuantidadeDeItensDoTipo(TipoItem tipo) {
        int quantidade = 0;
        for(String key : this.itensCardapioMap.keySet() ){
            if(this.itensCardapioMap.get(key).getTipo().equals(tipo)){
                quantidade++;
            }


        } return quantidade;
    }

}