package app.chalo.productbooking.common.data.models.app.request;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/request/BulkPreBookRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BulkPreBookRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8230a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;

    public BulkPreBookRequestAppModel(String str, String passId, String endStopId, String startStopId, List requestedTripIds, List seatPreference, boolean z) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(requestedTripIds, "requestedTripIds");
        Intrinsics.i(seatPreference, "seatPreference");
        this.f8230a = str;
        this.b = passId;
        this.c = endStopId;
        this.d = startStopId;
        this.e = requestedTripIds;
        this.f = seatPreference;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkPreBookRequestAppModel)) {
            return false;
        }
        BulkPreBookRequestAppModel bulkPreBookRequestAppModel = (BulkPreBookRequestAppModel) obj;
        return Intrinsics.d(this.f8230a, bulkPreBookRequestAppModel.f8230a) && Intrinsics.d(this.b, bulkPreBookRequestAppModel.b) && Intrinsics.d(this.c, bulkPreBookRequestAppModel.c) && Intrinsics.d(this.d, bulkPreBookRequestAppModel.d) && Intrinsics.d(this.e, bulkPreBookRequestAppModel.e) && Intrinsics.d(this.f, bulkPreBookRequestAppModel.f) && this.g == bulkPreBookRequestAppModel.g;
    }

    public final int hashCode() {
        return r30.b(r30.b(nf1.e(nf1.e(nf1.e(this.f8230a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BulkPreBookRequestAppModel(city=", this.f8230a, ", passId=", this.b, ", endStopId=");
        cb0.t(sbE, this.c, ", startStopId=", this.d, ", requestedTripIds=");
        dd.o(sbE, this.e, ", seatPreference=", this.f, ", autoAssignForWomenReservation=");
        return b3.g(")", sbE, this.g);
    }
}
