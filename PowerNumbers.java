
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class PowerNumbers {


    static int power(int n,int m){
        if(m == 0 ){
            return 1;
        }

        return n*power(n,m-1);
    }
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       int n,m;
        System.out.print("Taban kuvveti giriniz : ");
        n=inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        m=inp.nextInt();


        System.out.println("Sonuç : "+ power(n,m));
    }
}
