public class Enfermero extends Persona {
    private String turno;
    private int aniosExperiencia;

    public Enfermero(String nombre, String apellidos, int edad, String turno, int aniosExperiencia) {
        super(nombre, apellidos, edad);
        this.turno = turno;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void asistirDoctor() {
        System.out.println(nombre + " está asistiendo al doctor.");
    }

    public void aplicarMedicamento() {
        System.out.println(nombre + " está aplicando medicamentos.");
    }

    public void asistirPaciente() {
        System.out.println(nombre + " está asistiendo al paciente.");
    }

    @Override
    public void darOpiniones() {
        System.out.println(nombre + " (Enfermero): Recomiendo mejorar los equipos médicos.");
    }

    public String getTurno() { return turno; }
    public int getAniosExperiencia() { return aniosExperiencia; }
}
