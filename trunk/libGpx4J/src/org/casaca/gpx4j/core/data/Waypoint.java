package org.casaca.gpx4j.core.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Waypoint extends BaseObject {
	//POSITION INFO
	private Double elevation;
	private Calendar time;
	private Degrees magvar;
	private Double geoIdHeight;
	private Double latitude;
	private Double longitude;
	
	//DESCRIPTION INFO
	private String name;
	private String cmt;
	private String description;
	private String src;
	private List<Link> links;
	private String sym;
	private String type;
	
	//ACCURACY INFO
	private Fix fix;
	private Integer sat;
	private Double hdop;
	private Double vdop;
	private Double pdop;
	private Double ageOfDgpsData;
	private DgpsStation dGpsId;
	private Extensions extensions;
	
	public Waypoint(Double latitude, Double longitude) throws IllegalArgumentException{
		if(latitude == null || longitude == null) throw new IllegalArgumentException("Error creating waypoint. Latitude and longitude must not be null");
		
		this.elevation = null;
		this.time = null;
		this.magvar = null;
		this.geoIdHeight = null;
		this.latitude = latitude;
		this.longitude = longitude;
		
		this.name = null;
		this.cmt = null;
		this.description = null;
		this.src = null;
		this.links = new ArrayList<Link>();
		this.sym = null;
		this.type = null;
		
		this.fix = null;
		this.sat = null;
		this.hdop = null;
		this.vdop = null;
		this.pdop = null;
		this.ageOfDgpsData = null;
		this.dGpsId = null;
		this.extensions = new Extensions();
	}

	public Double getElevation() {
		return elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	public Calendar getTime() {
		return time;
	}

	public void setTime(Calendar time) {
		this.time = time;
	}

	public Degrees getMagvar() {
		return magvar;
	}

	public void setMagvar(Degrees magvar) {
		this.magvar = magvar;
	}

	public Double getGeoIdHeight() {
		return geoIdHeight;
	}

	public void setGeoIdHeight(Double geoIdHeight) {
		this.geoIdHeight = geoIdHeight;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void addLink(Link link){
		this.links.add(link);
	}

	public String getSym() {
		return sym;
	}

	public void setSym(String sym) {
		this.sym = sym;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Fix getFix() {
		return fix;
	}

	public void setFix(Fix fix) {
		this.fix = fix;
	}

	public Integer getSat() {
		return sat;
	}

	public void setSat(Integer sat) {
		this.sat = sat;
	}

	public Double getHdop() {
		return hdop;
	}

	public void setHdop(Double hdop) {
		this.hdop = hdop;
	}

	public Double getVdop() {
		return vdop;
	}

	public void setVdop(Double vdop) {
		this.vdop = vdop;
	}

	public Double getPdop() {
		return pdop;
	}

	public void setPdop(Double pdop) {
		this.pdop = pdop;
	}

	public Double getAgeOfDgpsData() {
		return ageOfDgpsData;
	}

	public void setAgeOfDgpsData(Double ageOfDgpsData) {
		this.ageOfDgpsData = ageOfDgpsData;
	}

	public DgpsStation getdGpsId() {
		return dGpsId;
	}

	public void setdGpsId(DgpsStation dGpsId) {
		this.dGpsId = dGpsId;
	}

	public Extensions getExtensions() {
		return extensions;
	}

	public void setExtensions(Extensions extensions) {
		this.extensions = extensions;
	}
}
