
import java.util.*;

class ListTrim {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Apple", "Person", "Books", "Happy");
        trimStringList(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }

    static void trimStringList(List<String> stringList) {
        for (ListIterator<String> lsItr = stringList.listIterator(); lsItr.hasNext();) {
            lsItr.set(lsItr.next().trim());
        }
    }

}