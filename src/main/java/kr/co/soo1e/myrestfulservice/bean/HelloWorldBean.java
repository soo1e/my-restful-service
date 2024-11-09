package kr.co.soo1e.myrestfulservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class HelloWorldBean {
    private final String message;
}