package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20155a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ z0(ActivityHandler activityHandler, boolean z, String str, int i) {
        this.f20155a = i;
        this.b = activityHandler;
        this.c = z;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20155a) {
            case 0:
                this.b.lambda$setPushToken$33(this.c, this.d);
                break;
            default:
                this.b.lambda$setPushToken$32(this.c, this.d);
                break;
        }
    }
}
