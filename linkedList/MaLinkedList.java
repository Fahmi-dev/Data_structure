package linkedList;

import java.util.LinkedList;

public class MaLinkedList {

    Node head = null;

    public void ajouter(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        if (head == null) {
            head = node;
        } else 
        // On va voyager d'une noeud à une autre. la variable n va prendre la valeur de n.next/ 
            // à chaque tour de boucle . 
        {

            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void ajouterAuDebut(int valeur) {

        Node n = new Node();
        n.value = valeur;

        Node tempNode = head;
        head = n;
        head.next = tempNode;

    }

    //SOLUTION 1
    public void inserer(int indice, int valeur) {

        Node node = new Node();
        node.value = valeur;
        Node n = head;
        if (indice == 0) {
            ajouterAuDebut(valeur);
        } else {
            //On va voyager jusqu'à ce qu'on arrive à l'indice-1 . Pourquoi -1? car dans
            // le cas ou on me pas -1, on va entrer dans la boucle et la variable n va prendre la
            // valeur de n.next et dès qu'on sort, on trouve que l'indice à supprimer correspond exactement
            // à la variable n et non pas à la variable n.next. 
            for (int x = 0; x < indice - 1; x++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
//SOLUTON 2

    public void inserer2(int index, int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        int compteur = 0;
        if (head == null) {
            head = node;
        } else if (index == 0) {
            ajouterAuDebut(value);   
        } else {

            //Solution 2
            Node n = head;

            while (n.next != null) {
                compteur++;
                if (index == compteur) {
                    node.next = n.next;
                    n.next = node;
                    
                    break;
                } else {
                    n = n.next;
                }
            }
        }
    }

    public void supprimerIndice(int indice) {
        Node n = head;

         if (indice == 0) {
           supprimerDebut();

        } else {
            for (int index = 0; index < indice - 1; index++) {
                n = n.next;
            }
            Node tempNode = n.next;
            n.next=tempNode.next;
            // OR//n.next = n.next.next;t
            tempNode=null;// On veut detruire l'objet supprimé.
        }
    }

    public void supprimerDebut() {
        
            head = head.next;
            
        }
    

    public void afficher() {

        Node n = head;

        while (n.next != null) {
            System.out.println(n.value);
            n = n.next;
        }
        System.out.println(n.value);
    }

}
