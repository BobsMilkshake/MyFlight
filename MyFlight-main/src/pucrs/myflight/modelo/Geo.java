package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	public static final  double r = 6371;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public double distanciaEntrePontos(Geo geo1, Geo geo2){
		// confirmar se esta certo
		return 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((geo1.getLatitude() + geo2.getLatitude()) / 2), 2) + Math.pow(Math.sin((geo1.getLongitude() + geo2.getLongitude()) /2) , 2)));
		
	}
}
