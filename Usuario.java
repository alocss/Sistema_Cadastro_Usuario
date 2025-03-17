public class Usuario {
    private String nome;
    private String email;
    private int idade;
        
    //Criando construtor da classe usuari
        public Usuario(String nome, String email, int idade){
            this.nome = nome;
            this.email = email;
            this.idade = idade;
    }
    // Getters e Setters
    public String Nome(){
        return nome;
    }
    public void Nome(String nome){
        this.nome = nome;
    }

    public String Email(){
        return email;
    }

    public void Email (String email){
        this.email = email;
    }

    public int Idade (){
        return idade;
    }

    public void Idade (int idade){
        this.idade = idade;
    }

     // Método para mostrar os dados do usuário
     @Override
     public String toString() {
         return "Nome: " + nome + ", Email: " + email + ", Idade: " + idade;
     }
}
