//Özgül BAYTEKİN - 220315005
package com.mycompany.e_commerce;

public class mainClass_eCommerce {
    public static void main(String[] args){
        
        User_ecommerce first_user=new User_ecommerce("ozgul1","ozgul","baytekin",12345,"ozgulbaytekin@outlook.com","15.04.2002" ,"Yalova","Manisa");
        //User_ecommerce second_user=new User_ecommerce("cemre","baytekin",54321,"cemrebaytekin@outlook.com","01.01.2008" ,"Yalova","İstanbul");
        System.out.println("Username: "+first_user.getUsername());
        System.out.println("User name: "+first_user.getName());
        System.out.println("User surname: "+first_user.getSurname());
        System.out.println("User email : "+first_user.getEmail());
        System.out.println("User birthday: "+first_user.getBirthday());
        System.out.println("Home adress: "+first_user.getHome_adress());
        System.out.println("Work adress :"+first_user.getWork_adress());
        
       CreditCard card1 = new CreditCard(first_user,1234567,123,"12/27");
       System.out.println("Card owner: "+first_user.getName()+first_user.getSurname());
       System.out.println("Card number: "+card1.getCard_number());
       
       Product product1 = new Product("computer","black","electrical device",300,2,"Has 2 years of guarantee");
       System.out.println("Product name: "+product1.getProduct_name());
       System.out.println("Product color: "+product1.getProduct_color());
       System.out.println("Product category: "+product1.getProduct_category());
       System.out.println("Product stock information: "+product1.getProduct_stock_info());
       System.out.println("Product weigth: "+product1.getProduct_weigth());
       System.out.println("Product description: "+product1.getProduct_description());
       
       Product product2 = new Product("phone","black","electrical device",100,2,"Has 2 years of guarantee");
       System.out.println("Product name: "+product2.getProduct_name());
       System.out.println("Product color: "+product2.getProduct_color());
       System.out.println("Product category: "+product2.getProduct_category());
       System.out.println("Product stock information: "+product2.getProduct_stock_info());
       System.out.println("Product weigth: "+product2.getProduct_weigth());
       System.out.println("Product description: "+product2.getProduct_description());
       
       Order transaction= new Order(first_user,product1,card1);
       
       
       first_user.add_user(first_user);
       card1.add_credit_card(card1);
       first_user.add_product(product1);
       first_user.add_product(product2);
       first_user.fav_product(product1);
       first_user.order_product(product1,2);
       transaction.order(product1, first_user, 3);
       
        
    }
    
}
