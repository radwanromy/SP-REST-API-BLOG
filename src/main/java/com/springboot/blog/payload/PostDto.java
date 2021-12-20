package com.springboot.blog.payload;

import lombok.Data;

@Data

public class PostDto {
    private long id;
    private String lckrid;
    private String lckrcod;
    private String lckrnam;
    private String vencod;
    private String brandcod;
    private String numofdrwr;
    private String lckrdes;
    private String remarks;
    private String oprstamp;
    private String oprtimstamp;
    private String updstamp;
    private String updtimstamp;
    private String actflg;
    private String bokflg;
    private String appflg;
    private String appstamp;
    private String apptimstamp;


}
