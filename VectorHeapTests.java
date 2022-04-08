/**
 * VectorHeapTest
 * Objetivo: Test de vector heap metodos add y remove
 * 
 * @author Pedro Marroquin 
 * @author Paulo Sanchez
 * @version 1.0 finalizado 8/04/2022
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VectorHeapTests {
    @Test
    public void testAdd()
    {
        VectorHeap<Paciente> pacientes = new VectorHeap<Paciente>();
        Paciente paciente1 = new Paciente("Juanito", "hinchazon", "B");
        pacientes.add(paciente1);
        assertEquals(1, pacientes.size());
    }

    @Test
    public void testRemove()
    {
        VectorHeap<Paciente> pacientes = new VectorHeap<Paciente>();
        Paciente paciente1 = new Paciente("Juanito", "hinchazon", "B");
        Paciente paciente2 = new Paciente("Andres", "Desmembrado", "A");
        Paciente paciente3 = new Paciente("Pedrito", "Estreñimiento", "D");
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        Paciente paciente_obtenido = pacientes.remove();
        assertEquals(paciente2, paciente_obtenido);
        
    }
}
