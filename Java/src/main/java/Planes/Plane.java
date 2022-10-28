package Planes;

import java.util.Objects;

abstract public class Plane 
{
    String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) 
    {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String GetModel()
{
        return model;
    }

    public int GetMS()
    {
        return maxSpeed;
    }

    public int Get_Max_Flight_Distance() 
    {
        return maxFlightDistance;
    }

    public int GetMinLoadCapacity() 
    {
        int result = this.maxLoadCapacity;
        return result;
    }

    @Override
    public String ToString()
    {
        return "Plane{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean Equals(Object o) 
    {
        if (this == o) 
        {
        	return true;
        }
        if (!(o instanceof Plane)) 
        {
        	return false;
        }
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int HashCode()
    {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
