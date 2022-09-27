package Spoorwegovergang;

public class Slagboompje extends TreinTracker {

    //@Override checkt voor de zekerheid of de func gelijk zijn
    public Slagboompje(Spoor spoor) {
        this.spoor = spoor;
        this.spoor.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Slagboom zakt");
    }
}
