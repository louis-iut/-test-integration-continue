package fr.iut.iem.marvelcomics.data.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Guillaume Colletaz on 05/12/2017.
 */

public class Comics {

    private int id;
    private String title;
    private Date date;
    private int pageCount;
    private String image;
    private String description;
    private String diamondCode;
    private float price;
    private List<Creator> creatorList;

    public Comics(int id, String title, Date date, int pageCount, String image, String description, String diamondCode, float price, List<Creator> creatorList) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.pageCount = pageCount;
        this.image = image;
        this.description = description;
        this.diamondCode = diamondCode;
        this.price = price;
        this.creatorList = creatorList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Creator> getCreatorList() {
        return creatorList;
    }

    public void setCreatorList(List<Creator> creatorList) {
        this.creatorList = creatorList;
    }
}
