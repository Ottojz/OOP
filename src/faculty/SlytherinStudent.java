package faculty;

public class SlytherinStudent extends HogwartsStudent {
    private byte cunning;
    private byte determination;
    private byte ambition;
    private byte resourcefulness;
    private byte lustForPower;

    public SlytherinStudent (String name, String surname, byte spellPower, byte transgessionDistance, byte cunning, byte determination, byte ambition, byte resourcefulness, byte lustForPower) {
        super(name, surname, spellPower, transgessionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public byte getCunning () {
        return cunning;
    }

    public byte getDetermination () {
        return determination;
    }

    public byte getAmbition () {
        return ambition;
    }

    public byte getResourcefulness () {
        return resourcefulness;
    }

    public byte getLustForPower () {
        return lustForPower;
    }

//Метод для выведения информации по конкретному студенту Слизерина
    public static void slytherinStudentPrint (SlytherinStudent student) {
        hogwartsStudentPrint(student);
        System.out.println("Хитрость: " + student.getCunning() +
                ";\nРешительность: " + student.getDetermination() +
                ";\nАмбициозность: " + student.getAmbition() +
                ";\nНаходчивость: " + student.getResourcefulness() +
                ";\nЖажда власти: " + student.getLustForPower());
    }

//Суммирование качеств студента Слизерина
    public static int characteristicsSum (SlytherinStudent student) {
        return student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;
    }

//Сравнение двух студентов Слизерина
    public static void compareSlytherinStudents (SlytherinStudent student1, SlytherinStudent student2) {
        if (characteristicsSum(student1) > characteristicsSum(student2)) {
            System.out.println(student1.getFullName() + " лучше подходит для Слизерина, чем " + student2.getFullName());
        } else if (characteristicsSum(student1) < characteristicsSum(student2)) {
            System.out.println(student2.getFullName() + " лучше подходит для Слизерина, чем " + student1.getFullName());
        } else {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " одинаково подходят для Слизерина");
        }
    }
}