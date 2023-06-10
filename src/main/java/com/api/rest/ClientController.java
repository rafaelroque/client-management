package com.api.rest;

import com.api.domain.Client;
import com.api.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
      return ResponseEntity.ok(clientService.findAll());
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client client){
        return ResponseEntity.ok(clientService.save(client));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id,@RequestBody Client client){
        Client toUpdate = clientService.findOne(id).get();
        if(null != client.getAddress()){
            toUpdate.setAddress(client.getAddress());
        }
        if(null != client.getName()){
            toUpdate.setName(client.getName());
        }
        return ResponseEntity.ok(clientService.save(toUpdate));
    }


}
