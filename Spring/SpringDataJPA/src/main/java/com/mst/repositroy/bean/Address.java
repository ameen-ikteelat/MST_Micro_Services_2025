package com.mst.repositroy.bean;


import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Address {


    @EmbeddedId
    private AddressPk addressPk;
    private String state;
    private String country;

}
