/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Bravo
 */
public class SamplingSite {
    private int id;
    private String name;
    private int province_id;
    private int canton_id;
    private int district_id;
    private int entity_id;

    public SamplingSite() {
    }

    public SamplingSite(String name, int province_id, int canton_id, int district_id, int entity_id) {
        this.name = name;
        this.province_id = province_id;
        this.canton_id = canton_id;
        this.district_id = district_id;
        this.entity_id = entity_id;
    }

    public SamplingSite(int id, String name, int province_id, int canton_id, int district_id, int entity_id) {
        this.id = id;
        this.name = name;
        this.province_id = province_id;
        this.canton_id = canton_id;
        this.district_id = district_id;
        this.entity_id = entity_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getCanton_id() {
        return canton_id;
    }

    public void setCanton_id(int canton_id) {
        this.canton_id = canton_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public int getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(int entity_id) {
        this.entity_id = entity_id;
    }
    
}
