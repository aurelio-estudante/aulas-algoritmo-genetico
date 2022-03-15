package src.aula02;
import java.util.ArrayList;
import java.util.Random;

public class Individuo {
    ArrayList<Integer> gene = new ArrayList<Integer>();
    public Individuo(){
        for(int i=0;i<10;i++){
            Random rand = new Random();
            gene.add(rand.nextInt(10));
        }
    }

    public ArrayList<Integer> getGene(){
        return this.gene;
    }
}
