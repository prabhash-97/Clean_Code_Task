const PassengerPlane = require('./Planes/PassengerPlane');
const MilitaryPlane = require('./Planes/MilitaryPlane');
const MilitaryType = require('./models/militaryType');
const experimentalPlane = require('./Planes/experimentalPlane');

class Airport 
{

    GetPasPl() 
	 {
        let pl = this.planes;
        var x = [];
		
        for (let p of this.planes) 
		{
            if (p instanceof PassengerPlane) {x.push(p);}
        }
		
        return x;
    }

    GetMilitaryPlanes() 
	{
		
        let militaryPlanes = [];
		
        this.planes.forEach(plane => {
			
            if (plane instanceof MilitaryPlane) 
			{
                militaryPlanes.push(plane);
            }
			
        });
		
        return militaryPlanes;
    }

    GetPassengerPlaneWithMaxPassengersCapacity() 
	{
		
        let passengerPlanes = this.GetPasPl();
        let planeWithMaxCapacity = passengerPlanes[0];
		
        for (let i = 0; i < passengerPlanes.length; i++) 
		{
			
            if (passengerPlanes[i].GetPassengersCapacity() > planeWithMaxCapacity.GetPassengersCapacity()) 
			{
                planeWithMaxCapacity = passengerPlanes[i];
            }
			
        }
		
        return planeWithMaxCapacity;
    }

    GetTransportMilitaryPlanes()
	{
		
        let transportMilitaryPlanes = [];
        let militaryPlanes = this.GetMilitaryPlanes();
		
        for (let i = 0; i < militaryPlanes.length; i++) 
		{
			
			if (militaryPlanes[i].GetMilitaryType() == MilitaryType.TYPE_TRANSPORT) 
			{
				transportMilitaryPlanes.push(militaryPlanes[i]);
			}
			
        }
		
        return transportMilitaryPlanes;
    }

    getBomberMilitaryPlanes()
    {
        let bomberMilitaryPlanes = [];
        let militaryPlanes = this.GetMilitaryPlanes();
		
        for (let i = 0; i < militaryPlanes.length; i++) 
		{
			
            if (militaryPlanes[i].GetMilitaryType()=== MilitaryType.BOMBER) 
			{
                bomberMilitaryPlanes.push(militaryPlanes[i]);
            }
			
        }
		
        return bomberMilitaryPlanes;
    }

    constructor(planes)
	{
        this.planes = planes;
    }

    GetExperimentalPlanes() 
	{
        let experimentalPlanes  = [];
		
        this.planes.forEach(plane => 
		{
			
            if (plane instanceof experimentalPlane) 
			{
                experimentalPlanes.push(plane);
            }
			
        });

        return experimentalPlanes;
    }

    SortByMaxDistance()
	{
        this.planes.sort((a, b) => (a.GetMaxFlightDistance() > b.GetMaxFlightDistance()) ? 1 : -1);
        return this;
    }

    /**
     * Sorts by max speed
     * @return Airport
     */
    SortByMaxSpeed() 
	{
        this.planes.sort((a, b) => (a.GetMS() > b.GetMS()) ? 1 : -1);
        return this;
    }

    SortByMaxLoadCapacity() 
	{
        this.planes.sort((a, b) => (a.GetMinLoadCapacity() > b.GetMinLoadCapacity()) ? 1 : -1);
        return this;
    }

    GetPlanes() 
	{
        return this.planes;
    }

    static Print(planes) 
	{
        return JSON.stringify(planes);
    }
}

module.exports = Airport;
