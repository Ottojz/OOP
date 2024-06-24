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

//Метод для выведения информации по конкретному студенту Когтеврана
    @Override
    public void allStatsPrint() {
        super.allStatsPrint();
        System.out.println("Ум: " + intelligence + ";\nМудрость: " + wisdom + ";\nОстроумие: " + wittness +
                ";\nТворчество: " + creation + ";");
    }

//Суммирование качеств студента Когтеврана
    public int ravenclawCharacteristicsSum () {
        return intelligence + wisdom + wittness + creation;
    }

//Сравнение двух студентов Когтеврана
    public void compareRavenclawStudents (RavenclawStudent student) {
        if (this.ravenclawCharacteristicsSum() > student.ravenclawCharacteristicsSum()) {
            System.out.println(this.getFullName() + " лучше подходит для Когтеврана, чем " + student.getFullName());
        } else if (student.ravenclawCharacteristicsSum() > this.ravenclawCharacteristicsSum()) {
            System.out.println(student.getFullName() + " лучше подходит для Когтеврана, чем " + this.getFullName());
        } else {
            System.out.println("Студенты " + this.getFullName() + " и " + student.getFullName() + " одинаково подходят для Когтеврана");
        }
    }
}