package aStarAlgorithm;

import java.util.List;

public class AStarTestClass {

    public static void main(String[] args) {
        //initialise the testing Map
    	Node startNode = new Node(2, 1);
        Node endNode = new Node(2, 5);
        int rows = 6;
        int cols = 7;
        
        AStar aStar = new AStar(rows, cols, startNode, endNode);
       
        //define and set walls
        int[][] blocksArray = new int[][]{{1, 3}, {2, 3}, {3, 3}};
        aStar.setBlocks(blocksArray);
        
        //find end Node
        List<Node> path = aStar.findPath();
        for (Node node : path) {
            System.out.println(node);
        }
}
}
