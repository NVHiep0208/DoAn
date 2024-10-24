package com.doantotnghiep.demo.dto.request.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddProductRequest {
//    private Long id;
    private String name;
    private Long price;
    private String description; //mo ta dai
    private String manufacturer; //mo ta ngan
    private String image;
    private Integer gender;
    private Integer branch;
    private Integer style;
    private Integer color;
    private Integer material;
    private Integer technology;

    private List<AddSizeRequest> listSize;
}
