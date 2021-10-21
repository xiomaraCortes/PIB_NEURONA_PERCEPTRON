package com.example.demo.adapter.facade;

import com.example.demo.service.PIBService;
import com.example.demo.service.model.request.PIBRequestDTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NetworkFacade {


    final static Logger logger = Logger.getLogger(NetworkFacade.class);

    private PIBService pibService;

    @Autowired
    public NetworkFacade(PIBService pibService) {
    	this.pibService = pibService;
    }

    @Async
    public Object executeGetPib(PIBRequestDTO networkRequestDTO){
         return this.pibService.executeNetworkMultiLayer(networkRequestDTO);
    }
}
