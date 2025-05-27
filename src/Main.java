import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para registrar acciones
        boolean pReg = false, pCita = false, pTrat = false, pOpin = false;
        boolean eAsistD = false, eMedic = false, eAsistP = false, eOpin = false;
        boolean dDiag = false, dTrat = false, dSeg = false, dOpin = false;

        // PACIENTE
        System.out.println("Ingrese los datos del Paciente:");
        System.out.print("Nombre: ");
        String nomP = sc.nextLine();
        System.out.print("Apellidos: ");
        String apeP = sc.nextLine();
        System.out.print("Edad: ");
        int edadP = sc.nextInt(); sc.nextLine();
        System.out.print("Historia clínica: ");
        String hc = sc.nextLine();
        System.out.print("Número de seguro: ");
        String ns = sc.nextLine();
        Paciente paciente = new Paciente(nomP, apeP, edadP, hc, ns);

        // Acciones Paciente
        System.out.println("\n--- Acciones del Paciente ---");
        System.out.print("¿Se registrará? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { pReg = true; paciente.registrarse(); }

        System.out.print("¿Solicitará cita? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { pCita = true; paciente.solicitarCita(); }

        System.out.print("¿Recibirá tratamiento? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { pTrat = true; paciente.recibirTratamiento(); }

        System.out.print("¿Dará opiniones? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { pOpin = true; paciente.darOpiniones(); }

        sc.nextLine(); // limpiar buffer

        // ENFERMERO
        System.out.println("\nIngrese los datos del Enfermero:");
        System.out.print("Nombre: ");
        String nomE = sc.nextLine();
        System.out.print("Apellidos: ");
        String apeE = sc.nextLine();
        System.out.print("Edad: ");
        int edadE = sc.nextInt(); sc.nextLine();
        System.out.print("Turno: ");
        String turno = sc.nextLine();
        System.out.print("Años de experiencia: ");
        int expE = sc.nextInt(); sc.nextLine();
        Enfermero enfermero = new Enfermero(nomE, apeE, edadE, turno, expE);

        // Acciones Enfermero
        System.out.println("\n--- Acciones del Enfermero ---");
        System.out.print("¿Asistirá al doctor? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { eAsistD = true; enfermero.asistirDoctor(); }

        System.out.print("¿Aplicará medicamento? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { eMedic = true; enfermero.aplicarMedicamento(); }

        System.out.print("¿Asistirá al paciente? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { eAsistP = true; enfermero.asistirPaciente(); }

        System.out.print("¿Dará opiniones? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { eOpin = true; enfermero.darOpiniones(); }

        sc.nextLine(); // limpiar buffer

        // DOCTOR
        System.out.println("\nIngrese los datos del Doctor:");
        System.out.print("Nombre: ");
        String nomD = sc.nextLine();
        System.out.print("Apellidos: ");
        String apeD = sc.nextLine();
        System.out.print("Edad: ");
        int edadD = sc.nextInt(); sc.nextLine();
        System.out.print("Especialidad: ");
        String esp = sc.nextLine();
        System.out.print("Años de experiencia: ");
        int expD = sc.nextInt(); sc.nextLine();
        Doctor doctor = new Doctor(nomD, apeD, edadD, esp, expD);

        // Acciones Doctor
        System.out.println("\n--- Acciones del Doctor ---");
        System.out.print("¿Diagnosticará? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { dDiag = true; doctor.diagnosticar(); }

        System.out.print("¿Prescribirá tratamiento? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { dTrat = true; doctor.prescribirTratamiento(); }

        System.out.print("¿Dará seguimiento? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { dSeg = true; doctor.darSeguimiento(); }

        System.out.print("¿Dará opiniones? (s/n): ");
        if (sc.next().equalsIgnoreCase("s")) { dOpin = true; doctor.darOpiniones(); }

        // --- RESUMEN FINAL ---
        System.out.println("\n--- RESUMEN FINAL DE DATOS Y ACCIONES ---");

        System.out.println("\nPACIENTE:");
        System.out.println("Nombre: " + paciente.getNombre() + " " + paciente.getApellidos());
        System.out.println("Edad: " + paciente.getEdad());
        System.out.println("Historia clínica: " + paciente.getHistoriaClinica());
        System.out.println("Número de seguro: " + paciente.getNumeroSeguro());
        System.out.println("Acciones:");
        if (pReg) System.out.println("- Se registró");
        if (pCita) System.out.println("- Solicitó cita");
        if (pTrat) System.out.println("- Recibió tratamiento");
        if (pOpin) System.out.println("- Dio opiniones");
        if (!pReg && !pCita && !pTrat && !pOpin) System.out.println("- No realizó acciones");

        System.out.println("\nENFERMERO:");
        System.out.println("Nombre: " + enfermero.getNombre() + " " + enfermero.getApellidos());
        System.out.println("Edad: " + enfermero.getEdad());
        System.out.println("Turno: " + enfermero.getTurno());
        System.out.println("Experiencia: " + enfermero.getAniosExperiencia() + " años");
        System.out.println("Acciones:");
        if (eAsistD) System.out.println("- Asistió al doctor");
        if (eMedic) System.out.println("- Aplicó medicamento");
        if (eAsistP) System.out.println("- Asistió al paciente");
        if (eOpin) System.out.println("- Dio opiniones");
        if (!eAsistD && !eMedic && !eAsistP && !eOpin) System.out.println("- No realizó acciones");

        System.out.println("\nDOCTOR:");
        System.out.println("Nombre: " + doctor.getNombre() + " " + doctor.getApellidos());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Especialidad: " + doctor.getEspecialidad());
        System.out.println("Experiencia: " + doctor.getAniosExperiencia() + " años");
        System.out.println("Acciones:");
        if (dDiag) System.out.println("- Diagnosticó");
        if (dTrat) System.out.println("- Prescribió tratamiento");
        if (dSeg) System.out.println("- Dio seguimiento");
        if (dOpin) System.out.println("- Dio opiniones");
        if (!dDiag && !dTrat && !dSeg && !dOpin) System.out.println("- No realizó acciones");

        sc.close();
    }
}
