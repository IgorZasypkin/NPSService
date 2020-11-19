public class Main {
    public static void main(String[] args) {
        NPSService npsService = new NPSService();

        int[] votes = {1,9,10,8,7,10,10};


        double nps = npsService.nps(votes);


        System.out.println(nps);

    }
}
