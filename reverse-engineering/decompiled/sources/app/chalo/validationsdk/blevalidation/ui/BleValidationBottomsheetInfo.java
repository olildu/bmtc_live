package app.chalo.validationsdk.blevalidation.ui;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationBottomsheetInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationBottomsheetInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAndUserDetailsBottomsheetInfo f10567a;
    public final NearbyDevicesAndPermissionRationaleBottomsheetInfo b;
    public final PostValidationBottomsheetInfo c;
    public final RideRatingBottomsheetInfo d;

    public BleValidationBottomsheetInfo(ProductAndUserDetailsBottomsheetInfo productAndUserDetailsBottomsheetInfo, NearbyDevicesAndPermissionRationaleBottomsheetInfo nearbyDevicesAndPermissionRationaleBottomsheetInfo, PostValidationBottomsheetInfo postValidationBottomsheetInfo, RideRatingBottomsheetInfo rideRatingBottomsheetInfo) {
        this.f10567a = productAndUserDetailsBottomsheetInfo;
        this.b = nearbyDevicesAndPermissionRationaleBottomsheetInfo;
        this.c = postValidationBottomsheetInfo;
        this.d = rideRatingBottomsheetInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationBottomsheetInfo)) {
            return false;
        }
        BleValidationBottomsheetInfo bleValidationBottomsheetInfo = (BleValidationBottomsheetInfo) obj;
        return Intrinsics.d(this.f10567a, bleValidationBottomsheetInfo.f10567a) && Intrinsics.d(this.b, bleValidationBottomsheetInfo.b) && Intrinsics.d(this.c, bleValidationBottomsheetInfo.c) && Intrinsics.d(this.d, bleValidationBottomsheetInfo.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.f10614a.hashCode() + nf1.e(this.f10567a.f10615a.hashCode() * 31, 31, this.b.f10613a)) * 31;
        RideRatingBottomsheetInfo rideRatingBottomsheetInfo = this.d;
        return iHashCode + (rideRatingBottomsheetInfo == null ? 0 : rideRatingBottomsheetInfo.hashCode());
    }

    public final String toString() {
        return "BleValidationBottomsheetInfo(productAndUserDetailsBottomsheetInfo=" + this.f10567a + ", nearbyDevicesAndPermissionRationaleBottomsheetInfo=" + this.b + ", postValidationBottomsheetInfo=" + this.c + ", rideRatingBottomsheetInfo=" + this.d + ")";
    }
}
