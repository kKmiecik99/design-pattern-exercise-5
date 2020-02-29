package main;

import model.Auction;
import model.AuctionService;
import model.Customer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer seller = new Customer("Jan Kowalski");
        Auction auction = new Auction().builder()
                .withItem("Coffee")
                .withSeller(seller)
                .withHighestBid(0)
                .withBuyer(null)
                .withDueDate(LocalDateTime.now().plusDays(2L))
                .withDescription(null)
                .build();
        System.out.println(auction.toString());

        AuctionService auctionService = AuctionService.getInstance();
        auctionService.bid(auction,new Customer("Anna Kowalik"),20);

        auctionService.bid(auction,new Customer("Krzysztof Adamowicz"),25);


        System.out.println("Auction with id: " + auction.getId()+ " finished. Highest bid: " + auction.getHighestBid() + " PLN.");
    }
}
