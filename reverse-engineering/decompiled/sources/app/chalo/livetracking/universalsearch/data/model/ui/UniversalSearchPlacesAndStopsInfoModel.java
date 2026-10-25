package app.chalo.livetracking.universalsearch.data.model.ui;

import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.i71;
import defpackage.n21;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchPlacesAndStopsInfoModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchPlacesAndStopsInfoModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UniversalSearchResultType f5003a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ChaloTransitMode f;
    public final LatLng g;
    public final String h;
    public final String i;

    public UniversalSearchPlacesAndStopsInfoModel(UniversalSearchResultType resultType, LatLng latLng, ChaloTransitMode transitMode, String str, String str2, String stopId, String stopName, String str3, String searchPartner) {
        Intrinsics.i(resultType, "resultType");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(searchPartner, "searchPartner");
        this.f5003a = resultType;
        this.b = str;
        this.c = str2;
        this.d = stopId;
        this.e = stopName;
        this.f = transitMode;
        this.g = latLng;
        this.h = str3;
        this.i = searchPartner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchPlacesAndStopsInfoModel)) {
            return false;
        }
        UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = (UniversalSearchPlacesAndStopsInfoModel) obj;
        return this.f5003a == universalSearchPlacesAndStopsInfoModel.f5003a && Intrinsics.d(this.b, universalSearchPlacesAndStopsInfoModel.b) && Intrinsics.d(this.c, universalSearchPlacesAndStopsInfoModel.c) && Intrinsics.d(this.d, universalSearchPlacesAndStopsInfoModel.d) && Intrinsics.d(this.e, universalSearchPlacesAndStopsInfoModel.e) && this.f == universalSearchPlacesAndStopsInfoModel.f && Intrinsics.d(this.g, universalSearchPlacesAndStopsInfoModel.g) && Intrinsics.d(this.h, universalSearchPlacesAndStopsInfoModel.h) && Intrinsics.d(this.i, universalSearchPlacesAndStopsInfoModel.i);
    }

    public final int hashCode() {
        int iHashCode = this.f5003a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = i71.d(this.g, n21.c(this.f, nf1.e(nf1.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31);
        String str3 = this.h;
        return this.i.hashCode() + ((iD + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalSearchPlacesAndStopsInfoModel(resultType=");
        sb.append(this.f5003a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", placeId=");
        cb0.t(sb, this.c, ", stopId=", this.d, ", stopName=");
        sb.append(this.e);
        sb.append(", transitMode=");
        sb.append(this.f);
        sb.append(", latLng=");
        sb.append(this.g);
        sb.append(", stopAddress=");
        sb.append(this.h);
        sb.append(", searchPartner=");
        return vo1.p(sb, this.i, ")");
    }
}
