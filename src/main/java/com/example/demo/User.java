package com.example.demo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int id;
    private String name;
    private boolean isOnline;

}
