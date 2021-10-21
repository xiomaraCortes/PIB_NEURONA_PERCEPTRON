package com.example.demo.service;
import com.example.demo.service.model.request.PIBRequestDTO;
import com.example.demo.service.model.response.DataResponseDTO;
import com.example.demo.service.model.response.NetworkResponseDTO;
import com.example.demo.utils.Neurona;
import org.apache.log4j.Logger;

import org.springframework.stereotype.Service;

@Service
public class PIBService {
	
	final static Logger logger = Logger.getLogger(PIBService.class);

	public DataResponseDTO executeNetworkMultiLayer(PIBRequestDTO pibService)  {

		Neurona n = new Neurona(pibService.getYear());

		DataResponseDTO   dataResponseDTO= new DataResponseDTO( );
		NetworkResponseDTO networkResponseDTO = new NetworkResponseDTO(networkRequestDTO.getInput(), n.getWeight(), n.getTangent());
		dataResponseDTO.setData(networkResponseDTO);
		return dataResponseDTO;

	}
}