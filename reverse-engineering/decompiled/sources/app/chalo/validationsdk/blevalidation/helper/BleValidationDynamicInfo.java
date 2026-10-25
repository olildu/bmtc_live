package app.chalo.validationsdk.blevalidation.helper;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationDynamicInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationDynamicInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10534a;
    public final long b;
    public final boolean c;

    public BleValidationDynamicInfo(String currentQrCodeToShow, long j, boolean z) {
        Intrinsics.i(currentQrCodeToShow, "currentQrCodeToShow");
        this.f10534a = currentQrCodeToShow;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationDynamicInfo)) {
            return false;
        }
        BleValidationDynamicInfo bleValidationDynamicInfo = (BleValidationDynamicInfo) obj;
        return Intrinsics.d(this.f10534a, bleValidationDynamicInfo.f10534a) && this.b == bleValidationDynamicInfo.b && this.c == bleValidationDynamicInfo.c;
    }

    public final int hashCode() {
        int iHashCode = this.f10534a.hashCode() * 31;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "BleValidationDynamicInfo(currentQrCodeToShow=", this.f10534a, ", timeLeftUntilSwitchOptionAvailableInMillis=");
        sbM.append(", isActivationExpired=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}
