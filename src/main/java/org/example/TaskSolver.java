package org.example;

public class TaskSolver {
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RESET = "\u001B[0m";

    public static void getProblemStatement(){
        System.out.println(YELLOW +" 1" +RESET + GREEN+".Ikki xonali son berilgan." + "Avval uning o‘nlar, keyin birlar xonasidagi raqamlarini ekranga chiqaring"+RESET);
        System.out.println(YELLOW+"2."+RESET+GREEN+"Ikki xonali son berilgan. Ularning raqamlari yig‘indisini hisoblaydigan dastur tuzing."+RESET);
        System.out.println(YELLOW+"3."+GREEN+"Uch xonali son berilgan. Avval yuzlar, keyin o‘nlar va oxirida birlar xonasidagi raqamlarini ekranga chiqaring"+RESET);
        System.out.println(YELLOW+"4"+GREEN+"Berilgan uch xonali sonning raqamlarini teskari tartibda chiqaruvchi dastur yozing."+RESET);
        System.out.println(YELLOW+"5"+GREEN+"Berilgan uch xonali son palindrom ekanligini tekshiring (teskari o‘qilganda o‘zi bilan bir xil bo‘lishi kerak, masalan: 121, 232)."+RESET);
    }
}
