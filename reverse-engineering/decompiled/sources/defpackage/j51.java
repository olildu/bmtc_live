package defpackage;

import in.juspay.hypersdk.core.SdkTracker;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j51 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17373a;
    public final /* synthetic */ SdkTracker b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j51(SdkTracker sdkTracker, String str, String str2, String str3, String str4, Object obj, int i) {
        this.f17373a = i;
        this.b = sdkTracker;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17373a) {
            case 0:
                this.b.lambda$trackLifecycle$6(this.c, this.d, this.e, this.f, this.g);
                break;
            case 1:
                this.b.lambda$trackAction$8(this.c, this.d, this.e, this.f, this.g);
                break;
            default:
                this.b.lambda$trackContext$11(this.c, this.d, this.e, this.f, this.g);
                break;
        }
    }
}
