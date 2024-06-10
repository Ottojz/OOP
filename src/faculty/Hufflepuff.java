package faculty;

public class Hufflepuff extends Hogwarts {
    private byte hardworkness;
    private byte loyalty;
    private byte honesty;

    public Hufflepuff (String name, String surname, byte spellPower, byte transgessionDistance, byte hardworkness, byte loyalty, byte honesty) {
        super (name, surname, spellPower, transgessionDistance);
        this.hardworkness = hardworkness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public byte getHardworkness () {
        return hardworkness;
    }

    public byte getLoyalty () {
        return loyalty;
    }

    public byte getHonesty () {
        return honesty;
    }
}