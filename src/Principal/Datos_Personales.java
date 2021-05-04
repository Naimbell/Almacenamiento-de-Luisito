//Atributos de los datos personales
package Principal;

public class Datos_Personales {
    private int codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String dpi;
    private String edad;
private String sexo;    
    
    //crear un constructor vacio
    public Datos_Personales(){
    }
//Creacion de un constuctor
    public Datos_Personales(int codigo, String nombre, String apellidos, String telefono, String direccion, String dpi, String edad, String sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
         this.direccion = direccion;
          this.dpi = dpi;
           this.edad = edad;
           this.sexo = sexo;         
         
         
    }
   //Set y Get

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     public String getDireccion() {
        return direccion;
    }
    
     public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     public String getDpi() {
        return dpi;
    }
    
     public void setDpi(String dpi) {
        this.dpi= dpi;
    }
     
      public String getEdad() {
        return edad;
    }
    
     public void setEdad(String edad) {
        this.edad = edad;
    }
    
      public String getSexo() {
        return sexo;
    }
    
     public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
