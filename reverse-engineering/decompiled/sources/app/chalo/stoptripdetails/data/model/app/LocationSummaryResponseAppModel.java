package app.chalo.stoptripdetails.data.model.app;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/LocationSummaryResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationSummaryResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9495a;
    public final String b;

    public LocationSummaryResponseAppModel(ArrayList arrayList, String status) {
        Intrinsics.i(status, "status");
        this.f9495a = arrayList;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSummaryResponseAppModel)) {
            return false;
        }
        LocationSummaryResponseAppModel locationSummaryResponseAppModel = (LocationSummaryResponseAppModel) obj;
        return this.f9495a.equals(locationSummaryResponseAppModel.f9495a) && Intrinsics.d(this.b, locationSummaryResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9495a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationSummaryResponseAppModel(payload=" + this.f9495a + ", status=" + this.b + ")";
    }
}
