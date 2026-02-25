package ito.poo;

public class mazcota {
        private String nombre;
        private int edad;
        private String especie;
        private String raza;
        public Mazcota(String nombre, int edad, String especie, String raza){
            this.nombre=nombre;
            this.edad=edad;
            this.especie=especie;
            this.raza=raza;

        }
        public void cumpleAños(){
            this.edad++;
        }
        public String getNombre(){
            return nombre;
        }
        public int getEdad(){
            return edad;
        }
        public String getEspecie(){
            return especie;
        }
        public String getRaza(){
            return raza;
        }
        @Override
        public String toString(){
            return "Mascota:{"+nombre+","+edad+","+especie+","+raza+"}";
        }
    }

