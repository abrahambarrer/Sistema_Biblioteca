import java.util.Scanner;

import Biblioteca.*;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n--- MENÚ DE BIBLIOTECA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Mostrar catálogo completo");
            System.out.println("5. Mostrar libros disponibles");
            System.out.println("\n--- USUARIOS ---");
            System.out.println("6. Agregar usuario");
            System.out.println("7. Eliminar usuario");
            System.out.println("8. Buscar usuario");
            System.out.println("9. Mostrar usuarios");
            System.out.println("\n--- PRESTAMOS ---");
            System.out.println("10. Realizar préstamo");
            System.out.println("11. Restaurar libro (devolución)");
            System.out.println("12. Mostrar préstamos activos");
            System.out.println("13. Salir\n");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ID del libro: ");
                    String libroID = scanner.nextLine();
                    biblioteca.agregarLibro(titulo, autor, libroID);
                    break;

                case 2:
                    System.out.print("Ingrese el ID del libro a eliminar: ");
                    String eliminarID = scanner.nextLine();
                    biblioteca.eliminarLibro(eliminarID);
                    break;

                case 3:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String buscarTitulo = scanner.nextLine();
                    biblioteca.buscarLibro(buscarTitulo);
                    break;

                case 4:
                    biblioteca.mostrarCatalogo();
                    break;

                case 5:
                    biblioteca.mostrarDisponibles();
                    break;

                case 6:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese el ID del usuario: ");
                    String usuarioID = scanner.nextLine();
                    biblioteca.agregarUsuario(nombreUsuario, usuarioID);
                    break;

                case 7:
                    System.out.print("Ingrese el ID del usuario a eliminar: ");
                    String eliminarUsuarioID = scanner.nextLine();
                    biblioteca.eliminarUsuario(eliminarUsuarioID);
                    break;

                case 8:
                    System.out.print("Ingrese el ID del usuario a buscar: ");
                    String buscarUsuarioID = scanner.nextLine();
                    biblioteca.buscarUsuario(buscarUsuarioID);
                    break;

                case 9:
                    biblioteca.mostrarUsuarios();
                    break;

                case 10:
                    System.out.print("Ingrese el ID del libro para préstamo: ");
                    String prestamoLibroID = scanner.nextLine();
                    System.out.print("Ingrese el ID del usuario: ");
                    String prestamoUsuarioID = scanner.nextLine();
                    biblioteca.realizarPrestamo(prestamoLibroID, prestamoUsuarioID);
                    break;

                case 11:
                    System.out.print("Ingrese el ID del libro a devolver: ");
                    String devolverLibroID = scanner.nextLine();
                    biblioteca.restaurarLibro(devolverLibroID);
                    break;

                case 12:
                    biblioteca.mostrarPrestamos();
                    break;

                case 13:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 13);
        
        scanner.close();
    }
}
