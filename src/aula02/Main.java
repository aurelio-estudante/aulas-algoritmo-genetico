package src.aula02;
import java.util.ArrayList;

public class Main{



    public static void main(String[] args) {
        ArrayList<Individuo> individuos = new ArrayList<>();
        individuos = geraIndividuo();

        imprimeIndividuos(individuos);
    }

    private static ArrayList<Individuo> geraIndividuo(){
        ArrayList<Individuo> listaIndividuos = new ArrayList<>();
        for(int i=0;i<10;i++){
            Individuo individuo = new Individuo();
            listaIndividuos.add(individuo);
        }
        return listaIndividuos;
    }

    private static void imprimeIndividuos(ArrayList<Individuo> individuos){
        for(int i=0;i<individuos.size();i++){
            System.out.println(individuos.get(i).getGene());
        }
    }
}