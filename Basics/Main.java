public class Main {
  public static void main(String[] arg) {
    // Some basics
    int myInt = 13;
    float myFloat = 7.9f;
    double pi = 3.141592;
    char myChar = 'A';
    String name = "ME";

    String[] pens = {"Blue", "Red", "Green", "Black"};
    
    System.out.println("int = " + myInt);
    System.out.println("float and double = " + myFloat + "/" + pi);
    System.out.println("My name starts with an " + myChar);
    System.out.println("Hello " + name);
    
    int count = 0;
    while (count < pens.length) {
      System.out.print("\t" + pens[count]);
      count++;
    }
        
    // Print args
    for (int i = 0; i < arg.length; i++) {
      System.out.println(arg[i]);
    }
  }
}
