import java.util.Random;

public class NumerosAleatorios {

  public static void main(String[] args) {
   
    Random numeros = new Random();
    
    int contador = 0;
    
    while(contador<30) {
      contador++;
      int numerosAleatorios=numeros.nextInt(1,10);
      System.out.println(contador + " número aleatorio: " + numerosAleatorios);
    }
    
  }

}
