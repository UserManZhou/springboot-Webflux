package com.springboot.webflux.entity;

import lombok.*;
import org.omg.CORBA.INTERNAL;

import java.math.BigInteger;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private BigInteger money;

}
