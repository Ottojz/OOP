package faculty;

public class Hogwarts {

    private  String name;
    private  String surname;
    private byte spellPower;
    private byte transgessionDistance;

    public Hogwarts (String name, String surname, byte spellPower, byte transgessionDistance) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
        this.transgessionDistance = transgessionDistance;
    }

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public byte getSpellPower () {
        return spellPower;
    }

    public byte getTransgessionDistance () {
        return transgessionDistance;
    }
}