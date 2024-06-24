package faculty;

public abstract class HogwartsStudent {
    private String name;
    private String surname;
    private byte spellPower;
    private byte transgessionDistance;

    public HogwartsStudent (String name, String surname, byte spellPower, byte transgessionDistance) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
        this.transgessionDistance = transgessionDistance;
    }

    public String getFullName() {
        return name + " " + surname;
    }

//Метода выведения общей информации по любому студенту Хогвартса
    public void allStatsPrint () {
        System.out.println("\nИмя: " + getFullName() + ";\nСила колдовства: " + spellPower +
                ";\nДальность трансгрессии: " + transgessionDistance + ";");
    }
//Понимаю, что можно было реализовать как геттер, привести все к одной строке и в других классах вызывать через this.
//но с таким решением (переопределение метода) не пришлось придумывать новое название методу

//Суммирование силы колдовстваи дальности трансгрессии:
    public int hogwartsCharacteristicsSum () {
        return spellPower + transgessionDistance;
    }

//Сравнение мощности магии студентов Хогвартса
    public void compareHogwartsStudents (HogwartsStudent student) {
        if (this.hogwartsCharacteristicsSum() > student.hogwartsCharacteristicsSum()) {
            System.out.println(this.getFullName() + " обладает бОльшей мощностью магии, чем " + student.getFullName());
        } else if (student.hogwartsCharacteristicsSum() > this.hogwartsCharacteristicsSum()) {
            System.out.println(student.getFullName() + " обладает бОльшей мощностью магии, чем " + this.getFullName());
        } else {
            System.out.println("Студенты " + this.getFullName() + " и " + student.getFullName() + " обладают одинаковой мощьностью магии");
        }
    }
}