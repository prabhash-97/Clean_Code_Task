import Planes.experimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport 
{
    private List<? extends Plane> planes;

    public List<PassengerPlane> GetPasPl() 
    {
        List<? extends Plane> l = this.planes;
        List<PassengerPlane> x = new ArrayList<>();
        
        for (Plane p : l) 
        {
        	
        	if (p instanceof PassengerPlane) 
        	{
        		x.add((PassengerPlane) p);
        	}
        	
        }
        
        return x;
    }

    public List<MilitaryPlane> GetMilitaryPlanes()
    {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        
        for (Plane plane : planes)
        {
        	
            if (plane instanceof MilitaryPlane) 
            {
                militaryPlanes.add((MilitaryPlane) plane);
            } 
            
        } 
        
        return militaryPlanes;
    }

    public PassengerPlane GetPassengerPlaneWithMaxPassengersCapacity() 
    {
        List<PassengerPlane> passengerPlanes = GetPasPl();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        
        for (int i = 0; i < passengerPlanes.size(); i++) 
        {
        	
            if (passengerPlanes.get(i).GetPassengersCapacity() > planeWithMaxCapacity.GetPassengersCapacity()) 
            {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
            
        }

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> GetTransportMilitaryPlanes() 
    {
    	List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    	List<MilitaryPlane> militaryPlanes = GetMilitaryPlanes();
    	
    	for (int i = 0; i < militaryPlanes.size(); i++) 
    	{
    		MilitaryPlane plane = militaryPlanes.get(i);
    		
    		if (plane.getType() == MilitaryType.TRANSPORT) 
    		{
    			transportMilitaryPlanes.add(plane);
    		}
    	}
    	
    	return transportMilitaryPlanes;
    
    }

    public List<MilitaryPlane> GetBomberMilitaryPlanes() 
    {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = GetMilitaryPlanes();
        
        for (int i = 0; i < militaryPlanes.size(); i++) 
        {
            MilitaryPlane plane = militaryPlanes.get(i);
            
            if (plane.getType() == MilitaryType.BOMBER) 
            {
                bomberMilitaryPlanes.add(plane);
            }
            
        }
        
        return bomberMilitaryPlanes;

    }

    public List<experimentalPlane> GetExperimentalPlanes() 
    {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        
        for (Plane plane : planes) 
        {
        	
            if (plane instanceof experimentalPlane) 
            {
                experimentalPlanes.add((experimentalPlane) plane);
            }
            
        }
        
        return experimentalPlanes;
    }

    public Airport SortByMaxDistance() 
    {
        Collections.sort(planes, new Comparator<Plane>() 
        {
            public int compare(Plane o1, Plane o2) 
            {
                return o1.Get_Max_Flight_Distance() - o2.Get_Max_Flight_Distance();
            }
        });
        
        return this;
    }


    /**
     * Sorts by max speed
     * @return Airport
     */
    public Airport SortByMaxSpeed() 
    {
        Collections.sort(planes, new Comparator<Plane>() 
        {
            public int compare(Plane o1, Plane o2) 
            {
                return o1.getMS() - o2.getMS();
            }
        });
        
        return this;
    }

    public Airport SortByMaxLoadCapacity() 
    {
        Collections.sort(planes, new Comparator<Plane>() 
        {
            public int compare(Plane o1, Plane o2) 
            {
                return o1.GetMinLoadCapacity() - o2.GetMinLoadCapacity();
            }
        });
        
        return this;
    }

    public List<? extends Plane> GetPlanes() 
    {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) 
    {
        Iterator<? extends Plane> iterator = collection.iterator();
        
        while (iterator.hasNext()) 
        {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String ToString() 
    {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    //Constructor
    public Airport(List<? extends Plane> planes)
    {
        this.planes = planes;
    }

}
