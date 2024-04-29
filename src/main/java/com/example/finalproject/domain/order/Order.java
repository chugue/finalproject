package com.example.finalproject.domain.order;

import com.example.finalproject.domain.delivery.Delivery;
import com.example.finalproject.domain.orderHistory.OrderHistory;
import com.example.finalproject.domain.user.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Entity
@Table(name = "order_tb")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user; // 사용자 고유번호

    @ManyToOne
    private OrderHistory orderHistory; // 주문 상세 고유번호

    @OneToOne
    private Delivery delivery; // 배송 고유번호

    private Integer totalOrderAmount; // 주문 전체 금액

    private Double fee; // 주무 전체 수수료

    @CreationTimestamp
    private Timestamp orderDate; // 주문일자


    @Builder
    public Order(Integer id, User user, OrderHistory orderHistory, Delivery delivery, Integer totalOrderAmount, Timestamp orderDate) {
        this.id = id;
        this.user = user;
        this.orderHistory = orderHistory;
        this.delivery = delivery;
        this.totalOrderAmount = totalOrderAmount;
        this.orderDate = orderDate;
    }
}