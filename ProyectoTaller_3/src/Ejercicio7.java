public class Ejercicio7 {
    public static void main(String[] args) {
    // Calculamos las partes de la expresión
    double respuesta1 = (Math.sqrt(81) + 9)/3;
    System.out.println("respuesta1 = " + respuesta1);
        
    double parte1 = respuesta1;
    boolean condicion1 = (parte1 ==9);
    System.out.println("condicion1 = " + condicion1);
        
    boolean condicion2 = (10 > 1);
    System.out.println("condicion2 = " + condicion2);
        
    double respuesta2 = 100/25 + Math.sqrt(100);
    System.out.println("respuesta2 = " + respuesta2);
        
    double parte2 = respuesta2;
    
    
    //Evaluamos la exprecion completa usando || y &&
    boolean resultadofinal = condicion1 || (condicion2 && (parte2 != 0));
    
    //Mostramos el resultado en pantalla
    System.out.println("El resultado final de la expresión es: " + resultadofinal);
    }
}
