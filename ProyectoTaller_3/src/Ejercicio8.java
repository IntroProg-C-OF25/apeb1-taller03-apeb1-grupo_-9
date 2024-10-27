public class Ejercicio8 {
    public static void main(String[] args) {
        // Calculamos las partes de la expresión
        double respuesta1 = (10*9) + 20 - (500 / 2) + Math.pow(3, 2);
        System.out.println("respuesta1 = " + respuesta1);
        
        double parte1 = respuesta1;
        boolean condicion1 = (parte1 >=200);
        System.out.println("condicion1 = " + condicion1);
        
        int respuesta2 = 50 - 50 +51 ;
        System.out.println("respuesta2 = " + respuesta2);
        boolean condicion2 = (50 >= respuesta2);
        System.out.println("condicion2 = " + condicion2);
        
        //Evaluamos la expresión completa usando ||
        boolean resultadofinal = condicion1 || condicion2;
        
        //Mostramos resultado en pantalla
        System.out.println("El resultado de la expresión es: " + resultadofinal);
    }
    
}
