package ch.ny.berufsbildner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ch.ny.person.Person;

@Entity
@Table(name = "berufsbildner")
public class Berufsbildner extends Person {

	public Berufsbildner() {
		super();
	}

	public Berufsbildner(long id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public Berufsbildner(String firstName, String lastName) {
		super(firstName, lastName);
	}

}
