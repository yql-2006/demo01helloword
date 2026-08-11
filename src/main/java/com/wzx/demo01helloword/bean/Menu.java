package com.wzx.demo01helloword.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Menu {
    private String mid;
    private String name;
    private String url;
}
