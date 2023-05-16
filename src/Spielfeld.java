import GLOOP.*;
public class Spielfeld{
    private GLQuader untergrund,wand1,wand2,wand3,wand4;
    private double breite, tiefe;

    public Spielfeld(double pBreite, double pTiefe){
        breite = pBreite;
        tiefe = pTiefe;
        untergrund = new GLQuader(0,0,0, breite,20,tiefe);
        untergrund.setzeTextur("src/img/Marmor.jpg");
       wand1= new GLQuader(0,20,tiefe/2,10,100,breite);
       wand1.drehe(0,90,0);
        wand2= new GLQuader(0,20,-tiefe/2,10,100,breite);
        wand2.drehe(0,90,0);
        wand3= new GLQuader(tiefe/2,20,0,10,100,breite);
        wand4= new GLQuader(-tiefe/2,20,0,10,100,breite);
        wand1.setzeTextur("src/img/Marmor.jpg");
        wand2.setzeTextur("src/img/Marmor.jpg");
        wand3.setzeTextur("src/img/Marmor.jpg");
        wand4.setzeTextur("src/img/Marmor.jpg");
    }



    public double GibX1 () {return wand1.gibX();

    }

    public double GibZ1 () {return wand1.gibZ();}


    public double GibX2 () {return wand2.gibX();

    }

    public double GibZ2 () {return wand2.gibZ();}


public double GibX3 () {return wand3.gibX();

        }

public double GibZ3 () {return wand3.gibZ();}


        public double GibX4 () {return wand4.gibX();


        }

public double GibZ4 () {return wand4.gibZ();}}




