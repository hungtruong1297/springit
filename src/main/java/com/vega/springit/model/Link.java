package com.vega.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor // Spring requires constructor with no argument. Lombok helps this with annotation.
@Data // Spring requires setter, getter class. Lombok helps this with annotation.
public class Link extends Auditable {

    @Id // For Springboot to scan @Entity, then it needs @Id for field.
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    //comments
    // When user clicks in a link, it contains many comments. So we should map a link to many comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

}
