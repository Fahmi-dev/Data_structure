/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.LinkedList;
import linkedList.*;

/**    
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MaLinkedList linkedList = new MaLinkedList();
        linkedList.ajouter(34);
        linkedList.ajouter(4);
        linkedList.ajouterAuDebut(2);
        linkedList.ajouterAuDebut(3);
        linkedList.afficher();

        System.out.println();
        linkedList.inserer2(1, 123);
        linkedList.afficher();
        
        System.out.println();
        linkedList.supprimerIndice(2);
        linkedList.afficher();
    }
}
