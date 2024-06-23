package faculty;

public abstract class HogwartsStudent {
    protected   String name;
    protected   String surname;
    protected byte spellPower;
    protected byte transgessionDistance;

    public HogwartsStudent (String name, String surname, byte spellPower, byte transgessionDistance) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
        this.transgessionDistance = transgessionDistance;
    }

    public byte getSpellPower () {
        return spellPower;
    }

    public byte getTransgessionDistance () {
        return transgessionDistance;
    }

    public String getFullName () {
        return name + " " + surname;
    }

    public static void hogwartsStudentPrint(HogwartsStudent student) {
        System.out.println("\nИмя: " + student.getFullName() +
                ";\nСила колдовства: " + student.getSpellPower() +
                ";\nДальность трансгрессии: " + student.getTransgessionDistance() + ";");
    }

//Суммирование силы колдовстваи дальности трансгрессии:
    public static int characteristicsSum (HogwartsStudent student) {
        return student.spellPower + student.transgessionDistance;
    }

//Сравнение мощности магии студентов Хогвартса
    public static void compareHogwartsStudents (HogwartsStudent student1, HogwartsStudent student2) {
        if (characteristicsSum(student1) > characteristicsSum(student2)) {
            System.out.println(student1.getFullName() + " обладает бОльшей мощностью магии, чем " + student2.getFullName());
        } else if (characteristicsSum(student1) < characteristicsSum(student2)) {
            System.out.println(student2.getFullName() + " обладает бОльшей мощностью магии, чем " + student1.getFullName());
        } else {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " обладают одинаковой мощьностью магии");
        }
    }
}