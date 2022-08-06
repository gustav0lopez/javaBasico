import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Números

        int edad=34;
        double peso=83.9;
        String nombre="Gustavo Lopez";
        boolean esMayor=true;

        System.out.println("Su nombre es :"+nombre+" su edad de "+edad+" su peso de "+peso+" y es mayor?" +esMayor);
        System.out.println("***** FUNCIONES *****");
        System.out.println("El precio de con IVA es de "+masIva(400));
    }

    static double masIva (double iva){
        return iva+iva*0.21;       
    }
}
