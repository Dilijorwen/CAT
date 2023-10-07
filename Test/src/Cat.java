public class Cat {
    private String name;
    private double age;
    private String owner_name;
    private double weight;

    public Cat(String name, String owner_name, double age, double weight) {
        this.name = name;
        this.owner_name = owner_name;
        this.age = age;
        this.weight = weight;
    }

    public String say() {
        if (age > 1) {
           return "Мяяяяяяу!";
        } else {
            return"Гав!";
        }
    }

    public String jump() {
        if (weight > 10) {
            return "Бух!";
        } else {
            return "Прыг";
        }
    }
    public String lickMilk(){
        return "Лакает молоко";
    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public String getOwnerName(){
        return owner_name;
    }
    public double getWeight(){
        return weight;
    }
}
