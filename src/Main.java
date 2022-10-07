public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Milagros");
        persona.setEdad(26);
        persona.setTelefono("12345678");

        System.out.println(persona.getNombre()+" - "+persona.getEdad()+" años - "+persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}