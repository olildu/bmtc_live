package app.chalo.livetracking.universalsearch.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/PlacesInfoDataAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlacesInfoDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4993a;
    public final String b;
    public final String c;

    public PlacesInfoDataAppModel(String str, String str2, String searchPartner) {
        Intrinsics.i(searchPartner, "searchPartner");
        this.f4993a = str;
        this.b = str2;
        this.c = searchPartner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesInfoDataAppModel)) {
            return false;
        }
        PlacesInfoDataAppModel placesInfoDataAppModel = (PlacesInfoDataAppModel) obj;
        return Intrinsics.d(this.f4993a, placesInfoDataAppModel.f4993a) && Intrinsics.d(this.b, placesInfoDataAppModel.b) && Intrinsics.d(this.c, placesInfoDataAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f4993a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("PlacesInfoDataAppModel(description=", this.f4993a, ", placeId=", this.b, ", searchPartner="), this.c, ")");
    }
}
