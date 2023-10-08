//Özgül BAYTEKİN- 220315005
package com.mycompany.e_commerce;



public class Product {
    private Product ordered_product;
    private String product_name;
    private String product_color;
    private String product_category;
    private int product_stock_info;
    private double product_weigth;
    private String product_description;
    ;
    
    public Product(String product_name,String product_color,String product_category,int product_stock_info,double product_weigth,String product_description){
        this.ordered_product=ordered_product;
        this.product_name=product_name;
        this.product_color=product_color;
        this.product_category=product_category;
        this.product_stock_info=product_stock_info;
        this.product_weigth=product_weigth;
        this.product_description=product_description;
        
    }
    
    

    public void reduceStocks(Product p1,int count){
        p1.product_stock_info-=count;
        
    }
    
    

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public double getProduct_weigth() {
        return product_weigth;
    }

    public void setProduct_weigth(double product_weigth) {
        this.product_weigth = product_weigth;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }


    public int getProduct_stock_info() {
        return product_stock_info;
    }

    public void setProduct_stock_info(int product_stock_info) {
        this.product_stock_info = product_stock_info;
    }
    
}
