public class Car
{
    public string Mark { get; private set; }
    public string Model { get; private set; }
    public int Year { get; private set; } = -1;
    public string RegistrationNumber { get; set; } = "";

    public Car(string mark, string model)
    {
        Mark = mark;
        model = model;
    }

    public Car(string mark, string model, int year) : base(mark, model)
    {
        Year = year
    }

    public Car(string mark, string model, string registrationNumber) : base(mark, model)
    {
        RegistrationNumber = registrationNumber
    }

    public Car(string mark, string model, int year, string registrationNumber): base(mark, model, year)
    {
        RegistrationNumber = registrationNumber
    }
}
