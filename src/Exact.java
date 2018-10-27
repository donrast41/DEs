import javafx.scene.chart.XYChart;

public class Exact {
    public static double function(double x) {
        double y;
        y = (4/(5*x*x*x*x*x - x)) + 2/x;
        return y;
    }

    public static XYChart.Series exact(double x0, double y0, double x, double N) {
        double currX = x0;
        double currY = y0;
        XYChart.Series ser = new XYChart.Series();
        double n = Math.abs(x - x0) / N;

        //calculation of exact solution and graph
        while (currX <= x) {
            ser.getData().add(new XYChart.Data<>(currX, currY));

            // exact solution
            currY = function(currX);
            currX += n;
        }
        return ser;
    }
}