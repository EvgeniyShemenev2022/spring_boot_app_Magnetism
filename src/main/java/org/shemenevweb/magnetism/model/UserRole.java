package org.shemenevweb.magnetism.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserRole {

    private Long id;
    private Long userId;
    private Long roleId;


}
