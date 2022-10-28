package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class experimentalPlane extends Plane
{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) 
    {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel GetClassificationLevel()
    {
        return classificationLevel;
    }

    public void SetClassificationLevel(ClassificationLevel classificationLevel)
    {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean Equals(Object o) 
    {
        return super.equals(o);
    }

    @Override
    public int HashCode()
    {
        return super.hashCode();
    }

    @Override
    public String ToString() 
    {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
