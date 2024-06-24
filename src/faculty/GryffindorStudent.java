package faculty;

public class GryffindorStudent extends HogwartsStudent {
    private byte generosity;
    private byte honor;
    private byte bravery;

    public GryffindorStudent (String name, String surname, byte spellPower, byte transgessionDistance, byte generosity, byte honor, byte bravery) {
        super (name, surname, spellPower, transgessionDistance);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

//Метод для выведения информации по конкретному студенту Гриффиндора
    @Override
    public void allStatsPrint() {
        super.allStatsPrint();
        System.out.println ("Благородство: " + generosity + ";\nЧесть: " + honor + ";\nХрабрость: " + bravery + ";");
    }

//Суммирование качеств студента Гриффиндора
    public int gryffindorCharacteristicsSum () {
        return generosity + honor + bravery;
    }

//Сравнение двух студентов Гриффиндора
    public void compareGryffindorStudents (GryffindorStudent student) {
        if (this.gryffindorCharacteristicsSum() > student.gryffindorCharacteristicsSum()) {
            System.out.println(this.getFullName() + " лучше подходит для Гриффиндора, чем " + student.getFullName());
        } else if (student.gryffindorCharacteristicsSum() > this.gryffindorCharacteristicsSum()) {
            System.out.println(student.getFullName() + " лучше подходит для Гриффиндора, чем " + this.getFullName());
        } else {
            System.out.println("Студенты " + this.getFullName() + " и " + student.getFullName() + " одинаково подходят для Гриффиндора");
        }
    }
}