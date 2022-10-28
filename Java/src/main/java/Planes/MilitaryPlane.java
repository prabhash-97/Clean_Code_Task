package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane
{

    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) 
    {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType GetType() 
    {
        return type;
    }

    @Override
    public String ToString() 
    {
        return super.toString().replace("}",", type=" + 
        		type +
                '}');
    }

    @Override
    public boolean Equals(Object o) 
    {
        if (this == o) 
        {
        		return true;
        }
        
        if (!(o instanceof MilitaryPlane)) 
        {
        	return false;
        }
        
        if (!super.equals(o)) 
        {
        	return false;
        }
        
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int HashCode() 
    {
        return Objects.hash(super.hashCode(), type);
    }
}
