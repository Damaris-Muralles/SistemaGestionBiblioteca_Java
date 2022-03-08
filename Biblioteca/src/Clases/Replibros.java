package Clases;


public class Replibros {
   private String Tipo;
    private Integer ID;
    private String Autor;
    private String Titulo;
    private Integer Edicion;
    private Long Isbn;
    private String Categoria;
    private String Area;
    private Integer Disponible;
     private Long ID_user;
    private String nombre_user;
    private String user_sesion;
    private String rol_user;
    public  Replibros(String Tipo,Integer ID,String Autor,Long Isbn,String Titulo,Integer Edicion,String Categoria,String Area, Integer Disponible,String user_sesion,String nombre_user,Long ID_user, String rol_user){
       this.ID_user=ID_user;
       this.nombre_user=nombre_user;
       this.user_sesion=user_sesion;
       this.rol_user=rol_user;
       this.ID=ID;
       this.Tipo=Tipo;
       this.Autor=Autor;
       this.Titulo=Titulo;
       this.Edicion=Edicion;
       this.Isbn=Isbn;
       this.Categoria=Categoria;
       this.Area=Area; 
       this.Disponible=Disponible;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Edicion
     */
    public Integer getEdicion() {
        return Edicion;
    }

    /**
     * @param Edicion the Edicion to set
     */
    public void setEdicion(Integer Edicion) {
        this.Edicion = Edicion;
    }

    /**
     * @return the Isbn
     */
    public Long getIsbn() {
        return Isbn;
    }

    /**
     * @param Isbn the Isbn to set
     */
    public void setIsbn(Long Isbn) {
        this.Isbn = Isbn;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the Area
     */
    public String getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * @return the Disponible
     */
    public Integer getDisponible() {
        return Disponible;
    }

    /**
     * @param Disponible the Disponible to set
     */
    public void setDisponible(Integer Disponible) {
        this.Disponible = Disponible;
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
    
    
    
}
