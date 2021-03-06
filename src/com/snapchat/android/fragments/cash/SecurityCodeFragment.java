package com.snapchat.android.fragments.cash;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import awf;
import bbo;
import beg;
import bhp;
import chc;
import chd;
import com.snapchat.android.api2.cash.square.data.ErrorType;
import com.snapchat.android.ui.cash.CardCvvEditText;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import za;

public class SecurityCodeFragment
  extends SnapchatFragment
{
  protected View a;
  @chd
  public a b;
  private CardCvvEditText c;
  private View d;
  private TextView e;
  private boolean f;
  private boolean g = false;
  private boolean h = false;
  
  public final void a(@chd final ErrorType paramErrorType, final int paramInt)
  {
    bhp.a(new Runnable()
    {
      public final void run()
      {
        SecurityCodeFragment.a(SecurityCodeFragment.this, false);
        SecurityCodeFragment.a(SecurityCodeFragment.this).setText(SecurityCodeFragment.b(paramErrorType, paramInt));
        if (!ErrorType.isNonRecoverableError(paramErrorType))
        {
          SecurityCodeFragment.b(SecurityCodeFragment.this).setText("");
          SecurityCodeFragment.b(SecurityCodeFragment.this).setEnabled(true);
          if (SecurityCodeFragment.b(SecurityCodeFragment.this).requestFocus()) {
            awf.g(getActivity());
          }
        }
        for (;;)
        {
          SecurityCodeFragment.d(SecurityCodeFragment.this).setVisibility(8);
          SecurityCodeFragment.e(SecurityCodeFragment.this).setBackgroundColor(getResources().getColor(2131230793));
          SecurityCodeFragment.b(SecurityCodeFragment.this, true);
          return;
          SecurityCodeFragment.c(SecurityCodeFragment.this);
        }
      }
    });
  }
  
  public final void e()
  {
    super.e();
    bbo.a().a(new beg(false));
  }
  
  public final boolean f_()
  {
    return true;
  }
  
  public final boolean g()
  {
    if ((!f) && (b != null))
    {
      if (!h) {
        break label37;
      }
      b.b();
    }
    for (;;)
    {
      b = null;
      return false;
      label37:
      b.a();
    }
  }
  
  protected final void i()
  {
    awf.a(getActivity(), mFragmentLayout);
    getActivity().onBackPressed();
  }
  
  public final void l()
  {
    bhp.a(new Runnable()
    {
      public final void run()
      {
        SecurityCodeFragment.a(SecurityCodeFragment.this, true);
        i();
      }
    });
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    mFragmentLayout = paramLayoutInflater.inflate(2130968606, paramViewGroup, false);
    c = ((CardCvvEditText)c(2131361977));
    c.setValidatedInputCallback(new b((byte)0));
    c.addTextChangedListener(new TextWatcher()
    {
      private boolean c = false;
      
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        if (!c)
        {
          SecurityCodeFragment.a(a);
          c = true;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    });
    c.setAlpha(0.6F);
    if (c.requestFocus()) {
      awf.g(getActivity());
    }
    d = c(2131361979);
    e = ((TextView)c(2131361982));
    a = c(2131361981);
    a.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        i();
      }
    });
    return mFragmentLayout;
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(@chc String paramString);
    
    public abstract void b();
  }
  
  final class b
    implements za
  {
    private b() {}
    
    public final void a()
    {
      SecurityCodeFragment.d(SecurityCodeFragment.this).setVisibility(8);
    }
    
    public final void b()
    {
      if (SecurityCodeFragment.f(SecurityCodeFragment.this) == null) {
        throw new RuntimeException("Forgot to set a callback on SecurityCodeFragment!");
      }
      if (SecurityCodeFragment.g(SecurityCodeFragment.this))
      {
        SecurityCodeFragment.b(SecurityCodeFragment.this, false);
        SecurityCodeFragment.h(SecurityCodeFragment.this).setBackgroundColor(-16777216);
      }
      SecurityCodeFragment.d(SecurityCodeFragment.this).setVisibility(0);
      SecurityCodeFragment.b(SecurityCodeFragment.this).setEnabled(false);
      SecurityCodeFragment.f(SecurityCodeFragment.this).a(SecurityCodeFragment.b(SecurityCodeFragment.this).getUnformattedText());
    }
    
    public final void c() {}
  }
}

/* Location:
 * Qualified Name:     com.snapchat.android.fragments.cash.SecurityCodeFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */