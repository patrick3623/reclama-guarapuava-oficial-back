package br.edu.utfpr.reclamaguarapuava.model;

import br.edu.utfpr.reclamaguarapuava.util.EntityApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Carlos Henrique
 */
@Data
@Entity
@Table(name = "address")
@EqualsAndHashCode(callSuper = true)
public class Address extends EntityApplication {

    @Column(length = 10, nullable = false)
    private Integer number;

    @Column(length = 50, nullable = false)
    private String street;

    @ManyToOne
    private Neighborhood neighborhood;

}
