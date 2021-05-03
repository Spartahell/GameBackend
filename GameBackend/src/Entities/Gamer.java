package Entities;
import Abstract.Entity;

public class Gamer implements Entity {
	private int id ;
	private String firstName;
	private String lastName ;
	private String userName ;
	private String citizenId;
	private String dateOfBirth;
	private Game[] games ;
	public Gamer(int id, String firstName, String lastName, String userName, String citizenId, String dateOfBirth,
			Game[] games) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.citizenId = citizenId;
		this.dateOfBirth = dateOfBirth;
		this.games = games;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Game[] getGames() {
		return games;
	}
	public void setGames(Game[] games) {
		this.games = games;
	}
		
}
