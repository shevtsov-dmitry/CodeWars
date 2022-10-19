public class FindOutlier {
    static int find(int[] arr) {
        int outlier = 0;
        if(arr.length > 2) {
            int evens = 0, odds = 0;
            for (int i : arr) {
                if (i % 2 == 0)
                    evens++;
                else
                    odds++;
            }
            if (evens > odds)
                for (int j : arr) if (j % 2 == 1) outlier = j;
            if (odds > evens)
                for (int k : arr) if (k % 2 == 0) outlier = k;
            return outlier;

        }
        return outlier;

    }
}

