//Özgül BAYTEKİN - 220315005
package com.mycompany.e_commerce;



public class Order {
    private User_ecommerce orderer;
    private Product ordered_product;
    private CreditCard card;
    private Product [] ordered_products;
    private int ordered_product_number;
    
    public Order(User_ecommerce orderer, Product ordered_product, CreditCard card){
        this.orderer=orderer;
        this.ordered_product=ordered_product;
        this.card=card;
        this.ordered_products = new Product[10];
        this.ordered_product_number = 0;
    }    
        
    public void order(Product p1,User_ecommerce u1,int count){
        System.out.println("Remaining stock count: "+p1.getProduct_stock_info());
        u1.order_product(p1,count);
            
        }
    
    
        

    public Product[] getOrdered_products(){
        return ordered_products;
    }

    public void setOrdered_products(Product[] ordered_products) {
        this.ordered_products = ordered_products;
    }

    public int getOrdered_product_number() {
        return ordered_product_number;
    }

    public void setOrdered_product_number(int ordered_product_number) {
        this.ordered_product_number = ordered_product_number;
    }
    
    

    public User_ecommerce getOrderer() {
        return orderer;
    }

    public void setOrderer(User_ecommerce orderer) {
        this.orderer = orderer;
    }

    public Product getOrdered_product() {
        return ordered_product;
    }

    public void setOrdered_product(Product ordered_product) {
        this.ordered_product = ordered_product;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
     
    }


