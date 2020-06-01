package JavaZaawansowana;

public abstract class AbstractRace {

    public static AbstractRace getRace(Vehicle attendee) {

        if(attendee instanceof Car) {
            return new CarRace();
        }
        return null;

    }
    public abstract Integer getLapsNumber();

}
© 2020 GitHub, Inc.
