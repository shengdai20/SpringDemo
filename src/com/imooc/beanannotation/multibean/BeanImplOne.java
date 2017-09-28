package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order对list有效，对map无效
@Order(value = 2)
@Component
public class BeanImplOne implements BeanInterface{

}
