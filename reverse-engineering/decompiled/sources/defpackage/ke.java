package defpackage;

import in.juspay.hyperupi.commonLibrary.v21.CL21;
import in.juspay.hyperupi.commonLibraryUtils.CLInterface;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ke implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17490a;
    public final /* synthetic */ CL21 b;
    public final /* synthetic */ CLInterface.CLTask c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ke(CL21 cl21, CLInterface.CLTask cLTask, boolean z, int i) {
        this.f17490a = i;
        this.b = cl21;
        this.c = cLTask;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17490a) {
            case 0:
                CL21.handleInit$lambda$2(this.b, this.c, this.d);
                break;
            default:
                CL21.handleInit$lambda$2$lambda$1(this.b, this.c, this.d);
                break;
        }
    }
}
