package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19080a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ String c;

    public /* synthetic */ q0(ActivityHandler activityHandler, String str, int i) {
        this.f19080a = i;
        this.b = activityHandler;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19080a) {
            case 0:
                this.b.lambda$setExternalDeviceIdInDelay$51(this.c);
                break;
            case 1:
                this.b.lambda$removeGlobalPartnerParameter$27(this.c);
                break;
            default:
                this.b.lambda$removeGlobalCallbackParameter$25(this.c);
                break;
        }
    }
}
