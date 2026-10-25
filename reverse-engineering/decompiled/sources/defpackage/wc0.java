package defpackage;

import in.juspay.hypersdk.core.JuspayServices;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class wc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19914a;
    public final /* synthetic */ JuspayServices b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ wc0(JuspayServices juspayServices, JSONObject jSONObject, int i) {
        this.f19914a = i;
        this.b = juspayServices;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19914a) {
            case 0:
                this.b.lambda$new$0(this.c);
                break;
            default:
                this.b.lambda$setBundleParameter$2(this.c);
                break;
        }
    }
}
