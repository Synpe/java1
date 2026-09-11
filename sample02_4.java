void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    float height;
    double weight;

    System.out.printf("What is your name? :");
    name = keyboard.nextLine();
    System.out.printf("What is your age? :");
    age = keyboard.nextInt();
    System.out.printf("How tall are you? :");
    height = keyboard.nextFloat();
    System.out.printf("What is your weight? (kg) :");
    weight = keyboard.nextDouble();

    System.out.printf("%s님의 나이는 %d입니다.\n", name, age);
    System.out.printf("%s님의 키는 %.1f입니다.\n" name, height);
    System.out.printf("%s님의 키는 %.1f입니다.\n" name, weight);
}