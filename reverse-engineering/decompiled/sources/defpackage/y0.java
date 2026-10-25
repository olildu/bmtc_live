package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20063a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ y0(ActivityHandler activityHandler, String str, String str2, int i) {
        this.f20063a = i;
        this.b = activityHandler;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20063a) {
            case 0:
                this.b.lambda$addGlobalPartnerParameter$23(this.c, this.d);
                break;
            default:
                this.b.lambda$addGlobalCallbackParameter$21(this.c, this.d);
                break;
        }
    }
}
