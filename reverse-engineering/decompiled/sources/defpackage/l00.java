package defpackage;

import in.juspay.hypersdk.core.JuspayServices;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18269a;
    public final /* synthetic */ JuspayServices b;

    public /* synthetic */ l00(JuspayServices juspayServices, int i) {
        this.f18269a = i;
        this.b = juspayServices;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18269a) {
            case 0:
                this.b.terminate();
                break;
            case 1:
                this.b.lambda$removeFragment$12();
                break;
            case 2:
                this.b.lambda$setBundleParameter$3();
                break;
            case 3:
                this.b.lambda$reset$9();
                break;
            default:
                this.b.lambda$initiate$6();
                break;
        }
    }
}
