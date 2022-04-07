public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma_desc;
    private String emergency_code;

    /**
     * Constructor vacío de un Paciente
     */
    public Paciente()
    {
        this.nombre = null;
        this.sintoma_desc = null;
        this.emergency_code = null;
    }
    /**
     * Constructor de un Paciente con toda su información
     * @param nombre del Paciente
     * @param sintoma_desc padecimiento y/o malestar
     * @param emergency_code prioridad de atención
     */
    public Paciente(String nombre, String sintoma_desc, String emergency_code){
        this.nombre = nombre;
        this.sintoma_desc = sintoma_desc;
        this.emergency_code = emergency_code;
    }
    /**
     *Setter del nombre de paciente
     * @param nombre del Paciente
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Getter
     * @return nombre del Paciente
     */
    public String getNombre()
    {
        return this.nombre;
    }

    /**
     * Setter de lo que padece el Paciente
     * @param sintoma_desc padecimiento
     */
    public void setSintoma(String sintoma_desc)
    {
        this.sintoma_desc = sintoma_desc;
    }

    /**
     * Getter
     * @return lo que padece el Paciente
     */
    public String getSintoma()
    {
        return this.sintoma_desc;
    }

    /**
     * Setter del código de emergencia
     * @param emergency_code prioridad de atención
     */
    public void setCode(String emergency_code)
    {
        this.emergency_code = emergency_code;
    }

    /**
     * Getter
     * @return código de prioridad de atención en el hospital
     */
    public String getCode()
    {
        return this.emergency_code;
    }

    /**
     *Compara la prioridad de atención que debe recibir un paciente
     * @param p Paciente al cual se quiere comparar
     * @return número de prioridad
     */
    @Override
    public int compareTo(Paciente p) {
        return this.emergency_code.compareTo(p.getCode());
    }
}
