.class public final enum Lcom/snapchat/android/util/TitleBarManager$LockedState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/snapchat/android/util/TitleBarManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LockedState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/snapchat/android/util/TitleBarManager$LockedState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/snapchat/android/util/TitleBarManager$LockedState;

.field public static final enum LOCKED:Lcom/snapchat/android/util/TitleBarManager$LockedState;

.field public static final enum NOT_LOCKED:Lcom/snapchat/android/util/TitleBarManager$LockedState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 37
    new-instance v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;

    const-string v1, "NOT_LOCKED"

    invoke-direct {v0, v1, v2}, Lcom/snapchat/android/util/TitleBarManager$LockedState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;->NOT_LOCKED:Lcom/snapchat/android/util/TitleBarManager$LockedState;

    .line 41
    new-instance v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;

    const-string v1, "LOCKED"

    invoke-direct {v0, v1, v3}, Lcom/snapchat/android/util/TitleBarManager$LockedState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;->LOCKED:Lcom/snapchat/android/util/TitleBarManager$LockedState;

    .line 33
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/snapchat/android/util/TitleBarManager$LockedState;

    sget-object v1, Lcom/snapchat/android/util/TitleBarManager$LockedState;->NOT_LOCKED:Lcom/snapchat/android/util/TitleBarManager$LockedState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/snapchat/android/util/TitleBarManager$LockedState;->LOCKED:Lcom/snapchat/android/util/TitleBarManager$LockedState;

    aput-object v1, v0, v3

    sput-object v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;->$VALUES:[Lcom/snapchat/android/util/TitleBarManager$LockedState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/snapchat/android/util/TitleBarManager$LockedState;
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;

    return-object v0
.end method

.method public static values()[Lcom/snapchat/android/util/TitleBarManager$LockedState;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/snapchat/android/util/TitleBarManager$LockedState;->$VALUES:[Lcom/snapchat/android/util/TitleBarManager$LockedState;

    invoke-virtual {v0}, [Lcom/snapchat/android/util/TitleBarManager$LockedState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/snapchat/android/util/TitleBarManager$LockedState;

    return-object v0
.end method
