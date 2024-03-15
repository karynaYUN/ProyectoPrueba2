public class Sala extends Administardor{
    String nombre;
    String codigo;
public Sala(String nombre, String codigo){
    this.nombre=nombre;
    this.codigo=codigo;
}
    public String getCodigo () {
        return codigo;
}

    public String getNombre() {
        return nombre;
    }
}
