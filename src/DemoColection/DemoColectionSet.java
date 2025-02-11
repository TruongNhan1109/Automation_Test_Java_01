package DemoColection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class DemoColectionSet {
    public static void main(String[] args) {
        Set<String> menu = new HashSet<>();
        menu.add("Hello1");
        menu.add("Hello");
        menu.add("Dashboard");

        System.out.println("Cac phan tu: ");
        System.out.println("\t"+ menu+"\n");

        Iterator<String> itr = menu.iterator();

    }
}
