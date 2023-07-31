import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        int edad = 0, Ncedula = 0, Ralumnos = 0;
        String nombres = "", apellidos = "", educación, enter = "", input = "";
        Scanner scanner = new Scanner(System.in);

        do {
            countStudents++;
            System.out.println("Por favor, Ingrese los datos requeridos del estudiante");
            input = "";
            while (input.isEmpty()) {
                try {
                    System.out.println("Digite el nombre del estudiante");
                    input = scanner.next();
                    if (!(esString(input))) {
                        nombres = input;
                    } else {
                        throw new IllegalArgumentException(" Por favor, utilize solo letras");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Por favor, utilize solo letras");
                    input = "";
                }
            }

            input = "";
            while (input.isEmpty()) {
                try {
                    System.out.println("Por favor, ingrese el apellido del alumno");
                    input = scanner.next();
                    if (!(esString(input))) {
                        apellidos = input;
                    } else {
                        throw new IllegalArgumentException("Por favor, utilize solomante letras");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Por favor, utilize solo letras");
                    input = "";
                }
            }

            while (!(esString(input))) {
                System.out.println(" Por favor, indique la edad del estudiante");
                input = scanner.next();

                try {
                    edad = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, utilize solo números para la edad");
                }
            }

            /*
            input = "";
            while (!(esString(input))) {
                System.out.println("Por favor, es necesario que indique el número de cedula");
                input = scanner.next();

                try {
                    if(input.length() == 10){
                        Ncedula = Integer.parseInt(input);
                    }else{
                        throw new IllegalArgumentException("error");
                    }
                } catch (IllegalArgumentException e){
                    System.out.println(" Por favor, verifique que el número sea correcto, use solo números ");
                }
            }
            */
            Ncedula = GetIdCard();

            System.out.println("Por favor, indique el nivel de educación del estudiante");
            educación = scanner.next();

            System.out.println("El nombre del alumno ingresado es N#: " + countStudents + " ,Nombre: " + nombres +
                    " ,Apellido = " + apellidos + ", id= 0" + Ncedula + " Edad = " + edad + " ,Educacion: "+educación);
            System.out.println("¿Desea registrar a otro alumno?");
            enter = scanner.next();
        } while (enter.equalsIgnoreCase("si"));


    }

    public static boolean esString(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static int GetNcedula() {
        String input = "";
        int Ncedula = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Por favor, ingrese el número de cedula: ");
            input = scanner.next();

            if (IsValidIdCard(input)) {
                Ncedula = Integer.parseInt(input);
            } else {
                System.out.println("Verifique que el número sea correcto, ( Solo debe tener 10 dígitos numéricos).");
                continue;
            }
        } while (!IsValidNcedula(input));
        return Ncedula;
    }

    public static boolean IsValidIdCard(String input) {
        if (input.length() != 10)
            return false;

        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
