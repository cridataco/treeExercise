package model;

public class Node {

   private int value;
   private Node rightNode;
   private Node leftNode;

    public Node(){
        rightNode = null;
        leftNode = null;
    }

    public Node(int value){
        rightNode = null;
        leftNode = null;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
}
