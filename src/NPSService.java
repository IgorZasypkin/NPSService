public class NPSService {
    public double nps(int[] votes) {
        int detractors = 0;
        int passives = 0; // passives not used
        int promoters = 0;

        for (int vote : votes) {
            if (vote<=6){
                detractors++;
            }
            if (vote >=9){
                promoters++;
            }
        }

        double nps = ((promoters *1. - detractors * 1.) * 100) / votes.length;
        return nps;

    }
}


