.class public abstract Laos;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public c:J

.field protected final d:Laph;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 8

    .prologue
    .line 20
    invoke-static {}, Laph;->a()Laph;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v6}, Laos;-><init>(Ljava/lang/String;JJLaph;)V

    .line 21
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JJLaph;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Laos;->a:Ljava/lang/String;

    .line 26
    iput-wide p2, p0, Laos;->b:J

    .line 27
    iput-wide p4, p0, Laos;->c:J

    .line 28
    iput-object p6, p0, Laos;->d:Laph;

    .line 29
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract a(J)V
.end method
