public class Function {
    public static int substring(String a, String b) {
        String temp=a;
        int count = 1;
        for (int i = 0; i < b.length(); i++) {
            if (a.contains(b)) {
               // System.out.println(a);
                return count;
            }
            count++;
            a=a+temp;
        }
        //System.out.println(a);
        return -1;
    }
}
