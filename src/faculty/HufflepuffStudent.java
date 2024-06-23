package faculty;

public class HufflepuffStudent extends HogwartsStudent {
    private byte hardworkness;
    private byte loyalty;
    private byte honesty;

    public HufflepuffStudent (String name, String surname, byte spellPower, byte transgessionDistance, byte hardworkness, byte loyalty, byte honesty) {
        super (name, surname, spellPower, transgessionDistance);
        this.hardworkness = hardworkness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public byte getHardworkness () {
        return hardworkness;
    }

    public byte getLoyalty () {
        return loyalty;
    }

    public byte getHonesty () {
        return honesty;
    }

//Метод для выведения информации по конкретному студенту Пуффендуя
    public static void hufflepuffStudentPrint (HufflepuffStudent student) {
        hogwartsStudentPrint(student);
        System.out.println("Трудолюбие: " + student.getHardworkness() +
                ";\nВерность: " + student.getLoyalty() +
                ";\nЧестность: " + student.getHonesty());
    }

//Суммирование качеств студента Пуффендуя
    public static int characteristicsSum (HufflepuffStudent student) {
        return student.hardworkness + student.loyalty + student.honesty;
    }

//Сравнение двух студентов Пуффендуя
    public static void compareHufflepuffStudents (HufflepuffStudent student1, HufflepuffStudent student2) {
        if (characteristicsSum(student1) > characteristicsSum(student2)) {
            System.out.println(student1.getFullName() + " лучше подходит для Пуффендуя, чем " + student2.getFullName());
        } else if (characteristicsSum(student1) < characteristicsSum(student2)) {
            System.out.println(student2.getFullName() + " лучше подходит для Пуффендуя, чем " + student1.getFullName());
        } else {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " одинаково подходят для Пуффендуя");
        }
    }
}