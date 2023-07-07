import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float Numero1 = 0;
        float Numero2 = 0;
        int ope = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número");
        Numero1 = sc.nextFloat();
        System.out.println("Digite el segundo número");
        Numero2 = sc.nextFloat();
        System.out.println(
                "Digite el número de la operción realizada: 1: suma, 2: resta, 3: multiplicación, 4: división");
        ope = sc.nextInt();

        operaciones oper = new operaciones(Numero1, Numero2);
        float result = 0;

        switch (ope) {
            case 1:
                result = oper.suma();
                break;
            case 2:
                result = oper.resta();
                break;
            case 3:
                result = oper.multiplicacion();
                break;
            case 4:
                result = oper.division();
                break;
        }

        System.out.println("El resultado de la operción es: " + result);

    }

}
