package faculty;

public class RavenclawStudent extends HogwartsStudent {
    private byte intelligence;
    private byte wisdom;
    private byte wittness;
    private byte creation;

    public RavenclawStudent (String name, String surname, byte spellPower, byte transgessionDistance, byte intelligence, byte wisdom, byte wittness, byte creation) {
        super(name, surname, spellPower, transgessionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittness = wittness;
        this.creation = creation;
    }

    public byte getIntelligence () {
        return intelligence;
    }

    public byte getWisdom () {
        return wisdom;
    }

    public byte getWittness () {
        return wittness;
    }

    public byte getCreation () {
        return creation;
    }

//Метод для выведения информации по конкретному студенту Когтеврана
    public static void ravenclawStudentPrint (RavenclawStudent student) {
        hogwartsStudentPrint(student);
        System.out.println("Ум: " + student.getIntelligence() +
                ";\nМудрость: " + student.getWisdom() +
                ";\nОстроумие: " + student.getWittness() +
                ";\nТворчество: " + student.getCreation());
    }

//Суммирование качеств студента Когтеврана
    public static int characteristicsSum (RavenclawStudent student) {
        return student.intelligence + student.wisdom + student.wittness + student.creation;
    }

//Сравнение двух студентов Когтеврана
    public static void compareRavenclawStudents (RavenclawStudent student1, RavenclawStudent student2) {
        if (characteristicsSum(student1) > characteristicsSum(student2)) {
            System.out.println(student1.getFullName() + " лучше подходит для Когтеврана, чем " + student2.getFullName());
        } else if (characteristicsSum(student1) < characteristicsSum(student2)) {
            System.out.println(student2.getFullName() + " лучше подходит для Когтеврана, чем " + student1.getFullName());
        } else {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " одинаково подходят для Когтеврана");
        }
    }
}