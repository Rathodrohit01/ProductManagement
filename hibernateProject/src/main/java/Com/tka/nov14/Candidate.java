package Com.tka.nov14;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="election" , schema="advjava193" )
public class Candidate {
	
	@Id
	private int cid;
	private String name;
	private String partyname;
	private String assembly;
	private String statename;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int cid, String name, String partyname, String assembly, String statename, String gender,
			int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.partyname = partyname;
		this.assembly = assembly;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", partyname=" + partyname + ", assembly=" + assembly + "]";
	}


}
