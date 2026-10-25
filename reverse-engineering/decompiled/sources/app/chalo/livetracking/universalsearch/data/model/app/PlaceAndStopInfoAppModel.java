package app.chalo.livetracking.universalsearch.data.model.app;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/PlaceAndStopInfoAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlaceAndStopInfoAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UniversalSearchResultType f4992a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final LatLng f;
    public final ChaloTransitMode g;
    public final String h;
    public final String i;

    public PlaceAndStopInfoAppModel(UniversalSearchResultType resultType, LatLng stopLocation, ChaloTransitMode transitMode, String description, String placeId, String stopId, String stopName, String str, String searchPartner) {
        Intrinsics.i(resultType, "resultType");
        Intrinsics.i(description, "description");
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(stopLocation, "stopLocation");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(searchPartner, "searchPartner");
        this.f4992a = resultType;
        this.b = description;
        this.c = placeId;
        this.d = stopId;
        this.e = stopName;
        this.f = stopLocation;
        this.g = transitMode;
        this.h = str;
        this.i = searchPartner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceAndStopInfoAppModel)) {
            return false;
        }
        PlaceAndStopInfoAppModel placeAndStopInfoAppModel = (PlaceAndStopInfoAppModel) obj;
        return this.f4992a == placeAndStopInfoAppModel.f4992a && Intrinsics.d(this.b, placeAndStopInfoAppModel.b) && Intrinsics.d(this.c, placeAndStopInfoAppModel.c) && Intrinsics.d(this.d, placeAndStopInfoAppModel.d) && Intrinsics.d(this.e, placeAndStopInfoAppModel.e) && Intrinsics.d(this.f, placeAndStopInfoAppModel.f) && this.g == placeAndStopInfoAppModel.g && Intrinsics.d(this.h, placeAndStopInfoAppModel.h) && Intrinsics.d(this.i, placeAndStopInfoAppModel.i);
    }

    public final int hashCode() {
        int iC = n21.c(this.g, i71.d(this.f, nf1.e(nf1.e(nf1.e(nf1.e(this.f4992a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
        String str = this.h;
        return this.i.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceAndStopInfoAppModel(resultType=");
        sb.append(this.f4992a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", placeId=");
        cb0.t(sb, this.c, ", stopId=", this.d, ", stopName=");
        sb.append(this.e);
        sb.append(", stopLocation=");
        sb.append(this.f);
        sb.append(", transitMode=");
        sb.append(this.g);
        sb.append(", stopAddress=");
        sb.append(this.h);
        sb.append(", searchPartner=");
        return vo1.p(sb, this.i, ")");
    }
}
