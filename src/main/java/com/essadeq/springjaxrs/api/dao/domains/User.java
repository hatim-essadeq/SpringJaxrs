package com.essadeq.springjaxrs.api.dao.domains;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    long id;
    String name;
    String email;
    String pass;
    String phone;
}
