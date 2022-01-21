/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import service.SectionService;

/**
 *
 * @author dell
 */
public class TestSection {
     public static void main(String[] args) {
      
        SectionService ss = new SectionService();
       ss.log("admin", "admin");
        System.out.println(ss.log("admin", "admin").getUsername());
    }
}
