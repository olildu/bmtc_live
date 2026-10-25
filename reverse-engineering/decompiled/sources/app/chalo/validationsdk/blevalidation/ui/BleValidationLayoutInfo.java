package app.chalo.validationsdk.blevalidation.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationLayoutInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationLayoutInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BleValidationBasicLayoutInfo f10606a;
    public final SwitchToQrValidationLayoutInfo b;
    public final QRScreenLayoutInfo c;

    public BleValidationLayoutInfo(BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo, SwitchToQrValidationLayoutInfo switchToQrValidationLayoutInfo, QRScreenLayoutInfo qRScreenLayoutInfo) {
        this.f10606a = bleValidationBasicLayoutInfo;
        this.b = switchToQrValidationLayoutInfo;
        this.c = qRScreenLayoutInfo;
    }

    public static BleValidationLayoutInfo a(BleValidationLayoutInfo bleValidationLayoutInfo, SwitchToQrValidationLayoutInfo switchToQrValidationLayoutInfo, QRScreenLayoutInfo qRScreenLayoutInfo, int i) {
        BleValidationBasicLayoutInfo bleValidationBasicLayoutInfo = bleValidationLayoutInfo.f10606a;
        if ((i & 2) != 0) {
            switchToQrValidationLayoutInfo = bleValidationLayoutInfo.b;
        }
        bleValidationLayoutInfo.getClass();
        return new BleValidationLayoutInfo(bleValidationBasicLayoutInfo, switchToQrValidationLayoutInfo, qRScreenLayoutInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationLayoutInfo)) {
            return false;
        }
        BleValidationLayoutInfo bleValidationLayoutInfo = (BleValidationLayoutInfo) obj;
        return Intrinsics.d(this.f10606a, bleValidationLayoutInfo.f10606a) && Intrinsics.d(this.b, bleValidationLayoutInfo.b) && Intrinsics.d(this.c, bleValidationLayoutInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f10606a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BleValidationLayoutInfo(bleValidationBasicLayoutInfo=" + this.f10606a + ", switchToQrValidationLayoutInfo=" + this.b + ", qrScreenLayoutInfo=" + this.c + ")";
    }
}
