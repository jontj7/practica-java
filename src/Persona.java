public abstract class Persona {
    private static int contadorId = 1; // Contador para IDs automáticos
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setEdad(int edad) { this.edad = edad; }

    public abstract void darOpiniones();
}
