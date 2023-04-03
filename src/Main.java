import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        mentoria1.setCargaHoraria(8);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
