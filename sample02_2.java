void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age = 0;

    System.out.printf("What is your name? :");
    name = keyboard.nextLine();
    System.out.printf("What is your age? :");
    age = keyboard.nextInt();

    System.out.printf("이름: %s, 나이: %d살\n", name, age);
}