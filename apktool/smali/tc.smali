.class public final Ltc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd;


# instance fields
.field private final mCardSummary:Ltl;
    .annotation build Lchd;
    .end annotation
.end field

.field private final mCashCustomer:Lcom/snapchat/android/api2/cash/square/data/CashCustomer;
    .annotation build Lchd;
    .end annotation
.end field

.field private final mCashCustomerStatus:Ltm;
    .annotation build Lchc;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltm;)V
    .locals 1
    .param p1    # Ltm;
        .annotation build Lchc;
        .end annotation
    .end param

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ltc;->mCashCustomerStatus:Ltm;

    .line 23
    iget-object v0, p1, Ltm;->mCustomer:Lcom/snapchat/android/api2/cash/square/data/CashCustomer;

    iput-object v0, p0, Ltc;->mCashCustomer:Lcom/snapchat/android/api2/cash/square/data/CashCustomer;

    .line 24
    iget-object v0, p1, Ltm;->mCardSummary:Ltl;

    iput-object v0, p0, Ltc;->mCardSummary:Ltl;

    .line 25
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Ltc;->mCardSummary:Ltl;

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x1

    .line 41
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Ltc;->mCashCustomerStatus:Ltm;

    iget-boolean v0, v0, Ltm;->mPasswordConfirmationEnabled:Z

    return v0
.end method

.method public final c()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 78
    iget-object v1, p0, Ltc;->mCashCustomerStatus:Ltm;

    if-eqz v1, :cond_0

    .line 79
    iget-object v1, p0, Ltc;->mCashCustomerStatus:Ltm;

    iget v1, v1, Ltm;->mNumberOfPayments:I

    if-lez v1, :cond_0

    const/4 v0, 0x1

    .line 81
    :cond_0
    return v0
.end method

.method public final d()Lcom/snapchat/android/api2/cash/square/data/CardBrand;
    .locals 1
    .annotation build Lchd;
    .end annotation

    .prologue
    .line 47
    iget-object v0, p0, Ltc;->mCardSummary:Ltl;

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Ltc;->mCardSummary:Ltl;

    iget-object v0, v0, Ltl;->mBrand:Lcom/snapchat/android/api2/cash/square/data/CardBrand;

    .line 50
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1
    .annotation build Lchd;
    .end annotation

    .prologue
    .line 56
    iget-object v0, p0, Ltc;->mCardSummary:Ltl;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Ltc;->mCardSummary:Ltl;

    iget-object v0, v0, Ltl;->mPanSuffix:Ljava/lang/String;

    .line 59
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
