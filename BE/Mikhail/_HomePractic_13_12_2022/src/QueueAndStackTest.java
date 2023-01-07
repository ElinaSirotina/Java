public class QueueAndStackTest {
    public static void main(String[] args) {
        MyStackImpl st=new MyStackImpl();
        st.add(5);
        st.add(7);
        st.add(9);
        st.print();
        st.delete();
        st.print();
        st.isEmpty(20);
        MyQueueImpl c=new MyQueueImpl();
        c.add("Elina");
        c.add("Viktor");
        c.print();
        c.delete("Viktor");
        c.print();
        c.isEmpty("Maxim");



    }

}

