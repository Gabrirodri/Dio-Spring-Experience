
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;
import java.text.DecimalFormat;

public class Program {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int casos = input.nextInt();
    int cont = 0;
    while (cont < casos) {

      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      // TODO: complete os espaços em branco com sua solução para o problema

      double media = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);
      DecimalFormat df = new DecimalFormat("###,###.0");
      System.out.println(df.format(media));
      cont++;
    }
  }
}