package fundamentos.arrays;

public class Aula04 {
    static void main() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Outra forma
        String[] nomes = new String[]{"josé", "gustavo", "milla", "marcos", "belinha"};

        System.out.println("Percorrendo o array numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] >> " + numeros[i]);
        }

        System.out.println("Percorrendo o array nomes:");
        // Outra forma de percorrer
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
