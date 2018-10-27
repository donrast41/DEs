import javafx.scene.chart.XYChart;

class IEuler {
    public static XYChart.Series ieuler(double x0, double y0, double x, double N) {
        double currX = x0;
        double currY = y0;
        XYChart.Series ser = new XYChart.Series();
        double n = Math.abs(x - x0) / N;
        ser.getData().add(new XYChart.Data<>(currX, currY));

        double val;
        double tempo;

        //graph and improved euler method
        while (currX <= x) {

            tempo = Variant.funct(currX,currY);
            val = n*Variant.funct(currX+n/2, currY+ n*tempo/2);
            currX += n;
            currY += val;

            ser.getData().add(new XYChart.Data<>(currX, currY));
        }

        return ser;
    }
}