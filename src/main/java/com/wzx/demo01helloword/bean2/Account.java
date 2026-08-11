package com.wzx.demo01helloword.bean2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Account { //Account-->account
    private String id; //id-->id
    private String name;//name-->name
    private Double value;//value-->value
}