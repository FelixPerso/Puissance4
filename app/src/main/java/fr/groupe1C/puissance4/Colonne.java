package src.main.java.fr.groupe1C.puissance4;
public class Colonne {
    
    private int[] colonne = new int[6];

    public Colonne(){
        for(int i = 0; i < 6; i++) {
            colonne[i] = 0;
        }
        this.setOnClickListener(new ListenerJeux());
    }

    public int[] getColonne() {
        return this.colonne;
    }

    public int[] setColonne(int[] colonne) {
        this.colonne = colonne;
        return this.colonne;
    }
}
