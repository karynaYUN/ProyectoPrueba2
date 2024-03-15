import java.util.ArrayList;
import java.util.Scanner;

public class Administardor implements App{
    ArrayList<Departamento> lista2=new ArrayList<>();
    ArrayList<Sala> lista3=new ArrayList<>();
    int opcionMenu=0;
    @Override
    public void loginAdministrador() {
        Scanner in=new Scanner (System.in);
            System.out.println("Escribe contrasena de admin:");
            String contrasena = in.nextLine();
        if (contrasena.equals("admin")) {
            System.out.println("Bienvenido a administrador");
            do {
                try {
                System.out.println("Menu de administrador:" +
                        "\n1. Lista de departamentos" +
                        "\n2. Añadir departamento" +
                        "\n3. Eleminar departamento" +
                        "\n4. Lista de salas " +
                        "\n5. Añadir sala" +
                        "\n6. Eleminar sala" +
                        "\n7. Lista de reservas" +
                        "\n8. Cerrar ");
                System.out.println("Escribe una opcion:");
                opcionMenu= in.nextInt();
                }catch (NumberFormatException ne){
                    System.out.println("Lo siento pero tines que elegir una opcion desde 1 a 7");
                }
                switch (opcionMenu){
                    case 1:
                        listarDepartamentos();
                        break;
                    case 2:
                        añadirDepartamento();
                        break;
                    case 3:
                        eliminarDepartamento();
                        break;
                    case 4:
                        listarSalas();
                    case 5:
                        añadirSala();
                        break;
                    case 6:
                        eleminarSala();
                        break;
                }
            }while (opcionMenu!=8);
        }else {
            System.out.println("Contrasena es incorecta");
        }
    }

    public void añadirDepartamento() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe el código del departamento:");
        String codigo = in.nextLine();
        System.out.println("Escribe el nombre del departamento:");
        String nombre = in.nextLine();
        Departamento nuevoDepartamento = new Departamento(codigo, nombre);

        lista2.add(nuevoDepartamento);
        System.out.println("Departamento añadido correctamente.");
    }
    public void añadirSala(){
        Scanner in=new Scanner(System.in);
        System.out.println("Escribe el nombre de sala que quieres añadir:");
        String nombre=in.nextLine();
        System.out.println("Escribe codigo de sala quq quieres añadir:");
        String codigo =in.nextLine();
        Sala sala=new Sala(nombre,codigo);

        lista3.add(sala);
        System.out.println("Sala esta añadida");
    }
    public void eliminarDepartamento() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe el código del departamento a eliminar:");
        String codigo = in.nextLine();
        boolean eliminado = false;
        for (Departamento depto : lista2) {
            if (depto.getCodigo().equals(codigo)) {
                lista2.remove(depto);
                eliminado = true;
                System.out.println("Departamento eliminado correctamente.");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró un departamento con ese código.");
        }
    }
    public void eleminarSala(){
        Scanner in=new Scanner(System.in);
        System.out.println("Escribe el codigo de sala que quieres elminar:");
        String codigo=in.nextLine();
        boolean encontrado=false;
        for(Sala sala: lista3){
            if(sala.getCodigo().equals(codigo)) {
                lista3.remove(sala);
                encontrado = true;
                System.out.println("Sala esta eleminado, correcto");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un departamento con ese código.");
        }
    }
    public void listarDepartamentos() {
        if (lista2.isEmpty()) {
            System.out.println("No hay departamentos registrados.");
        } else {
            System.out.println("Lista de departamentos:");
            for (Departamento depto : lista2) {
                System.out.println("Código: " + depto.getCodigo() + ", Nombre: " + depto.getNombre());
            }
        }
    }
    public void listarSalas(){
        if(lista3.isEmpty()){
            System.out.println("NO hay salas");
        }else {
            System.out.println("Lista de salas:");
            for(Sala sala: lista3){
                System.out.println("Codigo "+sala.getCodigo()+ ", Nombre "+sala.getNombre());
            }
        }
    }
    @Override
    public void loginDepartamento() {
        Scanner in=new Scanner(System.in);
        System.out.println("Escribe codigo de departamento:");
        String codigo=in.nextLine();
        if (codigo.length()!=3){
            System.out.println("Lo siento pero cofigo de departamento puede ser solo tres letras");
        } else if (in.hasNextInt()) {
            System.out.println("Lo siento pero el codifo de departamento puede ser colo letras");
        }
    }
}
