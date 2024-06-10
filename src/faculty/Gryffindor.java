package faculty;

public class Gryffindor extends Hogwarts{
    private byte generosity;
    private byte honor;
    private byte bravery;

    public Gryffindor (String name, String surname, byte spellPower, byte transgessionDistance, byte generosity, byte honor, byte bravery) {
        super (name, surname, spellPower, transgessionDistance);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public byte getGenerosity () {
        return generosity;
    }

    public byte getHonor () {
        return honor;
    }

    public byte getBravery () {
        return bravery;
    }
}