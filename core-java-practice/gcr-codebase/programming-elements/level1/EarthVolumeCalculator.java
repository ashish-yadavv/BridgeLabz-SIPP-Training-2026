class EarthVolumeCalculator {
    public static void main(String[] args) {
        double earthRadiusKm = 6378;
        double pi = 3.141592653589793;
        double volumeKmCubic = (4.0 / 3.0) * pi * earthRadiusKm * earthRadiusKm * earthRadiusKm;
        double kmToMilesFactor = 0.621371;
        double earthRadiusMiles = earthRadiusKm * kmToMilesFactor;
        double volumeMilesCubic = (4.0 / 3.0) * pi * earthRadiusMiles * earthRadiusMiles * earthRadiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKmCubic + " and cubic miles is " + volumeMilesCubic);
    }
}
