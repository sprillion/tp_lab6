package com.matyuhin.tp_lab6.models;

import lombok.Data;

@Data
public class Response {

    public Codes codes;

    public Response(Codes codes){
        this.codes = codes;
    }
}
