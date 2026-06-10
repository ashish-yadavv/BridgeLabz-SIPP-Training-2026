public class Transpose {
    public static void main(String[] args) {

        int[] stock = {50, 20, 80, 40, 20, 60, 80};

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int total = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] > maxi) {
                maxi = stock[i];
            }

            if (stock[i] < mini) {
                mini = stock[i];
            }

            total += stock[i];
        }

        System.out.println("Maximum Stock: " + maxi);
        System.out.println("Minimum Stock: " + mini);
        System.out.println("Total Stock: " + total + '\n');

        System.out.println("Duplicate Items:");

        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                }
            }
        }
        
        //Extend : Rotate stock by K positions
        
        int[] stocks = {10, 20, 30, 40, 50};
        int k = 2;

        for (int r = 0; r < k; r++) {

            int last = stocks[stocks.length - 1];

            for (int i = stocks.length - 1; i > 0; i--) {
                stocks[i] = stocks[i - 1];
            }

            stocks[0] = last;
        }
        
        System.out.print('\n');

        System.out.println("Rotated Array:");

        for (int i = 0; i < stocks.length; i++) {
            System.out.print(stocks[i] + " ");
        }
        
        System.out.print('\n');
        
        
        //Extend : transpose
        
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nOriginal Matrix:");

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[i].length; j++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matrix:");

        for (int i = 0; i < shelf[0].length; i++) {
            for (int j = 0; j < shelf.length; j++) {
                System.out.print(shelf[j][i] + " ");
            }
            System.out.println();
        }
        
        
        
   
    }
}