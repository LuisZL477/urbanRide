package com.example.urban_ride.utils;

public class Endpoints {

    public static final String registro_usuario="https://urbanrideapp.com/api//registrousuario.php";

    public static final String registro_viaje= "https://urbanrideapp.com/api/registroviaje.php";

    public static final String url_precios = "https://urbanrideapp.com/api/precios2dev.php?distr={distr}&distc={distc}&tiempor={tiempor]&tiempoc=&hora={hora]";

    final String url_distance = "https://maps.googleapis.com/maps/api/distancematrix/json?origins={origin}&destinations={destination}&departure_time=now&mode=driving&key={key}";

    public static final String url_directions = "https://maps.googleapis.com/maps/api/directions/json?{params}";

    public static final String url_terms = "http://urbanrideapp.com/legal/TerminosURBANRIDEv5.pdf";


}
