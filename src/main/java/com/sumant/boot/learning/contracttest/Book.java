package com.sumant.boot.learning.contracttest;

import lombok.Builder;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

@Data
@Builder
public class Book {
    String name;
    int value;
}
