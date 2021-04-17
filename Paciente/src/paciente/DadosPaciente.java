package paciente;
public class DadosPaciente extends Data {
    public String nome;
    public String sexo;
    private int idade;
    private String quadroClinico;
    public boolean consulta;

   

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getQuadroClinico() {
        return quadroClinico;
    }

    public boolean getConsulta() {
        return consulta;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQuadroClinico(String quadroClinico) {
        this.quadroClinico = quadroClinico;
    }

    public void setConsulta(boolean consulta) {
        this.consulta = consulta;
    }
    
    
        
    
    public void FazerConsulta(String n,String s,int i, String qc){
        
        this.setNome(n);
        this.setSexo(s);
        this.setIdade(i);
        this.setQuadroClinico(qc);   
        
        
    }
    public void status(){
        System.out.println("Nome: "+getNome());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Idade: "+getIdade());
        System.out.println("Quadro Clínico: "+getQuadroClinico());
        System.out.println("Data da consulta: "+getDia()+"/"+getMes()+"/"+getAno());
    }

   
    
    
    
}
