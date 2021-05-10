public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords(){
        System.out.println("Orange \nBanana \nApple");
    }

    static void checkSumSign(){
        int a=5;
        int b=-6;
        int c=a+b;
        if(c>=0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor(){
        int value=101;
        if(value<=0){
            System.out.println("Красный");
        }
        else if (value>0&&value<=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленный");
        }
    }

    static void compareNumbers(){
        int a=2;
        int b=6;
        if(a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }

}
