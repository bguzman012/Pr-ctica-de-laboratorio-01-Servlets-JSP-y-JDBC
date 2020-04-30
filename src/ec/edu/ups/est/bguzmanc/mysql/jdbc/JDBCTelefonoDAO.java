package ec.edu.ups.est.bguzmanc.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ec.edu.ups.est.bguzmanc.dao.TelefonoDAO;
import ec.edu.ups.est.bguzmanc.modelo.Telefono;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO{
 
	/*
	 * private static final long serialVersionUID = 1L;
	private int codigo;
	private String numero;
	private String tipo;
	private String operadora;
	 */
	
	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		conexionDos.update("DROP TABLE IF EXISTS Telefono");
		conexionDos.update("CREATE TABLE Telefono ( TEL_CODIGO INT NOT NULL UNIQUE, TEL_NUMERO VARCHAR(10), "
				+ "TEL_TIPO VARCHAR(25), TEL_OPERADORA(25), PRIMARY KEY (TEL_CODIGO), "
				+ "FOREIGN KEY(USU_CEDULA) REFERENCES USUARIO(CEDULA))");
		
	}

	@Override
	public void create(Telefono telefono) {
		
	}
	
	public void createTabla(Telefono telefono, String id) {
		// TODO Auto-generated method stub
		conexionDos.update("INSERT Telefono VALUES (" + telefono.getCodigo() + ", '" + telefono.getNumero() + "', '"
				+ telefono.getTipo() + "', '" + telefono.getOperadora() + "', '" + id + "')");
				
	}

	@Override
	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(Telefono telefono) {
		// TODO Auto-generated method stub
		
		conexionUno.update("UPDATE Telefono SET TEL_NUMERO = '" + telefono.getNumero() + "', TEL_TIPO = '"
				+ telefono.getTipo() + "', TEL_OPERADORA = '" + telefono.getOperadora() + "' WHERE TEL_CODIGO = " 
				+ telefono.getCodigo());	
	}

	@Override
	public void delete(Telefono telefono) {
		// TODO Auto-generated method stub
		conexionUno.update("DELETE FROM TELEFONO WHERE TEL_CODIGO = " + telefono.getCodigo());
		
	}

	@Override
	public List<Telefono> find() {
		// TODO Auto-generated method stub
		List<Telefono> list = new ArrayList<Telefono>();
		ResultSet rsTelefono = conexionUno.query("Select * FROM Telefono");
		try {
			while(rsTelefono.next()) {
				Telefono telefono = new Telefono(rsTelefono.getInt("TEL_CODIGO"), rsTelefono.getString("TEL_NUMERO"), 
						rsTelefono.getString("TEL_TIPO"), rsTelefono.getString("TEL_OPERADORA"));
				list.add(telefono);
			}
		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:find): " + e.getMessage());
		}
		
		return list;

	}
	
	/*
	 * private static final long serialVersionUID = 1L;
	private int codigo;
	private String numero;
	private String tipo;
	private String operadora;
	 */

	@Override
	public Set<Telefono> findByUsuario(String cedula) {
		// TODO Auto-generated method stub
		Set<Telefono> list = new HashSet<Telefono>();
		ResultSet rsTelefono = conexionDos.query("SELECT * FROM TELEFONO WHERE USU_CEDULA ='" + cedula + "'");
		try {
			while (rsTelefono.next()) {
				Telefono telefono = new Telefono(rsTelefono.getInt("TEL_CODIGO"), rsTelefono.getString("TEL_NUMERO"), 
						rsTelefono.getString("TEL_TIPO"), rsTelefono.getString("TEL_OPERADORA"));
				list.add(telefono);
			}
		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:findByShoppingBasketId): " + e.getMessage());
		}
		return list;
		/*
		 * 
		ResultSet rsProduct = conexionDos.query("SELECT * FROM Product WHERE shopping_basket_id=" + shoppingBasketId);
		try {
			while (rsProduct.next()) {
				Product product = new Product(rsProduct.getInt("id"), rsProduct.getInt("amount"),
						rsProduct.getString("description"));
				list.add(product);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCProductDAO:findByShoppingBasketId): " + e.getMessage());
		}

		return list;
		 */
	}


}
