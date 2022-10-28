const Plane = require('./Plane');

class experimentalPlane extends Plane
{

    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity, type, classificationLevel)  
	{
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
        this.type = type;
        this.classificationLevel = classificationLevel;
    }


    GetModel()
    {
        return this.model;
    }

    SetModel(value) 
	{
        this.model = value;
    }

    GetMaxSpeed()
	{
        return this.maxSpeed;
    }

    SetMaxSpeed(value) 
	{
        this.MaxSpeed = value;
    }

    GetMaxFlightDistance() 
	{
        return this.maxFlightDistance;
    }

    SetMaxFlightDistance(value) 
	{
        this.maxFlightDistance = value;
    }

    GetMaxLoadCapacity() 
	{
        return this.maxLoadCapacity;
    }

    set maxLoadCapacity(value) 
	{
        this.maxLoadCapacity = value;
    }

    GetType() 
	{
        return this.Type;
    }

    SetType(value) 
	{
        this.type = value;
    }

    GetClassificationLevel() 
	{
        return this.classificationLevel;
    }

    SetClassificationLevel(value) 
	{
        this.classificationLevel = value;
    }
}

module.exports = experimentalPlane