package com.premiumminds.internship.screenlocking;

import java.util.HashMap;

public class GraphStruct {

    HashMap<Vertex,Vertex[]> adjTable = new HashMap<>();
    private Vertex[] allVertex = {new Vertex(1),new Vertex(2),new Vertex(3),new Vertex(4),new Vertex(5),
                        new Vertex(6),new Vertex(7),new Vertex(8),new Vertex(9)};

    final class Vertex{

        private Boolean isVisited;
        private Integer point;

        public Vertex(Integer startPoint) {
            point = startPoint;
            isVisited = false;
        }

        public void makevisited() {
            isVisited = true;
        } 

        public Boolean checkVisited(){
            return isVisited;
        }

        public void makeUnvisited(){
            isVisited = false;
        }

        public Integer getPoint(){
            return point;
        }

    }

    public void addEdge(Integer point, Integer pointToAdd){
        Vertex pointToAddTo = integerToVertex(point);
        Vertex pointAdd = integerToVertex(pointToAdd);
        Vertex[] adj = adjTable.get(pointToAddTo);
        Vertex[] newAdj = new Vertex[adj.length+1];
        newAdj = adj;
        newAdj[adj.length+1] = pointAdd;
        adjTable.put(pointToAddTo,newAdj);
    }

    public Vertex integerToVertex(Integer point){
        return allVertex[point-1];
    }

    /**
     * Main Graph constructor
     */
    public GraphStruct(){
        Vertex[] oddNumbersAdj = {new Vertex(2),new Vertex(4),new Vertex(5),new Vertex(6),new Vertex(8)};

        Vertex[] twoEightAdj = {new Vertex(1),new Vertex(3),new Vertex(4),new Vertex(5),new Vertex(6),
            new Vertex(7),new Vertex(9)};

        Vertex[] fourSixAdj = {new Vertex(1),new Vertex(2),new Vertex(3),new Vertex(5),new Vertex(7),
            new Vertex(8),new Vertex(9)};

        Vertex[] fiveAdj = {new Vertex(1),new Vertex(2),new Vertex(3),new Vertex(4),new Vertex(6),
            new Vertex(7),new Vertex(8),new Vertex(9)};

        adjTable.put(integerToVertex(1),oddNumbersAdj);
        adjTable.put(integerToVertex(2),twoEightAdj);
        adjTable.put(integerToVertex(3),oddNumbersAdj);
        adjTable.put(integerToVertex(4),fourSixAdj);
        adjTable.put(integerToVertex(5),fiveAdj);
        adjTable.put(integerToVertex(6),fourSixAdj);
        adjTable.put(integerToVertex(7),oddNumbersAdj);
        adjTable.put(integerToVertex(8),twoEightAdj);
        adjTable.put(integerToVertex(9),oddNumbersAdj);
    }
}
