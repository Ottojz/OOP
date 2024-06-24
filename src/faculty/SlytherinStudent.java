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

//Метод для выведения информации по конкретному студенту Слизерина
    @Override
    public void allStatsPrint() {
        super.allStatsPrint();
        System.out.println("Хитрость: " + cunning + ";\nРешительность: " + determination + ";\nАмбициозность: " +
                ambition + ";\nНаходчивость: " + resourcefulness + ";\nЖажда власти: " + lustForPower + ";");
    }

//Суммирование качеств студента Слизерина
    public int slytherinCharacteristicsSum () {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

//Сравнение двух студентов Слизерина
    public void compareSlytherinStudents (SlytherinStudent student) {
        if (this.slytherinCharacteristicsSum() > student.slytherinCharacteristicsSum()) {
            System.out.println(this.getFullName() + " лучше подходит для Слизерина, чем " + student.getFullName());
        } else if (student.slytherinCharacteristicsSum() > this.slytherinCharacteristicsSum()) {
            System.out.println(student.getFullName() + " лучше подходит для Слизерина, чем " + this.getFullName());
        } else {
            System.out.println("Студенты " + this.getFullName() + " и " + student.getFullName() + " одинаково подходят для Слизерина");
        }
    }
}