package com.example.eurekaclient.request;

import lombok.Data;
import lombok.ToString;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

@Data
@ToString
public class MyRequest{

    private String data;
}
