package com.fedex.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class JmsController {

    @Autowired
    private JmsModel jmsModel;

    @GetMapping("/jmsdetails")
    public String getEmployeeByID() {
        System.out.println(jmsModel.getConfig().getJMS_USERNAME());
        return jmsModel.getConfig().toString();
    }


}