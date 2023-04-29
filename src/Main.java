import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a ="1,e3,e6,e8";
        String[] strings= a.split(",e");
        int[] array =new int[strings.length];
        for (int i=0;i<strings.length;i++){
            array[i]= Integer.parseInt(strings[i]);
        }
        double d=0;
        for(int e=0;e<array.length; e++){
            d=d+Math.pow(array[e],2);
        }
        System.out.println(d);

        }
    }

