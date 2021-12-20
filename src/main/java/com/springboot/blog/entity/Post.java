package com.springboot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "posts",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"lckrid"})}
)
public class Post {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name  = "lckrid", nullable = false)
    private String lckrid;


    @Column(name  = "lckrcod", nullable = false)
    private String lckrcod;


    @Column(name  = "lckrnam", nullable = false)
    private  String lckrnam;

    @Column(name  = "vencod", nullable = false)
    private  String vencod;

    @Column(name  = "brandcod", nullable = false)
    private  String brandcod;

    @Column(name  = "numofdrwr", nullable = false)
    private  String numofdrwr;

    @Column(name  = "lckrdes", nullable = false)
    private  String lckrdes;

    @Column(name  = "remarks", nullable = false)
    private  String remarks;

    @Column(name  = "oprstamp", nullable = false)
    private  String oprstamp;

    @Column(name  = "oprtimstamp", nullable = false)
    private  String oprtimstamp;

    @Column(name  = "updstamp", nullable = false)
    private  String updstamp;

    @Column(name  = "updtimstamp", nullable = false)
    private  String updtimstamp;

    @Column(name  = "actflg", nullable = false)
    private  String actflg;

    @Column(name  = "bokflg", nullable = false)
    private  String bokflg;

    @Column(name  = "appflg", nullable = false)
    private  String appflg;

    @Column(name  = "appstamp", nullable = false)
    private  String appstamp;

    @Column(name  = "apptimstamp", nullable = false)
    private  String apptimstamp;

}
