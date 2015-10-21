/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramDisplay extends ApplicationFrame {
    
   public HistogramDisplay(){
       super("Histograma");
       setContentPane(createPanel());
       pack();
   }
      
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 450));
        return chartPanel;
   }
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(null,
                "Dominios",
                "Nº emails",
                dataset,
                PlotOrientation.HORIZONTAL,
                true,
                true,
                false);
        return chart;
    }
     private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(10, "Enero", "gmail.com");
        dataset.addValue(6, "Febrero", "gmail.com");
        dataset.addValue(4, "Marzo", "gmail.com");
        dataset.addValue(7, "Enero", "ulpgc.es");
        dataset.addValue(5, "Febrero", "ulpgc.es");
        dataset.addValue(9, "Marzo", "ulpgc.es");
        dataset.addValue(12, "Enero", "ull.com");
        dataset.addValue(7, "Febrero", "ull.com");
        dataset.addValue(9, "Marzo", "ull.com");
        dataset.addValue(12, "Enero", "hotmail.com");
        dataset.addValue(8, "Febrero", "hotmail.com");
        dataset.addValue(4, "Marzo", "hotmail.com");
        return dataset;
    }
    public void execute (){
        setVisible(true);
    }
        
}

   