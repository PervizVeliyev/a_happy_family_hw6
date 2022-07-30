public enum Species {
    DOG(false, 4 ,true),
    CAT(false, 4 ,true),
    HAMSTER(false, 4 ,false),
    MONKEY(false, 4, false),
    RABBIT(false, 2, true),
    TURTLE(false, 4, false),
    BIRD(true, 2, true),
    TIGER(false, 4, true),
    SNAKE(false, 0, false);

    boolean canFly;
    int numberOfLegs;
    boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    Species() {
    }

    @Override
    public String toString() {
        return "canFly=" + canFly +
                ", numberOfLegs=" + numberOfLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}