.class final Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lapi$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;


# direct methods
.method constructor <init>(Lcom/snapchat/android/stories/ui/MyStoryView$1$1;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 119
    iget-object v0, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v0}, Lcom/snapchat/android/stories/ui/MyStoryView;->a(Lcom/snapchat/android/stories/ui/MyStoryView;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c00f1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v1, v1, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v1, v1, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v1}, Lcom/snapchat/android/stories/ui/MyStoryView;->c(Lcom/snapchat/android/stories/ui/MyStoryView;)Lcom/squareup/otto/Bus;

    move-result-object v1

    const/high16 v2, -0x1000000

    invoke-static {v0, v2}, Lcom/snapchat/android/stories/ui/MyStoryView;->a(Ljava/lang/String;I)Lbcg;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/squareup/otto/Bus;->a(Ljava/lang/Object;)V

    .line 122
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 124
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v0}, Lcom/snapchat/android/stories/ui/MyStoryView;->a(Lcom/snapchat/android/stories/ui/MyStoryView;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c00f5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v1, v1, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v1, v1, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v1}, Lcom/snapchat/android/stories/ui/MyStoryView;->c(Lcom/snapchat/android/stories/ui/MyStoryView;)Lcom/squareup/otto/Bus;

    move-result-object v1

    const/high16 v2, -0x1000000

    invoke-static {v0, v2}, Lcom/snapchat/android/stories/ui/MyStoryView;->a(Ljava/lang/String;I)Lbcg;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/squareup/otto/Bus;->a(Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v0}, Lcom/snapchat/android/stories/ui/MyStoryView;->d(Lcom/snapchat/android/stories/ui/MyStoryView;)Lcom/snapchat/android/stories/ui/MyStoryView$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/snapchat/android/stories/ui/MyStoryView$a;->c()V

    .line 131
    return-void
.end method

.method public final d()V
    .locals 3

    .prologue
    .line 134
    iget-object v0, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v0, v0, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v0}, Lcom/snapchat/android/stories/ui/MyStoryView;->a(Lcom/snapchat/android/stories/ui/MyStoryView;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c00ef

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 136
    iget-object v1, p0, Lcom/snapchat/android/stories/ui/MyStoryView$1$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1$1;

    iget-object v1, v1, Lcom/snapchat/android/stories/ui/MyStoryView$1$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView$1;

    iget-object v1, v1, Lcom/snapchat/android/stories/ui/MyStoryView$1;->a:Lcom/snapchat/android/stories/ui/MyStoryView;

    invoke-static {v1}, Lcom/snapchat/android/stories/ui/MyStoryView;->c(Lcom/snapchat/android/stories/ui/MyStoryView;)Lcom/squareup/otto/Bus;

    move-result-object v1

    sget v2, Lcom/snapchat/android/notification/AndroidNotificationManager;->a:I

    invoke-static {v0, v2}, Lcom/snapchat/android/stories/ui/MyStoryView;->a(Ljava/lang/String;I)Lbcg;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/squareup/otto/Bus;->a(Ljava/lang/Object;)V

    .line 138
    return-void
.end method
