package defpackage;

import in.juspay.hypersdk.core.DuiInterface;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17453a;
    public final /* synthetic */ DuiInterface b;

    public /* synthetic */ k00(DuiInterface duiInterface, int i) {
        this.f17453a = i;
        this.b = duiInterface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17453a) {
            case 0:
                this.b.lambda$requestKeyboardHide$9();
                break;
            case 1:
                this.b.lambda$onDuiReady$2();
                break;
            default:
                this.b.lambda$suppressKeyboard$8();
                break;
        }
    }
}
