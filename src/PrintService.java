import faculty.*;

public class PrintService {

//Список студентов Гриффиндора
    public void print(Gryffindor[] gryffindorStudents) {
        System.out.println("\nНа Грффиндоре учатся:");
        System.out.println("Имя         Фамилия         Сила магии      Расстояние трансгрессии     Благородство    Честь           Храбрость\n");
        for (int i = 0; i < gryffindorStudents.length; i++) {
            Gryffindor gryffindor = gryffindorStudents [i];
            System.out.println(gryffindor.getName() +
                    "       " + gryffindor.getSurname() +
                    "             " + gryffindor.getSpellPower() +
                    "               " + gryffindor.getTransgessionDistance() +
                    "                       " + gryffindor.getGenerosity() +
                    "               " + gryffindor.getHonor() +
                    "               " + gryffindor.getBravery());
        }
    }

//Выведение в консоль всей информации по конкретному студенту Гриффиндора
    public void currentGryffindorStudentPrint(int i, Gryffindor[] gryffindorStudents) {
        Gryffindor gryffindor = gryffindorStudents [i];
        System.out.println("Имя: " + gryffindor.getName() + " " + gryffindor.getSurname() +
                ";\nСила колдовства: " + gryffindor.getSpellPower() +
                ";\nДальность Трансгрессии: " + gryffindor.getTransgessionDistance() +
                ";\nБлагородство: " + gryffindor.getGenerosity() +
                ";\nЧесть: " + gryffindor.getHonor() +
                ";\nХрабрость: " + gryffindor.getBravery());
    }

//Список студентов Пуффендуя
    public void print(Hufflepuff[] hufflepuffStudents) {
        System.out.println("\nНа Пуффендуе учатся:");
        System.out.println("Имя         Фамилия         Сила магии      Расстояние трансгрессии     Трудолюбие          Верность           Честность\n");
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            Hufflepuff hufflepuff = hufflepuffStudents [i];
            System.out.println(hufflepuff.getName() +
                    "       " + hufflepuff.getSurname() +
                    "             " + hufflepuff.getSpellPower() +
                    "               " + hufflepuff.getTransgessionDistance() +
                    "                       " + hufflepuff.getHardworkness() +
                    "               " + hufflepuff.getLoyalty() +
                    "                   " + hufflepuff.getHonesty());
        }
    }

//Выведение в консоль всей информации по конкретному студенту Пуффендуя
    public void currentHufflepuffStudentPrint(int i, Hufflepuff[] hufflepuffStudents) {
        Hufflepuff hufflepuff = hufflepuffStudents [i];
        System.out.println("Имя: " + hufflepuff.getName() + " " + hufflepuff.getSurname() +
                ";\nСила колдовства: " + hufflepuff.getSpellPower() +
                ";\nДальность Трансгрессии: " + hufflepuff.getTransgessionDistance() +
                ";\nТрудолюбие: " + hufflepuff.getHardworkness() +
                ";\nВерность: " + hufflepuff.getLoyalty() +
                ";\nЧестность: " + hufflepuff.getHonesty());
    }

//Список студентов Когтеврана
    public void print(Ravenclaw[] ravenclawStudents) {
        System.out.println("\nНа Когтевране учатся:");
        System.out.println("Имя         Фамилия         Сила магии      Расстояние трансгрессии     Ум          Мудрость           Остроумие      Творчество\n");
        for (int i = 0; i < ravenclawStudents.length; i++) {
            Ravenclaw ravenclaw = ravenclawStudents [i];
            System.out.println(ravenclaw.getName() +
                    "       " + ravenclaw.getSurname() +
                    "             " + ravenclaw.getSpellPower() +
                    "               " + ravenclaw.getTransgessionDistance() +
                    "                           " + ravenclaw.getIntelligence() +
                    "               " + ravenclaw.getWisdom() +
                    "               " + ravenclaw.getWittness() +
                    "               " + ravenclaw.getCreation());
        }
    }

