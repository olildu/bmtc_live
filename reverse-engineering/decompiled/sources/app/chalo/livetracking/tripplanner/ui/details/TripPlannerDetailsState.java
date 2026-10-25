package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import defpackage.dd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerDetailsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4739a;
    public final String b;
    public final Integer c;
    public final List d;
    public final TripPlannerPurchaseHooksUiState e;
    public final TripPlannerDetailsMapUiModel f;
    public final List g;
    public final TripPlannerDetailsBottomSheetType h;

    public TripPlannerDetailsState(String str, String str2, Integer num, List list, TripPlannerPurchaseHooksUiState tripPlannerPurchaseHooksUiState, TripPlannerDetailsMapUiModel tripPlannerDetailsMapUiModel, List stopMarkerList, TripPlannerDetailsBottomSheetType tripPlannerDetailsBottomSheetType) {
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        this.f4739a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
        this.e = tripPlannerPurchaseHooksUiState;
        this.f = tripPlannerDetailsMapUiModel;
        this.g = stopMarkerList;
        this.h = tripPlannerDetailsBottomSheetType;
    }

    public static TripPlannerDetailsState a(TripPlannerDetailsState tripPlannerDetailsState, String str, String str2, Integer num, List list, TripPlannerPurchaseHooksUiState tripPlannerPurchaseHooksUiState, TripPlannerDetailsMapUiModel tripPlannerDetailsMapUiModel, List list2, TripPlannerDetailsBottomSheetType.MetroTicketPurchaseBottomSheet metroTicketPurchaseBottomSheet, int i) {
        if ((i & 1) != 0) {
            str = tripPlannerDetailsState.f4739a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = tripPlannerDetailsState.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            num = tripPlannerDetailsState.c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            list = tripPlannerDetailsState.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            tripPlannerPurchaseHooksUiState = tripPlannerDetailsState.e;
        }
        TripPlannerPurchaseHooksUiState purchaseHooksState = tripPlannerPurchaseHooksUiState;
        if ((i & 32) != 0) {
            tripPlannerDetailsMapUiModel = tripPlannerDetailsState.f;
        }
        TripPlannerDetailsMapUiModel mapUiModel = tripPlannerDetailsMapUiModel;
        List stopMarkerList = (i & 64) != 0 ? tripPlannerDetailsState.g : list2;
        tripPlannerDetailsState.getClass();
        TripPlannerDetailsBottomSheetType tripPlannerDetailsBottomSheetType = (i & 256) != 0 ? tripPlannerDetailsState.h : metroTicketPurchaseBottomSheet;
        tripPlannerDetailsState.getClass();
        Intrinsics.i(purchaseHooksState, "purchaseHooksState");
        Intrinsics.i(mapUiModel, "mapUiModel");
        Intrinsics.i(stopMarkerList, "stopMarkerList");
        return new TripPlannerDetailsState(str3, str4, num2, list3, purchaseHooksState, mapUiModel, stopMarkerList, tripPlannerDetailsBottomSheetType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerDetailsState)) {
            return false;
        }
        TripPlannerDetailsState tripPlannerDetailsState = (TripPlannerDetailsState) obj;
        return Intrinsics.d(this.f4739a, tripPlannerDetailsState.f4739a) && Intrinsics.d(this.b, tripPlannerDetailsState.b) && Intrinsics.d(this.c, tripPlannerDetailsState.c) && Intrinsics.d(this.d, tripPlannerDetailsState.d) && Intrinsics.d(this.e, tripPlannerDetailsState.e) && Intrinsics.d(this.f, tripPlannerDetailsState.f) && Intrinsics.d(this.g, tripPlannerDetailsState.g) && Intrinsics.d(this.h, tripPlannerDetailsState.h);
    }

    public final int hashCode() {
        String str = this.f4739a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31) + 1237) * 31;
        TripPlannerDetailsBottomSheetType tripPlannerDetailsBottomSheetType = this.h;
        return iHashCode4 + (tripPlannerDetailsBottomSheetType != null ? tripPlannerDetailsBottomSheetType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TripPlannerDetailsState(totalFareString=", this.f4739a, ", totalTravelTimeString=", this.b, ", totalChangeCount=");
        sbE.append(this.c);
        sbE.append(", tripPlannerLegUiModelList=");
        sbE.append(this.d);
        sbE.append(", purchaseHooksState=");
        sbE.append(this.e);
        sbE.append(", mapUiModel=");
        sbE.append(this.f);
        sbE.append(", stopMarkerList=");
        sbE.append(this.g);
        sbE.append(", showLoadingDialog=false, bottomSheetType=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TripPlannerDetailsState(List list, int i) {
        String str = (i & 1) != 0 ? null : "245";
        String str2 = (i & 2) != 0 ? null : "1234";
        Integer num = (i & 4) != 0 ? null : 5;
        List list2 = (i & 8) != 0 ? null : list;
        EmptyList emptyList = EmptyList.f17557a;
        this(str, str2, num, list2, TripPlannerPurchaseHooksUiState.Loading.f4741a, new TripPlannerDetailsMapUiModel(emptyList, false, MapCameraViewState.InitialState.NoState.f1881a), emptyList, null);
    }
}
