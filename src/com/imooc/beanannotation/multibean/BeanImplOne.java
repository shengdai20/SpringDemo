package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order��list��Ч����map��Ч
@Order(value = 2)
@Component
public class BeanImplOne implements BeanInterface{

}
