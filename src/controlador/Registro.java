package controlador;

import modelo.Paciente;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Registro {
    private Conexion conexion = new Conexion();
    
    public boolean conectar(){
        return conexion.conectar();
    }

    public String agregar(Paciente p){
        return conexion.agregar(p);
    }

    public ResultSet buscarPorRut(String rut){
        return conexion.buscar(rut);
    }
    public ResultSet buscarTodos(){
        return conexion.listar();
    }
}
