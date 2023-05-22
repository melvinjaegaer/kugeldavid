import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private double feld;
     float feldmaß;
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    public double bewegeX,bewegeZ;
     public Spielfeld spielfeld,wand1,wand2,wand3,wand4;
    public Kugel(Spielfeld spielfeld) {
        kugel = new GLKugel(-500 + Math.random() * 1000, 25, -500 + Math.random() * 1000, 10);
        bewegeX = Math.random() *2-1;
        bewegeZ=Math.random()*2-1;

    }
    public void bewegen(Spielfeld spielfeld) {


        if(kugel.gibZ()>= spielfeld.GibZ1()-5){
        bewegeZ= bewegeZ * -1;
            bewegeX= bewegeX * -1;

        }


        if(kugel.gibZ()<= spielfeld.GibZ2()){
            bewegeZ= bewegeZ * -1;
            bewegeX= bewegeX * -1;

        }

        if(kugel.gibX()>= spielfeld.GibX3()){
            bewegeZ= bewegeZ * -1;
            bewegeX= bewegeX * -1;
        }

        if(kugel.gibX()<= spielfeld.GibX4()){
            bewegeZ= bewegeZ * -1; bewegeX= bewegeX * -1;
        }




        kugel.verschiebe(bewegeX, 0, bewegeZ);


    }

    public boolean getroffen(){
        double distance = Math.sqrt(Math.pow( kugel.gibX()- dieBox.GibX(), 2 )  + Math.pow( kugel.gibZ()- dieBox.GibZ(), 2 ));

        if (distance < 200) return true;
        else return false;
    }





    public double GibX () {return kugel.gibX();

    }
    public double GibY () {return kugel.gibY();}
    public double GibZ () {return kugel.gibZ();}

}


