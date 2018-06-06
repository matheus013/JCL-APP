package br.ufal.laccan.app;

import android.app.Activity;
import android.graphics.DashPathEffect;
import android.os.Bundle;

import com.androidplot.util.PixelUtils;
import com.androidplot.xy.CatmullRomInterpolator;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYGraphWidget;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.List;

import implementations.dm_kernel.user.JCL_FacadeImpl;
import interfaces.kernel.JCL_facade;
import interfaces.kernel.JCL_result;
import laccan.devices.Sample;
import laccan.lang.Lang;

/**
 * A simple XYPlot
 */
public class Ploter extends Activity {

    private XYPlot plot;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_xy_plot_example);

        plot = (XYPlot) findViewById(R.id.plot);

        final Number[] domainLabels = new Number[100];
        Number[] series1Numbers = new Number[100];

        JCL_facade jcl = JCL_FacadeImpl.getInstance();
        JCL_result result = null;
        if (jcl.containsGlobalVar(Lang.RESULT)) {
            result = jcl.getValue(Lang.RESULT);
        }

        List<Sample> list = null;
        if (result != null) {
            list = (List<Sample>) result.getCorrectResult();
        }
        for (int i = 0; i < list.size(); i++) {
            domainLabels[i] = list.get(i).getDate();
            series1Numbers[i] = list.get(i).getTemperature();
        }
        XYSeries series = new SimpleXYSeries(
                Arrays.asList(series1Numbers), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Series");

        LineAndPointFormatter series1Format =
                new LineAndPointFormatter(this, R.xml.line_point_formatter_with_labels);

        LineAndPointFormatter series2Format =
                new LineAndPointFormatter(this, R.xml.line_point_formatter_with_labels_2);

        series2Format.getLinePaint().setPathEffect(new DashPathEffect(new float[]{PixelUtils.dpToPix(20),
                PixelUtils.dpToPix(15)}, 0));

        series1Format.setInterpolationParams(
                new CatmullRomInterpolator.Params(10, CatmullRomInterpolator.Type.Centripetal));

        series2Format.setInterpolationParams(
                new CatmullRomInterpolator.Params(10, CatmullRomInterpolator.Type.Centripetal));

        plot.addSeries(series, series1Format);

        plot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).setFormat(new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                int i = Math.round(((Number) obj).floatValue());
                return toAppendTo.append(domainLabels[i]);
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        });
    }
}