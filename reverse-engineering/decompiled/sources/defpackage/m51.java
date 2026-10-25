package defpackage;

import in.juspay.hypersdk.core.SdkTracker;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m51 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18372a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m51(String str, String str2, String str3, String str4, Object obj, int i) {
        this.f18372a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18372a) {
            case 0:
                SdkTracker.lambda$trackBootLifecycle$2(this.b, this.c, this.d, this.e, this.f);
                break;
            default:
                SdkTracker.lambda$trackBootAction$3(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
