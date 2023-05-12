import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;
    
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    public double bewegeX,bewegeZ;

    public Kugel(){kugel=new GLKugel(-500+Math.random()*1000,20,-500+Math.random()*1000,10);
    bewegeX= kugel.verschiebe(Math.random()*1,0,0);;
    }
    public void bewege(){

        kugel.verschiebe(0,0,Math.random()*1);



        }




    public double GibX () {return kugel.gibX();

    }
    public double GibY () {return kugel.gibY();}
    public double GibZ () {return kugel.gibZ();}

}


