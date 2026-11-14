package compare;

import org.json.JSONMLParserConfiguration;

public class Comparer {
    public boolean compare(String a, String b){
        return a.equalsIgnoreCase(b);
    }
    public boolean compare(Object a, Object b){
        return a.equals(b);
    }

    public static void main(String[] args){
        Comparer sc = new Comparer();
        String s1 = "hello";
        Object o1 = s1;
        System.out.println(sc.compare(o1, s1)); //as specific as possible without assuming anything
    }
}