//Выведение в консоль всей информации по конкретному студенту Когтеврана
    public void currentRavenclawStudentPrint(int i, Ravenclaw[] ravenclawStudents) {
        Ravenclaw ravenclaw = ravenclawStudents [i];
        System.out.println("Имя: " + ravenclaw.getName() + " " + ravenclaw.getSurname() +
                ";\nСила колдовства: " + ravenclaw.getSpellPower() +
                ";\nДальность Трансгрессии: " + ravenclaw.getTransgessionDistance() +
                ";\nУм: " + ravenclaw.getIntelligence() +
                ";\nМудрость: " + ravenclaw.getWisdom() +
                ";\nОстроумие: " + ravenclaw.getWittness() +
                ";\nТворчество: " + ravenclaw.getCreation());
    }

//Список студентов Слизерина
    public void print (Slytherin[] slytherinStudents) {
        System.out.println("\nНа Слизерене учатся:");
        System.out.println("Имя         Фамилия         Сила магии      Расстояние трансгрессии     Хитрость    Решительность       Амбициозность      Находчивость     Жажда власти\n");
        for (int i = 0; i < slytherinStudents.length; i++) {
            Slytherin slytherin = slytherinStudents [i];
            System.out.println(slytherin.getName() +
                    "       " + slytherin.getSurname() +
                    "             " + slytherin.getSpellPower() +
                    "               " + slytherin.getTransgessionDistance() +
                    "                       " + slytherin.getCunning() +
                    "               " + slytherin.getDetermination() +
                    "               " + slytherin.getAmbition() +
                    "               " + slytherin.getResourcefulness() +
                    "               " + slytherin.getLustForPower());
        }
    }

//Выведение в консоль всей информации по конкретному студенту Слизерина
    public void currentSlytherinStudentPrint(int i, Slytherin[] slytherinStudents) {
        Slytherin slytherin = slytherinStudents [i];
        System.out.println("Имя: " + slytherin.getName() + " " + slytherin.getSurname() +
                ";\nСила колдовства: " + slytherin.getSpellPower() +
                ";\nДальность Трансгрессии: " + slytherin.getTransgessionDistance() +
                ";\nХитрость: " + slytherin.getCunning() +
                ";\nРешительность: " + slytherin.getDetermination() +
                ";\nАмбициозность: " + slytherin.getAmbition() +
                ";\nНаходчивость: " + slytherin.getResourcefulness() +
                ";\nЖажда власти: " + slytherin.getLustForPower());
    }

//Сравнение двух студентов Гриффиндора
    public void compareGryffindorStudents(int i, int j, Gryffindor[] gryffindorStudents) {
        Gryffindor gryffindor1 = gryffindorStudents[i];
        Gryffindor gryffindor2 = gryffindorStudents[j];
        int student1 = gryffindor1.getGenerosity() + gryffindor1.getHonor() + gryffindor1.getBravery();
        int student2 = gryffindor2.getGenerosity() + gryffindor2.getHonor() + gryffindor2.getBravery();
        if (student1 > student2) {
            System.out.println(gryffindor1.getName() + " " + gryffindor1.getSurname() + " лучше подходит для Гриффиндора, чем "
                    + gryffindor2.getName() + " " + gryffindor2.getSurname());
        } else if (student1 < student2) {
            System.out.println(gryffindor2.getName() + " " + gryffindor2.getSurname() + " лучше подходит для Гриффиндора, чем "
                    + gryffindor1.getName() + " " + gryffindor1.getSurname());
        } else {
            System.out.println("Студенты " + gryffindor1.getName() + " " + gryffindor1.getSurname() + " и "
                    + gryffindor2.getName() + " " + gryffindor2.getSurname() + " одинаково подходят для Гриффиндора");
        }
    }

//Сравнение двух студентов Пуффендуя
    public void compareHufflepuffStudents(int i, int j, Hufflepuff[] hufflepuff) {
        Hufflepuff hufflepuff1 = hufflepuff[i];
        Hufflepuff hufflepuff2 = hufflepuff[j];
        int student1 = hufflepuff1.getHardworkness() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int student2 = hufflepuff2.getHardworkness() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if (student1 > student2) {
            System.out.println(hufflepuff1.getName() + " " + hufflepuff1.getSurname() + " лучше подходит для Пуффендуя, чем "
                    + hufflepuff2.getName() + " " + hufflepuff2.getSurname());
        } else if (student1 < student2) {
            System.out.println(hufflepuff2.getName() + " " + hufflepuff2.getSurname() + " лучше подходит для Пуффендуя, чем "
                    + hufflepuff1.getName() + " " + hufflepuff1.getSurname());
        } else {
            System.out.println("Студенты " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() + " и "
                    + hufflepuff2.getName() + " " + hufflepuff2.getSurname() + " одинаково подходят для Пуффендуя");
        }
    }

