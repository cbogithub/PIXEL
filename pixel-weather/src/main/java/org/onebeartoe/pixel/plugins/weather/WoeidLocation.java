
package org.onebeartoe.pixel.plugins.weather;

public class WoeidLocation 
{
    public String locationId;
    
    public String city;
    public String region;
    public String country;
    public String condition;
    public String temp;
    public String chill;
    public String humidity;
    public String imageUrl;
    public String htmlDescription;
    
    public WoeidLocation() 
    {
        
    }
    
    public String toQueryString()
    {
        return "w=" + locationId;
    }
    
    @Override
    public String toString()
    {
        StringBuilder buf = new StringBuilder();
        buf.append("Current Weather Conditions for:");
        buf.append(city);
        if( region != null && !region.trim().equals("") )
        {
            buf.append(", " + region);
        }
        buf.append(", " + condition);
        buf.append("\n");
        
        buf.append("Temperature: " + temp);
        buf.append("\n");
        
        buf.append("Condition: " + condition);
        buf.append("\n");
        
        buf.append("Humidity: " + humidity);
        buf.append("\n");
        
        buf.append("Wind Chill: " + chill);
        buf.append("\n");
        
        buf.append("Image: " + imageUrl);
        buf.append("\n");
        
        return buf.toString();
    }

}
