public class Ejercicio10 {
    public static void main(String[] args) {
        //Calculamos las partes de la expresión
        double resultado1 = Math.sqrt(25) * 10;
        boolean condicion1 = (resultado1 >= 100) && true;
        boolean condicion2 = false;
        boolean condicion3 = (10 / 5 >= 2);
        
        //Evaluamos la expresión completa usando || y &&
        boolean resultadofinal = condicion1 || condicion2 || condicion3;
        
        //Mostramos el resultado final en pantalla
        System.out.println("El resultado final de la expresión es: " + resultadofinal);
        
    }
    
}
