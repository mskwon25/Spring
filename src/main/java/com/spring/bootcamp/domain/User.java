package com.spring.bootcamp.domain;

import lombok.Data;

/**
 * @author minseok.kwon@nhnent.com
 * @since 2018-04-24
 */
@Data
public class User {
    String id;
    String name;
    String password;
}