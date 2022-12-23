package org.shemenevweb.magnetism.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Task {

    private Long id;
    private String text;
    private Long userId;
    private Date date;


}
