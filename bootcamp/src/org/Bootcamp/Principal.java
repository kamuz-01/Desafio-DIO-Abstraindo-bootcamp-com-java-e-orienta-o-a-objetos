package org.Bootcamp;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
    	
        // Criando cursos e mentoria
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Criando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Simulando inscrição e progresso de inscritos
        simularInscricaoEProgresso(bootcamp, "Camila");
        simularInscricaoEProgresso(bootcamp, "Joao");
    }

    private static void simularInscricaoEProgresso(Bootcamp bootcamp, String nomeInscrito) {
        Inscritos inscrito = new Inscritos();
        inscrito.setNome(nomeInscrito);
        inscrito.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteúdos Inscritos " + nomeInscrito + ": " + inscrito.getConteudosInscritos());

        inscrito.progredir();
        inscrito.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + nomeInscrito + ": " + inscrito.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + nomeInscrito + ": " + inscrito.getConteudosConcluidos());
        System.out.println("XP " + nomeInscrito + ": " + inscrito.calcularTotalXp());

        System.out.println("-------");
    }
}