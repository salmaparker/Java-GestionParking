/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connexion.Connexion;
import dao.IDao;
import entities.Login;
import entities.Section;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class SectionService implements IDao<Section> {
      @Override
    public boolean create(Section o) {
        try {
            String req = "insert into section values (null, ?)";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            
            pr.setString(1, o.getCode());

            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(Section o) {
        try {
            String req = "delete from section where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Section o) {
        try {
            String req = "update section set code = ? where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setString(1, o.getCode());
            pr.setInt(2, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Section findById(int id) {
        try {
            String req = "select * from section where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new Section(rs.getInt("id"), rs.getString("code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Section> findAll() {
        List<Section> sections = new ArrayList<Section>();
        try {
            String req = "select * from section";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                sections.add(new Section(rs.getInt("id"), rs.getString("code")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sections;
    }

    public List<Section> findSectionByReference(String ref) {
        List<Section> sections = new ArrayList<Section>();

        String sql = "select * from section where reference =  ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ps.setString(1, ref);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sections.add(new Section(rs.getInt("id"), rs.getString("code")
                ));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return sections;
    }

    public List<String> findReference() {
        List<String> references = new ArrayList<String>();
        String sql = "select distinct(reference) as ref from section";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                references.add(rs.getString("reference"));
            }
        } catch (SQLException e) {
            System.out.println("findReference " + e.getMessage());
        }
        return references;
    }

    public String findById(Section section) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Login log  (String username,String password){
        
        try {
            String req = "select * from user where user=? and password=? ";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setString(1,username);
            pr.setString(2, password);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new Login(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
       
        }
}
