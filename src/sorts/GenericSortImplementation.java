// Jr Silva 22/12/2018
// Implementação genérica de Comparable para os principais algoritmos de ordenação

package sorts;

import java.util.Arrays;
import java.util.List;

public interface GenericSortImplementation {

    <T extends Comparable<T>> T[] sort(T[] arrangement);

    default <T extends Comparable<T>> List<T> sort(List<T> arrangement){
        return Arrays.asList(sort(arrangement.toArray((T[]) new Comparable[arrangement.size()])));
    }
}
