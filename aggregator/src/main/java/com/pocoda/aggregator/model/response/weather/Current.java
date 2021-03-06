package com.pocoda.aggregator.model.response.weather;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current{
    public double temp_c;
    public double temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public double pressure_mb;
    public double pressure_in;
    public int humidity;
    public int cloud;
    public double uv;
}
