import faculty.*;

public class Main {
    public static void main(String[] args) {

//Массив студентов Хогвартса
        Hogwarts[] hogwartsStudents = {
                new Hogwarts ("Harry", "Potter", (byte) 95, (byte) 30),
                new Hogwarts ("Hermione", "Granger", (byte) 55, (byte) 90),
                new Hogwarts ("Ron", "Weasley", (byte) 45, (byte) 45),
                new Hogwarts ("Zacharias", "Smith", (byte) 13, (byte) 53),
                new Hogwarts ("Cedric", "Diggory", (byte) 81, (byte) 83),
                new Hogwarts ("Justin", "Finch-Fletchley", (byte) 47, (byte) 22),
                new Hogwarts ("Cho", "Chang", (byte) 65, (byte) 44),
                new Hogwarts ("Padma", "Patil", (byte) 73, (byte) 65),
                new Hogwarts ("Marcus", "Belby", (byte) 12, (byte) 13),
                new Hogwarts ("Draco", "Malfoy", (byte) 85, (byte) 48),
                new Hogwarts ("Graham", "Montague", (byte) 8, (byte) 32),
                new Hogwarts ("Gregory", "Goyle", (byte) 22, (byte) 15)
        };

//Массив студентов Гриффиндора
        Gryffindor[] gryffindorStudents = {
                new Gryffindor (hogwartsStudents[0].getName(), hogwartsStudents[0].getSurname(), hogwartsStudents[0].getSpellPower(), hogwartsStudents[0].getTransgessionDistance(), (byte) 73, (byte) 78, (byte) 82),
                new Gryffindor (hogwartsStudents[1].getName(), hogwartsStudents[1].getSurname(), hogwartsStudents[1].getSpellPower(), hogwartsStudents[1].getTransgessionDistance(), (byte) 80, (byte) 33, (byte) 60),
                new Gryffindor (hogwartsStudents[2].getName(), hogwartsStudents[2].getSurname(), hogwartsStudents[2].getSpellPower(), hogwartsStudents[2].getTransgessionDistance(), (byte) 95, (byte) 68, (byte) 95),
        };

//Массив студентов Пуффендуя
        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff (hogwartsStudents[3].getName(), hogwartsStudents[3].getSurname(), hogwartsStudents[3].getSpellPower(), hogwartsStudents[3].getTransgessionDistance(), (byte) 69, (byte) 78, (byte) 72),
                new Hufflepuff (hogwartsStudents[4].getName(), hogwartsStudents[4].getSurname(), hogwartsStudents[4].getSpellPower(), hogwartsStudents[4].getTransgessionDistance(), (byte) 52, (byte) 92, (byte) 81),
                new Hufflepuff (hogwartsStudents[5].getName(), hogwartsStudents[5].getSurname(), hogwartsStudents[5].getSpellPower(), hogwartsStudents[5].getTransgessionDistance(), (byte) 73, (byte) 74, (byte) 63),
        };

//Массив студентов Когтеврана
        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw (hogwartsStudents[6].getName(), hogwartsStudents[6].getSurname(), hogwartsStudents[6].getSpellPower(), hogwartsStudents[6].getTransgessionDistance(), (byte) 12, (byte) 18, (byte) 43, (byte) 15),
                new Ravenclaw (hogwartsStudents[7].getName(), hogwartsStudents[7].getSurname(), hogwartsStudents[7].getSpellPower(), hogwartsStudents[7].getTransgessionDistance(), (byte) 96, (byte) 23, (byte) 46, (byte) 19),
                new Ravenclaw (hogwartsStudents[8].getName(), hogwartsStudents[8].getSurname(), hogwartsStudents[8].getSpellPower(), hogwartsStudents[8].getTransgessionDistance(), (byte) 18, (byte) 64, (byte) 55, (byte) 73),
        };

//Массив студентов Слизерина
        Slytherin[] slytherinStudents = {
                new Slytherin (hogwartsStudents[9].getName(), hogwartsStudents[9].getSurname(), hogwartsStudents[9].getSpellPower(), hogwartsStudents[9].getTransgessionDistance(), (byte) 73, (byte) 13, (byte) 90, (byte) 42, (byte) 59),
                new Slytherin (hogwartsStudents[10].getName(), hogwartsStudents[10].getSurname(), hogwartsStudents[10].getSpellPower(), hogwartsStudents[10].getTransgessionDistance(), (byte) 23, (byte) 47, (byte) 70, (byte) 90, (byte) 22),
                new Slytherin (hogwartsStudents[11].getName(), hogwartsStudents[11].getSurname(), hogwartsStudents[11].getSpellPower(), hogwartsStudents[11].getTransgessionDistance(), (byte) 37, (byte) 38, (byte) 71, (byte) 69, (byte) 62),
        };

        System.out.println("\nВсего в системе " + (gryffindorStudents.length + hufflepuffStudents.length + ravenclawStudents.length + slytherinStudents.length) + " студентов\n");

//Инициация и применение методов
        PrintService printService = new PrintService();
        printService.print(gryffindorStudents);
        printService.print(hufflepuffStudents);
        printService.print(ravenclawStudents);
        printService.print(slytherinStudents);

        System.out.println();
        System.out.println();

        printService.currentGryffindorStudentPrint(2, gryffindorStudents);

        System.out.println();
        System.out.println();

        printService.currentHufflepuffStudentPrint(0, hufflepuffStudents);

        System.out.println();
        System.out.println();

        printService.currentRavenclawStudentPrint(1, ravenclawStudents);

        System.out.println();
        System.out.println();

        printService.currentSlytherinStudentPrint(0, slytherinStudents);

        System.out.println();
        System.out.println();

        printService.compareGryffindorStudents(0,2, gryffindorStudents);
        printService.compareHufflepuffStudents(2,1, hufflepuffStudents);
        printService.compareRavenclawStudents(2,1, ravenclawStudents);
        printService.compareSlytherinStudents(0,2, slytherinStudents);

        System.out.println();
        System.out.println();

        printService.compareSpellPower(0, 9, hogwartsStudents);
        printService.compareTransgessionDistance(4, 1, hogwartsStudents);

    }
}