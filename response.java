package com.example.springbootdemo.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@Setter
public class response {
    
    int code;
    String message;
    Object data;
    public response(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    
    public String getMessage() {
        return message;
    }
  
    public Object getData() {
        return data;
    }

}
