package com.premiumminds.internship.screenlocking;




public class AllPatterns implements Callable<Integer>{

    private Integer[][] pattern = {{1,2,3},{4,5,6},{7,8,9}};
    private Integer size = Arrays.asList(pattern).size();

    GraphStruct graphPattern = new GraphStruct();

    public Integer startingPoint;
    public Integer length;

    public AllPatterns(Integer startPoint, Integer startLength) {
        startingPoint = startPoint;
        length = startLength;
    }
    
    private Integer pointToPatternFirstIndex(Integer point){
        return point >> 2;
    }
    
    private Integer pointToPatternSecondIndex(Integer point){
        Integer index = point%size;
        if(index == 0) return 2; 
        else return index-1;
    }

    private Boolean isMiddleVisited(Integer point){
        GraphStruct.Vertex[] adj = graphPattern.adjTable.get(graphPattern.integerToVertex(point));
        Vertex firstVertex;
        Vertex secondVertex;
        switch(point){
            case 1:
                firstVertex = graphPattern.integerToVertex(point+1);
                secondVertex = graphPattern.integerToVertex(point+size);
                break;
            case 3:
                firstVertex = graphPattern.integerToVertex(point-1);
                secondVertex = graphPattern.integerToVertex(point+size);
            break;
            case 7:
                firstVertex = graphPattern.integerToVertex(point-size);
                secondVertex = graphPattern.integerToVertex(point+1);
            break;
            case 9:
                firstVertex = graphPattern.integerToVertex(point-1);
                secondVertex = graphPattern.integerToVertex(point-size);
            break;
            ArrayUtils.contains(adj,firstVertex);
        }
        return 
    }


    public Integer getOppositePoint(Integer point){
        
    }

    private Integer pointFromPattern(Integer firstIndex, Integer secondIndex){
        try{
          Integer p = pattern[firstIndex][secondIndex];
          return p;
        } catch(Exception e){
          return null;
        }
    }
    
    public Integer getPatterns(){

    }
    
    @Override
    public Integer call() throws Exception {
        return getPatterns();
    }
}
    
