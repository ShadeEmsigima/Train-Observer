package Spoorwegovergang;

public class Belletje extends TreinTracker {

    //@Override checkt voor de zekerheid of de func gelijk zijn
    public Belletje(Spoor spoor) {
        this.spoor = spoor;
        this.spoor.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Ding! Ding! Ding!");
    }
}
