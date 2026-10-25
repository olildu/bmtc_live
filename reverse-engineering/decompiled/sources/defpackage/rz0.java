package defpackage;

import android.content.Intent;
import in.juspay.hyper.core.ResultAwaitingDuiHook;
import in.juspay.hyperqr.QrBridge;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class rz0 implements ResultAwaitingDuiHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19255a = 0;
    public final /* synthetic */ QrBridge b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rz0(QrBridge qrBridge, String str) {
        this.b = qrBridge;
        this.c = str;
    }

    @Override // in.juspay.hyper.core.ResultAwaitingDuiHook
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        switch (this.f19255a) {
            case 0:
                return QrBridge.scanQRFromGallery$lambda$1(this.b, (String) this.c, i, i2, intent);
            default:
                return QrBridge.shareImage$lambda$4((File) this.c, this.b, i, i2, intent);
        }
    }

    public /* synthetic */ rz0(File file, QrBridge qrBridge) {
        this.c = file;
        this.b = qrBridge;
    }
}
