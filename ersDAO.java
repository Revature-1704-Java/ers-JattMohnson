package com.revature.ERS;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ersDAO 
{
	public List<Employee> getAllEmployees() {
		PreparedStatement ps = null;
		Employee e = null;
		List<Employee> employees = new ArrayList<Employee>();
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM REIMBURSEMENTEMPLOYEE";
			ps = conn.prepareStatement(sql);
			//Add any variables to PS
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("empID");
				String name = rs.getString("empName");
				e = new Employee(id, name);
				employees.add(e);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		return employees;
	}
}
