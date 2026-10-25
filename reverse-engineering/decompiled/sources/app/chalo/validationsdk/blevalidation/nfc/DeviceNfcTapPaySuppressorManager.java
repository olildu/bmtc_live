package app.chalo.validationsdk.blevalidation.nfc;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressorManager;", "Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressorProvider;", "Lapp/chalo/validationsdk/blevalidation/nfc/DeviceNfcTapPaySuppressorSetter;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceNfcTapPaySuppressorManager implements DeviceNfcTapPaySuppressorProvider, DeviceNfcTapPaySuppressorSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Lazy f10563a;

    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorSetter
    public final void a(Lazy suppressor) {
        Intrinsics.i(suppressor, "suppressor");
        this.f10563a = suppressor;
    }

    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorProvider
    public final DeviceNfcTapPaySuppressor b() {
        DeviceNfcTapPaySuppressor deviceNfcTapPaySuppressor;
        Lazy lazy = this.f10563a;
        return (lazy == null || (deviceNfcTapPaySuppressor = (DeviceNfcTapPaySuppressor) lazy.getValue()) == null) ? NoOpDeviceNfcTapPaySuppressor.f10564a : deviceNfcTapPaySuppressor;
    }

    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorProvider
    public final int c() {
        Lazy lazy = this.f10563a;
        if (lazy != null) {
            return lazy.hashCode();
        }
        return 0;
    }

    @Override // app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorSetter
    public final void remove() {
        DeviceNfcTapPaySuppressor deviceNfcTapPaySuppressor;
        Lazy lazy = this.f10563a;
        if (lazy != null && (deviceNfcTapPaySuppressor = (DeviceNfcTapPaySuppressor) lazy.getValue()) != null) {
            deviceNfcTapPaySuppressor.disable();
        }
        this.f10563a = null;
    }
}
