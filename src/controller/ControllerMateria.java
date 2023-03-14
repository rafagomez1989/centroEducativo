package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Materia;
import model.Nivel;


public class ControllerMateria {
	private static Connection conn = null;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static List<Materia> cargarMaterias(int id) {
		List<Materia> lc = new ArrayList<Materia>();
		try {
			conn = controller.ConnectionManager.getConexion();

			PreparedStatement ps = conn.prepareStatement(
					"select * from centroeducativo.materia where curso_id = " + id);
			ResultSet rs = ps.executeQuery();
			Materia m = null;
			while (rs.next()) {
				m = new Materia();
				m.setId(rs.getInt(1));
				m.setNombre(rs.getString(2));
				Nivel ni = new Nivel(); 
				ni.setId(rs.getInt(4));
				
			}
			rs.close();
			ps.close();
			conn.close();
			return lc;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
