package fundamentos.arrays;

public class Aula02 {
    static void main() {
        char[] caracteres = new char[3];
        System.out.println("caracteres[0] >> " + caracteres[0]);
        System.out.println("caracteres[1] >> " + caracteres[1]);
        System.out.println("caracteres[2] >> " + caracteres[2]);
        // Falando sobre valores de inicialização padrão. Temos o seguinte, quando não se trata de um atributo de classe.
        //byte, short, int, long, float, e double >> 0
        // char '\u0000' >> ' '
        // boolean >> false
        // String >> null
    }
}
