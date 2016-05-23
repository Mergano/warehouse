/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mergano.core;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class AreaChart {

    public ChartPanel chartPanel;

    public ChartPanel getChart() {
        // create a dataset...
        final double[][] data = new double[][]{
            {34.0, 10.0, 2.0, 25.0, 53.0, 79.0, 27.0, 13.0, 34.0, 13.0, 5.0, 39.0, 69.0, 85.0, 55.0, 32.0, 48.0, 25.0, 53.0, 79.0, 27.0, 13.0, 34.0, 13.0, 0, 79.0, 27.0, 13.0, 34.0, 13.0,}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "May ", "Day ", data
        );
        // create the chart...
        final JFreeChart chart = createChart(dataset);
        chartPanel = new ChartPanel(chart);

        return chartPanel;
    }

    private JFreeChart createChart(final CategoryDataset dataset) {

        final JFreeChart chart = ChartFactory.createAreaChart(
                "Order statistic", // chart title
                "Days", // domain axis label
                "Order Average", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                false, // tooltips
                false // urls
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        // set the background color for the chart...
//        final StandardLegend legend = (StandardLegend) chart.getLegend();
        //      legend.setAnchor(StandardLegend.SOUTH);
        chart.setBackgroundPaint(Color.white);
        chart.setAntiAlias(true);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(0, 191, 165));
        plot.setForegroundAlpha(0.75f);
        plot.setBackgroundPaint(Color.white);

        plot.setDomainCrosshairVisible(false);
        plot.setRangeCrosshairVisible(false);
        // plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0)); // disable this
        plot.setDomainGridlinesVisible(false);
        plot.setDomainGridlinePaint(new Color(240, 240, 240));
        plot.setRangeGridlinesVisible(false);
        plot.setRangeGridlinePaint(new Color(240, 240, 240));
        plot.setDomainCrosshairPaint(Color.MAGENTA);
        plot.setRangeCrosshairPaint(Color.CYAN);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        domainAxis.setLowerMargin(0.0);
        domainAxis.setUpperMargin(0.0);
        domainAxis.addCategoryLabelToolTip("Type 1", "The first type.");
        domainAxis.addCategoryLabelToolTip("Type 2", "The second type.");
        domainAxis.addCategoryLabelToolTip("Type 3", "The third type.");

        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setLabelAngle(0 * Math.PI / 2.0);
        // OPTIONAL CUSTOMISATION COMPLETED.

        return chart;

    }
}
