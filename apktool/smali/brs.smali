.class public final Lbrs;
.super Lbrg;


# instance fields
.field private d:Lbrg;


# direct methods
.method public constructor <init>(Lbrg;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lbrg;-><init>(Lbrg;)V

    .line 23
    iput-object p1, p0, Lbrs;->d:Lbrg;

    .line 24
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 28
    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    .line 29
    iget-object v1, p0, Lbrg;->a:Lbrm;

    sget-object v2, Lbrt;->d:Lbrt;

    invoke-interface {v1, v2}, Lbrm;->a(Lbrg;)V

    .line 40
    :goto_0
    return v0

    .line 33
    :cond_0
    iget v1, p0, Lbrs;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lbrs;->c:I

    .line 34
    int-to-char v1, p1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    .line 35
    iget-object v1, p0, Lbrs;->d:Lbrg;

    invoke-virtual {p0}, Lbrs;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lbrg;->b(I)V

    .line 36
    iget-object v1, p0, Lbrg;->a:Lbrm;

    iget-object v2, p0, Lbrs;->d:Lbrg;

    invoke-interface {v1, v2}, Lbrm;->a(Lbrg;)V

    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lorg/apache/http/util/CharArrayBuffer;)Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x1

    return v0
.end method

.method public final b()Lbrg;
    .locals 0

    .prologue
    .line 47
    return-object p0
.end method

.method public final c()Lbrg;
    .locals 0

    .prologue
    .line 53
    return-object p0
.end method

.method protected final d()I
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method protected final e()I
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    return v0
.end method
