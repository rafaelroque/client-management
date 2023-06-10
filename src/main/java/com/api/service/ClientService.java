package com.api.service;

import com.api.domain.Client;
import com.api.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

     private final ClientRepository clientRepository;

     public List<Client> findAll(){
         return clientRepository.findAll();
     }

}
