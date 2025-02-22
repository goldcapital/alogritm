package org.example;

public class TaskSolver {

        private static final String[] PROBLEMS = {
                "Ikki xonali son berilgan. Avval uning o‘nlar, keyin birlar xonasidagi raqamlarini ekranga chiqaring",
                "Ikki xonali son berilgan. Ularning raqamlari yig‘indisini hisoblaydigan dastur tuzing.",
                "Uch xonali son berilgan. Avval yuzlar, keyin o‘nlar va oxirida birlar xonasidagi raqamlarini ekranga chiqaring",
                "Berilgan uch xonali sonning raqamlarini teskari tartibda chiqaruvchi dastur yozing.",
                "Berilgan uch xonali son palindrom ekanligini tekshiring (teskari o‘qilganda o‘zi bilan bir xil bo‘lishi kerak, masalan: 121, 232).",
                "Uch xonali son berilgan. Uning o'nliklar xonasidagi raqam bilan yuzliklar xonasidagi raqamni almashtirishdan hosil bo‘lgan sonni aniqlovchi programma tuzing (Masalan: Kirish=123, Natija=213).",
                "Qasidir yil berilgan .Berilgan yilning qaysi yuz yilikka kirishini aniqlovchi programma tuzilsin (Masalan : 20 yuz yillikning boshi 1901 yil",
                "Kun boshidan boshlab N sekund o'tdi .Kun boshidan boshlab qancha soat ,minut ,sekund o'tganini hisoblovchi dastur tuzing",
        };

        public static void getProblemStatement() {
            for (int i = 0; i < PROBLEMS.length; i++) {
                System.out.println(Color.YELLOW + (i + 1) + "." + Color.RESET + Color.GREEN + PROBLEMS[i] + Color.RESET);
            }
        }
    public static class Color {
        private static final String GREEN = "\u001B[32m";
        private static final String YELLOW = "\u001B[33m";
        private static final String RESET = "\u001B[0m";
    }
}
