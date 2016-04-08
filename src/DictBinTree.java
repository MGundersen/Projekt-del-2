import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictBinTree implements Dict {

    Integer size = 0;
    Element header;
    private Integer counter = 0;
    private ArrayList<Element> listOfOrderedElements = new ArrayList<>();

    public DictBinTree(Element e) {
        header = e;
        size += 1;
    }

    @Override
    public void insert(Element z) {
        size ++;

        Element y = null;
        Element x = header;

        while ( x != null ) {
            y = x;
            if (z.getKey() < x.getKey()){
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }

        z.setParent(y);
        if ( y == null ) {
            header = z; //Tree was empty
        } else if (z.getKey() < y.getKey()) {
            y.setLeft(z);
        } else {
            y.setRight(z);
        }

    }

    @Override
    public ArrayList<Element> orderedTraversal(Element x) {
        //Den skal returne en liste, men lige nu printer den bare.
        if (x != null) {
            orderedTraversal(x.left);
            listOfOrderedElements.add(counter,x);
            counter++;
            orderedTraversal(x.right);
        }
     return listOfOrderedElements;
    }

    @Override
    public Element search(Element x, Integer k) {
        if (k == x.getKey()) {
            System.out.println("Element was found");
            return x;
        }
        if (k < x.getKey()) {
            System.out.println("We search to the left");
            return search(x.getLeft(),k);
        } else{
            System.out.println("We search to the right");
            return search(x.getRight(),k);
        }
    }
}
