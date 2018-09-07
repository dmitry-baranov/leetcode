public class BackpackingProblem {

    private static int[] cost = {10, 20, 30, 40};
    private static int[] weights = {2, 3, 4, 7};
    private static int capacity = 7;

    public static void main(String[] args) {
        int amountElement = cost.length;
        int[][] sumCost = new int[amountElement][capacity];

        for (int i = 0; i < amountElement; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (i == 0) {
                    if (weights[i] <= j)
                        sumCost[i][j - 1] = cost[i];
                    else sumCost[i][j - 1] = 0;
                } else if (weights[i] == j) {
                    if (sumCost[i - 1][j - 1] < cost[i])
                        sumCost[i][j - 1] = cost[i];
                    else sumCost[i][j - 1] = sumCost[i - 1][j - 1];
                } else if (weights[i] < j) {
                    if (sumCost[i - 1][j - 1] < cost[i] + sumCost[i - 1][j - 1 - weights[i]])
                        sumCost[i][j - 1] = cost[i] + sumCost[i - 1][j - 1 - weights[i]];
                    else sumCost[i][j - 1] = 0;
                } else sumCost[i][j - 1] = 0;
            }
        }

        System.out.println(sumCost[amountElement - 1][capacity - 1]);
    }

}
