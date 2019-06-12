package Modul2_Test2;

public class Test2 {
    /*
    Scrieti o solutie pentru urmatoarea situatie: Aveti un ceas care arata in felul urmator:(displayed on TV/projector - un exemplu)
    1. Becul rotund reprezinta secundele. Aprins inseamna ca a  trecut un numar par de secunde, stins inseamna ca e numar impar de secunde
    2. Urmatoarele 2 linii reprezinta orele
    3. Ultimele 2 linii reprezinta minutele. Afisati ora pe care ati primit-o ca set de date
    (cate un set de date pt fiecare) utilizand pentru fiecare interval de timp cate un simbol diferit.
    Exemplu: pt 31 de secunde afisati I de atarea ori cate secunde de valoare impara au trecut de la inceputul minutului.
    Acelasi lucru pentru litera P( valoare para)
    Ai de afisat ora 12:46:51
    */
    public static void main(String args[]) {
        int o = 12;
        int m = 46;
        int s = 51;

        int x = 0;
        int y = 0;
        int i = 0;

        // Afisare 12 ore (prima linie: 2*5 = 10, a doua linie: 2*1 = 2)
        x = o / 5;
        y = o % 5;

        for (i = 0; i < x; i++) {
            System.out.print("O");
        }

        System.out.println();

        for (i = 0; i < y; i++) {
            System.out.print("o");
        }

        System.out.println();

        // Afisare 51 secunde (pentru numar impar: I, pentru numar par: P)
        if ((s % 2) != 0)
        {
            System.out.print("I");
        }
        else {
            System.out.print("P");
        }

        System.out.println();

        // Afisare 46 minute (prima linie: 9*5 = 45, a doua linie: 1*1 = 1)
        x = m / 5;
        y = m % 5;

        for (i = 0; i < x; i++) {
            System.out.print("M");
        }

        System.out.println();

        for (i = 0; i < y; i++) {
            System.out.print("m");
        }
    }
}
