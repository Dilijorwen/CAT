public class Main {
    public static void main(String[] args) {
        System.out.println("Кот номер 1:");
        Cat Kratos = new Cat("Kratos", "Sofi", 7.5, 3.3);
        System.out.println(Kratos.getName());
        System.out.println(Kratos.getOwnerName());
        System.out.println(Kratos.getAge());
        System.out.println(Kratos.getWeight());
        System.out.println(Kratos.say());
        System.out.println(Kratos.jump());
        System.out.println(Kratos.lickMilk());
        System.out.println("\n");

        System.out.println("Кот номер 2:");
        Cat Magnus = new Cat("Magnus", "Olga", 0.5, 11.1);
        System.out.println(Magnus.getName());
        System.out.println(Magnus.getOwnerName());
        System.out.println(Magnus.getAge());
        System.out.println(Magnus.getWeight());
        System.out.println(Magnus.say());
        System.out.println(Magnus.jump());
        System.out.println(Magnus.lickMilk());
    }

}