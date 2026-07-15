package fundamentos.arrays;

public class Aula03 {
    static void main() {
        // O tamanho do array não pode ser alterado dinâmicamente. Não pode ser alterado em tempo de execução, temos que compilar.
        String[] nomes = new String[3];

        nomes[0] = "José";
        nomes[1] = "Maria";
        nomes[2] = "Milla";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nomes[" + i + "] >> " + nomes[i]);
        }
    }
}
