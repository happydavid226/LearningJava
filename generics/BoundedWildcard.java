package generics;

class TestClass {}

class TwoD {
    int x, y;
    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;
    ThreeD(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int t;
    FourD(int x, int y, int z, int t){
        super(x, y, z);
        this.t = t;
    }
}

class Coords <T extends TwoD> {
    T[] coords;
    Coords(T[] objectsOfCoords){
        coords = objectsOfCoords;
    }
}

public class BoundedWildcard {
    public static void showXY(Coords<?> c){
        for(int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }

    public static void showXYZ(Coords<? extends ThreeD> c){
        for(int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }

    public static void showXYZT(Coords<? extends FourD> c){
        for(int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
    }

    public static void main(String[] args){
        int i1 = 10;
        TwoD[] d = new TwoD[10];
        ThreeD[] d1 = new ThreeD[10];
        FourD[] d2 = new FourD[10];

        for(int i = 0; i < 10; i++){
            d[i] = new TwoD(i, i+1);
        }
        for(int i = 0; i < 10; i++){
            d1[i] = new ThreeD(i, i+1, i+2);
        }
        for(int i = 0; i < 10; i++){
            d2[i] = new FourD(i, i+1, i+2, i+3);
        }

        Coords<TwoD> c = new Coords<>(d);
        Coords<ThreeD> c1 = new Coords<>(d1);
        Coords<FourD> c2 = new Coords<>(d2);
        showXY(c);
        showXY(c1);
        showXY(c2);

        showXYZ(c1);
        showXYZ(c2);
        showXYZT(c2);
    }
}
