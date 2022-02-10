package DELinkedList;

public class DELinkListTest {
    
    public static void main(String[] args) {
        DELinkList list = new DELinkList();
        //Veamos si la lista esta vacia
        if(list.isEmpty())
            System.out.println("No hay ningun elemento en la lista");

        //Insertamos dos elementos al principio de la lista
        list.insertFirst(2.99);
        list.insertFirst(4.99);
        //Insertamos un elemento al final
        list.insertLast(1.33);
        //Insertamos otros dos elementos al principio de la lista
        list.insertFirst(6.99);
        list.insertFirst(8.99);
        //Insertamos otro elemento al final
        list.insertLast(0.25);
        //Mostramos la lista
        list.displayList(); 
        
        //Eliminamos los dos primeros elementos de la lista
        list.deleteFirst();
        list.deleteFirst();    

        //Mostramos la lista actualizada
        list.displayList(); 
    } 
}