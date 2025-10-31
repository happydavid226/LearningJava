import java.util.Scanner;
class Box {
    private int l, w, h;
    public Box(int l, int w, int h){
        this.l = l; this.w = w; this.h = h;
    }
    public void setL(int l){
        this.l = l;
    }
    public void setW(int w){
        this.w = w;
    }
    public void setH(int h){
        this.h = h;
    }
    public int getL(){
        return l;
    }
    public int getW(){
        return w;
    }
    public int getH(){
        return h;
    }
}

class BoxWeight extends Box {
    private int boxVolume;
    public BoxWeight(int l, int w, int h){
        super(l, w, h);
        this.boxVolume = getL() * getW() * getH();
    }
    public String toString(){
        return ("length : " + getL() + "\nwidth : " + getW() + "\nheight : " + getW() + "\nvolume : " + boxVolume);
    }
}

public class Private{
    public static void main(String[] args){
        int l, w, h;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt(); w = sc.nextInt(); h = sc.nextInt();
        BoxWeight boxWeight = new BoxWeight(l, w, h);
        System.out.println(boxWeight.toString());
    }
}