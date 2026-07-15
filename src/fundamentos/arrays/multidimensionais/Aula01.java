package fundamentos.arrays.multidimensionais;

public class Aula01 {
    static void main() {
        // Um array multidimensional é um array de arrays

        // O segundo array não precisa ter seu tamanho definido naquele momento
        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 10;
        dias[1][1] = 20;
        dias[1][2] = 30;

        dias[2][0] = 100;
        dias[2][1] = 200;
        dias[2][2] = 300;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

    }
}
