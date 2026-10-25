package app.chalo.stoptripdetails.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.n21;
import defpackage.q7;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/LocationSummaryPayloadResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationSummaryPayloadResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9494a;
    public final List b;
    public final String c;
    public final Double d;
    public final StopAppModel e;
    public final String f;

    public LocationSummaryPayloadResponseAppModel(String str, List list, String str2, Double d, StopAppModel stopAppModel, String stopId) {
        Intrinsics.i(stopId, "stopId");
        this.f9494a = str;
        this.b = list;
        this.c = str2;
        this.d = d;
        this.e = stopAppModel;
        this.f = stopId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSummaryPayloadResponseAppModel)) {
            return false;
        }
        LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel = (LocationSummaryPayloadResponseAppModel) obj;
        return Intrinsics.d(this.f9494a, locationSummaryPayloadResponseAppModel.f9494a) && Intrinsics.d(this.b, locationSummaryPayloadResponseAppModel.b) && Intrinsics.d(this.c, locationSummaryPayloadResponseAppModel.c) && Intrinsics.d(this.d, locationSummaryPayloadResponseAppModel.d) && Intrinsics.d(this.e, locationSummaryPayloadResponseAppModel.e) && Intrinsics.d(this.f, locationSummaryPayloadResponseAppModel.f);
    }

    public final int hashCode() {
        int iB = r30.b(this.f9494a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.d;
        return this.f.hashCode() + n21.b(this.e, (iHashCode + (d != null ? d.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("LocationSummaryPayloadResponseAppModel(id=", this.f9494a, ", summary=", ", agencyName=", this.b);
        sbH.append(this.c);
        sbH.append(", distance=");
        sbH.append(this.d);
        sbH.append(", stop=");
        sbH.append(this.e);
        sbH.append(", stopId=");
        sbH.append(this.f);
        sbH.append(")");
        return sbH.toString();
    }
}
