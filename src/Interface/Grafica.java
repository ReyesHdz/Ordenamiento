/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author xoxo
 */
public class Grafica 
{
    private JFreeChart graficax;
    private XYSeriesCollection series;
    private String nombre,Comparaciones_X,Tiempo_Y;
    public Grafica(String nombre,String ty,String tx) 
    {
        this.graficax = null;
        this.series = new XYSeriesCollection();
        this.nombre = nombre;
        this.Comparaciones_X = tx;
        this.Tiempo_Y = ty;
    }
    
    public Grafica() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void agregarSerie (ArrayList<Double> datosSerie, String nombreSerie)
    {       
        XYSeries serie = new XYSeries(nombreSerie);// instanciamos la serie
        for (int x = 0 ; x < datosSerie.size();x++)// recorrer los datos 
        {
            serie.add(x, datosSerie.get(x));
        }
        this.series.addSeries(serie);
    }
    
    public void creaYmuestraGrafica()
    {    
        this.graficax = ChartFactory.createXYLineChart(nombre, Comparaciones_X, Tiempo_Y, series);
        ChartFrame panel = new ChartFrame("grafica",graficax);
        panel.pack();
        panel.setVisible(true);
    } 
}