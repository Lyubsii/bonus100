public class Main {
    public static void main(String[] args) {

        int customerBalance = 200;
        int add = 1896;
        int bonus = 0;

        if (add > 1000){
            bonus = add / 100;
        }


        int totalAccount = customerBalance + add + bonus;

        System.out.println("Ваш итоговый счет, включая бонусы " + totalAccount + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");

    }
}