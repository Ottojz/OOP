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

//Метод для выведения информации по конкретному студенту Пуффендуя
    @Override
    public void allStatsPrint () {
        super.allStatsPrint();
        System.out.println ("Трудолюбие: " + hardworkness + ";\nВерность: " + loyalty + ";\nЧестность: " + honesty + ";");
    }

//Суммирование качеств студента Пуффендуя
    public int hufflepuffCharacteristicsSum () {
        return hardworkness + loyalty + honesty;
    }

//Сравнение двух студентов Пуффендуя
    public void compareHufflepuffStudents (HufflepuffStudent student) {
        if (this.hufflepuffCharacteristicsSum() > student.hufflepuffCharacteristicsSum()) {
            System.out.println(this.getFullName() + " лучше подходит для Пуффендуя, чем " + student.getFullName());
        } else if (student.hufflepuffCharacteristicsSum() > this.hufflepuffCharacteristicsSum()) {
            System.out.println(student.getFullName() + " лучше подходит для Пуффендуя, чем " + this.getFullName());
        } else {
            System.out.println("Студенты " + this.getFullName() + " и " + student.getFullName() + " одинаково подходят для Пуффендуя");
        }
    }
}