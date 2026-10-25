package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesDataState;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteViewTargetType;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerInfo;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.routeselection.data.remote.AvailableRoutesFetchFailedException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r31 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19174a;

    public /* synthetic */ r31(int i) {
        this.f19174a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19174a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                RouteDetailsDataState it = (RouteDetailsDataState) obj;
                Intrinsics.i(it, "it");
                return RouteDetailsDataState.a(it, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -524289, 127);
            case 1:
                RouteDetailsDataState it2 = (RouteDetailsDataState) obj;
                Intrinsics.i(it2, "it");
                return RouteDetailsDataState.a(it2, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, Integer.MAX_VALUE, 127);
            case 2:
                RouteDetailsDataState it3 = (RouteDetailsDataState) obj;
                Intrinsics.i(it3, "it");
                return RouteDetailsDataState.a(it3, false, null, null, null, null, null, null, RouteDetailsViewType.MainScreen.f4880a, null, null, null, null, null, false, true, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -4259969, ComposerImplKt.nodeKey);
            case 3:
                RouteDetailsDataState it4 = (RouteDetailsDataState) obj;
                Intrinsics.i(it4, "it");
                return RouteDetailsDataState.a(it4, false, null, null, null, null, null, null, RouteDetailsViewType.MainScreen.f4880a, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -129, ComposerImplKt.nodeKey);
            case 4:
                RouteDetailsDataState it5 = (RouteDetailsDataState) obj;
                Intrinsics.i(it5, "it");
                return RouteDetailsDataState.a(it5, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -4194305, 127);
            case 5:
                RouteDetailsDataState it6 = (RouteDetailsDataState) obj;
                Intrinsics.i(it6, "it");
                List<RouteDetailsMapStopMarkerInfo> list = it6.B;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                for (RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfoA : list) {
                    if (routeDetailsMapStopMarkerInfoA.h) {
                        routeDetailsMapStopMarkerInfoA = RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfoA, StopEtaStatus.ETA_NOT_AVAILABLE, StopEtaUiModel.NotAvailable.f4416a, null, false, 1907);
                    }
                    arrayList.add(routeDetailsMapStopMarkerInfoA);
                }
                return RouteDetailsDataState.a(it6, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, arrayList, null, false, false, null, null, false, null, false, null, false, -268435457, 127);
            case 6:
                RouteDetailsDataState it7 = (RouteDetailsDataState) obj;
                Intrinsics.i(it7, "it");
                List<LiveVehiclesMarkerInfo> list2 = it7.C;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                for (LiveVehiclesMarkerInfo liveVehiclesMarkerInfoA : list2) {
                    if (liveVehiclesMarkerInfoA.c) {
                        liveVehiclesMarkerInfoA = LiveVehiclesMarkerInfo.a(liveVehiclesMarkerInfoA, false, null);
                    }
                    arrayList2.add(liveVehiclesMarkerInfoA);
                }
                return RouteDetailsDataState.a(it7, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, arrayList2, false, false, null, null, false, null, false, null, false, -536870913, 127);
            case 7:
                return RouteDetailsDataState.a((RouteDetailsDataState) obj, false, null, null, null, null, null, null, RouteDetailsViewType.Error.f4879a, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -130, ComposerImplKt.nodeKey);
            case 8:
                return RouteDetailsDataState.a((RouteDetailsDataState) obj, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -65537, 127);
            case 9:
                Intrinsics.i((SheetValue) obj, "it");
                return Boolean.TRUE;
            case 10:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                RouteViewTargetType viewType = (RouteViewTargetType) AnimatedContent.getTargetState();
                Intrinsics.i(viewType, "viewType");
                int i2 = RouteDetailsScreenKt.WhenMappings.f4464a[viewType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3 || i2 == 4) {
                        return ContentAnimationTransitionSpecKt.b(AnimatedContent);
                    }
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return ContentAnimationTransitionSpecKt.d(AnimatedContent);
            case 11:
                RouteViewTargetType it8 = (RouteViewTargetType) obj;
                Intrinsics.i(it8, "it");
                return it8;
            case 12:
                String it9 = (String) obj;
                float f = RouteDetailsStopsListUIStateFactory.c;
                Intrinsics.i(it9, "it");
                return Boolean.valueOf(it9.length() > 0);
            case 13:
                Intrinsics.i((RouteDetailsIntent) obj, "it");
                return unit;
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new AvailableRoutesFetchFailedException(genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 15:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("routes_table");
                return unit;
            case 16:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("routes_table");
                return unit;
            case 17:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("routes_table");
                return unit;
            case 18:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 19:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("routes_table");
                return unit;
            case 20:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("routes_table");
                return unit;
            case 21:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("routes_table");
                return unit;
            case 22:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("routes_table");
                return unit;
            case 23:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("routes_table");
                return unit;
            case 24:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("routes_table");
                return unit;
            case 25:
                SavedPlacesAndRidesDataState it10 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it10, "it");
                return SavedPlacesAndRidesDataState.a(it10, false, false, null, null, null, null, false, false, 479);
            case 26:
                SavedPlacesAndRidesDataState it11 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it11, "it");
                return SavedPlacesAndRidesDataState.a(it11, false, false, null, null, null, null, true, false, 351);
            case 27:
                SavedPlacesAndRidesDataState it12 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it12, "it");
                return SavedPlacesAndRidesDataState.a(it12, true, true, null, null, null, null, false, false, 252);
            case 28:
                SavedPlacesAndRidesDataState it13 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it13, "it");
                return SavedPlacesAndRidesDataState.a(it13, false, false, null, null, null, null, true, false, 383);
            default:
                SavedPlacesAndRidesDataState it14 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it14, "it");
                return SavedPlacesAndRidesDataState.a(it14, false, false, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT);
        }
    }
}
