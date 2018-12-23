package sorts.Implementation;

import java.util.Arrays;

public class SortHelpers {

    /**
     *
     * Método helper que compara o elemento de arranjo v com um arranjo w e indica o menor deles
     *
     * @param v subparte do arranjo que será verificado
     * @param w outra subparte do arranjo que será verificado
     *
     * @return boolean
     * */
    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    /**
     *
     * Método helper que efetua a troca de dois elementos do arranjo em dadas posições
     *
     * @param arrangement arranjo que será efetuado a troca dos elementos
     * @param idx elemento atual da troca
     * @param idy elemento que será efetuado a troca
     *
     * @return boolean
     * */
    public static <T> boolean swap(T[] arrangement, int idx, int idy){
        T swap = arrangement[idx];
        arrangement[idx] = arrangement[idy];
        arrangement[idy] = swap;
        return true;
    }

    /**
     *
     * Método helper simplesmente exibe um arranjo
     *
     * @param arrangement arranjo que será exibido
     *
     * @return void
     * */
    public static void show (Object[] arrangement){
        System.out.println(Arrays.toString(arrangement));
    }

}
