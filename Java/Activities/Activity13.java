package Activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> aList= new ArrayList<>();
        Random random = new Random();
        System.out.println("Enter the Integer numbers");
        while(sc.hasNextInt())
        {
            aList.add(sc.nextInt());
        }
        Integer num[] =aList.toArray(new Integer[0]);
         int index = random.nextInt(num.length);
         System.out.println("Index Value Generated " +index);
         System.out.println("Value in Array at Generated index " +num[index]);
            sc.close();
    }

}
