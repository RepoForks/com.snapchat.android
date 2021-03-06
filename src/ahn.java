import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.snapchat.android.database.schema.VerifiedDeviceSchema;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.AlertDialogUtils.YesNoOption;
import com.snapchat.android.util.AlertDialogUtils.a;

public final class ahn
  extends CursorAdapter
{
  private final Context a;
  private final String b;
  private final String c;
  private final ahn.a d;
  
  public ahn(Context paramContext, ahn.a parama)
  {
    super(paramContext, null, 0);
    a = paramContext;
    d = parama;
    c = a.getString(2131493557);
    b = a.getString(2131493556);
  }
  
  public final void bindView(final View paramView, final Context paramContext, Cursor paramCursor)
  {
    paramView = (ahn.b)paramView.getTag();
    paramContext = paramCursor.getString(VerifiedDeviceSchema.DEVICE_ID.getColumnNumber());
    a.setText(paramCursor.getString(VerifiedDeviceSchema.DEVICE_NAME.getColumnNumber()));
    b.setText(auv.a(null, 2131493551, new Object[] { atz.b(a, paramCursor.getLong(VerifiedDeviceSchema.LAST_LOGIN.getColumnNumber())) }));
    c.setVisibility(0);
    d.setVisibility(8);
    c.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AlertDialogUtils.a(ahn.a(ahn.this), ahn.b(ahn.this), ahn.c(ahn.this), new AlertDialogUtils.a()
        {
          public final void a(AlertDialogUtils.YesNoOption paramAnonymous2YesNoOption)
          {
            if (paramAnonymous2YesNoOption == AlertDialogUtils.YesNoOption.YES)
            {
              a.c.setVisibility(8);
              a.d.setVisibility(0);
              ahn.d(ahn.this).a(b);
            }
          }
        });
      }
    });
  }
  
  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    paramContext = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968776, paramViewGroup, false);
    paramContext.setTag(new ahn.b(paramContext));
    return paramContext;
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString);
  }
  
  static final class b
  {
    TextView a;
    TextView b;
    View c;
    View d;
    
    public b(View paramView)
    {
      a = ((TextView)paramView.findViewById(2131362823));
      b = ((TextView)paramView.findViewById(2131362824));
      c = paramView.findViewById(2131362825);
      d = paramView.findViewById(2131361918);
    }
  }
}

/* Location:
 * Qualified Name:     ahn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */