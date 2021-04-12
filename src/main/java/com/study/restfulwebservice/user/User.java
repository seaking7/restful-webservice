package com.study.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password", "ssn"})
//@JsonFilter("UserInfo")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2, message="Name은 2글자 이상 입력해주세요")
    private String name;

    @Past
    private Date JoinDate;

   // @JsonIgnore
    private String password;

   // @JsonIgnore
    private String ssn;
}
