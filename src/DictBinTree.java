/*
        MADE BY MGUND15, D3 AND DANJO14, D3
*/
public class DictBinTree implements Dict {

    Integer size = 0;
    Element header;
    private Integer counter = 0;
    public int[] anArray;

    public DictBinTree() {

    }

    @Override
    public void insert(Integer k) {
        Element z = new Element(k);
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
    public int[] orderedTraversal() {
     anArray = new int[size];
     orderedTraversalInner(header);
     return anArray;
    }

    private void orderedTraversalInner(Element x) {
        if (x != null) {
            orderedTraversalInner(x.left);
            anArray[counter] = x.getKey();
            counter++;
            orderedTraversalInner(x.right);
        }
    }

    @Override
    public Boolean search(Integer k) {
        return searchInner(header,k);
    }

    private Boolean searchInner(Element x, Integer k) {
        if (header == null) {
            return false;
        }
        if (k == x.getKey()) {
            return true;
        }
        if (k < x.getKey()) {
            if ( x.getLeft() == null) {
                return false;
            } else return searchInner(x.getLeft(),k);
        } else{
            if ( x.getRight() == null) {
                return false;
            } else return searchInner(x.getRight(),k);
        }
    }
}
