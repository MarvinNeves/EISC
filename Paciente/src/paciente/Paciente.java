package paciente;
import java.util.Scanner;
public class Paciente {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("nome :");
        String nome = ler.nextLine();
        System.out.println("sexo M/F :");
        String sexo = ler.nextLine();
        System.out.println("quadro clinico :");
        String qclinico = ler.nextLine();
        System.out.println("idade:");
        int idade = ler.nextInt();
        System.out.println("dia para consulta:");
        int dia = ler.nextInt();
        System.out.println("mes:");
        int mes = ler.nextInt();
        System.out.println("ano:");
        int ano = ler.nextInt();
        System.out.println("vai fazer consulta :");
        boolean consulta = ler.nextBoolean();
        
        String genero = "null";
        
        if (sexo == "m" || sexo == "M" || sexo == "f" || sexo == "F"){
            genero = sexo;
        }
        
        
    
        DadosPaciente k = new DadosPaciente();
        if (consulta){
            System.out.println("===========================================");
            System.out.println("Consulta Marcada");
            k.FazerConsulta(nome, genero, idade,qclinico);
            k.setData(dia, mes, ano);
            k.status();
        }
        else{
            System.out.println("consulta não marcada");
        }
        
    }
    
}
