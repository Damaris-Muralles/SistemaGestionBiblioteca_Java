package Clases;


public class Sesion {
    private Long ID_user;
    private String nombre_user;
    private String apellido_user;
    private String user_sesion;
    private String rol_user;
    private String password_user;
    
    public Sesion(Long ID_user,String nombre_user,String apellido_user, String user_sesion, String rol_user,String password_user){
       this.ID_user=ID_user;
       this.nombre_user=nombre_user;
       this.apellido_user=apellido_user;
       this.user_sesion=user_sesion;
       this.rol_user=rol_user;
       this.password_user=password_user;
    }

   

    /**
     * @return the nombre_user
     */
    public String getNombre_user() {
        return nombre_user;
    }

    /**
     * @param nombre_user the nombre_user to set
     */
    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    /**
     * @return the apellido_user
     */
    public String getApellido_user() {
        return apellido_user;
    }

    /**
     * @param apellido_user the apellido_user to set
     */
    public void setApellido_user(String apellido_user) {
        this.apellido_user = apellido_user;
    }

    /**
     * @return the user_sesion
     */
    public String getUser_sesion() {
        return user_sesion;
    }

    /**
     * @param user_sesion the user_sesion to set
     */
    public void setUser_sesion(String user_sesion) {
        this.user_sesion = user_sesion;
    }

    /**
     * @return the rol_user
     */
    public String getRol_user() {
        return rol_user;
    }

    /**
     * @param rol_user the rol_user to set
     */
    public void setRol_user(String rol_user) {
        this.rol_user = rol_user;
    }

    /**
     * @return the password_user
     */
    public String getPassword_user() {
        return password_user;
    }

    /**
     * @param password_user the password_user to set
     */
    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    /**
     * @return the ID_user
     */
    public Long getID_user() {
        return ID_user;
    }

    /**
     * @param ID_user the ID_user to set
     */
    public void setID_user(Long ID_user) {
        this.ID_user = ID_user;
    }
    
}
