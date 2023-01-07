import java.util.Stack;

public class MyStackImpl implements MyStack {
    Stack<Integer> num=new Stack<>();

    @Override
    public void add(Object el) {
            num.add((Integer) el);
    }

    @Override
    public void delete() {
        num.pop();
    }

    @Override
    public void isEmpty(Object el) {
        System.out.println(num.search(el));


    }
    public void print(){
        System.out.println(num);
    }
}
