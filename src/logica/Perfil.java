package logica;

/**
 *
 * @author scben
 */
public class Perfil {
    
  String usuario, password, type;
  int id;

    public Perfil() {
    }

    public Perfil(String usuario, String password, String type, int id) {
        this.usuario = usuario;
        this.password = password;
        this.type = type;
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
  
}
