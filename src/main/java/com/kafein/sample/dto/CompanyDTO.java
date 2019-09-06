package com.kafein.sample.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CompanyDTO {

    private long id;
    private String name;
    private String foundedYear;


}
