public class Main {

    public static void main(String[] args) {

        String greeting = "Hello Filip";
        System.out.println(greeting);

        int birthYear = 1998;
        System.out.println("I was born in the year " + birthYear);

        double pi = 3.14;

        boolean isLearningJava = true;
        System.out.println(isLearningJava);

        String favouriteFilm = "Spider-Man";
        System.out.println("My favourite film is " + favouriteFilm);
        favouriteFilm = "Hannah Montana: The Movie";
        System.out.println("My favourite film is " + favouriteFilm);

        //task 5
        String firstName = "Filip";
        printGreeting(firstName);

        int result = subtractNum(9,4);
        System.out.println("The result is: " + result);
    }

    private static void printGreeting (String name){
        System.out.println("Hello " + name);
    }

    private static int subtractNum (int num1, int num2) {
        return num1 - num2;
    }

}
