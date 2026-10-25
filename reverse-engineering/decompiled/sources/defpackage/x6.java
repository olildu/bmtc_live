package defpackage;

import in.juspay.airborne.ota.ApplicationManager;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x6 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19989a = 1;
    public final /* synthetic */ ApplicationManager b;
    public final /* synthetic */ String c;

    public /* synthetic */ x6(ApplicationManager applicationManager, String str) {
        this.b = applicationManager;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19989a) {
            case 0:
                return ApplicationManager.readSplits$lambda$12$lambda$11(this.c, this.b);
            default:
                return ApplicationManager.readFileAsync$lambda$20(this.b, this.c);
        }
    }

    public /* synthetic */ x6(String str, ApplicationManager applicationManager) {
        this.c = str;
        this.b = applicationManager;
    }
}
