flowchart TB
    subgraph "UI/Orchestration"
        Main["Main (Application Entry Point)"]:::ui
    end

    subgraph "Domain Model"
        Persona["Persona (abstract)"]:::domain
        Doctor["Doctor"]:::domain
        Enfermero["Enfermero"]:::domain
        Paciente["Paciente"]:::domain
    end

    Doctor --|>|"extends"| Persona
    Enfermero --|>|"extends"| Persona
    Paciente --|>|"extends"| Persona
    Main -.->|"instantiates/uses"| Persona

    click Main "https://github.com/jontj7/practica-java/blob/main/src/Main.java"
    click Persona "https://github.com/jontj7/practica-java/blob/main/src/Persona.java"
    click Doctor "https://github.com/jontj7/practica-java/blob/main/src/Doctor.java"
    click Enfermero "https://github.com/jontj7/practica-java/blob/main/src/Enfermero.java"
    click Paciente "https://github.com/jontj7/practica-java/blob/main/src/Paciente.java"

    classDef ui fill:#ffe4b5,stroke:#333,stroke-width:2px;
    classDef domain fill:#e0ffff,stroke:#333,stroke-width:2px;
