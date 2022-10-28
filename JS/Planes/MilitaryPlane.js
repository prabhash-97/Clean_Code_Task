const Plane = require('./Plane');

class MilitaryPlane extends Plane 
{

    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity, militaryType) 
	{
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;

    }

    GetMilitaryType() 
	{
        return this.militaryType;
    }
}

module.exports = MilitaryPlane;