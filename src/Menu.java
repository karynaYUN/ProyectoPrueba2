import java.util.Scanner;

public class Menu extends Administardor {
    public static void main(String[] args) {
        Administardor admin=new Administardor();
        Departamento depto = new Departamento();
        Scanner in=new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.println("Menu:" +
                    "\n1. Login como Administrador" +
                    "\n2. Login como Departamento");
            System.out.println("Escribe una opcion de menu:");
            opcion = in.nextInt();
        }catch (NumberFormatException ne){
            System.out.println("Error: tienes que escribir los numeros");
        }
        switch (opcion){
            case 1:
                admin.loginAdministrador();
                break;
            case 2:
                depto.loginDepartamento();
                break;
        }
    }
    }
