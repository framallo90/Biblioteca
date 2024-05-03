import com.framallo90.biblioteca.model.entity.Biblioteca;
import com.framallo90.libro.model.repository.LibroRepository;
import com.framallo90.libro.view.LibroView;
import com.framallo90.prestamo.controller.PrestamoController;
import com.framallo90.prestamo.model.entity.Prestamo;
import com.framallo90.prestamo.model.repository.PrestamoRepository;
import com.framallo90.prestamo.view.PrestamoView;
import com.framallo90.usuario.model.repository.UsuarioRepository;
import com.framallo90.usuario.view.UsuarioView;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioView usuarioView = new UsuarioView();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        LibroView libroView = new LibroView();
        LibroRepository libroRepository = new LibroRepository();
        PrestamoView prestamoView = new PrestamoView();
        PrestamoRepository prestamoRepository = new PrestamoRepository();


        PrestamoController prestamoController = new PrestamoController(
                usuarioRepository,
                usuarioView,
                libroRepository,
                libroView,
                prestamoView,
                prestamoRepository);

        Biblioteca biblioteca = new Biblioteca(prestamoController);

        biblioteca.menu();

        System.out.println("Historial de prestamos: ");
        prestamoView.mostrarPrestamos(prestamoRepository.getListaPrestamo());

    }
}