package projects.wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class UserGuide {
    public static void userGuide(){
        System.out.println("The syntax is : java CountWords filename.extension");
    }
}

class CountWords {
    public static void main(String[] args) throws IOException {
        if(args.length != 1){
            UserGuide.userGuide();
            System.exit(0);
        }

        String fileName = args[0];
        boolean space  = true;
        int r = 0;

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(fileName));
            int numberOfWords = 0;
            do {
                r = br.read();
                if(r != -1){
                    Character c= (char) r;
                    if(Character.isWhitespace(c)){
                        space = true;
                    }
                    if(!Character.isWhitespace(c) && space){
                        numberOfWords++;
                        space = false;
                    }
                }
            } while(r != -1);
            System.out.println("The number of words in your file is : " + numberOfWords);
        } catch(FileNotFoundException e){
            System.out.println("The file " + fileName + " you specified is not found");
            System.exit(0);
        }

        System.out.println("Thank you for using our application.");
    }
}