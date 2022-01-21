/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connexion.Connexion;
import dao.IDao;
import entities.Place;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class PLaceService implements IDao<Place>{
     List<Place> places;

    public PLaceService() {
        places = new ArrayList<Place>();
    }

    @Override
    public boolean create(Place o) {
        try {
            String req = "insert into place values (null, ?,?,?,?)";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, o.getNumero());
            pr.setString(2, o.isEtat());
            pr.setString(3, o.getType());
           pr.setInt(4, o.getidSection());
            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Place o) {
        try {
            String req = "delete from place where id  = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : Erreur");
        }
        return false;
    }

    @Override
    public boolean update(Place o) {

        try {
            String req = "update place set numero = ? and etat = ?  and type = ? and idsection = ? where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, o.getNumero());
            pr.setString(2, o.isEtat());
            pr.setString(3, o.getType());
            pr.setInt(4, o.getidSection());
            pr.setInt(5, o.getId());
            if (pr.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void librer (int id){
        String sql = "update place set etat = false where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();       
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }

    }
        public void occupe (int id){
        String sql = "update place set etat = true where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();       
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }

    }

    @Override
    public Place findById(int id) {
        try {
            String req = "select * from place where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            SectionService gs = new SectionService();
            if (rs.next()) {
                return new Place(rs.getInt("id"), rs.getInt("numero"), rs.getString("etat"), rs.getNString("type"), rs.getInt("idsection"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Place> findAll() {
        List<Place> places = new ArrayList<Place>();
        try {
            String req = "select * from place";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = pr.executeQuery();
            SectionService gs = new SectionService();
            while (rs.next()) {
                places.add(new Place(rs.getInt("id"), rs.getInt("numero"), rs.getString("etat"), rs.getNString("type"), rs.getInt("idsection")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return places;
    }

}
