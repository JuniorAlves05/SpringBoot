package br.com.junior.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                            // Informa que a classe representa a uma tabela do banco de dados //
@Table ( name = "person")         // Informa o nome da tabela no banco de dados, podendo alterar o nome //
public class Person implements Serializable {
	
	private static final long serialLVersionUID =1L;
	
	@Id                                                 // Informa que para cada cadastro vai ter um ID //
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Informa que vai gerar um Id diferente //
	private Long id;
	
	@Column(name = "first_name", nullable = false,length = 80)	 
	private String firstName;
	
	// O Column informa que vai ter uma coluna com essa função //
	// nullable usa para garantir que o nome nao seja nulo //
	
	@Column(name = "last_name",nullable = false, length =80) 
	private String lastName;
	
	// O length informa a quantidade de caracteres que vai ser usado no banco //

	
	@Column (nullable = false,length= 100)
	private String address;		
	
	// O Column com o name e usado apenas quando se tem nomes diferentes//
	
	@Column (nullable = false,length=6)
	private String gender;
	
	
	public Person() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, firstName, gender, id, lastName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}

}
