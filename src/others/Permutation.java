package others;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {

    public static void main (String... args) {

        int[] arr = {1, 2, 3};
        List<List<Integer>> results = permute(arr);

        String result = results.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n"));

        System.out.println(result);
    }

    /**
     * Método que, dada uma coleção de n números, retorna todas suas n permutações
     *
     * @param arrangementOfNums Arranjo alvo que será permutado
     * @return uma lista de permutações do arranjo
     */
    private static List<List<Integer>> permute (int[] arrangementOfNums) {

        LinkedList<List<Integer>> results = new LinkedList<List<Integer>>();
        results.add(new ArrayList<Integer>());

        for (int n : arrangementOfNums) {

            int size = results.size();

            while (size > 0) {
                List<Integer> current = results.pollFirst();
                for (int i = 0; i <= current.size(); i++) {
                    List<Integer> temp = new ArrayList<Integer>(current);
                    temp.add(i, n);
                    results.add(temp);
                }
                size--;
            }
        }

        return results;
    }

}
