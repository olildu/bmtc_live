package app.chalo.titoridedetail.ui;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.ui.TitoRideDetailsScreenLiveBusMarker;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitoRideDetailsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TitoRideDataAppModel f9723a;
    public final TITORideDetailScreenType b;
    public final TITORideDetailBottomsheetType c;
    public final boolean d;
    public final TITORideDetailMapUiModel e;
    public final List f;
    public final TitoRideDetailsScreenLiveBusMarker g;
    public final List h;
    public final double i;
    public final boolean j;

    public TitoRideDetailsViewState(TitoRideDataAppModel titoRideDataAppModel, TITORideDetailScreenType titoRideDetailScreenType, TITORideDetailBottomsheetType titoTideDetailsBottomsheetType, boolean z, TITORideDetailMapUiModel tITORideDetailMapUiModel, List stopMarkerList, TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker, List missedTapOutItemsList, double d, boolean z2) {
        Intrinsics.i(titoRideDetailScreenType, "titoRideDetailScreenType");
        Intrinsics.i(titoTideDetailsBottomsheetType, "titoTideDetailsBottomsheetType");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        Intrinsics.i(missedTapOutItemsList, "missedTapOutItemsList");
        this.f9723a = titoRideDataAppModel;
        this.b = titoRideDetailScreenType;
        this.c = titoTideDetailsBottomsheetType;
        this.d = z;
        this.e = tITORideDetailMapUiModel;
        this.f = stopMarkerList;
        this.g = titoRideDetailsScreenLiveBusMarker;
        this.h = missedTapOutItemsList;
        this.i = d;
        this.j = z2;
    }

    public static TitoRideDetailsViewState a(TitoRideDetailsViewState titoRideDetailsViewState, TitoRideDataAppModel titoRideDataAppModel, TITORideDetailScreenType tITORideDetailScreenType, TITORideDetailBottomsheetType tITORideDetailBottomsheetType, boolean z, TITORideDetailMapUiModel tITORideDetailMapUiModel, ArrayList arrayList, TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker, List list, double d, boolean z2, int i) {
        if ((i & 1) != 0) {
            titoRideDataAppModel = titoRideDetailsViewState.f9723a;
        }
        TitoRideDataAppModel titoRideDataAppModel2 = titoRideDataAppModel;
        if ((i & 2) != 0) {
            tITORideDetailScreenType = titoRideDetailsViewState.b;
        }
        TITORideDetailScreenType titoRideDetailScreenType = tITORideDetailScreenType;
        if ((i & 4) != 0) {
            tITORideDetailBottomsheetType = titoRideDetailsViewState.c;
        }
        TITORideDetailBottomsheetType titoTideDetailsBottomsheetType = tITORideDetailBottomsheetType;
        titoRideDetailsViewState.getClass();
        boolean z3 = (i & 16) != 0 ? titoRideDetailsViewState.d : z;
        TITORideDetailMapUiModel mapUiModel = (i & 32) != 0 ? titoRideDetailsViewState.e : tITORideDetailMapUiModel;
        List stopMarkerList = (i & 64) != 0 ? titoRideDetailsViewState.f : arrayList;
        TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker2 = (i & 128) != 0 ? titoRideDetailsViewState.g : titoRideDetailsScreenLiveBusMarker;
        List missedTapOutItemsList = (i & 256) != 0 ? titoRideDetailsViewState.h : list;
        double d2 = (i & 512) != 0 ? titoRideDetailsViewState.i : d;
        boolean z4 = (i & 1024) != 0 ? titoRideDetailsViewState.j : z2;
        titoRideDetailsViewState.getClass();
        Intrinsics.i(titoRideDetailScreenType, "titoRideDetailScreenType");
        Intrinsics.i(titoTideDetailsBottomsheetType, "titoTideDetailsBottomsheetType");
        Intrinsics.i(mapUiModel, "mapUiModel");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        Intrinsics.i(missedTapOutItemsList, "missedTapOutItemsList");
        return new TitoRideDetailsViewState(titoRideDataAppModel2, titoRideDetailScreenType, titoTideDetailsBottomsheetType, z3, mapUiModel, stopMarkerList, titoRideDetailsScreenLiveBusMarker2, missedTapOutItemsList, d2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoRideDetailsViewState)) {
            return false;
        }
        TitoRideDetailsViewState titoRideDetailsViewState = (TitoRideDetailsViewState) obj;
        return Intrinsics.d(this.f9723a, titoRideDetailsViewState.f9723a) && this.b == titoRideDetailsViewState.b && this.c == titoRideDetailsViewState.c && this.d == titoRideDetailsViewState.d && Intrinsics.d(this.e, titoRideDetailsViewState.e) && Intrinsics.d(this.f, titoRideDetailsViewState.f) && Intrinsics.d(this.g, titoRideDetailsViewState.g) && Intrinsics.d(this.h, titoRideDetailsViewState.h) && Double.compare(this.i, titoRideDetailsViewState.i) == 0 && this.j == titoRideDetailsViewState.j;
    }

    public final int hashCode() {
        TitoRideDataAppModel titoRideDataAppModel = this.f9723a;
        int iB = r30.b((this.e.hashCode() + ((((((this.c.hashCode() + ((this.b.hashCode() + ((titoRideDataAppModel == null ? 0 : titoRideDataAppModel.hashCode()) * 31)) * 31)) * 31) + 1237) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31, 31, this.f);
        TitoRideDetailsScreenLiveBusMarker titoRideDetailsScreenLiveBusMarker = this.g;
        int iB2 = r30.b((iB + (titoRideDetailsScreenLiveBusMarker != null ? titoRideDetailsScreenLiveBusMarker.hashCode() : 0)) * 31, 31, this.h);
        long jDoubleToLongBits = Double.doubleToLongBits(this.i);
        return ((iB2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        return "TitoRideDetailsViewState(titoRideDataAppModel=" + this.f9723a + ", titoRideDetailScreenType=" + this.b + ", titoTideDetailsBottomsheetType=" + this.c + ", showCardDisclaimerMessage=false, shouldSyncingDataLoader=" + this.d + ", mapUiModel=" + this.e + ", stopMarkerList=" + this.f + ", vehicleMarker=" + this.g + ", missedTapOutItemsList=" + this.h + ", swipeToProceedPercentage=" + this.i + ", showNavigationBackButton=" + this.j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TitoRideDetailsViewState() {
        TITORideDetailScreenType tITORideDetailScreenType = TITORideDetailScreenType.MAP_WITH_ETA_BOTTOM_SHEET;
        TITORideDetailBottomsheetType tITORideDetailBottomsheetType = TITORideDetailBottomsheetType.NONE;
        EmptyList emptyList = EmptyList.f17557a;
        this(null, tITORideDetailScreenType, tITORideDetailBottomsheetType, false, new TITORideDetailMapUiModel(emptyList, false, MapCameraViewState.InitialState.NoState.f1881a), emptyList, null, emptyList, 0.8d, false);
    }
}
