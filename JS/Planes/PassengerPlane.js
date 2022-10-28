const Plane = require('./Plane');

class PassengerPlane extends Plane 
{

    //=================CONSTRUCTORS=================

    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity, passengersCapacity) 
	{
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    //=================METHODS=================
    GetPassengersCapacity()
	{
        return this.passengersCapacity;
    }

    // set passengersCapacity(value) {
    //     this._passengersCapacity = value;
    // }
}

module.exports = PassengerPlane;