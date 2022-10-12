package com.online.restaurant;

import java.util.List;
import  java.util.Date;

public class Order {
    private long orderId; //orderNumber
    private double totalAmount;
    private Vendor vendor;// veeeeeendor detail
    private Customer customer;// Customer detail
    private String deliveryAddress;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<OrderMenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(List<OrderMenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    private List<OrderMenuItem> menuItem;
    private Date orderDate;
    private String orderStatus;

}
