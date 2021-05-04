//Crear, Modificar, Eliminar
package Principal;

import java.util.ArrayList;

public class ProcesoDatos {
   private ArrayList<Object> a = new ArrayList<Object>();
//constructor vacio
public ProcesoDatos(){
} 
public ProcesoDatos(ArrayList<Object> a){
        this.a = a;
    }
    
//crear un nuevo registro en un archivo plano
public void crearRegistro(Datos_Personales p){
        this.a.add(p);
    }
//modificarRegistro
public void modificarRegistro(int i, Datos_Personales p){
        this.a.set(i, p);
    }
//Eliminar Registros
public void eliminarRegistros(int i){
        this.a.remove(i); 
    }
//Recorrido y obtener los Datos Personales
 public Datos_Personales obtenerRegistro(int i){
        return (Datos_Personales)a.get(i);
    }
//crear una clase que determine la cantidad de registros encontradods
 public int cantidadRegistros(){
        return this.a.size();
    }
//Crear un Buscador 
public int buscarCodigo(int codigo){
        for(int i = 0; i < cantidadRegistros(); i++){
            if(codigo == obtenerRegistro(i).getCodigo())return i;
        }
        return -1;
    }
}