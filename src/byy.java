import java.util.ArrayList;

public final class byy
  implements byh
{
  public final byl a(bya parambya, String paramString)
  {
    parambya = byk.a(paramString);
    if (parambya.size() != 2) {
      throw new byi("Two numeric arguments are required.");
    }
    try
    {
      parambya = new Double(Math.max(((Double)parambya.get(0)).doubleValue(), ((Double)parambya.get(1)).doubleValue()));
      return new byl(parambya.toString(), 0);
    }
    catch (Exception parambya)
    {
      throw new byi("Two numeric arguments are required.", parambya);
    }
  }
  
  public final String a()
  {
    return "max";
  }
}

/* Location:
 * Qualified Name:     byy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */