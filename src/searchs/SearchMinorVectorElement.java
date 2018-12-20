package searchs;

public class SearchMinorVectorElement {

    public static void main (String... args) {
        int[] arr = {3, 5, 6, 7, 10, 12, 2, 16, 34};

        System.out.println(searchMinorVectorElement(arr, 0, arr.length - 1));
    }

    private static int searchMinorVectorElement (int[] arrangement, int i, int f) {
        if (i == f)
            return arrangement[i];

        int left, right, media;

        media = (i + f) / 2;

        left = searchMinorVectorElement(arrangement, i, media);
        right = searchMinorVectorElement(arrangement, media + 1, f);

        if (left < right)
            return left;
        else
            return right;
    }
}
