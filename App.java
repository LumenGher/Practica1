package ito.poo;

public class App {
    static CuerposCelestes cuerposCelestes;
    static void run () {
        cuerposCelestes=new CuerposCelestes("saturno", 160, 140,"enero,febrero,marzo",
                1, "gaseoso");
            System.out.println(cuerposCelestes);
    }
    public static void main (String[] args) {run();}
}
