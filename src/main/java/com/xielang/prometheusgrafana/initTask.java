package com.xielang.prometheusgrafana;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

//希望这个方法在应用启动时执行，可以在启动类中添加一个方法，使用@PostConstruct注解，如下所示：
@Component
public class initTask  {
    @PostConstruct
    public void init() {
        ArrayList<Object> list = new ArrayList<>();
        while (true) {
            //不停地往集合里面添加
            //list.add(new Object());
            System.out.println("list.size() = " + list.size());
        }
    }

}
