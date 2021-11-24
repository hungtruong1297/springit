package com.vega.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@NoArgsConstructor // Spring requires constructor with no argument. Lombok helps this with annotation.
@Data // Spring requires setter, getter class. Lombok helps this with annotation.
public class Comment extends Auditable {


    @Id // For Springboot to scan @Entity, then it needs @Id for field.
    @GeneratedValue
    private Long id;
    private String body;

    //link
    @ManyToOne
    Link link = new Link();

}
