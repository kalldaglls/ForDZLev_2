package Metoda2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestExcep {
    public static void main(String[] args) {
        //Проверка RuntimeException(UnChecked)
        int a = 2;
        int b = 0;
    try {
 nullPointer(a,b);
 } catch (ArithmeticException e_a) {
   e_a.printStackTrace();
 }
        //finally {
//            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//        }

        int [] d ={a,b};
//        try {
//            throw new AncestorThrow("KILLL!", "Buick!");
//            System.out.println(d[2]);
 //           int c = a/b;
//            System.out.println(c);
       // System.out.println(c);
            System.out.println("INSIDE 30");
//        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e + " OMG!");
//            System.out.println();
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e1) {
//            e1.printStackTrace();
//        }
//        } catch (AncestorThrow ancestorThrow) {
//            ancestorThrow.printStackTrace();
//        }
//        } catch (AncestorThrow e2) {
//            throw e2;
//        }
      //  System.out.println(a/b);
        System.out.println("Continue...");
//   Выдал: Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Metoda2_2.TestExcep.main(TestExcep.java:7)
        //Почему???

        //Проверка Checked. Выкидывает FileNotFoundException! Если не делаю throws FileNotFoundException, то
        // не компилирует вообще!!!
//        try {
//
//            File file = new File("C:/JAVA/IdeaProjects/ForDZLev_2/Les_1/Green1.txt");
////            Scanner scanner = new Scanner(file);
////             Если здесь не делать try catch или не выкидывать
////            System.out.println(scanner.nextLine());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("AFTERFILENOTFOUND");
    }

    public static void nullPointer(int a, int b) throws ArithmeticException {
        int c = a/b;
    }
}
