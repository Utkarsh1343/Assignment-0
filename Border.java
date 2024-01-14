public class Border {
    public static void bo(int[][] boundary, int w, double p) {
        for (int j = 0; j < w; j++) {
            for (int i = 0; i < 1000; i++) {
                Sensor cell = new Sensor();
                int k = cell.sense(p);
                boundary[j][i] = k;
            }
        }
    }
}

