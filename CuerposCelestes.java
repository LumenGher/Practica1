package ito.poo;

public class CuerposCelestes {
    private int longitud;
    private int latitud;
    private String meses;
    private int añosLuz;
    private String composicion;
    private String nombre;

    public CuerposCelestes (String nombre,int longitud,int latitud,String meses,int añosLuz,String composicion) {
       this.nombre=nombre;
        this.longitud=longitud;
        this.latitud=latitud;
        this.meses=meses;
        this.añosLuz=añosLuz;
        this.composicion=composicion;
    }

    public int getLatitud() {
        return latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getMeses() {
        return meses;
    }

    public String getComposicion() {
        return composicion;
    }

    public int getAñosLuz() {
        return añosLuz;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString () {
        return "Cuerpo Celeste:{"+nombre+","+latitud+","+longitud+","+meses+","+añosLuz+","+composicion+"}";
}
}
