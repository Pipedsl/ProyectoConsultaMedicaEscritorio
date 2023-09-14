package bd;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import modelo.Paciente;

/**
 *
 * @author felip
 */
public class Conexion {
    
    private Connection con;
    private Statement state;
    private Paciente p = new Paciente();

    public Conexion() {
    }
    
    public boolean conectar(){
        boolean conectado =true;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/consultaMedica","root","");
            state = con.createStatement();
            
        }catch(Exception ex ){
            //lanza mensaje de error;
            conectado =false;
        }
        return conectado;
    }
    
    public String agregar(Paciente p) {
        String mensaje = "";
        try {
            String sql = "insert into paciente values('"
                    + p.getRut()+ "','" + p.getNombre() 
                    + "','" + p.getGenero()+ "', '"+p.getEdad()+"','"
                    + p.getDireccion() +"','"+ p.getCiudad() +"','"
                    +p.getIsapre()+"',"+p.isDonante()+")";
            state.execute(sql);
            mensaje ="Paciente agregado";
        } catch (Exception ex) {
            mensaje ="Paciente No pudo agregarse";
        }
        return mensaje;
    }
    
        public ResultSet listar( ) {
        try {
            String sql = "select * from paciente;";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
        
    public ResultSet buscar(String rut) {
        try {
            String sql = "select * from paciente where rut = "+ rut+";";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }

}
