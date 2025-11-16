package regeces;

import java.util.regex.*;

public class First {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("\\w{1,100}@\\w{1,20}\\.[a-z]{2,10}");
        String password = "w@gml.co";
        Matcher matcher = pattern.matcher(password);

        while(matcher.find()){
            String group = matcher.group();
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(group + " from " + start + " to " + end);
        }
    }

}
