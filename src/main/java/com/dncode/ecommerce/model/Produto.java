package com.dncode.ecommerce.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto 
{
	@Id
	@EqualsAndHashCode.Include
	private Long codigo;
	private String nome;
	private String descricao;
	private BigDecimal preco;
}
