package DZ_2_2;

import java.util.Arrays;

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
//и просуммировать. Если в каком-то элементе массива преобразование не удалось
//(например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException,
//с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
//MyArrayDataException, и вывести результат расчета.
//как мне здесь изменить цвет закомментированного текста???ПОЯРЧЕ!!!
//1.Исключения должны быть Checked or UnChecked?2. "Метод" создать в классе Main или нет?
public class DZ_Main_2_2 {
    public static void main(String[] args) {
        String [][] newStr =
           {{"14","-10","3","99"},
            {"56","42","17","5"},
            {"8","-97","-67","3"},
            {"1","77","0","43"}};

        String [][] newStr3 =
                {{"0","3","99"},
                 {"7","17","5"},
                 {"-97","5","3"},
                 {"77","0","43"}};

        String [][] newStr2 =
                {{"14","8f","3","99"},
                 {"56","df","17","5"},
                 {"8","-97","-67","3"},
                 {"1","77","0","43"}};

        System.out.println(newStr.length);
   //     while (true) {
            try {
                //checkExp(newStr);
                checkExp(newStr2);
//                checkExp(newStr3);
                //checkExp(newStr);
            } catch (MyArrayDataException | MyArraySizeException e) {
                System.out.println();
                System.out.println("We are lost!");
                System.out.println(e.getCause());
                e.printStackTrace();
            }
//            catch (MyArraySizeException e) {
//                System.out.println();
//                System.out.println("We are lost!");
//                e.printStackTrace();
//                System.out.println(e.getCause());
//            }
            finally {
                System.out.println("FINAL!");
            }
      //  }

        System.out.println("END OF PROGRAM");
    }

    public static void checkExp(String [][] strings) throws MyArraySizeException, MyArrayDataException {
//        for (String o: strings) {
//            Integer.parseInt(o);
//        }
        System.out.println(strings.length);
        System.out.println(strings[0].length);
        if(strings.length != 4 || strings[0].length != 4) {
            throw new MyArraySizeException("Wrong array size!");
        }
        int [][] ints = new int[strings.length][strings.length];
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length ; j++) {
                //if (!Integer.valueOf(strings[i][j]).getClass().equals(strings[i][j].getClass())){
                 try {
                     ints[i][j] = Integer.parseInt(strings[i][j]);
                     System.out.print("[" + ints[i][j] + "]");
                     sum = sum + ints[i][j];
                 } catch (NumberFormatException e) {
                     throw new MyArrayDataException(String.format("Wrong data type in cell [%s][%s]!",i,j),e);
                 }
            }
            System.out.println();
        }
//        int sum = 0;
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < ints.length ; j++) {
//                System.out.print("[" + ints[i][j] + "]");
//                sum = sum + ints[i][j];
//            }
//            System.out.println();
//        }
        System.out.println(sum);
    }
}
