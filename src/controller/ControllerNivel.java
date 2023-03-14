package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CentroEducativo;
import model.Nivel;

public class ControllerNivel {
	private static Connection conn = null;

	
	/**
	 * 
	 * @return
	 */
	public static List<Nivel> cargarNiveles(int id) {
		List<Nivel> lc = new ArrayList<Nivel>();
		try {
			conn = controller.ConnectionManager.getConexion();

			PreparedStatement ps = conn.prepareStatement(
					"select * from nivelesymaterias.nivel where curso_id = " + id);
			ResultSet rs = ps.executeQuery();
			Nivel ni = null;
			while (rs.next()) {
				ni = new Nivel();
				ni.setId(rs.getInt(1));
				ni.setDescripcion(rs.getNString(2));
				CentroEducativo ce = new CentroEducativo(); 
				ce.setId(rs.getInt(3));
				ni.setDescripcion(rs.getString(null));
				lc.add(ni);
			}
			rs.close();
			ps.close();
			conn.close();
			return lc;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
