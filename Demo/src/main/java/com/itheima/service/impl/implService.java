package com.itheima.service.impl;

import com.itheima.dao.itemInt;
import com.itheima.domin.item;
import com.itheima.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class implService implements itemService {
    @Autowired
     private itemInt itemi;
    @Override
    public item find(int id) {
       return itemi.find(id);
    }
}
