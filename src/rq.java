import com.snapchat.android.api2.cash.blockers.BlockerOrder;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.util.AlertDialogUtils.YesNoOption;
import com.snapchat.android.util.AlertDialogUtils.a;
import com.snapchat.android.util.CashUtils.1;
import com.snapchat.android.util.CashUtils.CurrencyCode;
import com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType;
import com.snapchat.android.util.eventbus.ShowDialogEvent.a;
import com.squareup.otto.Bus;
import java.util.List;
import java.util.Locale;

public final class rq
  extends rl
{
  public final void a(@chc CashTransaction paramCashTransaction)
  {
    final boolean bool = mFromRain;
    if (((!bool) && (!akr.aw())) || ((bool) && (!akr.ax())))
    {
      super.a(null, true);
      return;
    }
    Bus localBus = bbo.a();
    ShowDialogEvent.a locala = new ShowDialogEvent.a(ShowDialogEvent.DialogType.YES_NO_DONTASK_DIALOG);
    int j = mAmount;
    paramCashTransaction = mCurrencyCode;
    int[] arrayOfInt = CashUtils.1.$SwitchMap$com$snapchat$android$util$CashUtils$CurrencyCode;
    paramCashTransaction.ordinal();
    paramCashTransaction = Locale.US;
    if (j % 100 != 0) {}
    for (int i = 2;; i = 0)
    {
      mMessage = auv.a(null, 2131493396, new Object[] { auy.a(j / 100.0D, paramCashTransaction, i) });
      mTitleResId = 2131493397;
      mYesNoAlertListener = new AlertDialogUtils.a()
      {
        public final void a(AlertDialogUtils.YesNoOption paramAnonymousYesNoOption)
        {
          switch (rq.2.$SwitchMap$com$snapchat$android$util$AlertDialogUtils$YesNoOption[paramAnonymousYesNoOption.ordinal()])
          {
          default: 
            return;
          case 1: 
            if (bool) {
              akr.am();
            }
          case 2: 
            for (;;)
            {
              a(null, true);
              return;
              akr.al();
            }
          }
          rq.a(rq.this);
        }
      };
      localBus.a(locala.a());
      return;
    }
  }
  
  protected final void a(@chd List<rl> paramList, boolean paramBoolean)
  {
    super.a(paramList, paramBoolean);
  }
  
  public final BlockerOrder c()
  {
    return BlockerOrder.SEND_CONFIRMATION_BLOCKER;
  }
}

/* Location:
 * Qualified Name:     rq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */