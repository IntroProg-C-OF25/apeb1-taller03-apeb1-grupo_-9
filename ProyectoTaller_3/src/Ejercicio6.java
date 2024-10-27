public class Ejercicio6 {
    public static void main(String[] args) {
        //Realizamos la operacion paso a paso
        double resultado = (Math.sqrt(81)+9)/3;
        boolean condicion1 = (resultado ==9);
        boolean condicion2 = (10>1);
        
        //Evaluamos ambas condiciones con el operador &&
        boolean resultadofinal = condicion1 && condicion2;
        
        //mostramos el resultado en pantalla
        System.out.println("El resultado de la exprecion es: " + resultadofinal);
    }
}
