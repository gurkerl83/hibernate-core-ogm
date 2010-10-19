package org.hibernate.ogm.test.associations.onetoone;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Persister;
import org.hibernate.ogm.persister.OgmEntityPersister;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Emmanuel Bernard
 */
@Entity
@Persister(impl = OgmEntityPersister.class)
public class Husband {
	@Id
	@GeneratedValue(generator = "uuid") @GenericGenerator( name="uuid", strategy = "uuid2")
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	private String id;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	private String name;

	@OneToOne(fetch = FetchType.LAZY) @JoinColumn(name = "wife")
	public Wife getWife() { return wife; }
	public void setWife(Wife wife) { this.wife = wife; }
	private Wife wife;
}
