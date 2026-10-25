package app.chalo.appsupport.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/data/models/app/CancelBookingAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CancelBookingAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancelBookingStatus f980a;
    public final String b;

    public CancelBookingAppModel(CancelBookingStatus status, String str) {
        Intrinsics.i(status, "status");
        this.f980a = status;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelBookingAppModel)) {
            return false;
        }
        CancelBookingAppModel cancelBookingAppModel = (CancelBookingAppModel) obj;
        return this.f980a == cancelBookingAppModel.f980a && Intrinsics.d(this.b, cancelBookingAppModel.b);
    }

    public final int hashCode() {
        int iHashCode = this.f980a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CancelBookingAppModel(status=" + this.f980a + ", message=" + this.b + ")";
    }
}
