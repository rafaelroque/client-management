package com.api.service;

import com.api.domain.Client;
import com.api.exception.ClienteNaoEncontradoException;
import com.api.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

     private final ClientRepository clientRepository;

     public List<Client> findAll(){
         return clientRepository.findAll();
     }

     public Client save(Client client){
         return clientRepository.save(client);
     }

     public Optional<Client> findOne(Long id){
         return Optional.ofNullable(clientRepository.findById(id)
                 .orElseThrow(() -> new ClienteNaoEncontradoException("Cliente nao encontrado com id:"+id)));
     }

}
