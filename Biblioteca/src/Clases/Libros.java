package Clases;


public class Libros {
    private String Tipo;
    private Integer ID;
    private String Autor;
    private String Titulo;
    private Integer Edicion;
    private Integer Yearpublic;
    private Long Isbn;
    private String Descripcion;
    private String[] Pclaves;
    private String[] Tema;
    private String Categoria;
    private Integer Ejemplares; 
    private String Area;
    private Integer Copias;
    private Integer Tam;
    private Integer Disponible;
    public Libros(Integer ID, String Tipo,String Autor,Integer Yearpublic,Long Isbn,String Titulo,Integer Edicion,String[]Pclaves,  
           String Descripcion,String[]Tema,Integer Copias,String Categoria,Integer Ejemplares,String Area,Integer Tam,Integer Disponible){
       this.ID=ID;
       this.Tipo=Tipo;
       this.Autor=Autor;
       this.Titulo=Titulo;
       this.Edicion=Edicion;
       this.Yearpublic=Yearpublic;
       this.Isbn=Isbn;
       this.Descripcion=Descripcion;
       this.Pclaves=Pclaves;
       this.Tema=Tema;
       this.Categoria=Categoria;
       this.Ejemplares=Ejemplares;
       this.Area=Area;         
       this.Copias=Copias;
       this.Tam=Tam;  
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
     * @return the Yearpublic
     */
    public Integer getYearpublic() {
        return Yearpublic;
    }

    /**
     * @param Yearpublic the Yearpublic to set
     */
    public void setYearpublic(Integer Yearpublic) {
        this.Yearpublic = Yearpublic;
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
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
     * @return the Copias
     */
    public Integer getCopias() {
        return Copias;
    }

    /**
     * @param Copias the Copias to set
     */
    public void setCopias(Integer Copias) {
        this.Copias = Copias;
    }

    /**
     * @return the Tam
     */
    public Integer getTam() {
        return Tam;
    }

    /**
     * @param Tam the Tam to set
     */
    public void setTam(Integer Tam) {
        this.Tam = Tam;
    }

    

    /**
     * @return the Ejemplares
     */
    public Integer getEjemplares() {
        return Ejemplares;
    }

    /**
     * @param Ejemplares the Ejemplares to set
     */
    public void setEjemplares(Integer Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    /**
     * @return the Pclaves
     */
    public String[] getPclaves() {
        return Pclaves;
    }

    /**
     * @param Pclaves the Pclaves to set
     */
    public void setPclaves(String[] Pclaves) {
        this.Pclaves = Pclaves;
    }

    /**
     * @return the Tema
     */
    public String[] getTema() {
        return Tema;
    }

    /**
     * @param Tema the Tema to set
     */
    public void setTema(String[] Tema) {
        this.Tema = Tema;
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

    
}
