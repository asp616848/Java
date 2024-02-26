import java.util.ArrayList;

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " is hopping.");
    }

    public int getGerbilNumber() {
        return gerbilNumber;
    }
}

public class a {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();

        // Adding Gerbil objects to the ArrayList
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));

        // Using get() method to move through the List and call hop() for each Gerbil
        for (int i = 0; i < gerbils.size(); i++) {
            Gerbil currentGerbil = gerbils.get(i);
            System.out.print("Moving through gerbil number: " + currentGerbil.getGerbilNumber() + " - ");
            currentGerbil.hop();
        }
    }
}
