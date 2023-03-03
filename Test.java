import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размер массива ");
        int arrayLength = Integer.parseInt(reader.readLine());
        int mass[] = new int[arrayLength];
        int j;
        boolean sort = false;

            for(int i = 0; i<mass.length; i++) {
                System.out.print("Введите "  + (i+1)  + " элемент: ");
                mass[i] = Integer.parseInt(reader.readLine());
            }
        while (!sort){
            sort = true;
            for(int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]){
                  j = mass[i];
                  mass[i] = mass[i + 1];
                  mass[i + 1] = j;
                  sort = false;
                }
                }
        }
        System.out.println("Массив отсортирован в порядке возрастания методом пузырька");
        for (int i = 0; i<mass.length; i++){
            System.out.println("Элемент " + (i+1) + ": " + mass[i]);
        }
    }
}


