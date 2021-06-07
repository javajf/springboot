package com.example.springboot_demo01.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ValueTeat {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(0.06).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_FLOOR)+"%");
        System.out.println(new DecimalFormat("0.00").format(0.66)+"%");
    }
}
