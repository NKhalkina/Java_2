package HomeWork2;
/*Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
*результат после каждой итерации запишите в лог-файл. */
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;

public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите длину массива: ");
        int size = scanner.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); 
        }
        System.out.print ("");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); 
        }
        System.out.println();
        System.out.println("Отсортированный массив: " + bubble(array));
        System.out.println();
    }

    public static String bubble(int[] mas) {
        boolean isSorted = false;
        int buf;
        String file_name = "D:/OBMENN/IT/Java/HomeWork2/log.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,false);
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;
                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                        writer.write(Arrays.toString(mas));
                        writer.write("\n");
                    }
                }
            }
            writer.close();
    } catch (Exception e){ 
        System.out.println("Ошибка");
    }
        return Arrays.toString(mas);
}
}