.class public abstract Lckj;
.super Lckc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lckj$a;
    }
.end annotation


# instance fields
.field private final a:Lchn;

.field final b:J


# direct methods
.method public constructor <init>(Lchj;J)V
    .locals 2

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lckc;-><init>(Lchj;)V

    .line 57
    iput-wide p2, p0, Lckj;->b:J

    .line 58
    new-instance v0, Lckj$a;

    invoke-virtual {p1}, Lchj;->x()Lcho;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lckj$a;-><init>(Lckj;Lcho;)V

    iput-object v0, p0, Lckj;->a:Lchn;

    .line 59
    return-void
.end method


# virtual methods
.method public abstract a(JI)J
.end method

.method public abstract a(JJ)J
.end method

.method public final b(JJ)I
    .locals 3

    .prologue
    .line 92
    invoke-virtual {p0, p1, p2, p3, p4}, Lckj;->c(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcki;->a(J)I

    move-result v0

    return v0
.end method

.method public c(JJ)J
    .locals 7

    .prologue
    const-wide/16 v4, 0x1

    .line 119
    cmp-long v0, p1, p3

    if-gez v0, :cond_1

    .line 120
    invoke-virtual {p0, p3, p4, p1, p2}, Lckj;->c(JJ)J

    move-result-wide v0

    neg-long v0, v0

    .line 134
    :cond_0
    :goto_0
    return-wide v0

    .line 123
    :cond_1
    sub-long v0, p1, p3

    iget-wide v2, p0, Lckj;->b:J

    div-long/2addr v0, v2

    .line 124
    invoke-virtual {p0, p3, p4, v0, v1}, Lckj;->a(JJ)J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-gez v2, :cond_3

    .line 126
    :cond_2
    add-long/2addr v0, v4

    .line 127
    invoke-virtual {p0, p3, p4, v0, v1}, Lckj;->a(JJ)J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-lez v2, :cond_2

    .line 128
    sub-long/2addr v0, v4

    goto :goto_0

    .line 129
    :cond_3
    invoke-virtual {p0, p3, p4, v0, v1}, Lckj;->a(JJ)J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-lez v2, :cond_0

    .line 131
    :cond_4
    sub-long/2addr v0, v4

    .line 132
    invoke-virtual {p0, p3, p4, v0, v1}, Lckj;->a(JJ)J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-gtz v2, :cond_4

    goto :goto_0
.end method

.method public final d()Lchn;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lckj;->a:Lchn;

    return-object v0
.end method
