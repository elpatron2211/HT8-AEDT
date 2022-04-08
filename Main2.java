/**
 * Main2
 * Objetivo: Intermediar funciones priority queue
 * 
 * @author Pedro Marroquin 
 * @author Paulo Sanchez
 * @version 1.0 finalizado 8/04/2022
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main2 {
    public static String archivo = "Pacientes.txt";
    public static void main(String[] args) throws IOException {

        PriorityQueue<Paciente> pacientes = new PriorityQueue<Paciente>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Leyendo archivo de informacion de Pacientes...");
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(archivo),
                    StandardCharsets.UTF_8
            );
            lines.forEach(line-> {
                String[] info_paciente = line.split(",");
                String nombre = info_paciente[0];
                String sintoma_desc = info_paciente[1];
                String emergency_code = info_paciente[2];
                Paciente paciente_nuevo = new Paciente(nombre, sintoma_desc, emergency_code);
                pacientes.add(paciente_nuevo);
            });
            System.out.println("¡Todos los pacientes en espera se han registrados exitosamente!");
        }catch (IOException e)
        {
            System.out.println("Archivo no encontrado");
        }
        System.out.println("Generando listado de orden de pacientes...");
        do{
            System.out.println("Presione enter para obtener el siguiente paciente a atender");
            scan.nextLine();
            Paciente paciente_atender = pacientes.remove();
            System.out.println("Se debe atender a "+paciente_atender.getNombre()+" por "+paciente_atender.getSintoma()+" con prioridad: "+paciente_atender.getCode());
        }while(!pacientes.isEmpty());
        System.out.println("¡Todos los pacientes han sido atendidos, gracias por salvar vidas!");
    }
}
