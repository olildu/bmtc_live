package app.chalo.titoridedetail.ui;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TITORideDetailMapUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TITORideDetailMapUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9703a;
    public final boolean b;
    public final MapCameraViewState c;

    public TITORideDetailMapUiModel(List mapStopsPolylineDetails, boolean z, MapCameraViewState mapCameraViewState) {
        Intrinsics.i(mapStopsPolylineDetails, "mapStopsPolylineDetails");
        this.f9703a = mapStopsPolylineDetails;
        this.b = z;
        this.c = mapCameraViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITORideDetailMapUiModel)) {
            return false;
        }
        TITORideDetailMapUiModel tITORideDetailMapUiModel = (TITORideDetailMapUiModel) obj;
        return Intrinsics.d(this.f9703a, tITORideDetailMapUiModel.f9703a) && this.b == tITORideDetailMapUiModel.b && Intrinsics.d(this.c, tITORideDetailMapUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f9703a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TITORideDetailMapUiModel(mapStopsPolylineDetails=" + this.f9703a + ", isLocationEnabled=" + this.b + ", mapCameraViewState=" + this.c + ")";
    }
}
