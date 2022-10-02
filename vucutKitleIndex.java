import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class vucutKitleIndex {
    public static void main(String[] args) {
        double boy, kilo, index;
        Scanner input = new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();
        index=(kilo)/(boy*boy);
        System.out.println("Vucut kitle indexiniz: "+index);
    }
}
