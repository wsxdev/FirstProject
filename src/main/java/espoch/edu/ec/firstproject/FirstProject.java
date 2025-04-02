package espoch.edu.ec.firstproject;

public class FirstProject {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // int valor = 5;

        /*
         * while (valor >= 5) {
         * System.out.println("Hello " + valor);
         * }
         */
        /*
         * do {
         * System.out.println("Hello " + valor);
         * valor++;
         * } while(valor > 6);
         */

        // area del rectangulo, calcular e imprimir

        /*
         * float base = 5.5f;
         * float altura = 6.6f;
         * float area = 0;
         * 
         * System.out.println(area = base * altura);
         */

        // NUMEROS POSITIVOS Y PARES
        /*
         * int numero = 50;
         * 
         * if (numero >= 0){
         * System.out.println("El numero: " + numero + " es positivo");
         * } else{
         * System.out.println("El numero: " + numero + " es negativo");
         * }
         * 
         * // Determinar si un numero es par o impar
         * 
         * if (numero % 2 == 0){
         * System.out.println("Numero par: " + numero);
         * } else {
         * System.out.println("Numero impar: " + numero);
         * }
         */

        // DETERMINAR SI UN ESTUDIANTE APRUEBA
        float nota = 367;
        if (nota >= 0 && nota <= 100) {
            if (nota >= 90) {
                System.out.println("Nota excelente: " + nota);
            } else if (nota >= 70 && nota <= 89) {
                System.out.println("Aprobado: " + nota);
            } else {
                System.out.println("Reprobado: " + nota);
            }
        } else{
            System.out.println("El dato ingresado es incorrecto...");
        }

    }
}