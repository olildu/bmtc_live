package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import in.juspay.hyperupi.UPIBridge;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class nm1 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18526a;
    public final /* synthetic */ UPIBridge b;
    public final /* synthetic */ String c;

    public /* synthetic */ nm1(UPIBridge uPIBridge, String str, int i) {
        this.f18526a = i;
        this.b = uPIBridge;
        this.c = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f18526a) {
            case 0:
                UPIBridge.prepareIntegrityTokenProvider$lambda$3(this.b, this.c, exc);
                break;
            default:
                UPIBridge.requestIntegrityToken$lambda$1(this.b, this.c, exc);
                break;
        }
    }
}
