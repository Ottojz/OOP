package faculty;

public class Ravenclaw extends Hogwarts {
    private byte intelligence;
    private byte wisdom;
    private byte wittness;
    private byte creation;

    public Ravenclaw (String name, String surname, byte spellPower, byte transgessionDistance, byte intelligence, byte wisdom, byte wittness, byte creation) {
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
}