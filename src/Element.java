
public class Element {

    Integer key;
    Element left = null;
    Element right = null;
    Element parent = null;

    public Element(Integer key) {
        this.key = key;
    }

    public Integer getKey() {
        return key;
    }

    public Element getLeft() {
        return left;
    }

    public Element getRight() {
        return right;
    }

    public Element getParent() {
        return parent;
    }

    public void setLeft(Element left) {
        this.left = left;
    }

    public void setRight(Element right) {
        this.right = right;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }
}
