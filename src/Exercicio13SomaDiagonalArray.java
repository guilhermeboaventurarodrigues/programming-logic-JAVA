public class Exercicio13SomaDiagonalArray {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];

        numbers[0][0] = 22;
        numbers[0][1] = 11;
        numbers[0][2] = 25;

        numbers[1][0] = 44;
        numbers[1][1] = 55;
        numbers[1][2] = 27;

        numbers[2][0] = 88;
        numbers[2][1] = 87;
        numbers[2][2] = 30;

        int sum = 1;
        for (int i = 0, j = 0; i < numbers.length && j < numbers[i].length; i++, j++) {
            System.out.println(numbers[i][j]);
            System.out.println("--------------");
            sum *= numbers[i][j];
        }
        System.out.println(sum);
    }
}
