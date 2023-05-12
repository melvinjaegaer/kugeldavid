import GLOOP.*;
public class Box{
    private GLQuader quader; 
    private Spielfeld feld;
    private double vX,vZ;
    private double breite, tiefe;

    public Box() {quader=new GLQuader(0,40,0,100,100,100);
    }
    public void bewegeLinks(){
        quader.verschiebe(-1,0,0) ;}


    public void bewegeRechts(){quader.verschiebe(1,0,0) ;}
    public void bewegeHoch(){
        quader.verschiebe(0,0,-1) ;}
    public void bewegeRunter(){
        quader.verschiebe(0,0,1) ;}




    public double GibX () {return quader.gibX();

    }
    public double GibY () {return quader.gibY();}
    public double GibZ () {return quader.gibZ();}

}
