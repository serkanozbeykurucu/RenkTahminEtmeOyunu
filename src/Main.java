import java.util.Random;
import java.util.Scanner;

public class Main
{
    private static void renktahminetme()
    {
        Scanner rd = new Scanner(System.in);
        String[] renkler = {"kirmizi","mavi","sarı"};

        Random rnd = new Random();
        int x = rnd.nextInt(3);
        System.out.println(x);

        System.out.println("Bir Renk Giriniz (kirmizi,mavi,sari):");
        var renk =  rd.nextLine();

        if (renk.equals(renkler[x].toString()))
        {
            System.out.println("Rengi Dogru Tahmin Ettiniz...!");
        }
        else
        {
            System.out.println("Rengi Yanlis Tahmin Ettiniz...!");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}