package de.hska.domain;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.persistence.Id;


/**
 * @author alex
 *
 */
@PersistenceCapable
public class Teil implements Serializable {
	
	private static final long serialVersionUID = -7847686121890282705L;

	@Id
    private Long key;
    
    private Integer TeilNummer;
    
    private String TeilTyp;

    private String Bezeichnung;

    private Float LieferzeitInPerioden;

    private Float AbweichungInPerioden;

    private Float LieferkostenNormal;

    private Float LieferkostenEil;

    private Integer Sicherheitsbestand;
    
    public Teil(){};
   	
    public Teil(Integer teilNummer, String teilTyp, String bezeichnung,
			Float lieferzeitInPerioden, Float abweichungInPerioden,
			Float lieferkostenNormal, Float lieferkostenEil,
			Integer sicherheitsbestand) {
		super();
		TeilNummer = teilNummer;
		TeilTyp = teilTyp;
		Bezeichnung = bezeichnung;
		LieferzeitInPerioden = lieferzeitInPerioden;
		AbweichungInPerioden = abweichungInPerioden;
		LieferkostenNormal = lieferkostenNormal;
		LieferkostenEil = lieferkostenEil;
		Sicherheitsbestand = sicherheitsbestand;
	}

	public Integer getTeilNummer() {
		return TeilNummer;
	}

	public void setTeilNummer(Integer teilNummer) {
		TeilNummer = teilNummer;
	}

	public String getTeilTyp() {
		return TeilTyp;
	}

	public void setTeilTyp(String teilTyp) {
		TeilTyp = teilTyp;
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}

	public Float getLieferzeitInPerioden() {
		return LieferzeitInPerioden;
	}

	public void setLieferzeitInPerioden(Float lieferzeitInPerioden) {
		LieferzeitInPerioden = lieferzeitInPerioden;
	}

	public Float getAbweichungInPerioden() {
		return AbweichungInPerioden;
	}

	public void setAbweichungInPerioden(Float abweichungInPerioden) {
		AbweichungInPerioden = abweichungInPerioden;
	}

	public Float getLieferkostenNormal() {
		return LieferkostenNormal;
	}

	public void setLieferkostenNormal(Float lieferkostenNormal) {
		LieferkostenNormal = lieferkostenNormal;
	}

	public Float getLieferkostenEil() {
		return LieferkostenEil;
	}

	public void setLieferkostenEil(Float lieferkostenEil) {
		LieferkostenEil = lieferkostenEil;
	}

	public Integer getSicherheitsbestand() {
		return Sicherheitsbestand;
	}

	public void setSicherheitsbestand(Integer sicherheitsbestand) {
		Sicherheitsbestand = sicherheitsbestand;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public Long getKey() {
		return key;
	}
	

}
