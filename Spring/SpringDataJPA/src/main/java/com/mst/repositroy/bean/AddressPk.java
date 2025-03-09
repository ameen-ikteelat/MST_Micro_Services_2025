package com.mst.repositroy.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Embeddable
public class AddressPk implements Serializable {
    @Column(name="City")
    private String CityName;
    @Column(name="Code")
    private String CityCode;


}
