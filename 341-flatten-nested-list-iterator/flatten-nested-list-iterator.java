public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> st;
    public NestedIterator(List<NestedInteger> nestedList) {
        st = new Stack<>();
        for(int i = nestedList.size() - 1; i > -1; i--){
            st.add(nestedList.get(i));
        }
    }
    @Override
    public Integer next() {
        return st.pop().getInteger();
    }
    @Override
    public boolean hasNext() {
        while(!st.isEmpty()){
            if(st.peek().isInteger()) return true;
            List<NestedInteger> list = st.pop().getList();
            for(int i = list.size() - 1; i > -1; i--){
                st.add(list.get(i));
            }
        }
        return false;
    }
}

