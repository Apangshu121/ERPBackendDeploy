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
@Table(name = "employee_roles")
public class EmployeeRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String empId;
    private String roleId;
}
