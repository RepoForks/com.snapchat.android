.class final Lcom/snapchat/android/fragments/signup/SignupFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/snapchat/android/fragments/signup/SignupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/snapchat/android/fragments/signup/SignupFragment;


# direct methods
.method constructor <init>(Lcom/snapchat/android/fragments/signup/SignupFragment;)V
    .locals 0

    .prologue
    .line 397
    iput-object p1, p0, Lcom/snapchat/android/fragments/signup/SignupFragment$10;->a:Lcom/snapchat/android/fragments/signup/SignupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 400
    iget-object v0, p0, Lcom/snapchat/android/fragments/signup/SignupFragment$10;->a:Lcom/snapchat/android/fragments/signup/SignupFragment;

    invoke-static {v0}, Lcom/snapchat/android/fragments/signup/SignupFragment;->k(Lcom/snapchat/android/fragments/signup/SignupFragment;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 401
    return-void
.end method
