package defpackage;

import in.juspay.hypersdk.analytics.LogPusher;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class nf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18508a;
    public final /* synthetic */ LogPusher b;
    public final /* synthetic */ String c;
    public final /* synthetic */ JSONObject d;

    public /* synthetic */ nf0(LogPusher logPusher, String str, JSONObject jSONObject, int i) {
        this.f18508a = i;
        this.b = logPusher;
        this.c = str;
        this.d = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18508a) {
            case 0:
                this.b.lambda$setHeaders$3(this.c, this.d);
                break;
            default:
                this.b.lambda$setLogHeaderValues$4(this.c, this.d);
                break;
        }
    }
}
