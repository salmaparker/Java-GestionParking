/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author dell
 */
public class Section {
     private int id;
    private String code;
   

    public Section(int id,  String code) {
        super();
        this.id = id;
        this.code = code;

    }

    public Section( String code) {
        super();
        this.code = code;

    }
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	


	@Override
	public String toString() {
		return "Section [id=" + id + ", code=" + code + "]";
	}
}
