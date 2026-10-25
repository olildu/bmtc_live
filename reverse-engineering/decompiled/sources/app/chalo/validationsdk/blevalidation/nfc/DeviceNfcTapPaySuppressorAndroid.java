package app.chalo.validationsdk.blevalidation.nfc;

import android.app.Activity;
import android.nfc.NfcAdapter;
import defpackage.ny;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressorAndroid;", "Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressor;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceNfcTapPaySuppressorAndroid implements DeviceNfcTapPaySuppressor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f10562a;
    public final NfcAdapter b;
    public final int c = 387;
    public final ny d = new ny();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressorAndroid$Companion;", "", "", "TAG", "Ljava/lang/String;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DeviceNfcTapPaySuppressorAndroid(Activity activity) {
        this.f10562a = activity;
        this.b = NfcAdapter.getDefaultAdapter(activity);
    }

    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressor
    public final void disable() {
        NfcAdapter nfcAdapter = this.b;
        if (nfcAdapter == null) {
            return;
        }
        try {
            nfcAdapter.disableReaderMode(this.f10562a);
        } catch (Exception e) {
            String message = "NFC reader mode disable failed: " + e + " - " + e.getMessage();
            Intrinsics.i(message, "message");
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressor
    public final void enable() {
        NfcAdapter nfcAdapter = this.b;
        if (nfcAdapter == null || !nfcAdapter.isEnabled()) {
            return;
        }
        try {
            nfcAdapter.enableReaderMode(this.f10562a, this.d, this.c, null);
        } catch (Exception e) {
            String message = "NFC reader mode enable failed: " + e + " - " + e.getMessage();
            Intrinsics.i(message, "message");
        }
    }
}
