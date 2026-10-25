package defpackage;

import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteTripTimingAppModel;
import app.chalo.citydata.data.model.app.ShortTripTimingAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.compose.components.ChaloRecentlySearchedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.core.Recent_location_pair_table;
import app.chalo.core.Recent_location_pair_tableQueries;
import app.chalo.core.Recent_place_table;
import app.chalo.core.Recent_place_tableQueries;
import app.chalo.core.Recent_route_table;
import app.chalo.core.Recent_route_tableQueries;
import app.chalo.core.Recent_stop_and_route_based_trip_table;
import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import app.chalo.core.Recent_stop_based_trip_table;
import app.chalo.core.Recent_stop_based_trip_tableQueries;
import app.chalo.core.Recent_stop_table;
import app.chalo.core.Recent_stop_tableQueries;
import app.chalo.core.Recent_trip_table;
import app.chalo.core.Recent_trip_tableQueries;
import app.chalo.core.Ride_based_super_pass_ride_details_table;
import app.chalo.core.Ride_based_super_pass_ride_details_tableQueries;
import app.chalo.core.Ride_based_super_pass_table;
import app.chalo.core.Ride_based_super_pass_tableQueries;
import app.chalo.core.Ride_booking_user_feedback_table;
import app.chalo.core.Ride_booking_user_feedback_tableQueries;
import app.chalo.core.Routes_table;
import app.chalo.core.Routes_tableQueries;
import app.chalo.core.database.dao.RideBookingUserFeedbackDaoImpl;
import app.chalo.core.database.dao.RouteDaoImpl;
import app.chalo.core.database.mappers.RoutesTableMappers;
import app.chalo.data.ProductBookingBranding;
import app.chalo.home.data.model.app.LocationTooltipData;
import app.chalo.home.data.model.app.LocationTurnOnTooltipType;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataHolder;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerState;
import app.chalo.home.nearbytrips.domain.NearbyTripsFetchStatus;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiStateTracker;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.instantticket.ui.routeselection.RouteSelectionViewState;
import app.chalo.juspay.JuspayOperationFailure;
import app.chalo.juspay.JuspaySdkStatus;
import app.chalo.livetracking.routedetails.data.model.app.response.SeatAvailabilityAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleSeatAvailabilityDetailsAppModel;
import app.chalo.livetracking.routedetails.data.model.ui.BusMapInfoWindowUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.FixedEtaUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModelKt;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteTimeTableUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.TimeTableUiModel;
import app.chalo.livetracking.routedetails.domain.GetRouteTimeTableUiModelUseCase;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerInfo;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo;
import app.chalo.location.LocationUpdateResult;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.routeselection.ui.RouteSelectionBottomSheetType;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import app.chalo.routeselection.ui.compose.ComposableSingletons$RouteSelectionBottomSheetKt;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.uistate.components.ChaloRecentlySearchedCardUiState;
import app.chalo.uistate.components.RecentlySearchedContainerSpec;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.firebase.remoteconfig.ConfigUpdate;
import defpackage.hq0;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19617a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t01(int i, Object obj, Object obj2) {
        this.f19617a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj) {
        String str;
        Object next;
        Object next2;
        RouteDetailsComponent routeDetailsComponent = (RouteDetailsComponent) this.b;
        RouteAppModel routeAppModel = (RouteAppModel) this.c;
        RouteDetailsDataState viewState = (RouteDetailsDataState) obj;
        Intrinsics.i(viewState, "viewState");
        GetRouteTimeTableUiModelUseCase getRouteTimeTableUiModelUseCase = routeDetailsComponent.w;
        RouteTripTimingAppModel routeTiming = routeAppModel.i;
        List routeStopsList = routeAppModel.e;
        getRouteTimeTableUiModelUseCase.getClass();
        Intrinsics.i(routeTiming, "routeTiming");
        Intrinsics.i(routeStopsList, "routeStopsList");
        TimeTableUiModel timeTableUiModelA = getRouteTimeTableUiModelUseCase.a(((StopAppModel) CollectionsKt.F(routeStopsList)).b, ((StopAppModel) CollectionsKt.P(routeStopsList)).b, routeTiming.d);
        List<ShortTripTimingAppModel> list = routeTiming.c;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (ShortTripTimingAppModel shortTripTimingAppModel : list) {
            List list2 = shortTripTimingAppModel.c;
            List list3 = routeStopsList;
            Iterator it = list3.iterator();
            do {
                str = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((StopAppModel) next).f1727a, shortTripTimingAppModel.f1724a));
            StopAppModel stopAppModel = (StopAppModel) next;
            String str2 = stopAppModel != null ? stopAppModel.b : null;
            Iterator it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.d(((StopAppModel) next2).f1727a, shortTripTimingAppModel.b));
            StopAppModel stopAppModel2 = (StopAppModel) next2;
            if (stopAppModel2 != null) {
                str = stopAppModel2.b;
            }
            arrayList.add(getRouteTimeTableUiModelUseCase.a(str2, str, list2));
        }
        return RouteDetailsDataState.a(viewState, false, null, null, null, null, null, null, RouteDetailsViewType.TimeTable.f4883a, null, null, null, RouteDetailsMapUiModelKt.b(viewState.m, routeDetailsComponent.z0), new RouteTimeTableUiModel(timeTableUiModelA, arrayList), false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -12417, ComposerImplKt.nodeKey);
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0280  */
    /* JADX WARN: Code duplicated, block: B:70:0x032a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        Object obj2;
        VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel;
        Object obj3;
        VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel2;
        switch (this.f19617a) {
            case 0:
                final List list = (List) this.b;
                final RecentlySearchedContainerSpec recentlySearchedContainerSpec = (RecentlySearchedContainerSpec) this.c;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.compose.tabheader.RecentSearchesRowKt$RegularBusRecentSearchesRow$lambda$2$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list.get(((Number) obj4).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.compose.tabheader.RecentSearchesRowKt$RegularBusRecentSearchesRow$lambda$2$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            ChaloRecentlySearchedCardUiState chaloRecentlySearchedCardUiState = (ChaloRecentlySearchedCardUiState) list.get(iIntValue);
                            composer.startReplaceGroup(-1322114634);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ChaloRecentlySearchedCardKt.a(hq0.c("PL_Recent_Searched_Item_", iIntValue, companion), chaloRecentlySearchedCardUiState, composer, 0);
                            if (iIntValue < CollectionsKt.K(list)) {
                                composer.startReplaceGroup(2066718827);
                                ChaloSpacersKt.a(recentlySearchedContainerSpec.c, composer, 0);
                            } else {
                                composer.startReplaceGroup(2065311985);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return Unit.f17538a;
            case 1:
                Recent_location_pair_table recent_location_pair_table = (Recent_location_pair_table) this.b;
                Recent_location_pair_tableQueries recent_location_pair_tableQueries = (Recent_location_pair_tableQueries) this.c;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, recent_location_pair_table.f1990a);
                execute.bindString(1, recent_location_pair_table.b);
                execute.bindString(2, (String) recent_location_pair_tableQueries.b.f1991a.encode(recent_location_pair_table.c));
                execute.bindString(3, (String) recent_location_pair_tableQueries.b.b.encode(recent_location_pair_table.d));
                execute.d(4, Long.valueOf(recent_location_pair_table.e));
                execute.d(5, Long.valueOf(recent_location_pair_table.f));
                return Unit.f17538a;
            case 2:
                Recent_place_table recent_place_table = (Recent_place_table) this.b;
                Recent_place_tableQueries recent_place_tableQueries = (Recent_place_tableQueries) this.c;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, recent_place_table.f1992a);
                execute2.bindString(1, recent_place_table.b);
                execute2.bindString(2, recent_place_table.c);
                execute2.bindString(3, recent_place_table.d);
                execute2.bindString(4, recent_place_table.e);
                execute2.bindString(5, (String) recent_place_tableQueries.b.f1993a.encode(recent_place_table.f));
                execute2.bindString(6, (String) recent_place_tableQueries.b.b.encode(recent_place_table.g));
                execute2.d(7, Long.valueOf(recent_place_table.h));
                execute2.d(8, Long.valueOf(recent_place_table.i));
                execute2.bindString(9, recent_place_table.j);
                return Unit.f17538a;
            case 3:
                Recent_route_table recent_route_table = (Recent_route_table) this.b;
                Recent_route_tableQueries recent_route_tableQueries = (Recent_route_tableQueries) this.c;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, recent_route_table.f1994a);
                execute3.bindString(1, recent_route_table.b);
                execute3.bindString(2, recent_route_table.c);
                execute3.bindString(3, recent_route_table.d);
                execute3.bindString(4, recent_route_table.e);
                execute3.bindString(5, recent_route_table.f);
                execute3.b(6, Boolean.valueOf(recent_route_table.g));
                List list2 = recent_route_table.h;
                execute3.bindString(7, list2 != null ? (String) recent_route_tableQueries.b.f1995a.encode(list2) : null);
                execute3.b(8, Boolean.valueOf(recent_route_table.i));
                Recent_route_table.Adapter adapter = recent_route_tableQueries.b;
                execute3.bindString(9, (String) adapter.b.encode(recent_route_table.j));
                execute3.bindString(10, (String) adapter.c.encode(recent_route_table.k));
                execute3.d(11, Long.valueOf(recent_route_table.l));
                execute3.d(12, Long.valueOf(recent_route_table.m));
                execute3.bindString(13, recent_route_table.n);
                execute3.bindString(14, (String) adapter.d.encode(recent_route_table.o));
                return Unit.f17538a;
            case 4:
                Recent_stop_and_route_based_trip_table recent_stop_and_route_based_trip_table = (Recent_stop_and_route_based_trip_table) this.b;
                Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries = (Recent_stop_and_route_based_trip_tableQueries) this.c;
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, recent_stop_and_route_based_trip_table.f1996a);
                execute4.bindString(1, recent_stop_and_route_based_trip_table.b);
                execute4.bindString(2, recent_stop_and_route_based_trip_table.c);
                execute4.bindString(3, recent_stop_and_route_based_trip_table.d);
                execute4.bindString(4, (String) recent_stop_and_route_based_trip_tableQueries.b.f1997a.encode(recent_stop_and_route_based_trip_table.e));
                Recent_stop_and_route_based_trip_table.Adapter adapter2 = recent_stop_and_route_based_trip_tableQueries.b;
                execute4.bindString(5, (String) adapter2.b.encode(recent_stop_and_route_based_trip_table.f));
                execute4.bindString(6, (String) adapter2.c.encode(recent_stop_and_route_based_trip_table.g));
                execute4.bindString(7, (String) adapter2.d.encode(recent_stop_and_route_based_trip_table.h));
                execute4.d(8, Long.valueOf(recent_stop_and_route_based_trip_table.i));
                execute4.d(9, Long.valueOf(recent_stop_and_route_based_trip_table.j));
                return Unit.f17538a;
            case 5:
                Recent_stop_based_trip_table recent_stop_based_trip_table = (Recent_stop_based_trip_table) this.b;
                Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries = (Recent_stop_based_trip_tableQueries) this.c;
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, recent_stop_based_trip_table.f1998a);
                execute5.bindString(1, recent_stop_based_trip_table.b);
                execute5.bindString(2, (String) recent_stop_based_trip_tableQueries.b.f1999a.encode(recent_stop_based_trip_table.c));
                Recent_stop_based_trip_table.Adapter adapter3 = recent_stop_based_trip_tableQueries.b;
                execute5.bindString(3, (String) adapter3.b.encode(recent_stop_based_trip_table.d));
                execute5.bindString(4, (String) adapter3.c.encode(recent_stop_based_trip_table.e));
                execute5.d(5, Long.valueOf(recent_stop_based_trip_table.f));
                execute5.d(6, Long.valueOf(recent_stop_based_trip_table.g));
                return Unit.f17538a;
            case 6:
                Recent_stop_table recent_stop_table = (Recent_stop_table) this.b;
                Recent_stop_tableQueries recent_stop_tableQueries = (Recent_stop_tableQueries) this.c;
                SqlPreparedStatement execute6 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute6, "$this$execute");
                execute6.bindString(0, recent_stop_table.f2000a);
                execute6.bindString(1, recent_stop_table.b);
                execute6.bindString(2, (String) recent_stop_tableQueries.b.f2001a.encode(recent_stop_table.c));
                execute6.bindString(3, (String) recent_stop_tableQueries.b.b.encode(recent_stop_table.d));
                execute6.d(4, Long.valueOf(recent_stop_table.e));
                execute6.d(5, Long.valueOf(recent_stop_table.f));
                execute6.bindString(6, recent_stop_table.g);
                return Unit.f17538a;
            case 7:
                Recent_trip_table recent_trip_table = (Recent_trip_table) this.b;
                Recent_trip_tableQueries recent_trip_tableQueries = (Recent_trip_tableQueries) this.c;
                SqlPreparedStatement execute7 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute7, "$this$execute");
                execute7.bindString(0, recent_trip_table.f2002a);
                execute7.bindString(1, recent_trip_table.b);
                execute7.bindString(2, (String) recent_trip_tableQueries.b.f2003a.encode(recent_trip_table.c));
                Recent_trip_table.Adapter adapter4 = recent_trip_tableQueries.b;
                execute7.bindString(3, (String) adapter4.b.encode(recent_trip_table.d));
                ChaloTransitMode chaloTransitMode = recent_trip_table.e;
                execute7.bindString(4, chaloTransitMode != null ? (String) adapter4.c.encode(chaloTransitMode) : null);
                execute7.d(5, Long.valueOf(recent_trip_table.f));
                execute7.d(6, Long.valueOf(recent_trip_table.g));
                return Unit.f17538a;
            case 8:
                return Recomposer.effectJob$lambda$0$0$0$0((Recomposer) this.b, (Throwable) this.c, (Throwable) obj);
            case 9:
                return Recomposer.writeObserverOf$lambda$0((ControlledComposition) this.b, (MutableScatterSet) this.c, obj);
            case 10:
                JuspayOperationFailure juspayOperationFailure = (JuspayOperationFailure) this.b;
                RegularBusComponent regularBusComponent = (RegularBusComponent) this.c;
                Map raiseScanAndPayEnded = (Map) obj;
                Intrinsics.i(raiseScanAndPayEnded, "$this$raiseScanAndPayEnded");
                JuspayOperationFailure.SdkNotReady sdkNotReady = juspayOperationFailure instanceof JuspayOperationFailure.SdkNotReady ? (JuspayOperationFailure.SdkNotReady) juspayOperationFailure : null;
                if (sdkNotReady != null) {
                    JuspaySdkStatus juspaySdkStatus = sdkNotReady.f4053a;
                    regularBusComponent.getClass();
                    if (Intrinsics.d(juspaySdkStatus, JuspaySdkStatus.NotInitialised.f4072a)) {
                        str2 = "not_initialised";
                    } else if (Intrinsics.d(juspaySdkStatus, JuspaySdkStatus.Terminating.f4074a)) {
                        str2 = "terminating";
                    } else if (juspaySdkStatus instanceof JuspaySdkStatus.Initialising) {
                        str2 = "initialising";
                    } else if (Intrinsics.d(juspaySdkStatus, JuspaySdkStatus.Ready.f4073a)) {
                        str2 = "ready";
                    } else if (juspaySdkStatus instanceof JuspaySdkStatus.InitiationFailed) {
                        str2 = "initiation_failed";
                    } else if (Intrinsics.d(juspaySdkStatus, JuspaySdkStatus.Abandoned.f4069a)) {
                        str2 = "abandoned";
                    } else {
                        if (!(juspaySdkStatus instanceof JuspaySdkStatus.TerminationFailed)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "termination_failed";
                    }
                    raiseScanAndPayEnded.put("sdkStatus", str2);
                }
                JuspayOperationFailure.Error error = juspayOperationFailure instanceof JuspayOperationFailure.Error ? (JuspayOperationFailure.Error) juspayOperationFailure : null;
                if (error != null && (str = error.f4051a) != null) {
                    raiseScanAndPayEnded.put("errorMessage", str);
                }
                return Unit.f17538a;
            case 11:
                RegularBusComponent regularBusComponent2 = (RegularBusComponent) this.b;
                NearbyTripsDataManagerState nearbyTripsDataManagerState = (NearbyTripsDataManagerState) this.c;
                RegularBusViewState it = (RegularBusViewState) obj;
                Intrinsics.i(it, "it");
                regularBusComponent2.getClass();
                NearbyTripsDataHolder nearbyTripsDataHolder = nearbyTripsDataManagerState.f3122a;
                boolean z = false;
                if ((nearbyTripsDataHolder != null ? (LocationSummaryPayloadResponseAppModel) CollectionsKt.L(0, nearbyTripsDataHolder.b) : null) == null && (nearbyTripsDataManagerState.b instanceof NearbyTripsFetchStatus.InProgress)) {
                    z = true;
                }
                return RegularBusViewState.a(it, false, null, null, null, z, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4194271);
            case 12:
                RegularBusComponent regularBusComponent3 = (RegularBusComponent) this.b;
                LocationUpdateResult.SettingsResolutionRequired settingsResolutionRequired = (LocationUpdateResult.SettingsResolutionRequired) this.c;
                RegularBusViewState it2 = (RegularBusViewState) obj;
                Intrinsics.i(it2, "it");
                return RegularBusViewState.a(it2, false, null, null, null, false, null, null, null, null, null, null, null, new LocationTooltipData(regularBusComponent3.s.getR(), LocationTurnOnTooltipType.RequestGpsTurnOn.f2945a), settingsResolutionRequired.f5157a, null, null, null, false, false, false, false, 4169727);
            case 13:
                final RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker = (RegularBusUnifiedAdUiStateTracker) this.b;
                final String str3 = (String) this.c;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt$RegularBusScreenContent$lambda$10$0$17$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker2 = regularBusUnifiedAdUiStateTracker;
                        regularBusUnifiedAdUiStateTracker2.getClass();
                        String str4 = regularBusUnifiedAdUiStateTracker2.b;
                        String str5 = str3;
                        if (Intrinsics.d(str4, str5)) {
                            regularBusUnifiedAdUiStateTracker2.f3637a.remove(str5);
                            regularBusUnifiedAdUiStateTracker2.b = null;
                            regularBusUnifiedAdUiStateTracker2.c = new RegularBusUnifiedAdUiState(0, 0, false, false);
                        }
                    }
                };
            case 14:
                ((ProducerScope) this.b).mo7576trySendJP2dKIU(((ConfigUpdate) this.c).getUpdatedKeys());
                return Unit.f17538a;
            case 15:
                List<String> list3 = (List) this.b;
                RideBookingUserFeedbackDaoImpl rideBookingUserFeedbackDaoImpl = (RideBookingUserFeedbackDaoImpl) this.c;
                for (String bookingId : list3) {
                    Ride_booking_user_feedback_tableQueries ride_booking_user_feedback_tableQueries = rideBookingUserFeedbackDaoImpl.f2077a;
                    ride_booking_user_feedback_tableQueries.getClass();
                    Intrinsics.i(bookingId, "bookingId");
                    ride_booking_user_feedback_tableQueries.f697a.A0(-691440752, "DELETE FROM ride_booking_user_feedback_table WHERE bookingId = ?", new f31(bookingId, 1));
                    ride_booking_user_feedback_tableQueries.T(-691440752, new x21(14));
                }
                return Unit.f17538a;
            case 16:
                Ride_based_super_pass_ride_details_table ride_based_super_pass_ride_details_table = (Ride_based_super_pass_ride_details_table) this.b;
                Ride_based_super_pass_ride_details_tableQueries ride_based_super_pass_ride_details_tableQueries = (Ride_based_super_pass_ride_details_tableQueries) this.c;
                SqlPreparedStatement execute8 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute8, "$this$execute");
                execute8.bindString(0, ride_based_super_pass_ride_details_table.f2004a);
                execute8.bindString(1, (String) ride_based_super_pass_ride_details_tableQueries.b.f2005a.encode(ride_based_super_pass_ride_details_table.b));
                execute8.b(2, Boolean.valueOf(ride_based_super_pass_ride_details_table.c));
                execute8.d(3, Long.valueOf(ride_based_super_pass_ride_details_table.d));
                execute8.b(4, Boolean.valueOf(ride_based_super_pass_ride_details_table.e));
                execute8.d(5, Long.valueOf(ride_based_super_pass_ride_details_table.f));
                execute8.d(6, Long.valueOf(ride_based_super_pass_ride_details_table.g));
                return Unit.f17538a;
            case 17:
                Function7 function7 = (Function7) this.b;
                Ride_based_super_pass_ride_details_tableQueries ride_based_super_pass_ride_details_tableQueries2 = (Ride_based_super_pass_ride_details_tableQueries) this.c;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Object objF = cb0.f(sqlCursor, 1, ride_based_super_pass_ride_details_tableQueries2.b.f2005a);
                Boolean bool = sqlCursor.getBoolean(2);
                Intrinsics.f(bool);
                Long l = sqlCursor.getLong(3);
                Intrinsics.f(l);
                Boolean bool2 = sqlCursor.getBoolean(4);
                Intrinsics.f(bool2);
                Long l2 = sqlCursor.getLong(5);
                Intrinsics.f(l2);
                Long l3 = sqlCursor.getLong(6);
                Intrinsics.f(l3);
                return function7.invoke(strI, objF, bool, l, bool2, l2, l3);
            case 18:
                Ride_based_super_pass_table ride_based_super_pass_table = (Ride_based_super_pass_table) this.b;
                Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries = (Ride_based_super_pass_tableQueries) this.c;
                SqlPreparedStatement execute9 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute9, "$this$execute");
                execute9.d(0, Long.valueOf(ride_based_super_pass_table.f2006a));
                execute9.d(1, Long.valueOf(ride_based_super_pass_table.b));
                execute9.bindString(2, (String) ride_based_super_pass_tableQueries.b.f2007a.encode(ride_based_super_pass_table.c));
                execute9.d(3, Long.valueOf(ride_based_super_pass_table.d));
                execute9.d(4, Long.valueOf(ride_based_super_pass_table.e));
                execute9.d(5, Long.valueOf(ride_based_super_pass_table.f));
                Ride_based_super_pass_table.Adapter adapter5 = ride_based_super_pass_tableQueries.b;
                execute9.bindString(6, (String) adapter5.b.encode(ride_based_super_pass_table.g));
                execute9.b(7, Boolean.valueOf(ride_based_super_pass_table.h));
                execute9.d(8, Long.valueOf(ride_based_super_pass_table.i));
                execute9.d(9, Long.valueOf(ride_based_super_pass_table.j));
                execute9.d(10, Long.valueOf(ride_based_super_pass_table.k));
                execute9.b(11, Boolean.valueOf(ride_based_super_pass_table.l));
                execute9.b(12, Boolean.valueOf(ride_based_super_pass_table.m));
                execute9.bindString(13, (String) adapter5.c.encode(ride_based_super_pass_table.n));
                execute9.d(14, Long.valueOf(ride_based_super_pass_table.o));
                execute9.c(15, Double.valueOf(ride_based_super_pass_table.p));
                execute9.bindString(16, ride_based_super_pass_table.q);
                execute9.d(17, Long.valueOf(ride_based_super_pass_table.r));
                execute9.bindString(18, (String) adapter5.d.encode(ride_based_super_pass_table.s));
                execute9.bindString(19, (String) adapter5.e.encode(ride_based_super_pass_table.t));
                execute9.d(20, Long.valueOf(ride_based_super_pass_table.u));
                execute9.bindString(21, ride_based_super_pass_table.v);
                execute9.bindString(22, ride_based_super_pass_table.w);
                execute9.bindString(23, ride_based_super_pass_table.x);
                execute9.bindString(24, ride_based_super_pass_table.y);
                execute9.bindString(25, ride_based_super_pass_table.z);
                execute9.bindString(26, ride_based_super_pass_table.A);
                execute9.bindString(27, (String) adapter5.f.encode(ride_based_super_pass_table.B));
                execute9.bindString(28, ride_based_super_pass_table.C);
                execute9.bindString(29, ride_based_super_pass_table.D);
                execute9.bindString(30, ride_based_super_pass_table.E);
                execute9.c(31, Double.valueOf(ride_based_super_pass_table.F));
                execute9.c(32, Double.valueOf(ride_based_super_pass_table.G));
                execute9.b(33, Boolean.valueOf(ride_based_super_pass_table.H));
                execute9.c(34, Double.valueOf(ride_based_super_pass_table.I));
                execute9.bindString(35, (String) adapter5.g.encode(ride_based_super_pass_table.J));
                execute9.b(36, Boolean.valueOf(ride_based_super_pass_table.K));
                execute9.d(37, Long.valueOf(ride_based_super_pass_table.L));
                execute9.bindString(38, ride_based_super_pass_table.M);
                execute9.bindString(39, ride_based_super_pass_table.N);
                execute9.bindString(40, ride_based_super_pass_table.O);
                execute9.bindString(41, ride_based_super_pass_table.P);
                execute9.bindString(42, (String) adapter5.h.encode(ride_based_super_pass_table.Q));
                execute9.bindString(43, ride_based_super_pass_table.R);
                execute9.bindString(44, ride_based_super_pass_table.S);
                execute9.bindString(45, ride_based_super_pass_table.T);
                execute9.bindString(46, ride_based_super_pass_table.U);
                execute9.d(47, Long.valueOf(ride_based_super_pass_table.V));
                execute9.d(48, Long.valueOf(ride_based_super_pass_table.W));
                execute9.b(49, Boolean.valueOf(ride_based_super_pass_table.X));
                execute9.b(50, Boolean.valueOf(ride_based_super_pass_table.Y));
                execute9.bindString(51, ride_based_super_pass_table.Z);
                execute9.bindString(52, ride_based_super_pass_table.a0);
                execute9.bindString(53, ride_based_super_pass_table.b0);
                execute9.bindString(54, ride_based_super_pass_table.c0);
                execute9.bindString(55, ride_based_super_pass_table.d0);
                execute9.bindString(56, ride_based_super_pass_table.e0);
                execute9.bindString(57, ride_based_super_pass_table.f0);
                RefundInfoEntityModel refundInfoEntityModel = ride_based_super_pass_table.g0;
                execute9.bindString(58, refundInfoEntityModel != null ? (String) adapter5.i.encode(refundInfoEntityModel) : null);
                execute9.bindString(59, (String) adapter5.j.encode(ride_based_super_pass_table.h0));
                execute9.d(60, ride_based_super_pass_table.i0);
                execute9.d(61, ride_based_super_pass_table.j0);
                execute9.b(62, ride_based_super_pass_table.k0);
                PremiumBusMeta premiumBusMeta = ride_based_super_pass_table.l0;
                execute9.bindString(63, premiumBusMeta != null ? (String) adapter5.k.encode(premiumBusMeta) : null);
                execute9.b(64, ride_based_super_pass_table.m0);
                return Unit.f17538a;
            case 19:
                Function6 function6 = (Function6) this.b;
                Ride_booking_user_feedback_tableQueries ride_booking_user_feedback_tableQueries2 = (Ride_booking_user_feedback_tableQueries) this.c;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string = sqlCursor2.getString(1);
                return function6.invoke(strI2, string, uf0.j(string, sqlCursor2, 2), sqlCursor2.getString(3), sqlCursor2.getString(4), cb0.f(sqlCursor2, 5, ride_booking_user_feedback_tableQueries2.b.f2009a));
            case 20:
                Ride_booking_user_feedback_table ride_booking_user_feedback_table = (Ride_booking_user_feedback_table) this.b;
                Ride_booking_user_feedback_tableQueries ride_booking_user_feedback_tableQueries3 = (Ride_booking_user_feedback_tableQueries) this.c;
                SqlPreparedStatement execute10 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute10, "$this$execute");
                execute10.bindString(0, ride_booking_user_feedback_table.f2008a);
                execute10.bindString(1, ride_booking_user_feedback_table.b);
                execute10.d(2, Long.valueOf(ride_booking_user_feedback_table.c));
                execute10.bindString(3, ride_booking_user_feedback_table.d);
                execute10.bindString(4, ride_booking_user_feedback_table.e);
                execute10.bindString(5, (String) ride_booking_user_feedback_tableQueries3.b.f2009a.encode(ride_booking_user_feedback_table.f));
                return Unit.f17538a;
            case 21:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, (ProductBookingRouteDetails) this.b, new ProductBookingStopDetails("", "", null), new ProductBookingStopDetails("", "", null), (ProductBookingBranding) this.c, false, null, null, null, false, 992);
            case 22:
                List list4 = (List) this.b;
                RouteDaoImpl routeDaoImpl = (RouteDaoImpl) this.c;
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    routeDaoImpl.f2079a.f0(RoutesTableMappers.b((RouteEntity) it3.next()));
                }
                return Unit.f17538a;
            case 23:
                RouteDetailsComponent routeDetailsComponent = (RouteDetailsComponent) this.b;
                StopEtaUiModel stopEtaUiModel = (StopEtaUiModel) this.c;
                RouteDetailsDataState it4 = (RouteDetailsDataState) obj;
                Intrinsics.i(it4, "it");
                return RouteDetailsDataState.a(it4, false, null, null, null, null, null, null, null, null, it4.b(routeDetailsComponent.f0, StopEtaStatus.ETA_NOT_AVAILABLE, stopEtaUiModel), null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -513, 127);
            case 24:
                RouteDetailsComponent routeDetailsComponent2 = (RouteDetailsComponent) this.b;
                SeatAvailabilityAppModel seatAvailabilityAppModel = (SeatAvailabilityAppModel) this.c;
                RouteDetailsDataState it5 = (RouteDetailsDataState) obj;
                Intrinsics.i(it5, "it");
                List list5 = ((RouteDetailsDataState) routeDetailsComponent2.f.getValue()).j;
                int i = 10;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                int i2 = 0;
                for (Object obj4 : list5) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    RouteDetailsStopUiModel routeDetailsStopUiModelA = (RouteDetailsStopUiModel) obj4;
                    if (i2 == routeDetailsComponent2.f0) {
                        ArrayList arrayList2 = seatAvailabilityAppModel.f4395a;
                        Intrinsics.i(routeDetailsStopUiModelA, "<this>");
                        StopEtaUiModel stopEtaUiModel2 = routeDetailsStopUiModelA.j;
                        if (stopEtaUiModel2 instanceof StopEtaUiModel.WithEtaAvailable.FixedEta) {
                            List<FixedEtaUiModel> list6 = ((StopEtaUiModel.WithEtaAvailable.FixedEta) stopEtaUiModel2).f4419a;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list6, i));
                            for (FixedEtaUiModel fixedEtaUiModelA : list6) {
                                int size = arrayList2.size();
                                int i4 = 0;
                                do {
                                    if (i4 < size) {
                                        obj3 = arrayList2.get(i4);
                                        i4++;
                                    } else {
                                        obj3 = null;
                                    }
                                    vehicleSeatAvailabilityDetailsAppModel2 = (VehicleSeatAvailabilityDetailsAppModel) obj3;
                                    if (vehicleSeatAvailabilityDetailsAppModel2 != null) {
                                        fixedEtaUiModelA = FixedEtaUiModel.a(fixedEtaUiModelA, vehicleSeatAvailabilityDetailsAppModel2.b);
                                    }
                                    arrayList3.add(fixedEtaUiModelA);
                                } while (!Intrinsics.d(((VehicleSeatAvailabilityDetailsAppModel) obj3).f4397a, fixedEtaUiModelA.c));
                                vehicleSeatAvailabilityDetailsAppModel2 = (VehicleSeatAvailabilityDetailsAppModel) obj3;
                                if (vehicleSeatAvailabilityDetailsAppModel2 != null) {
                                    fixedEtaUiModelA = FixedEtaUiModel.a(fixedEtaUiModelA, vehicleSeatAvailabilityDetailsAppModel2.b);
                                }
                                arrayList3.add(fixedEtaUiModelA);
                            }
                            routeDetailsStopUiModelA = RouteDetailsStopUiModel.a(routeDetailsStopUiModelA, false, false, false, false, false, null, new StopEtaUiModel.WithEtaAvailable.FixedEta(arrayList3), null, null, 15871);
                        }
                    }
                    arrayList.add(routeDetailsStopUiModelA);
                    i2 = i3;
                    i = 10;
                }
                List list7 = it5.B;
                ArrayList arrayList4 = seatAvailabilityAppModel.f4395a;
                Intrinsics.i(list7, "<this>");
                List<RouteDetailsMapStopMarkerInfo> list8 = list7;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list8, 10));
                for (RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfoA : list8) {
                    if (routeDetailsMapStopMarkerInfoA.h) {
                        StopEtaUiModel fixedEta = routeDetailsMapStopMarkerInfoA.d;
                        if (fixedEta instanceof StopEtaUiModel.WithEtaAvailable.FixedEta) {
                            List<FixedEtaUiModel> list9 = ((StopEtaUiModel.WithEtaAvailable.FixedEta) fixedEta).f4419a;
                            ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list9, 10));
                            for (FixedEtaUiModel fixedEtaUiModelA2 : list9) {
                                int size2 = arrayList4.size();
                                int i5 = 0;
                                do {
                                    if (i5 < size2) {
                                        obj2 = arrayList4.get(i5);
                                        i5++;
                                    } else {
                                        obj2 = null;
                                    }
                                    vehicleSeatAvailabilityDetailsAppModel = (VehicleSeatAvailabilityDetailsAppModel) obj2;
                                    if (vehicleSeatAvailabilityDetailsAppModel != null) {
                                        fixedEtaUiModelA2 = FixedEtaUiModel.a(fixedEtaUiModelA2, vehicleSeatAvailabilityDetailsAppModel.b);
                                    }
                                    arrayList6.add(fixedEtaUiModelA2);
                                } while (!Intrinsics.d(((VehicleSeatAvailabilityDetailsAppModel) obj2).f4397a, fixedEtaUiModelA2.c));
                                vehicleSeatAvailabilityDetailsAppModel = (VehicleSeatAvailabilityDetailsAppModel) obj2;
                                if (vehicleSeatAvailabilityDetailsAppModel != null) {
                                    fixedEtaUiModelA2 = FixedEtaUiModel.a(fixedEtaUiModelA2, vehicleSeatAvailabilityDetailsAppModel.b);
                                }
                                arrayList6.add(fixedEtaUiModelA2);
                            }
                            fixedEta = new StopEtaUiModel.WithEtaAvailable.FixedEta(arrayList6);
                        }
                        routeDetailsMapStopMarkerInfoA = RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfoA, null, fixedEta, null, false, 2039);
                    }
                    arrayList5.add(routeDetailsMapStopMarkerInfoA);
                }
                return RouteDetailsDataState.a(it5, false, null, null, null, null, null, null, null, null, arrayList, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, arrayList5, null, false, false, null, null, false, null, false, null, false, -268435969, 127);
            case 25:
                String str4 = (String) this.b;
                BusMapInfoWindowUiModel busMapInfoWindowUiModel = (BusMapInfoWindowUiModel) this.c;
                RouteDetailsDataState it6 = (RouteDetailsDataState) obj;
                Intrinsics.i(it6, "it");
                List<LiveVehiclesMarkerInfo> list10 = it6.C;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list10, 10));
                for (LiveVehiclesMarkerInfo liveVehiclesMarkerInfoA : list10) {
                    if (Intrinsics.d(liveVehiclesMarkerInfoA.f4896a, str4)) {
                        liveVehiclesMarkerInfoA = LiveVehiclesMarkerInfo.a(liveVehiclesMarkerInfoA, true, busMapInfoWindowUiModel);
                    }
                    arrayList7.add(liveVehiclesMarkerInfoA);
                }
                return RouteDetailsDataState.a(it6, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, arrayList7, false, false, null, null, false, null, false, null, false, -536870913, 127);
            case 26:
                return a(obj);
            case 27:
                RouteDetailsComponent routeDetailsComponent3 = (RouteDetailsComponent) this.b;
                ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) this.c;
                RouteDetailsDataState it7 = (RouteDetailsDataState) obj;
                Intrinsics.i(it7, "it");
                return RouteDetailsDataState.a(it7, false, null, null, null, null, null, null, null, null, it7.b(routeDetailsComponent3.f0, StopEtaStatus.FETCHING_SUCCESS_AND_IN_PROGRESS, (StopEtaUiModel) success.f10419a), null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -513, 127);
            case 28:
                RouteSelectionBottomSheetType.MultipleRouteAvailable multipleRouteAvailable = (RouteSelectionBottomSheetType.MultipleRouteAvailable) this.b;
                final Function1 function1 = (Function1) this.c;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1514096907, true, new sx0(multipleRouteAvailable, 11)), 3, null);
                if (multipleRouteAvailable.f9188a.size() == 0) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$RouteSelectionBottomSheetKt.f9206a, 3, null);
                } else {
                    final List list11 = multipleRouteAvailable.f9188a;
                    LazyColumn.items(list11.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt$MultipleRoutesComposable$lambda$4$0$$inlined$itemsIndexed$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            list11.get(((Number) obj5).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt$MultipleRoutesComposable$lambda$4$0$$inlined$itemsIndexed$default$3
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i6;
                            String strC;
                            String str5;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj5;
                            int iIntValue = ((Number) obj6).intValue();
                            Composer composer = (Composer) obj7;
                            int iIntValue2 = ((Number) obj8).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i6 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i6 = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i6 |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2039820996, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                                }
                                final OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) list11.get(iIntValue);
                                composer.startReplaceGroup(409818666);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                                originDestinationAppModel.getClass();
                                String str6 = originDestinationAppModel.i;
                                StopAppModel stopAppModel = originDestinationAppModel.f;
                                if (stopAppModel == null) {
                                    composer.startReplaceGroup(409932372);
                                } else {
                                    composer.startReplaceGroup(409932373);
                                    StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{stopAppModel.b}, composer, 6);
                                }
                                composer.endReplaceGroup();
                                int i7 = RouteSelectionBottomSheetKt.WhenMappings.f9210a[originDestinationAppModel.j.ordinal()];
                                String strC2 = null;
                                if (i7 == 1) {
                                    composer.startReplaceGroup(410101354);
                                    if (stopAppModel == null) {
                                        composer.startReplaceGroup(410143637);
                                        composer.endReplaceGroup();
                                        strC = null;
                                    } else {
                                        composer.startReplaceGroup(410143638);
                                        strC = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{stopAppModel.b}, composer, 6);
                                        composer.endReplaceGroup();
                                    }
                                    if (strC == null) {
                                        strC = "";
                                    }
                                    if (str6 == null || str6.length() == 0) {
                                        composer.startReplaceGroup(410425366);
                                        if (stopAppModel == null) {
                                            composer.startReplaceGroup(410425365);
                                        } else {
                                            composer.startReplaceGroup(410425366);
                                            strC2 = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{stopAppModel.b}, composer, 6);
                                        }
                                        composer.endReplaceGroup();
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(151782884);
                                        String strC3 = StringResourcesHelperKt.c(StringEnum.VIA_, new Object[]{str6}, composer, 6);
                                        composer.endReplaceGroup();
                                        strC2 = strC3;
                                    }
                                    composer.endReplaceGroup();
                                    str5 = strC;
                                } else {
                                    if (i7 != 2) {
                                        throw pk0.p(composer, 151774008);
                                    }
                                    composer.startReplaceGroup(410563471);
                                    str5 = originDestinationAppModel.b;
                                    if (stopAppModel == null) {
                                        composer.startReplaceGroup(410667413);
                                    } else {
                                        composer.startReplaceGroup(410667414);
                                        strC2 = StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{stopAppModel.b}, composer, 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endReplaceGroup();
                                }
                                String str7 = strC2;
                                Painter painterA = PainterResourceHelperKt.a(IconType.IC_CHALO_BUS, composer, 6);
                                List list12 = originDestinationAppModel.g;
                                if (list12.isEmpty()) {
                                    list12 = originDestinationAppModel.h;
                                }
                                List list13 = list12;
                                final Function1 function2 = function1;
                                boolean zChanged = composer.changed(function2) | composer.changedInstance(originDestinationAppModel);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt$MultipleRoutesComposable$2$1$2$5$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute(originDestinationAppModel));
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                RouteSelectionBottomSheetKt.c(null, painterA, str5, str7, list13, (Function0) objRememberedValue, composer, Painter.$stable << 3, 1);
                                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }));
                }
                return Unit.f17538a;
            default:
                Routes_table routes_table = (Routes_table) this.b;
                Routes_tableQueries routes_tableQueries = (Routes_tableQueries) this.c;
                SqlPreparedStatement execute11 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute11, "$this$execute");
                execute11.d(0, Long.valueOf(routes_table.f2011a));
                execute11.bindString(1, routes_table.b);
                execute11.bindString(2, routes_table.c);
                execute11.bindString(3, routes_table.d);
                execute11.bindString(4, routes_table.e);
                execute11.bindString(5, routes_table.f);
                execute11.bindString(6, routes_table.g);
                execute11.bindString(7, (String) routes_tableQueries.b.f2012a.encode(routes_table.h));
                execute11.d(8, Long.valueOf(routes_table.i));
                execute11.d(9, Long.valueOf(routes_table.j));
                Routes_table.Adapter adapter6 = routes_tableQueries.b;
                execute11.bindString(10, (String) adapter6.b.encode(routes_table.k));
                execute11.bindString(11, (String) adapter6.c.encode(routes_table.l));
                execute11.bindString(12, routes_table.m);
                execute11.bindString(13, (String) adapter6.d.encode(routes_table.n));
                return Unit.f17538a;
        }
    }
}
