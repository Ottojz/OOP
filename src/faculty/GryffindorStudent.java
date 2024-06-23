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

    public byte getGenerosity () {
        return generosity;
    }

    public byte getHonor () {
        return honor;
    }

    public byte getBravery () {
        return bravery;
    }

//Метод для выведения информации по конкретному студенту Гриффиндора
    public static void gryffindorStudentPrint (GryffindorStudent student) {
        hogwartsStudentPrint(student);
        System.out.println("Благородство: " + student.getGenerosity() +
                ";\nЧесть: " + student.getHonor() +
                ";\nХрабрость: " + student.getBravery());
    }

//Суммирование качеств студента Гриффиндора
    public static int characteristicsSum (GryffindorStudent student) {
        return student.generosity + student.honor + student.bravery;
    }

//Сравнение двух студентов Гриффиндора
    public static void compareGryffindorStudents (GryffindorStudent student1, GryffindorStudent student2) {
        if (characteristicsSum(student1) > characteristicsSum(student2)) {
            System.out.println(student1.getFullName() + " лучше подходит для Гриффиндора, чем " + student2.getFullName());
        } else if (characteristicsSum(student1) < characteristicsSum(student2)) {
            System.out.println(student2.getFullName() + " лучше подходит для Гриффиндора, чем " + student1.getFullName());
        } else {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " одинаково подходят для Гриффиндора");
        }
    }
}