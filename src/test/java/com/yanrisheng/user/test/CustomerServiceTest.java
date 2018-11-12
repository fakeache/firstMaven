package com.yanrisheng.user.test;

import com.yanrisheng.user.model.Customer;
import com.yanrisheng.user.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){
        // TODO init database
    }

    @Test
    public void getCustomerListTest(){
        List<Customer> list = customerService.getCustomerList();
        Assert.assertEquals(2, list.size());
    }
}
