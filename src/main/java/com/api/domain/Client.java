package com.api.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_client")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

}
