import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        curso curso1 = new curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso curso2 = new curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descricao curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.getData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
