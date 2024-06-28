package Empresa;

public class Funcionario {
	private String id;
    private String nome;
    private String alergias;
    private String condicoesMedicas;
    private String telefone;
    private String email;
    
    public Funcionario(String id, String nome, String alergias, String condicoesMedicas, String telefone, String email) {
    	this.id = id;
    	this.nome = nome;
        this.alergias = alergias;
        this.condicoesMedicas = condicoesMedicas;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getCondicoesMedicas() {
        return condicoesMedicas;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Id do Funcionário: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "Alergias: " + alergias + "\n" +
               "Condições Médicas: " + condicoesMedicas + "\n" +
               "Telefone: " + telefone + "\n" +
               "Email: " + email;
    }
}
