import faculty.*;

public class Main {
    public static void main(String[] args) {

//Cтуденты Гриффиндора
        GryffindorStudent harryPotter = new GryffindorStudent ("Гарри", "Поттер", (byte) 95, (byte) 30, (byte) 73, (byte) 78, (byte) 82);
        GryffindorStudent hermioneGranger = new GryffindorStudent ("Гермиона", "Грейнджер", (byte) 55, (byte) 90, (byte) 80, (byte) 33, (byte) 60);
        GryffindorStudent ronWeasley = new GryffindorStudent ("Рон", "Уизли", (byte) 45, (byte) 45, (byte) 95, (byte) 68, (byte) 95);

//Студенты Пуффендуя
        HufflepuffStudent zachariasSmith = new HufflepuffStudent ("Захария", "Смит", (byte) 13, (byte) 53, (byte) 69, (byte) 78, (byte) 72);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent ("Седрик", "Диггори", (byte) 81, (byte) 83, (byte) 52, (byte) 92, (byte) 81);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent ("Джастин", "Финч-Флетчли", (byte) 47, (byte) 22, (byte) 73, (byte) 74, (byte) 63);

//Студенты Когтеврана
        RavenclawStudent choChang = new RavenclawStudent ("Чжоу", "Чанг", (byte) 65, (byte) 44, (byte) 12, (byte) 18, (byte) 43, (byte) 15);
        RavenclawStudent padmaPatil = new RavenclawStudent ("Падма", "Патил", (byte) 73, (byte) 65, (byte) 96, (byte) 23, (byte) 46, (byte) 19);
        RavenclawStudent marcusBelby = new RavenclawStudent ("Маркус", "Белби", (byte) 12, (byte) 13, (byte) 18, (byte) 64, (byte) 55, (byte) 73);

//Студенты Слизерина
        SlytherinStudent dracoMalfoy = new SlytherinStudent ("Драко", "Малфой", (byte) 75, (byte) 52, (byte) 73, (byte) 13, (byte) 90, (byte) 42, (byte) 59);
        SlytherinStudent grahamMontague = new SlytherinStudent ("Грэхэм", "Монтегю", (byte) 8, (byte) 32, (byte) 23, (byte) 47, (byte) 70, (byte) 90, (byte) 22);
        SlytherinStudent gregoryGoyle = new SlytherinStudent ("Грегори", "Гойл", (byte) 22, (byte) 15, (byte) 37, (byte) 38, (byte) 71, (byte) 69, (byte) 62);


//Применение методов, которые выводят описание конкретного студента
        ronWeasley.allStatsPrint();
        zachariasSmith.allStatsPrint();
        marcusBelby.allStatsPrint();
        dracoMalfoy.allStatsPrint();

        System.out.println();

//Применение методов сравнения двух студентов одного факультета
        ronWeasley.compareGryffindorStudents(hermioneGranger);
        cedricDiggory.compareHufflepuffStudents(justinFinchFletchley);
        choChang.compareRavenclawStudents(padmaPatil);
        gregoryGoyle.compareSlytherinStudents(grahamMontague);

        System.out.println();

        harryPotter.compareHogwartsStudents(dracoMalfoy);
    }
}