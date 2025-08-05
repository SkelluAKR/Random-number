import java.util.*;
public class random{
  public static void main(String args[]){
    int a = (int)(Math.random()*100);
    System.out.println(a);
    if(a > 90){
      System.out.println("Lucky message");
    }
  }
}