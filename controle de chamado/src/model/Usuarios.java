package model;

/**
 *
 * @author Luciano
 */
public class Usuarios {

    int ID;
    String Nome;
    String Cargo;
    String Setor;
    int Ramal;
    String Perfil;
    String Login;
    String Senha;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public int getRamal() {
        return Ramal;
    }

    public void setRamal(int Ramal) {
        this.Ramal = Ramal;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

}
