.class public final Laek;
.super Lana;
.source "SourceFile"

# interfaces
.implements Lui$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lana;",
        "Lui$b",
        "<",
        "Lbku;",
        ">;"
    }
.end annotation


# instance fields
.field public a:I

.field private b:Lakp;

.field private final c:Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 32
    invoke-static {}, Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;->a()Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Laek;-><init>(Landroid/content/Intent;Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;)V

    .line 33
    return-void
.end method

.method private constructor <init>(Landroid/content/Intent;Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lana;-><init>(Landroid/content/Intent;)V

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Laek;->a:I

    .line 37
    const-class v0, Lbku;

    invoke-virtual {p0, v0, p0}, Laek;->registerCallback(Ljava/lang/Class;Lui$b;)V

    .line 38
    iput-object p2, p0, Laek;->c:Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;

    .line 39
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 48
    invoke-static {p1}, Lakp;->a(Landroid/content/Context;)Lakp;

    move-result-object v0

    iput-object v0, p0, Laek;->b:Lakp;

    .line 49
    invoke-super {p0, p1}, Lana;->a(Landroid/content/Context;)V

    .line 50
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 85
    return-void
.end method

.method public final getMethod()Lcom/snapchat/android/api2/framework/HttpMethod;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/snapchat/android/api2/framework/HttpMethod;->GET:Lcom/snapchat/android/api2/framework/HttpMethod;

    return-object v0
.end method

.method public final getRequestPayload()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final l_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Laek;->c:Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;

    invoke-virtual {v0}, Lcom/snapchat/android/discover/util/network/DiscoverEndpointManager;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic onJsonResult(Ljava/lang/Object;Lus;)V
    .locals 1

    .prologue
    .line 25
    check-cast p1, Lbku;

    invoke-virtual {p2}, Lus;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-nez p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    iput v0, p0, Laek;->a:I

    invoke-static {}, Lcom/snapchat/android/discover/model/database/table/PublisherChannelTable;->a()Lcom/snapchat/android/discover/model/database/table/PublisherChannelTable;

    invoke-static {}, Lakp;->y()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/snapchat/android/discover/model/database/table/PublisherChannelTable;->a(Landroid/content/Context;Lbku;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lbku;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_1
.end method
