public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Section 5: Day of the week Challenge+");

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    private static void printDayOfTheWeek(int day){
        if (day == 0){
            System.out.println("Day of the week is Sunday");
        } else if(day == 1){
            System.out.println("Day of the week is Monday");
        } else if (day == 2){
            System.out.println("Day of the week is Tuesday");
        } else if(day == 3){
            System.out.println("Day of the week is Wednesday");
        } else if (day == 4){
            System.out.println("Day of the week is Thursday");
        } else if(day == 5){
            System.out.println("Day of the week is Friday");
        } else if(day == 6){
            System.out.println("Day of the week is Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}