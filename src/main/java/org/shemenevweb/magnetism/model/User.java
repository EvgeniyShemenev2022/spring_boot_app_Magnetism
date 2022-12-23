package org.shemenevweb.magnetism.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String email;

}
