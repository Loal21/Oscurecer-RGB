package Examen1;

import java.util.Scanner;
import javax.swing.text.html.HTMLEditorKit;

public class OscuNum {

    static int digitosg[] = new int[3];
    static int digitos = 0;
    static int poscu = 0;
    static int doscu[] = new int[3];

    public static void main(String[] args) {
        oscurecer();
    }

    public static void oscurecer() {

        System.out.println("Digite sus 3 enteros separados por un espacio");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            digitos = sc.nextInt();
            digitosg[i] = digitos;
            if (digitos > 255) {
                System.out.println("El digito " + digitosg[i] + " es mayor a 255, porfavor digite otro");
                i--;
            } else {
                System.out.println(digitosg[i]);
            }
        }

        System.out.println("Digite el porcentaje que quiere oscurecer sus colores");
        poscu = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            poscu = digitosg[i] * poscu / 100;
            doscu[i] = poscu + digitosg[i];
            if (doscu[i] > 255) {
                doscu[i] = 255;
            }
            System.out.print(" " + doscu[i]);

        }
    }
}
