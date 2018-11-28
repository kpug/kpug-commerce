package com.kpug.commerce.user.domain.customer;

import com.kpug.commerce.user.util.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long id;

    @Column(name = "c_d_id")
    private Long d_id;

    @Column(name = "c_first")
    private String first;

    @Column(name = "c_last")
    private String last;

    @Column(name = "c_street_1")
    private String street_1;

    @Column(name = "c_street_2")
    private String street_2;

    @Column(name = "c_city")
    private String city;

    @Column(name = "c_phone")
    private String phone;

    @Column(name = "c_since")
    private LocalDateTime datetime;

    @Column(name = "c_credit")
    private String credit;
}
