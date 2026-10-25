package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11230a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ bu(CrashlyticsCore crashlyticsCore, String str, String str2, int i) {
        this.f11230a = i;
        this.b = crashlyticsCore;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11230a) {
            case 0:
                this.b.lambda$setCustomKey$5(this.c, this.d);
                break;
            default:
                this.b.lambda$setInternalKey$7(this.c, this.d);
                break;
        }
    }
}
