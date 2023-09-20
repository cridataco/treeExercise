package presenter;

import model.TreeManger;

public class Presenter {

    private TreeManger treeManger;

    public Presenter(){
        treeManger = new TreeManger();
    }

    public void run (){
        treeManger.addNode(50);
        treeManger.addNode(25);
        treeManger.addNode(12);
        treeManger.addNode(19);
    }
}
