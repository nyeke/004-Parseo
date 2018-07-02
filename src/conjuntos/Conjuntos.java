package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Conjuntos {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();

        lista.add("gustavo");
        lista.add("gustavo");
        lista.add("Pepe");

        for (String data: lista){
            System.out.println(data);
        }

        System.out.println("***********");

        Iterator<String> iterator = lista.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
