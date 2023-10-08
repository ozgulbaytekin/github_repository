//Özgül BAYTEKİN - 220315005
package com.mycompany.e_commerce;

public class CreditCard {
    private User_ecommerce owner;
    private int card_number;
    private int CVV;
    private String expiration_date;
    private CreditCard [] cards;
    private int card_count;
    
    public CreditCard(User_ecommerce owner, int card_number, int CVV, String expiration_date){
        this.owner=owner;
        this.card_number=card_number;
        this.CVV=CVV;
        this.expiration_date=expiration_date;
        this.cards = new CreditCard[10];
        this.card_count=0;
    }

    public User_ecommerce getOwner() {
        return owner;
    }

    public void setOwner(User_ecommerce owner) {
        this.owner = owner;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }
    
    public void add_credit_card(CreditCard card){
        if(cards.length>0){
            
            CreditCard temp4[]=cards;
            cards=new CreditCard[cards.length+1];
            for(int i=0;i<temp4.length;i++){
                 cards[i]=temp4[i];
            }
            this.cards[card_count]=card;
            this.card_count++;
            
        }
       else{
            cards[0]=card;
       }
        System.out.println("New card is added to the cards.");
    }


    
    
    
}
