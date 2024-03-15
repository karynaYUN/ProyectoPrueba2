public class Departamento extends Administardor{
    String codigo;
    String nombre;
    public Departamento(String codigo, String nombre){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public Departamento() {}

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
