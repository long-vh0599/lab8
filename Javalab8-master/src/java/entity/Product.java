package entity;

import java.util.Date;

/**
 *
 * @author ThanDieu
 */
public class Product {

    private int productID;
    private String name;
    private float price;
    private String description;
    private Date lastUpdate;
    private int categoryID;
    private String image;
    private String thumbImage;
    private String descriptionDetail;

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getImage() {
        return image;
    }

    public String getThumbImage() {
        return thumbImage;
    }

    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setThumbImage(String thumbImage) {
        this.thumbImage = thumbImage;
    }

    public void setDescriptionDetail(String descriptionDetail) {
        this.descriptionDetail = descriptionDetail;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

}
