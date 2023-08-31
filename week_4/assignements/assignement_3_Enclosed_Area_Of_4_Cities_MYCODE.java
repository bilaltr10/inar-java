package week_4.assignements;

public class assignement_3_Enclosed_Area_Of_4_Cities_MYCODE {
    public static void main(String[] args) {

        final double radiusOfEarth = 6371.01;

        double yOfAtlantaGeorgia = -84.3879824;
        double xOfAtlantaGeorgia = 33.7489954;

        double yOfOrlandoFlorida = -81.3792364999;
        double xOfOrlandoFlorida = 28.5383355;

        double yOfSavannahGeorgia = -81.09983419999998;
        double xOfSavannahGeorgia = 32.0835407;

        double yOfCharlotteNorthCaroline = -80.84312669999997;
        double xOfCharlotteNorthCaroline = 35.2270869;

      /*  xOfAtlantaGeorgia = Math.toRadians(xOfAtlantaGeorgia);
        yOfAtlantaGeorgia = Math.toRadians(yOfAtlantaGeorgia);
        xOfOrlandoFlorida = Math.toRadians(xOfOrlandoFlorida);
        yOfOrlandoFlorida = Math.toRadians(yOfOrlandoFlorida);
        xOfSavannahGeorgia = Math.toRadians(xOfSavannahGeorgia);
        yOfSavannahGeorgia = Math.toRadians(yOfSavannahGeorgia);
        xOfCharlotteNorthCaroline = Math.toRadians(xOfCharlotteNorthCaroline);
        yOfCharlotteNorthCaroline = Math.toRadians(yOfCharlotteNorthCaroline);
*/
        double distanceFromSavannahToCharlotte = radiusOfEarth * (Math.acos(((Math.sin(xOfSavannahGeorgia) * Math.sin(xOfCharlotteNorthCaroline)) + Math.cos(xOfSavannahGeorgia) * Math.cos(xOfCharlotteNorthCaroline) * Math.cos(yOfSavannahGeorgia - yOfCharlotteNorthCaroline))));
        double distanceFromSavannahToOrlando = radiusOfEarth * (Math.acos(((Math.sin(xOfSavannahGeorgia) * Math.sin(xOfOrlandoFlorida)) + Math.cos(xOfSavannahGeorgia) * Math.cos(xOfOrlandoFlorida) * Math.cos(yOfSavannahGeorgia - yOfOrlandoFlorida))));
        double distanceFromOrlandoToAtlanta = radiusOfEarth * (Math.acos(((Math.sin(xOfOrlandoFlorida) * Math.sin(xOfAtlantaGeorgia)) + Math.cos(xOfOrlandoFlorida) * Math.cos(xOfAtlantaGeorgia) * Math.cos(yOfOrlandoFlorida - yOfAtlantaGeorgia))));
        double distanceFromAtlantaToCharlotte = radiusOfEarth * (Math.acos(((Math.sin(xOfAtlantaGeorgia) * Math.sin(xOfCharlotteNorthCaroline)) + Math.cos(xOfAtlantaGeorgia) * Math.cos(xOfCharlotteNorthCaroline) * Math.cos(yOfAtlantaGeorgia - yOfCharlotteNorthCaroline))));
        double distanceFromSavannahToAtlanta = radiusOfEarth * (Math.acos(((Math.sin(xOfSavannahGeorgia) * Math.sin(xOfAtlantaGeorgia + Math.cos(xOfSavannahGeorgia) * Math.cos(xOfAtlantaGeorgia) * Math.cos(yOfSavannahGeorgia - yOfAtlantaGeorgia))))));

        double sideTotalOfSavannahOrlandoAtlanta = distanceFromSavannahToOrlando + distanceFromOrlandoToAtlanta + distanceFromSavannahToAtlanta;
        double sideTotalOfCharlotteAtlantaGeorgia = distanceFromSavannahToCharlotte + distanceFromAtlantaToCharlotte + distanceFromSavannahToAtlanta;

        System.out.println("First Triangle : Savannah-Orlando-Atlanta :" + sideTotalOfSavannahOrlandoAtlanta);
        System.out.println("Second Triangle Charlotte-Atlanta-Georgia : "+sideTotalOfCharlotteAtlantaGeorgia);
        double s1 = sideTotalOfSavannahOrlandoAtlanta / 2.0;
        double areaOfSavannahOrlandoAtlanta = Math.sqrt(s1 * (s1 - distanceFromSavannahToOrlando) * (s1 - distanceFromOrlandoToAtlanta) * (s1 - distanceFromSavannahToAtlanta));

        double s2 = sideTotalOfCharlotteAtlantaGeorgia / 2.0;
        double areaOfCharlotteAtlantaGeorgia = Math.sqrt(s2 * (s2 - distanceFromSavannahToCharlotte) * (s2 - distanceFromAtlantaToCharlotte) * (s2 - distanceFromSavannahToAtlanta));

           System.out.printf("Estimated area enclosed by these four cities : %f",(areaOfCharlotteAtlantaGeorgia+areaOfSavannahOrlandoAtlanta));


    }


}
