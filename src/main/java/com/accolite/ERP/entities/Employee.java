package com.accolite.ERP.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private String firstName;
    private String employeeId;
    @NonNull
    private String lastName;
    private long phoneNumber;
    private String location;
    private String gender;
    @NonNull
    private String emailId;
    private String currentBusinessUnit;

}
