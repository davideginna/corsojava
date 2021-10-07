package figura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainFigura {
    public static void main(String[] args) {
        /*Quadrato q = new Quadrato(2);
        q.stampaArea();
        q.stampaPerimetro();
        q.redux(50);
        q.stampaArea();
        q.stampaPerimetro();
        System.out.println("-----------------------------------------");
        Triangolo t = new Triangolo(3);
        t.stampaArea();
        t.stampaPerimetro();
        t.redux(50);
        t.stampaArea();
        t.stampaPerimetro();
        t.aumentux(2);
        t.stampaArea();
        t.stampaPerimetro();*/

        List <Triangolo>  list = new ArrayList();
        System.out.println(list.size());
        list.add(new Triangolo(1));
        list.add(new Triangolo(2));
        list.add(new Triangolo(3));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(0,new Triangolo(0));

        System.out.println("..........................");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("..........................");

        list.forEach(triangolo -> {
            System.out.println(triangolo);
        });


    }
}
