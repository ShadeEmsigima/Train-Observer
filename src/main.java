import Spoorwegovergang.Belletje;
import Spoorwegovergang.Lampje;
import Spoorwegovergang.Slagboompje;
import Spoorwegovergang.Spoor;

public class main {
    public static void main(String[] args) {
        Spoor spoor = new Spoor();

        new Lampje(spoor);
        new Belletje(spoor);
        new Slagboompje(spoor);
        spoor.setState(5);
    }
}
