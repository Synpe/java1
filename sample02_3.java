void main() {

    Scanner keyboard = new Scanner(System.in);
    int radius;
    double area;

    System.out.printf("원의 반지름 value(정수형);");
    radius = keyboard.nextInt();

    area = 3.141592 * radius * radius;

    System.out.printf("원의 반지름 : %,d cm, 면적: %,.2f \u33A0\n", radius, area);
}