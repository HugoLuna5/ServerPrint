/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverprint;

import java.util.PriorityQueue;
import java.util.Queue;
import model.ListImpre;

/**
 *
 * @author HugoLuna
 */
public class ServerPrint {

    /**
     * @param args the command line arguments
     */
    /**
     public static void main(String[] args) {
        // TODO code application logic here
          Queue<ListImpre> cola = new PriorityQueue<ListImpre>();

        cola.add(new ListImpre("Daniel", 1, "ruta archivo"));
        cola.add(new ListImpre("Katherine", 3, "ruta archivo"));
        cola.add(new ListImpre("Julio", 2, "ruta archivo"));
        cola.add(new ListImpre("Maria", 1, "ruta archivo"));

        while (!cola.isEmpty()) {
            ListImpre a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getPrioridad());
        }
    }
     */
    
}
