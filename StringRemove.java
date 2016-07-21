# StringRemove
public class StringRemove {

    public static void main(String[] args) {
        String s = "malayalam";
                
        StringBuffer buffer = new StringBuffer(s);
        

        for (int i = 0; i <  buffer.length(); i++) {
            char ch = buffer.charAt(i);
            for (int j =i+1; j <  buffer.length(); j++) {
                if (ch == buffer.charAt(j)) {
                    buffer.deleteCharAt(j);
                }
            }
            System.out.print(ch);
        }

    }
}