//Сравнение двух студентов Когтеврана
    public void compareRavenclawStudents(int i, int j, Ravenclaw[] ravenclawStudents) {
        Ravenclaw ravenclaw1 = ravenclawStudents[i];
        Ravenclaw ravenclaw2 = ravenclawStudents[j];
        int student1 = ravenclaw1.getIntelligence() + ravenclaw1.getWisdom() + ravenclaw1.getWittness() + ravenclaw1.getCreation();
        int student2 = ravenclaw2.getIntelligence() + ravenclaw2.getWisdom() + ravenclaw2.getWittness() + ravenclaw2.getCreation();
        if (student1 > student2) {
            System.out.println(ravenclaw1.getName() + " " + ravenclaw1.getSurname() + " лучше подходит для Когтеврана, чем "
                    + ravenclaw2.getName() + " " + ravenclaw2.getSurname());
        } else if (student1 < student2) {
            System.out.println(ravenclaw2.getName() + " " + ravenclaw2.getSurname() + " лучше подходит для Когтеврана, чем "
                    + ravenclaw1.getName() + " " + ravenclaw1.getSurname());
        } else {
            System.out.println("Студенты " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() + " и "
                    + ravenclaw2.getName() + " " + ravenclaw2.getSurname() + " одинаково подходят для Когтеврана");
        }
    }

//Сравнение двух студентов Слизерина
    public void compareSlytherinStudents(int i, int j, Slytherin[] slytherinStudents) {
        Slytherin slytherin1 = slytherinStudents[i];
        Slytherin slytherin2 = slytherinStudents[j];
        int student1 = slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        int student2 = slytherin2.getCunning() + slytherin2.getDetermination() + slytherin2.getAmbition() + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        if (student1 > student2) {
            System.out.println(slytherin1.getName() + " " + slytherin1.getSurname() + " лучше подходит для Слизерина, чем "
                    + slytherin2.getName() + " " + slytherin2.getSurname());
        } else if (student1 < student2) {
            System.out.println(slytherin2.getName() + " " + slytherin2.getSurname() + " лучше подходит для Слизерина, чем "
                    + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("Студенты " + slytherin1.getName() + " " + slytherin1.getSurname() + " и "
                    + slytherin2.getName() + " " + slytherin2.getSurname() + " одинаково подходят для Слизерина");
        }
    }

//Сравнение двух студентов Хогвартса по силе волшебства
    public void compareSpellPower (int i, int j, Hogwarts[] hogwartsStudents) {
        Hogwarts hogwarts1 = hogwartsStudents[i];
        Hogwarts hogwarts2 = hogwartsStudents[j];
        if (hogwarts1.getSpellPower() > hogwarts2.getSpellPower()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + " более сильный волшебник, чем "
                    + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts1.getSpellPower() < hogwarts2.getSpellPower()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " более сильный волшебник, чем "
                    + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println("Волшебные силы студентов " + hogwarts1.getName() + " " + hogwarts1.getSurname() + " и "
                    + hogwarts2.getName() + " " + hogwarts2.getSurname() + " одинаковы");
        }
    }

//Сравнение двух студентов Хогвартса по дальности трансгрессии
    public void compareTransgessionDistance (int i, int j, Hogwarts[] hogwartsStudents) {
        Hogwarts hogwarts1 = hogwartsStudents[i];
        Hogwarts hogwarts2 = hogwartsStudents[j];
        if (hogwarts1.getTransgessionDistance() > hogwarts2.getTransgessionDistance()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + " может трансгрессировать дальше, чем "
                    + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts1.getTransgessionDistance() < hogwarts2.getTransgessionDistance()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " может трансгрессировать дальше, чем "
                    + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println("Таланты студентов " + hogwarts1.getName() + " " + hogwarts1.getSurname() + " и "
                    + hogwarts2.getName() + " " + hogwarts2.getSurname() + " в области трансгрессии одинаковы");
        }
    }

}
