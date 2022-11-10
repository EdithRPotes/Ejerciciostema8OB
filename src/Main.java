public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(24);
        int edad= persona.getEdad();

        persona.setNombre("Milena");
        String nombre = persona.getNombre();

        persona.setTelefono("2578965");
        String telefono = persona.getTelefono();

        System.out.println("Edad:"+edad + "\n"+"Nombre:"+nombre +"\n"+ "Telefono:"+telefono);
    }
}
/**Para practicar la encapsulación:

 Crear clase Persona.

 Crear variables las privadas edad, nombre y telefono de la clase Persona.

 Crear gets y sets de cada propiedad.

 Crear un objeto persona en el main.

 Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.**/

class Persona{
    private int  edad;
    private String nombre;
    private String telefono;
    // propiedad edad
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    // propiedad nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    // propiedad telefono
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public  String getTelefono(){
        return  this.telefono;
    }
}