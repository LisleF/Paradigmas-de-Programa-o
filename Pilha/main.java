import java.util.Scanner;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    Pilha elms = new Pilha();
    elms.Push(2);
    System.out.println(elms.Tamanho());
    System.out.println(elms.Pop());
    System.out.println(elms.Tamanho());
  }
}