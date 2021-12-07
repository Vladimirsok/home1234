package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int q = 1;
        for (q=1;q<=10;q++){
            System.out.print(q + " ");}
        System.out.println();
        for (int i = 10; i >=1;i--){
            System.out.print(i + " ");}
        System.out.println();


        int dayFriday  ;
        for (dayFriday=5;dayFriday<=31;dayFriday=dayFriday+7){

            System.out.println("Сегодня пятница " +dayFriday+ "-е число. Необходимо подготовить отчет.");
        }



        int currentYear = 2021;
        int start = currentYear - 200;
        int finish = currentYear + 100;
        for(int i = start; i<finish;i++)
            if (i % 79 == 0){
                System.out.println(i);}

    }
}
