package faculty;

public class Slytherin extends Hogwarts {
    private byte cunning;
    private byte determination;
    private byte ambition;
    private byte resourcefulness;
    private byte lustForPower;

    public Slytherin(String name, String surname, byte spellPower, byte transgessionDistance, byte cunning, byte determination, byte ambition, byte resourcefulness, byte lustForPower) {
        super(name, surname, spellPower, transgessionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public byte getCunning () {
        return cunning;
    }

    public byte getDetermination () {
        return determination;
    }

    public byte getAmbition () {
        return ambition;
    }

    public byte getResourcefulness () {
        return resourcefulness;
    }

    public byte getLustForPower () {
        return lustForPower;
    }
}