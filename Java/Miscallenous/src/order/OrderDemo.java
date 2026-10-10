package order;

import java.util.HashSet;
import java.util.Set;

public class OrderDemo {

    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();

        orders.add(new Order(101, "Puja", 5000, OrderStatus.PLACED));
        orders.add(new Order(102, "Rahul", 7500, OrderStatus.CONFIRMED));
        orders.add(new Order(103, "Rucha", 6200, OrderStatus.SHIPPED));
        orders.add(new Order(104, "Amit", 8100, OrderStatus.DELIVERED));
        orders.add(new Order(105, "Neha", 3000, OrderStatus.CANCELLED));

        System.out.println("Order Details:");
      
        for (Order order : orders) {
        System.out.println(order);
        }
    }
}