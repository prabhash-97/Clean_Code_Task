class Plane {

    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity) 
	{
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    GetModel() 
	{
        return this.model;
    }

    GetMS() 
	{
        return this.maxSpeed;
    }

    GetMaxFlightDistance() 
	{
        return this.maxFlightDistance;
    }

    GetMinLoadCapacity() 
	{
     let result = this.maxLoadCapacity;
     return result;
    }
}

module.exports = Plane;
