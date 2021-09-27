import java.util.*;

class FindDups {

    public static void main(String Args[]) {

        SortedSet<String> sortedSet = new TreeSet<String>(IGNORE_CASE);

        for (String str : Args) {
            sortedSet.add(str);
        }
        System.out.println(sortedSet.size() + " unique words :: " + sortedSet);

        // sortedSet.add("Hello");
        // sortedSet.add("Everyone");
        // sortedSet.add("This");
        // sortedSet.add("is");
        // sortedSet.add("another");
        // sortedSet.add("java");
        // sortedSet.add("class");
    }

    static final Comparator<String> IGNORE_CASE = new Comparator<String>() {

        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

}