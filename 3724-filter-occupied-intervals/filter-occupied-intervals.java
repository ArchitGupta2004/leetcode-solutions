class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> result=new ArrayList<>();
        if(occupiedIntervals==null||occupiedIntervals.length==0){
            return result;
        }
        Arrays.sort(occupiedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        int currentStart=occupiedIntervals[0][0];
        int currentEnd=occupiedIntervals[0][1];
        for(int i=0;i<occupiedIntervals.length;i++){
            int nextStart =occupiedIntervals[i][0];
            int nextEnd= occupiedIntervals[i][1];
            if(nextStart<=currentEnd+1){
                currentEnd=Math.max(currentEnd,nextEnd);
            }else{
                addFiltered(result,currentStart,currentEnd,freeStart,freeEnd);
                currentStart=nextStart;
                currentEnd=nextEnd;
            }
        }
        addFiltered(result,currentStart,currentEnd,freeStart,freeEnd);
        return result;
    }
    private void addFiltered(List<List<Integer>>result,int start,int end,int freeStart,int freeEnd){
        if(end <freeStart ||start> freeEnd){
            addInterval(result,start,end);
            
        }else{
            if(start<freeStart){
                addInterval(result,start,freeStart-1);
            }
            if(end> freeEnd){
                addInterval(result,freeEnd+1,end);
            }
        }
    }
    public void addInterval(List<List<Integer>> result,int start,int end){
        List<Integer>interval=new ArrayList<>();
        interval.add(start);
        interval.add(end);
        result.add(interval);
        
    }
}