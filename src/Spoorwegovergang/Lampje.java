package Spoorwegovergang;

public class Lampje extends TreinTracker {

    //@Override checkt voor de zekerheid of de func gelijk zijn
    public Lampje(Spoor spoor) {
        this.spoor = spoor;
        this.spoor.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Lampje flikkert aan en uit.");
    }
}
