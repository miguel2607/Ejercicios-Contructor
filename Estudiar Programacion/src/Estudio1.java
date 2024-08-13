public class Estudio1 {

    public String codigoPapas = "KJDNF12032RFN";
    public String Avichuela = "KDSNVFBJK3903854";
    public String codigoAncheta = "KNEFVDBVHBWSV829";


    public String getCodigoPapas() {
        return codigoPapas;
    }

    public void setCodigoPapas(String codigoPapas) {
        this.codigoPapas = codigoPapas;
    }


    public String getAvichuela (){
        return Avichuela;
    }

    public void setAvichuela (String avichuela){
        this.Avichuela = avichuela;
    }

    public String getCodigoAncheta (){
        return codigoAncheta;
    }
    public void setCodigoAncheta(String ancheta){
        this.codigoAncheta = ancheta;
    }




    private float precio1 = 11.000f;
    private long precio2 = 2_000_000;

 public float getprecio1(){
     return precio1;
 }

 public void setPrecio1 (float Precio1){
     this.precio1 = Precio1;
 }

 public long getprecio2(){
     return precio2;
 }
public void setprecio2(long precio2){
    this.precio2 = precio2;
}

    @Override
    public String toString() {
        return "Estudio1{" +
                "codigoPapas='" + codigoPapas + '\'' +
                ", Avichuela='" + Avichuela + '\'' +
                ", codigoAncheta='" + codigoAncheta + '\'' +
                ", precio1=" + precio1 +
                ", precio2=" + precio2 +
                '}';
    }
}


