package app.chalo.ridehailing.data.app;

import defpackage.dd;
import defpackage.nf1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingRemoteConfigAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideHailingRemoteConfigAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9114a;
    public final String b;
    public final ArrayList c;

    public RideHailingRemoteConfigAppModel(String productType, String productSubType, ArrayList arrayList) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f9114a = productType;
        this.b = productSubType;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingRemoteConfigAppModel)) {
            return false;
        }
        RideHailingRemoteConfigAppModel rideHailingRemoteConfigAppModel = (RideHailingRemoteConfigAppModel) obj;
        return Intrinsics.d(this.f9114a, rideHailingRemoteConfigAppModel.f9114a) && Intrinsics.d(this.b, rideHailingRemoteConfigAppModel.b) && this.c.equals(rideHailingRemoteConfigAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f9114a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RideHailingRemoteConfigAppModel(productType=", this.f9114a, ", productSubType=", this.b, ", userTripCompletionFeedbackReasons=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
