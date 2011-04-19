/**
 * 
 */
package de.hska.server.oldcode;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


/**
 * @author alex
 *
 */
@PersistenceCapable
public class TeilJDOOLD {
	
    @SuppressWarnings("unused")
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
    
    @Persistent
    private Integer TeilNummer;
    
    @Persistent
    private String TeilTyp;

    @Persistent
    private String Bezeichnung;

    @Persistent
    private Float LieferzeitInPerioden;

	@Persistent
    private Float AbweichungInPerioden;

    @Persistent
    private Float LieferkostenNormal;

    @Persistent
    private Float LieferkostenEil;

    @Persistent
    private Integer Sicherheitsbestand;
   	
    public TeilJDOOLD(Integer teilNummer, String teilTyp, String bezeichnung,
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
	

}
