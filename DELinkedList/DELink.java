package DELinkedList;

public class DELink {
    public double dData;
    public DELink next; 

    public DELink(double dd) {
        dData = dd;
        this.next = null;
    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }
}