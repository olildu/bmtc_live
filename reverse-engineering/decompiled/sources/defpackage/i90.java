package defpackage;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import in.juspay.hypersdk.services.HyperPaymentsServices;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15892a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i90(Context context, String str, SdkInitializationListener sdkInitializationListener, long j) {
        this.b = context;
        this.c = str;
        this.e = sdkInitializationListener;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15892a) {
            case 0:
                ((HyperPaymentsServices) this.b).lambda$initiate$4(this.d, (JSONObject) this.c, (HyperPaymentsCallback) this.e);
                break;
            case 1:
                ((HyperPaymentsServices) this.b).lambda$doProcess$11((JSONObject) this.c, this.d, (JSONObject) this.e);
                break;
            default:
                InMobiSdk.a((Context) this.b, (String) this.c, (SdkInitializationListener) this.e, this.d);
                break;
        }
    }

    public /* synthetic */ i90(HyperPaymentsServices hyperPaymentsServices, long j, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.b = hyperPaymentsServices;
        this.d = j;
        this.c = jSONObject;
        this.e = hyperPaymentsCallback;
    }

    public /* synthetic */ i90(HyperPaymentsServices hyperPaymentsServices, JSONObject jSONObject, long j, JSONObject jSONObject2) {
        this.b = hyperPaymentsServices;
        this.c = jSONObject;
        this.d = j;
        this.e = jSONObject2;
    }
}
