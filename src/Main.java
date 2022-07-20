import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIngra = new Dev();
        devIngra.setNome("Ingra");
        devIngra.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ingra" + devIngra.getConteudosInscritos());
        devIngra.progredir();
        devIngra.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ingra" + devIngra.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ingra" + devIngra.getConteudosConcluidos());
        System.out.println("Xp: " + devIngra.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoni = new Dev();
        devJoni.setNome("Joni");
        devJoni.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joni" + devJoni.getConteudosInscritos());
        devJoni.progredir();
        devJoni.progredir();
        devJoni.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joni" + devJoni.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joni" + devJoni.getConteudosConcluidos());
        System.out.println("Xp: " + devJoni.calcularTotalXp());



    }
}
