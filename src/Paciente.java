public class Paciente extends Persona {
    private String historiaClinica;
    private String numeroSeguro;

    public Paciente(String nombre, String apellidos, int edad, String historiaClinica, String numeroSeguro) {
        super(nombre, apellidos, edad);
        this.historiaClinica = historiaClinica;
        this.numeroSeguro = numeroSeguro;
    }

    public void registrarse() {
        System.out.println(nombre + " se ha registrado en el sistema.");
    }

    public void solicitarCita() {
        System.out.println(nombre + " ha solicitado una cita médica.");
    }

    public void recibirTratamiento() {
        System.out.println(nombre + " está recibiendo tratamiento.");
    }

    @Override
    public void darOpiniones() {
        System.out.println(nombre + " (Paciente): Me siento mejor con el tratamiento.");
    }

    // Getters específicos
    public String getHistoriaClinica() { return historiaClinica; }
    public String getNumeroSeguro() { return numeroSeguro; }
}
