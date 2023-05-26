import GLOOP.*;
public class Kugelfangen {
    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel kugel[];
    public Spielfeld feld;

    public Kugelfangen( ) {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 500, 800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

         feld = new Spielfeld(3000, 3000);
         dieBox=new Box();


        kugel = new Kugel [100];
        for (int i=0;i<kugel.length;i++){
            kugel[i]=new Kugel(feld,dieBox);

        }

        fuehreAus();

    }



    public void fuehreAus() { while (!tastatur.esc()) {

        if (tastatur.unten()) {
            dieBox.bewegeRunter();}
        if (tastatur.rechts() ) {
            dieBox.bewegeRechts();}

        if (tastatur.oben()) {
            dieBox.bewegeHoch();}

        if (tastatur.links()  ) {
            dieBox.bewegeLinks();}



        for (int i=0;i<kugel.length;i++){
            kugel[i].bewegen(feld);}

        for(int i = 0; i < kugel.length; i++){
            kugel[i].kugelweg();
        }



        Sys.warte();


    }

}
}

