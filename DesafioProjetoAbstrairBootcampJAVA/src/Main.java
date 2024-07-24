import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descricao do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("descricao do curso");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        
        Dev devLuizinho = new Dev();
        devLuizinho.setNome("Luiz");
        devLuizinho.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devLuizinho.getConteudoInscritos());
        devLuizinho.progredir();
        System.out.println("Conteudos concluidos:" + devLuizinho.getConteudosConcluidos());
        System.out.println("XP: " +devLuizinho.calcularTotalXp());
        System.out.println("=====================");
        System.out.println("\n");


        Dev devBagre = new Dev();
        devBagre.setNome("Gabriel");
        devBagre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devBagre.getConteudoInscritos());
        System.out.println("Conteudos concluidos:" + devBagre.getConteudosConcluidos());
        System.out.println("XP: " +devBagre.calcularTotalXp());


    }
}