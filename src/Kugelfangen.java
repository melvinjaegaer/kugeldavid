import GLOOP.*;
public class Kugelfangen {
    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel kugel[];
    public Spielfeld spielfeld;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 500, 800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

         spielfeld = new Spielfeld(1000, 1000);
        dieBox=new Box();


        kugel = new Kugel [100];
        for (int i=0;i<kugel.length;i++){
            kugel[i]=new Kugel(spielfeld);

        }

        fuehreAus();

    }



    public void fuehreAus() { while (!tastatur.esc()) {

        if (tastatur.unten()&& dieBox.GibZ() > 1000) {
            dieBox.bewegeRunter();}
        if (tastatur.rechts() && dieBox.GibX() > 1000) {
            dieBox.bewegeRechts();}

        if (tastatur.oben() && dieBox.GibZ() < -1000) {
            dieBox.bewegeHoch();}

        if (tastatur.links() && dieBox.GibX() < -1000 ) {
            dieBox.bewegeLinks();}
        for (int i=0;i<kugel.length;i++){
            kugel[i].bewegen(spielfeld);

        if(kugel[i].getroffen()){kugel.}}



        Sys.warte();


    }

}
}

