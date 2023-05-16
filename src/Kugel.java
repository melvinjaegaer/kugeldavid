import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private double feld;
     float feldmaﬂ;
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    public double bewegeX,bewegeZ;
     public Spielfeld spielfeld,wand1,wand2,wand3,wand4;
    public Kugel(Spielfeld spielfeld) {
        kugel = new GLKugel(-500 + Math.random() * 1000, 20, -500 + Math.random() * 1000, 10);


    }
    public void bewegen(Spielfeld spielfeld) {
        bewegeX = Math.random() * 1;
        bewegeZ=Math.random()*1;
        if(kugel.gibZ()== wand1.GibZ1()){
        bewegeZ= bewegeZ * -1;
        }
        if(kugel.gibX()== wand1.GibX1()){
            bewegeX= bewegeX * -1;
        }
        if(kugel.gibZ()== wand2.GibZ2()){
            bewegeZ= bewegeZ * -1;
        }
        if(kugel.gibX()== wand2.GibX2()){
            bewegeX= bewegeX * -1;
        }
        if(kugel.gibZ()== wand3.GibZ3()){
            bewegeZ= bewegeZ * -1;
        }
        if(kugel.gibX()== wand3.GibX3()){
            bewegeX= bewegeX * -1;
        }
        if(kugel.gibZ()== wand4.GibZ4()){
            bewegeZ= bewegeZ * -1;
        }
        if(kugel.gibX()== wand4.GibX4()){
            bewegeX= bewegeX * -1;
        }


         kugel.verschiebe(bewegeX, 0, bewegeZ);

    }







    public double GibX () {return kugel.gibX();

    }
    public double GibY () {return kugel.gibY();}
    public double GibZ () {return kugel.gibZ();}

}


