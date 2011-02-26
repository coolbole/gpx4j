package org.casaca.gpx4j.core.data;

public class Bounds extends BaseObject {
	private Double minLatitude;
	private Double minLongitude;
	private Double maxLatitude;
	private Double maxLongitude;
	
	public Bounds(Double minLatitude, Double minLongitude, Double maxLatitude,Double maxLongitude) throws IllegalArgumentException{
		if(this.minLatitude == null || this.minLongitude == null || this.maxLatitude == null || this.maxLongitude == null)
			throw new IllegalArgumentException("Error creating bounds. Latitudes and longitudes must not be null");
		
		this.minLatitude = minLatitude;
		this.minLongitude = minLongitude;
		this.maxLatitude = maxLatitude;
		this.maxLongitude = maxLongitude;
	}

	public Double getMinLatitude() {
		return minLatitude;
	}

	public Double getMinLongitude() {
		return minLongitude;
	}

	public Double getMaxLatitude() {
		return maxLatitude;
	}

	public Double getMaxLongitude() {
		return maxLongitude;
	}
}
