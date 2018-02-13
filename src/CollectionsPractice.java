import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsPractice {
    public static void main(String[] args){
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list;

        for (String x : things){
            list1.add(x);
        }

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        for (String y : moreThings){
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }

        editList(list1, list2);
        System.out.println();

        for (int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
    }

    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while (it.hasNext()){
            if (l2.contains(it.next())){
                it.remove();
            }
        }
    }
}
