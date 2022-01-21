/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import connexion.Connexion;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class Test {
    public static void main(String[] args) {

		try {
			
			String createTableSection = "create table section ("
					+ "id int primary key auto_increment,"
					+ "code varchar(20));";
			String createTablePlace = "create table place ("
					+ "id int primary key auto_increment,"
					+ "numero varchar(20),"
					+ "etat boolean,"
					+ "type varchar(20),"
					+ "idsection int ,"
			        + "foreign key (idsection) references section (id));";
					
			String createTableOccupation = "create table occupation ("
					+ "id int primary key auto_increment ,"
					+ "id_propr varchar(50),"
					+ "nom varchar(20),"
					+ "type varchar(30),"
					+ "matricule varchar(20),"
					+ "idplace int ,"
					+ "foreign key (idplace) references place (id));";
			
			Statement  st = Connexion.getConnection().createStatement();
			st.executeUpdate("drop table if exists section");
			st.executeUpdate("drop table if exists place");
			st.executeUpdate("drop table if exists occupation");
			
			st.executeUpdate(createTableSection);
			st.executeUpdate(createTablePlace);
			st.executeUpdate(createTableOccupation);
			
			
			
			Connexion.getConnection().close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
}
