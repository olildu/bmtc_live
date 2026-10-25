package defpackage;

import in.juspay.hypersdk.core.SdkTracker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k51 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17467a;
    public final /* synthetic */ SdkTracker b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ k51(SdkTracker sdkTracker, JSONObject jSONObject, int i) {
        this.f17467a = i;
        this.b = sdkTracker;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17467a) {
            case 0:
                this.b.lambda$addLogToPersistedQueue$14(this.c);
                break;
            default:
                this.b.lambda$track$17(this.c);
                break;
        }
    }
}
