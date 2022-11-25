//package com.example.carrental.model;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//public class Rent {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private User user;
//    private Car car;
//    private LocalDate rentDate;
//    private LocalDate returnDate;
//    private BigDecimal price;
//    private String notes;
//
//    public Rent(User user, Car car, LocalDate rentDate, LocalDate returnDate, BigDecimal price, String notes) {
//        this.user = user;
//        this.car = car;
//        this.rentDate = rentDate;
//        this.returnDate = returnDate;
//        this.price = price;
//        this.notes = notes;
//    }
//}
