.class public final Lavl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lorg/apache/http/annotation/NotThreadSafe;
.end annotation


# instance fields
.field public mAccumulatedTimeMillis:J

.field private final mClock:Lbhk;

.field private mCurrentIntervalStartTimeMillis:J

.field public mIsAccumulating:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    new-instance v0, Lbhk;

    invoke-direct {v0}, Lbhk;-><init>()V

    invoke-direct {p0, v0}, Lavl;-><init>(Lbhk;)V

    .line 24
    return-void
.end method

.method private constructor <init>(Lbhk;)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lavl;->mClock:Lbhk;

    .line 29
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lavl;->mAccumulatedTimeMillis:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lavl;->mCurrentIntervalStartTimeMillis:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lavl;->mIsAccumulating:Z

    .line 30
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 36
    iget-boolean v0, p0, Lavl;->mIsAccumulating:Z

    if-nez v0, :cond_0

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lavl;->mIsAccumulating:Z

    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lavl;->mCurrentIntervalStartTimeMillis:J

    .line 40
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .prologue
    .line 46
    iget-boolean v0, p0, Lavl;->mIsAccumulating:Z

    if-eqz v0, :cond_0

    .line 47
    iget-wide v0, p0, Lavl;->mAccumulatedTimeMillis:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lavl;->mCurrentIntervalStartTimeMillis:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lavl;->mAccumulatedTimeMillis:J

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lavl;->mIsAccumulating:Z

    .line 50
    :cond_0
    return-void
.end method
