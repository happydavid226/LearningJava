package iostreams;

import java.io.*;

class MyInputStream extends FileInputStream {
    MyInputStream(String fileName) throws IOException {
        super(fileName);
    }
    @Override
    public void close() throws IOException {
        System.out.println(" input file is closed don't worry");
        super.close();
    }
}
class MyOutputStream extends FileOutputStream {
    MyOutputStream(String fileName) throws IOException {
        super(fileName);
    }
    @Override
    public void close() throws IOException {
        System.out.println("output file is closed don't worry");
        super.close();
    }
}

public class CopyFile {
    public static void main(String[] args){

        if(args.length != 2){
            System.out.println("The syntax is \" java CopyFile sourceFileName destinationFileName \"");
            return;
        }

        try (FileInputStream in = new MyInputStream(args[0]); FileOutputStream out = new MyOutputStream(args[1])){
            int i;
            do {
                i = in.read();
                if(i != -1) out.write(i);
            } while(i != -1);
        } catch(FileNotFoundException e){
            System.out.println("File is not found!!");
        } catch(IOException e){
            System.out.println("Another Exception happened which is : " + e.getMessage());
        } 
    }
}