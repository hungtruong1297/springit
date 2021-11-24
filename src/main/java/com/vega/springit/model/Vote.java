package com.vega.springit.model;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor // Spring requires constructor with no argument. Lombok helps this with annotation.
@Data // Spring requires setter, getter class. Lombok helps this with annotation.
public class Vote {

    @Id // For Springboot to scan @Entity, then it needs @Id for field.
    @GeneratedValue
    private long id;
    private int vote;

}
