package com.wzx.demo01helloword.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name="account")
public class Account { //Account-->account
    @Id
    private String id; //id-->id
    private String name;//name-->name
    private Double value;//value-->value
}