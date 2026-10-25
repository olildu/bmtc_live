package defpackage;

import in.juspay.hyperupi.commonLibrary.v21.CL21;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class le implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18305a;
    public final /* synthetic */ CL21 b;
    public final /* synthetic */ String c;

    public /* synthetic */ le(CL21 cl21, String str, int i) {
        this.f18305a = i;
        this.b = cl21;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18305a) {
            case 0:
                CL21.isUpiLiteSupported$lambda$7(this.b, this.c);
                break;
            default:
                CL21.isDeviceSupported$lambda$5(this.b, this.c);
                break;
        }
    }
}
