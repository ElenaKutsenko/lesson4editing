public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i);
            i = i + 1;
        }
        {System.out.println ("\n");
        }

        for (int b =10;b>=1; b =b-1){
            System.out.print(b);

        }
        {System.out.println ("\n");
        }

        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница," + friday+ "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;

        }
        int now = 2021;
        int future = now+100;
        for (int year =1896;year<=future; year= year+79) {
            System.out.println(year);


        }}}
