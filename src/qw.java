import android.content.Context;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.api2.cash.ScCashResponsePayload.Status;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType;
import com.snapchat.android.util.eventbus.ShowDialogEvent.a;
import com.squareup.otto.Bus;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public final class qw
{
  public static void a(int paramInt, Object... paramVarArgs)
  {
    AndroidNotificationManager.a().a(SnapchatApplication.b(), paramInt, paramVarArgs);
  }
  
  public static void a(@chd CashTransaction paramCashTransaction, @chc ScCashResponsePayload.Status paramStatus)
  {
    AndroidNotificationManager localAndroidNotificationManager = AndroidNotificationManager.a();
    SnapchatApplication localSnapchatApplication = SnapchatApplication.b();
    switch (paramStatus)
    {
    }
    for (;;)
    {
      localAndroidNotificationManager.a(localSnapchatApplication, 2131493287, new Object[0]);
      return;
      paramCashTransaction = bbo.a();
      paramStatus = new ShowDialogEvent.a(ShowDialogEvent.DialogType.ONE_BUTTON);
      mTitleResId = 2131493008;
      mMessageResId = 2131493007;
      paramCashTransaction.a(paramStatus.a());
      return;
      paramCashTransaction = bbo.a();
      paramStatus = new ShowDialogEvent.a(ShowDialogEvent.DialogType.ONE_BUTTON);
      mTitleResId = 2131493582;
      mMessageResId = 2131493581;
      paramCashTransaction.a(paramStatus.a());
      return;
      localAndroidNotificationManager.a(localSnapchatApplication, 2131493289, new Object[0]);
      return;
      localAndroidNotificationManager.b(localSnapchatApplication, localSnapchatApplication.getString(2131493284, new Object[] { mRecipientUsername }));
      return;
      bbo.a().a(new ShowDialogEvent(ShowDialogEvent.DialogType.TOAST, 2131493250));
    }
  }
}

/* Location:
 * Qualified Name:     qw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */