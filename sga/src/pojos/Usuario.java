package pojos;
// Generated 13/11/2016 12:13:33 by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int cod;
     private String nome;
     private String login;
     private String senha;
     private String perfil;

    public Usuario() {
    }

    public Usuario(int cod, String nome, String login, String senha, String perfil) {
       this.cod = cod;
       this.nome = nome;
       this.login = login;
       this.senha = senha;
       this.perfil = perfil;
    }
   
    public int getCod() {
        return this.cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }




}


