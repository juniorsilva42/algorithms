// Jr Silva 22/12/2018
// Implementação genérica de Comparable para os principais algoritmos de ordenação

package sorts.Implementation;

public interface GenericSortInterface {

    /**
     *
     * Método main que ordena um arranjo qualquer
     *
     * @param arrangement arranjo que será efetuado a ordenação
     *
     * @return generic T
     * */
    <T extends Comparable<T>> T[] sort(T[] arrangement);
}
