package assessment;

public class SummativeSums {

    public static int sum(int[] array){

        int sum = 0;

        for (int i = 0; i < array.length; i++ ){
            sum = sum + array[i];
        }

        return sum;

    }

    public static void main(String[] args){

        int[] a1 = new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15};

        int[] a2 = new int[]{999, -60, -77, 14, 160, 301};

        int[] a3 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array sum: " + sum(a1));
        System.out.println("#2 Array sum: " + sum(a2));
        System.out.println("#3 Array sum: " + sum(a3));

    }

}
