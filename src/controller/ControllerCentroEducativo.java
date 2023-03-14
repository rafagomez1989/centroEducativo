package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CentroEducativo;



public class ControllerCentroEducativo {
	private static Connection conn = null;

	/**
	 * 
	 * @return
	 */
	public static List<CentroEducativo> cargarCentroEducativos(int id) {
		List<CentroEducativo> lc = new ArrayList<CentroEducativo>();
		try {
			conn = controller.ConnectionManager.getConexion();

			PreparedStatement ps = conn.prepareStatement(
					"select * from nivelesymaterias.centroeducativo where curso_id = " + id);
			ResultSet rs = ps.executeQuery();
			CentroEducativo ce = null;
			while (rs.next()) {
				ce = new CentroEducativo();
				ce.setId(rs.getInt(1));
				ce.setDescripcion(rs.getNString(2));				
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
