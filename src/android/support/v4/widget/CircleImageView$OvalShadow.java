package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class CircleImageView$OvalShadow
  extends OvalShape
{
  private int mCircleDiameter;
  private RadialGradient mRadialGradient;
  private Paint mShadowPaint = new Paint();
  private int mShadowRadius;
  
  public CircleImageView$OvalShadow(CircleImageView paramCircleImageView, int paramInt1, int paramInt2)
  {
    mShadowRadius = paramInt1;
    mCircleDiameter = paramInt2;
    float f1 = mCircleDiameter / 2;
    float f2 = mCircleDiameter / 2;
    float f3 = mShadowRadius;
    paramCircleImageView = Shader.TileMode.CLAMP;
    mRadialGradient = new RadialGradient(f1, f2, f3, new int[] { 1023410176, 0 }, null, paramCircleImageView);
    mShadowPaint.setShader(mRadialGradient);
  }
  
  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this$0.getWidth();
    int j = this$0.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, mCircleDiameter / 2 + mShadowRadius, mShadowPaint);
    paramCanvas.drawCircle(i / 2, j / 2, mCircleDiameter / 2, paramPaint);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.CircleImageView.OvalShadow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */