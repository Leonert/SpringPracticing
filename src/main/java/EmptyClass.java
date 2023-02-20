import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmptyClass {
    private List<Integer> list = new ArrayList<>();
    EmptyClass() {
        list.add(1);
    }

    public List<Integer> getList() {
        return list;
    }

    public int getInt() {
        return list.get(0);
    }
}
