package com.spring.bootcamp.domain;

import lombok.*;

/**
 * @author minseok.kwon@nhnent.com
 * @since 2018-04-24
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String id;
    public String name;
    public String password;
}