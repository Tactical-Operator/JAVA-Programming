import java.util.Scanner; 

class MyClass {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = sc.nextInt(); 

    System.out.println("Type another number:");
    y = sc.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
    sc.close();;
  }
}