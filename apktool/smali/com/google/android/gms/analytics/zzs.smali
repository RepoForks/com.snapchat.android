.class public final Lcom/google/android/gms/analytics/zzs;
.super Ljava/lang/Object;


# direct methods
.method static zzE(I)Ljava/lang/String;
    .locals 1

    const-string v0, "&cd"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static zzF(I)Ljava/lang/String;
    .locals 1

    const-string v0, "&cm"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zzG(I)Ljava/lang/String;
    .locals 1

    const-string v0, "&pr"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zzH(I)Ljava/lang/String;
    .locals 1

    const-string v0, "&promo"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zzI(I)Ljava/lang/String;
    .locals 1

    const-string v0, "pi"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zzJ(I)Ljava/lang/String;
    .locals 1

    const-string v0, "&il"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zzK(I)Ljava/lang/String;
    .locals 1

    const-string v0, "cd"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zzL(I)Ljava/lang/String;
    .locals 1

    const-string v0, "cm"

    invoke-static {v0, p0}, Lcom/google/android/gms/analytics/zzs;->zzd(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static zzd(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    if-gtz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "index out of range for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/zzae;->zzZ(Ljava/lang/String;)V

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
