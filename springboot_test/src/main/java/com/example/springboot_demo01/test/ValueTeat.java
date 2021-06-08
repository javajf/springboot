package com.example.springboot_demo01.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class ValueTeat {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(ValueTeat.class);
        logger.info("================>测试！！！");

        System.out.println(new BigDecimal(0.00007).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_FLOOR)+"%");
        System.out.println(new DecimalFormat("0.00").format(0.66)+"%");
    }
}
