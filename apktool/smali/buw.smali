.class public final Lbuw;
.super Lbuu;


# static fields
.field private static final f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 15
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "libcore.net.http.HttpURLConnectionImpl"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnectionImpl"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnection"

    aput-object v2, v0, v1

    sput-object v0, Lbuw;->f:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbum;Lbtx;)V
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lbuw;->f:[Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lbuu;-><init>(Lbum;Lbtx;[Ljava/lang/String;)V

    .line 23
    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    const-string v0, "http"

    return-object v0
.end method

.method protected final getDefaultPort()I
    .locals 1

    .prologue
    .line 60
    const/16 v0, 0x50

    return v0
.end method

.method protected final openConnection(Ljava/net/URL;)Ljava/net/URLConnection;
    .locals 4

    .prologue
    .line 26
    invoke-super {p0, p1}, Lbuu;->openConnection(Ljava/net/URL;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 29
    :try_start_0
    new-instance v1, Lbuz;

    iget-object v2, p0, Lbuu;->c:Lbum;

    iget-object v3, p0, Lbuu;->d:Lbtx;

    invoke-direct {v1, v0, v2, v3}, Lbuz;-><init>(Ljava/net/HttpURLConnection;Lbum;Lbtx;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-object v0, v1

    .line 37
    :goto_0
    return-object v0

    .line 33
    :catch_0
    move-exception v0

    throw v0

    .line 35
    :catch_1
    move-exception v1

    invoke-static {v1}, Lbue;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected final openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    .locals 4

    .prologue
    .line 43
    invoke-super {p0, p1, p2}, Lbuu;->openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 46
    :try_start_0
    new-instance v1, Lbuz;

    iget-object v2, p0, Lbuu;->c:Lbum;

    iget-object v3, p0, Lbuu;->d:Lbtx;

    invoke-direct {v1, v0, v2, v3}, Lbuz;-><init>(Ljava/net/HttpURLConnection;Lbum;Lbtx;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-object v0, v1

    .line 54
    :goto_0
    return-object v0

    .line 50
    :catch_0
    move-exception v0

    throw v0

    .line 52
    :catch_1
    move-exception v1

    invoke-static {v1}, Lbue;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
