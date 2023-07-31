import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Comparar dos numeros y devolver un valor \n" +
                "2. Ver si un cliente tiene descuento en su compra \n"+
                "3. Solicitar datos personales de un profesor \n"+
                "4. Generea un arreglo de numeros impares y primos");
        System.out.println("por favor, ingrese el numero que desea usar");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Por favor, ingrese el número");
                int num1 = scanner.nextInt();
                System.out.println("Por favor, ingrese un segundo número");
                int num2 = scanner.nextInt();
                System.out.println(pairAndOdd(num1,num2));
                break;
            case 2:
                System.out.println("Por favor, ingrese el total de su compra");
                double total = scanner.nextDouble();
                discount(Total);
                break;
            case 3:
                getTeacherData();
                break;
            case 4:
                System.out.println(" Por favor, ingrese el numero limite del que quiere saber los primos e impares");
                int limit = scanner.nextInt();
                oddDimiss(limit);
                break;
            default:
                System.out.println("La opción no es correcta");
        }
        scanner.close();
    }

    public static String pairAndOdd(int num1, int num2){
        if (num1 % 2 == 0 && num2 % 2 !=0){
            return "1";
        } else if (num1 % 3 == 0 && num2 % 2 ==0) {
            return "-1";
        }
        else{
            return "0";
        }
    }

    public static void discount(double total){
        if (total >= 100){
            System.out.println("Su cliente posee un descuento del 20%");
            double payDiscount = 0 ;
            payDiscount = total * 0.80 ;
            System.out.println("El total con descuento es de: "+ payDiscount);
        }
    }

    public static void getTeacherData (){
        Scanner scanner = new Scanner(System.in);
        int[] cedula = new int[100];
        String[] nombre = new String[100];
        String[] apellido = new String[100];
        String[] horario = new String[100];
        String[] materia = new String[100];

        int contadorProfesores = 0;

        boolean continuar = true;
        while (continuar) {
            System.out.println("Por favor, ingrese los datos del profesor:");
            System.out.print("Ncédula: ");
            cedulas[contadorProfesores] = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Nombre: ");
            nombres[contadorProfesores] = scanner.nextLine();

            System.out.print("Apellido: ");
            apellidos[contadorProfesores] = scanner.nextLine();

            System.out.print("Materia a ejercer: ");
            materias[contadorProfesores] = scanner.nextLine();

            System.out.print("Horario: ");
            horarios[contadorProfesores] = scanner.nextLine();

            contadorProfesores++;

            System.out.print("¿Desea agregar otro profesor? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n") || respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        System.out.println("\nDatos de los profesores registrados:");
        for (int i = 0; i < contadorProfesores; i++) {
            System.out.println("Profesor " + (i + 1) + ":");
            System.out.println("NCédula: " + cedula[i]);
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Apellido: " + apellido[i]);
            System.out.println("Horario: " + horario[i]);
            System.out.println("Materia a dictar: " + materia[i]);
            System.out.println("--------------------");
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void oddDimiss (int limit){
        int[] numeros = new int[limit];

        for (int i = 0; i < limit; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Son números primos menores e impares del 1 al : "+ limit);
        for (int i = 0; i < 50; i++) {
            if (esPrimo(numeros[i]) && numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}

