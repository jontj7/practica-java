public class Doctor extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public Doctor(String nombre, String apellidos, int edad, String especialidad, int aniosExperiencia) {
        super(nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void diagnosticar() {
        System.out.println(nombre + " está diagnosticando al paciente.");
    }

    public void prescribirTratamiento() {
        System.out.println(nombre + " está prescribiendo un tratamiento.");
    }

    public void darSeguimiento() {
        System.out.println(nombre + " está dando seguimiento médico.");
    }

    @Override
    public void darOpiniones() {
        System.out.println(nombre + " (Doctor): Necesitamos más personal para emergencias.");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
}
