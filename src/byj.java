import java.util.ArrayList;

public final class byj
  implements bxg
{
  public final bxk a(bwz parambwz, String paramString)
  {
    paramString = bxj.b(paramString);
    if (paramString.size() != 2) {
      throw new bxh("Two string arguments are required.");
    }
    try
    {
      parambwz = new Integer(bxj.a((String)paramString.get(0), a).compareTo(bxj.a((String)paramString.get(1), a)));
      return new bxk(parambwz.toString(), 0);
    }
    catch (bxh parambwz)
    {
      throw new bxh(parambwz.getMessage(), parambwz);
    }
    catch (Exception parambwz)
    {
      throw new bxh("Two string arguments are required.", parambwz);
    }
  }
  
  public final String a()
  {
    return "compareTo";
  }
}

/* Location:
 * Qualified Name:     byj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */