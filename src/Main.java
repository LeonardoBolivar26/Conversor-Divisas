import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EXTERNA:
        while(true){
            System.out.println("CONVERSOR DE DIVISAS");
            System.out.println("""
                    1 - Pesos chilenos a dolar
                    2 - Pesos Mexicanos a dolar
                    3 - Pesos colombianos a dolar
                    4 - Soles peruanos a dolar
                    5 - Salir
                    """);
            System.out.println("INGRESE UNA OPCION: ");
            Scanner read = new Scanner(System.in);
            char opcion = read.next().charAt(0);

            switch (opcion){
                case '1':
                    convert(954.52 , "Pesos chilenos");
                    break;
                case '2':
                    convert(16.9497 , "Pesos mexicanos");
                    break;
                case '3':
                    convert(3905.73 , "Pesos colombianos");
                    break;
                case '4':
                    convert(3.70987 , "soles peruanos");
                    break;
                case '5':
                    System.out.println("Cerrando programa...");
                    break EXTERNA;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
    static void convert(double valueDollar, String country){
        Scanner read = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", country);
        double amountMoney = read.nextDouble();

        double dollars = amountMoney / valueDollar;
        dollars = (double) Math.round(dollars * 100d)/100;

        System.out.println("------------------------------------");
        System.out.println("|    Son $"+dollars+" Dolares   |");
        System.out.println("------------------------------------");
    }
}