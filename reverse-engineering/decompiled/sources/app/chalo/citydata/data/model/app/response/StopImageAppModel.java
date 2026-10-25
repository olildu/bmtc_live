package app.chalo.citydata.data.model.app.response;

import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/StopImageAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopImageAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1747a;
    public final List b;

    public StopImageAppModel(String str, List imageUrls) {
        Intrinsics.i(imageUrls, "imageUrls");
        this.f1747a = str;
        this.b = imageUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopImageAppModel)) {
            return false;
        }
        StopImageAppModel stopImageAppModel = (StopImageAppModel) obj;
        return Intrinsics.d(this.f1747a, stopImageAppModel.f1747a) && Intrinsics.d(this.b, stopImageAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1747a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("StopImageAppModel(stopId=", this.f1747a, ", imageUrls=", ")", this.b);
    }
}
