package model;

import java.util.TreeMap;
public class TreeManger {

    private Node root;

    public TreeManger(){
        root = null;
    }

    public void addNode(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        addSearchNode(root, value);
    }

  /*  private void addSeachNode(Node currentNode, int id){
        if(id < currentNode.getValue()){
            if(currentNode.getLeftNode() == null){
                currentNode.setLeftNode(new Node(id));
                return;
            } else {
                addSeachNode(currentNode, id);
                return;
            }
        } else if (currentNode.getRightNode() == null){
            currentNode.setRightNode(new Node(id));
        } else {
            addSeachNode(currentNode, id);
            return;
        }
    }*/

    private void addSearchNode(Node currentNode, int id) {
        if (id < currentNode.getValue()) {
            if (currentNode.getLeftNode() == null) {
                currentNode.setLeftNode(new Node(id));
            } else {
                addSearchNode(currentNode.getLeftNode(), id);
            }
        } else if (id > currentNode.getValue()) {
            if (currentNode.getRightNode() == null) {
                currentNode.setRightNode(new Node(id));
            } else {
                addSearchNode(currentNode.getRightNode(), id);
            }
        }
    }
}
