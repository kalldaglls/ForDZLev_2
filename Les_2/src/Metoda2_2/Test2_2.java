package Metoda2_2;

public class Test2_2 {
    public static void main(String[] args) {
        String str1 = "2434";
        String str2 = "45k";

        System.out.println(Integer.valueOf(str1).getClass());
        try {
            System.out.println(Integer.valueOf(str2).getClass());
        }catch (NumberFormatException e) {
            throw new RuntimeException("WOW");
        }finally {
            str2 = "45";
            System.out.println(Integer.valueOf(str2).getClass());
        }

        System.out.println("COOLOCLOCLOLOCLCOOC");


    }
}
