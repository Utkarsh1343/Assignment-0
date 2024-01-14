public class Border {

    public static void bo(int[][] boundary,int w, int y) {
        for(int j=0;j<w;j++)
        {
            for(int i=0;i<10;i++)
            {
                Sensor cell = new Sensor();
                int k = cell.sense(y);
                boundary[j][i] = k;
            }
        }

    }
}
