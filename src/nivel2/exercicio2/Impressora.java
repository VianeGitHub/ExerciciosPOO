package nivel2.exercicio2;

public class Impressora {

       public String imprimirStrings = "";
       public int imprimirInts = 0;
       public double imprimirDoubles = 0.0;
       public boolean imprimirBooleans = true;

       public String imprimir(String imprimirString) {
           return imprimirStrings = imprimirString;
       }

       public int imprimir(int imprimirInt) {
           return imprimirInts = imprimirInt;
       }

       public double imprimir(double imprimirDouble) {
           return imprimirDoubles = imprimirDouble;
       }

       public boolean imprimir(boolean imprimirBoolean) {
           return imprimirBooleans = imprimirBoolean;
       }

       public void exibir() {
           System.out.println("String: " + imprimirStrings);
           System.out.printf("Int: %d\n", imprimirInts);
           System.out.printf("Double: %.2f\n", imprimirDoubles);
           System.out.println("Boolean: " + imprimirBooleans);
       }
}
