package ClassWork2_2;

public class Main2_2 {
    public static void main(String[] args) {
//        try {
//            String str1 = "1i";
//            System.out.println(Integer.parseInt(str1));
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }
//        System.out.println("aasd");
        Airplane airplane1 = new Airplane("SU-27");
        System.out.println("AASD");
        try {
            airplane1.doStabCheck();
        }
//        catch (StabExp e) {
//            e.printStackTrace();
//        }
        finally {
            System.out.println("EGORKA!!!");
        }

//        airplane1.doStabCheck();
//        System.out.println("+++++++++++++++++++++++++++++++++++");
//
//        airplane1.fly();
//
//        System.out.println("-----------------------------------");
//
//        airplane1.fly();

        System.out.println("EGOR!!!");
       Airplane airplane2 = new Airplane("F-22", 20);

    }
}
