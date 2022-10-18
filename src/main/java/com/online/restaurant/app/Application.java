package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import com.online.restaurant.dao.*;


import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer himanshi=new Customer();

        himanshi.setName("Himanshi");
        himanshi.setCity("Nagpur");
        himanshi.setAddress("New Nandanvan,Nagpur");
        himanshi.setState("Maharashtra");
        himanshi.setEmailId("abc@gmail.com");
        himanshi.setPhoneNumber("6483493758L");


        System.out.println("Name :"+ himanshi.getName());
        System.out.println("City :"+ himanshi.getCity());
        System.out.println("Address :"+ himanshi.getAddress());
        System.out.println("State :"+ himanshi.getState());
        System.out.println("Email Id:"+ himanshi.getEmailId());
        System.out.println("Phone:"+ himanshi.getPhoneNumber());




        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni Square Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");


        System.out.println("Vendor Details:");
        System.out.println("Name: "+ haldiram.getName());
        System.out.println("Address: "+ haldiram.getAddress());
        System.out.println("Category: "+ haldiram.getCategory());
        System.out.println("Phone: "+ haldiram.getPhoneNumber());
        System.out.println("Rating: "+ haldiram.getRating());
        System.out.println("State: "+ haldiram.getState());
        System.out.println("City: "+ haldiram.getCity());


        Order order = new Order();
        order .setCustomer(himanshi);
        order .setVendor(haldiram);
        order .setOrderDate(new Date());
        order .setDeliveryAddress("101,civil line nagpur");

        System.out.println("Order Details:");
        System.out.println("Odder Date: "+ order.getOrderDate());
        System.out.println("Order Delivery Address: "+ order.getDeliveryAddress());

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createTable();


        OrderDAO orderDAO = new OrderDAO();
        orderDAO.createTable();


        VendorDAO vendorDAO = new VendorDAO();
        vendorDAO.createTable();


        OrderMenuItemDAO orderMenuItemDAO = new OrderMenuItemDAO();
        orderMenuItemDAO.createTable();

        MenuItemDAO menuItemDAO = new MenuItemDAO();
        menuItemDAO.createTable();
    }

}
