.class Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;
.super Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/content/IntentCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IntentCompatImplHC"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;-><init>()V

    return-void
.end method


# virtual methods
.method public final makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 68
    invoke-static {p1}, Landroid/support/v4/content/IntentCompatHoneycomb;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public final makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 72
    invoke-static {p1}, Landroid/support/v4/content/IntentCompatHoneycomb;->makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method