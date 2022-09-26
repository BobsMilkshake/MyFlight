package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	public static final  double r = 6371;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/**
	 * Retorna a latitude da localização
	 * @return a latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/**
	 * Retorna a longitude da localização
	 * @return a longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Calcula a distancia entre dois pontos
	 * @param geo1 ponto de partida
	 * @param geo2 ponto de chegada
	 * @return a distância entre os pontos
	 */
	public double distanciaEntrePontos(Geo geo1, Geo geo2){
		// confirmar se esta certo
		double lat1 = Math.toRadians(geo1.getLatitude());
		double lat2 = Math.toRadians(geo2.getLatitude());
		double lon1 = Math.toRadians(geo1.getLongitude());
		double lon2 = Math.toRadians(geo2.getLongitude());
		return 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((lat1 + lat2) / 2), 2)
						   + Math.pow(Math.sin((lon1 + lon2) /2) , 2)) * Math.cos(lat1) * Math.cos(lat2));
		
	}
}
