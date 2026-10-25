package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.SavedStateConfiguration;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.citydata.data.error.RemoteDataErrorType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.core.Routes_tableQueries;
import app.chalo.core.Super_pass_application_table;
import app.chalo.core.Super_pass_application_tableQueries;
import app.chalo.core.Super_pass_bookings_table;
import app.chalo.core.Super_pass_bookings_tableQueries;
import app.chalo.core.database.dao.SuperPassBookingsDaoImpl;
import app.chalo.home.ui.selectridescreen.SelectRideDataState;
import app.chalo.home.ui.selectridescreen.SelectRideIntent;
import app.chalo.home.ui.selectridescreen.SelectedTime;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.livetracking.search.uistate.NearestStopItemUIState;
import app.chalo.livetracking.search.uistate.NearestStopsBottomSheetContainerUiState;
import app.chalo.livetracking.search.uistate.NearestStopsBottomSheetUISpec;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsectionType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenViewIntent;
import app.chalo.models.productbooking.productcapability.OperationalHoursAppModel;
import app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseThroughPassDelegate;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate;
import app.chalo.premiumbus.ui.slotselectionlist.SlotCardUIState;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListViewSpecs;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedIntent;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsIntent;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.routeselection.ui.RouteSelectionBottomSheetType;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.stoptripdetails.data.model.app.StopTripAppModel;
import app.chalo.stoptripdetails.ui.StopTripDetailsIntent;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import app.chalo.stoptripdetails.ui.TripScheduleScreenType;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.SuperPassBookingEntity;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.Cancellation;
import com.arkivanov.decompose.value.Value;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g41 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15700a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g41(int i, Object obj, Object obj2) {
        this.f15700a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        int i = this.f15700a;
        Unit unit = Unit.f17538a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function6 function6 = (Function6) obj3;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                return function6.invoke(strI, string, strJ, string2, cb0.j(string2, sqlCursor, 4), cb0.f(sqlCursor, 5, ((Routes_tableQueries) obj2).b.f2012a));
            case 1:
                return SearchBarState.Companion.Saver$lambda$1((AnimationSpec) obj3, (AnimationSpec) obj2, (List) obj);
            case 2:
                SelectRideIntent.InitializationIntent initializationIntent = (SelectRideIntent.InitializationIntent) obj3;
                SelectedTime selectedTime = (SelectedTime) obj2;
                SelectRideDataState it = (SelectRideDataState) obj;
                Intrinsics.i(it, "it");
                UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = initializationIntent.b;
                UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = initializationIntent.c;
                return SelectRideDataState.a(it, userCommutePreferencePlaceLocationAppModel, userCommutePreferencePlaceLocationAppModel2, selectedTime, false, (userCommutePreferencePlaceLocationAppModel == null || userCommutePreferencePlaceLocationAppModel2 == null || initializationIntent.d == null) ? false : true, null, false, null, 488);
            case 3:
                SelectRideDataState it2 = (SelectRideDataState) obj;
                Intrinsics.i(it2, "it");
                return SelectRideDataState.a(it2, (UserCommutePreferencePlaceLocationAppModel) obj3, (UserCommutePreferencePlaceLocationAppModel) obj2, null, false, false, null, false, null, TypedValues.PositionType.TYPE_CURVE_FIT);
            case 4:
                return SelectionContainerKt.SelectionContainer$lambda$7$0((CoroutineScope) obj3, (Clipboard) obj2, (AnnotatedString) obj);
            case 5:
                return SelectionManager._set_onSelectionChange_$lambda$0((SelectionManager) obj3, (Function1) obj2, (Selection) obj);
            case 6:
                return SelectionManagerKt.contextMenuBuilder$lambda$0((SelectionManager) obj3, (ContextMenuState) obj2, (ContextMenuScope) obj);
            case 7:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1((SelectionManager) obj3, (Context) obj2, (TextContextMenuBuilderScope) obj);
            case 8:
                return SerializableSaverKt.serializableSaver$lambda$1((KSerializer) obj3, (SavedStateConfiguration) obj2, (Bundle) obj);
            case 9:
                Scope scope = (Scope) obj3;
                Lifecycle lifecycle = (Lifecycle) obj2;
                PremiumBusFareDetailsFlowType flowType = (PremiumBusFareDetailsFlowType) obj;
                Intrinsics.i(flowType, "flowType");
                if (flowType instanceof PremiumBusFareDetailsFlowType.FreshPurchase) {
                    ClassReference classReferenceA = Reflection.a(FreshPurchaseDelegate.class);
                    scope.getClass();
                    return (PremiumBusFareDetailsDelegate) scope.d(classReferenceA, ParametersHolderKt.a(lifecycle, flowType), null);
                }
                if (flowType instanceof PremiumBusFareDetailsFlowType.PurchaseThroughPass) {
                    ClassReference classReferenceA2 = Reflection.a(TicketPurchaseThroughPassDelegate.class);
                    scope.getClass();
                    return (PremiumBusFareDetailsDelegate) scope.d(classReferenceA2, ParametersHolderKt.a(flowType), null);
                }
                if (!(flowType instanceof PremiumBusFareDetailsFlowType.PassUpsellNudge)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClassReference classReferenceA3 = Reflection.a(TicketPurchaseWithPassUpsellNudgeDelegate.class);
                scope.getClass();
                return (PremiumBusFareDetailsDelegate) scope.d(classReferenceA3, ParametersHolderKt.a(lifecycle, flowType), null);
            case 10:
                final List list = (List) obj3;
                final SlotSelectionListViewSpecs slotSelectionListViewSpecs = (SlotSelectionListViewSpecs) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.premiumbus.ui.slotselectionlist.compose.SlotSelectionListMainScreenKt$SlotSelectionListMainScreen$lambda$2$0$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list.get(((Number) obj4).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.premiumbus.ui.slotselectionlist.compose.SlotSelectionListMainScreenKt$SlotSelectionListMainScreen$lambda$2$0$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            SlotCardUIState slotCardUIState = (SlotCardUIState) list.get(iIntValue);
                            composer.startReplaceGroup(-1680587602);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            SlotSelectionListViewSpecs slotSelectionListViewSpecs2 = slotSelectionListViewSpecs;
                            SlotSelectionListMainScreenKt.a(ChaloThemeKt.c(companion, slotSelectionListViewSpecs2.c), slotCardUIState, composer, 0);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, slotSelectionListViewSpecs2.b), composer, 0);
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
                return unit;
            case 11:
                return SnapshotStateList$Companion$CREATOR$1.createFromParcel$lambda$0((Parcel) obj3, (ClassLoader) obj2, ((Integer) obj).intValue());
            case 12:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.i(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setAlpha(((Number) ((Animatable) obj3).getValue()).floatValue());
                graphicsLayer.setTranslationY(((Number) ((Animatable) obj2).getValue()).floatValue());
                return unit;
            case 13:
                StopBasedMetroLandingScreenDataState it3 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedMetroLandingScreenDataState.a(it3, null, false, null, null, null, null, null, null, ((StopBasedMetroLandingScreenDataState) ((StopBasedMetroLandingScreenComponent) obj3).f.getValue()).j, (StopAppModel) obj2, null, null, null, 7423);
            case 14:
                StopBasedMetroLandingScreenViewIntent.InitialisationIntent initialisationIntent = (StopBasedMetroLandingScreenViewIntent.InitialisationIntent) obj3;
                return StopBasedMetroLandingScreenDataState.a((StopBasedMetroLandingScreenDataState) obj, null, false, null, null, null, null, null, null, initialisationIntent.f5536a, initialisationIntent.b, null, null, (OperationalHoursAppModel) obj2, 3325);
            case 15:
                return StopBasedRouteSearchViewState.a((StopBasedRouteSearchViewState) obj, null, null, null, false, false, (RouteSelectionBottomSheetType.MultipleRouteAvailable) obj3, false, null, null, null, null, null, null, (SearchBarWithActionUIState) obj2, 8159);
            case 16:
                StopBasedTripPlannerSearchDataState it4 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedTripPlannerSearchDataState.a(it4, null, null, null, null, null, false, new StopBasedTripPlannerSearchBottomSheetType.NearestStopFetchError(((ChaloUseCaseResult.Failure) obj3).f10418a instanceof RemoteDataErrorType.NoInternet, (RecentPlaceAppModel) obj2), null, null, null, 1855);
            case 17:
                NearestStopsBottomSheetContainerUiState nearestStopsBottomSheetContainerUiState = (NearestStopsBottomSheetContainerUiState) obj3;
                NearestStopsBottomSheetUISpec nearestStopsBottomSheetUISpec = (NearestStopsBottomSheetUISpec) obj2;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                final List list2 = nearestStopsBottomSheetContainerUiState.d;
                LazyColumn2.items(list2.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt$NearestStopsBottomSheetContent$lambda$1$1$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list2.get(((Number) obj4).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt$NearestStopsBottomSheetContent$lambda$1$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            NearestStopItemUIState nearestStopItemUIState = (NearestStopItemUIState) list2.get(iIntValue);
                            composer.startReplaceGroup(-696324775);
                            StopBasedTripPlannerSearchScreenKt.a(null, nearestStopItemUIState, composer, 0);
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
                NearestStopItemUIState nearestStopItemUIState = nearestStopsBottomSheetContainerUiState.e;
                if (nearestStopItemUIState != null) {
                    LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(356127428, true, new sx0(nearestStopItemUIState, 17)), 3, null);
                }
                NonEditableSearchFieldUiState nonEditableSearchFieldUiState = nearestStopsBottomSheetContainerUiState.f;
                if (nonEditableSearchFieldUiState != null) {
                    LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(1702018927, true, new fu0(29, nearestStopsBottomSheetUISpec, nonEditableSearchFieldUiState)), 3, null);
                }
                return unit;
            case 18:
                StopTripDetailsViewState stopTripDetailsViewState = (StopTripDetailsViewState) obj;
                StopTripAppModel stopTripAppModel = ((StopTripDetailsIntent.ViewCreatedIntentStop) obj3).f9515a;
                return StopTripDetailsViewState.a(stopTripDetailsViewState, stopTripAppModel.f9499a, stopTripAppModel.d, stopTripAppModel.b, (String) obj2, TripScheduleScreenType.LOADING, null, 32);
            case 19:
                StopTripPlannerResultsDataState it5 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it5, "it");
                return StopTripPlannerResultsDataState.a(it5, null, null, null, null, null, null, null, null, null, null, (StopBasedTripPlannerResultsBottomSheetType.NearestStops) obj3, false, (StopTripPlannerStopEditTarget) obj2, false, null, false, null, 503807);
            case 20:
                Map map = (Map) obj2;
                StopTripPlannerResultsDataState it6 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it6, "it");
                return StopTripPlannerResultsDataState.a(it6, null, null, null, null, null, null, null, map != null ? StopTripPlannerResultsectionType.RESULT : StopTripPlannerResultsectionType.LOADING, null, ((StopTripPlannerResultIntent.ResultTypeTabClickedIntent) obj3).f4555a, null, false, null, false, null, false, null, 522111);
            case 21:
                StopTripPlannerResultsDataState it7 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it7, "it");
                return StopTripPlannerResultsDataState.a(it7, null, null, (StopTripPlannerLocationType) obj3, (StopTripPlannerLocationType) obj2, null, null, null, StopTripPlannerResultsectionType.LOADING, null, null, null, false, null, false, null, false, null, 491267);
            case 22:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                final Cancellation cancellationB = ((Value) obj3).b(new xq0((MutableState) obj2, 13));
                return new DisposableEffectResult() { // from class: com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt$subscribeAsState$lambda$4$lambda$3$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        cancellationB.cancel();
                    }
                };
            case 23:
                int i2 = 4;
                SuperPassBookingsDaoImpl superPassBookingsDaoImpl = (SuperPassBookingsDaoImpl) obj2;
                Iterator it8 = ((List) obj3).iterator();
                while (it8.hasNext()) {
                    SuperPassBookingEntity superPassBookingEntity = (SuperPassBookingEntity) it8.next();
                    Super_pass_bookings_tableQueries super_pass_bookings_tableQueries = superPassBookingsDaoImpl.f2081a;
                    Intrinsics.i(superPassBookingEntity, "<this>");
                    String str = superPassBookingEntity.f9565a;
                    String str2 = superPassBookingEntity.b;
                    Super_pass_bookings_table super_pass_bookings_table = new Super_pass_bookings_table(superPassBookingEntity.c, superPassBookingEntity.d, superPassBookingEntity.l, superPassBookingEntity.u, superPassBookingEntity.t, str, str2, superPassBookingEntity.e, superPassBookingEntity.f, superPassBookingEntity.g, superPassBookingEntity.h, superPassBookingEntity.i, superPassBookingEntity.k, superPassBookingEntity.m, superPassBookingEntity.n, superPassBookingEntity.o, superPassBookingEntity.p, superPassBookingEntity.q, superPassBookingEntity.r, superPassBookingEntity.s, superPassBookingEntity.j);
                    super_pass_bookings_tableQueries.getClass();
                    super_pass_bookings_tableQueries.f697a.A0(399124203, "INSERT OR REPLACE INTO super_pass_bookings_table (passId, rideType, activationTimeInSec, punchTimeInMillis, startStopName, endStopName, routeName, vehicleNo, conductorId, via, routeNamingScheme, specialFeatures, depotName, printedTicketId, scheduleNumber, routeServiceType, driverId, waybillNo, etimVersion, amount, fareData) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new pg1(1, super_pass_bookings_table, super_pass_bookings_tableQueries));
                    super_pass_bookings_tableQueries.T(399124203, new og1(i2));
                    it8 = it8;
                    i2 = 4;
                }
                return unit;
            case 24:
                Function1 function1 = (Function1) obj3;
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = (SuperPassEnterUserDetailsViewModel) obj2;
                Long l = (Long) obj;
                if (l != null) {
                    function1.invoke(l);
                } else {
                    superPassEnterUserDetailsViewModel.D(SuperPassEnterUserDetailsIntent.DismissDialogIntent.f8414a);
                }
                return unit;
            case 25:
                SuperPassPurchaseSharedIntent.ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent = (SuperPassPurchaseSharedIntent.ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent) obj3;
                SuperPassPurchaseSharedState it9 = (SuperPassPurchaseSharedState) obj;
                Set set = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it9, "it");
                String str3 = convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent.f8347a;
                SuperPassUserDetails superPassUserDetails = convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent.c;
                return SuperPassPurchaseSharedState.a(it9, null, null, str3, new SuperPassUserDetails(superPassUserDetails.f9580a, superPassUserDetails.b, superPassUserDetails.c, superPassUserDetails.d, superPassUserDetails.e, superPassUserDetails.f, superPassUserDetails.g, superPassUserDetails.a(((SuperPassPurchaseSharedViewModel) obj2).o)), null, null, convertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent.b, false, null, null, 260919);
            case 26:
                SuperPassPurchaseSharedState it10 = (SuperPassPurchaseSharedState) obj;
                Set set2 = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it10, "it");
                SuperPassUserDetails superPassUserDetails2 = ((SuperPassPurchaseSharedIntent.SaveUserDetailsFromSmartPassengerSelectionIntent) obj3).f8350a;
                return SuperPassPurchaseSharedState.a(it10, null, null, null, new SuperPassUserDetails(superPassUserDetails2.f9580a, superPassUserDetails2.b, superPassUserDetails2.c, superPassUserDetails2.d, superPassUserDetails2.e, superPassUserDetails2.f, superPassUserDetails2.g, superPassUserDetails2.a(((SuperPassPurchaseSharedViewModel) obj2).o)), null, null, 0L, false, null, null, 262015);
            case 27:
                SuperPassPurchaseSharedIntent.UploadProofImageIntent uploadProofImageIntent = (SuperPassPurchaseSharedIntent.UploadProofImageIntent) obj3;
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj2;
                SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) obj;
                Map map2 = superPassPurchaseSharedState.p;
                ProofUploadDetails proofUploadDetails = map2 != null ? (ProofUploadDetails) map2.get(uploadProofImageIntent.f8356a) : null;
                if (!Intrinsics.d(proofUploadDetails != null ? proofUploadDetails.c : null, uploadProofImageIntent.c)) {
                    return superPassPurchaseSharedState;
                }
                booleanRef.element = true;
                Map map3 = superPassPurchaseSharedState.p;
                if (map3 != null) {
                    LinkedHashMap linkedHashMapU = MapsKt.u(map3);
                    linkedHashMapU.put(uploadProofImageIntent.f8356a, new ProofUploadDetails("", uploadProofImageIntent.b, uploadProofImageIntent.c, ProofUploadStatus.UPLOAD_FAILED, 16));
                    linkedHashMap = linkedHashMapU;
                } else {
                    linkedHashMap = null;
                }
                return SuperPassPurchaseSharedState.a(superPassPurchaseSharedState, null, null, null, null, null, null, 0L, false, null, linkedHashMap, 229375);
            case 28:
                FunctionN functionN = (FunctionN) obj3;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string3 = sqlCursor2.getString(1);
                String strJ2 = cb0.j(string3, sqlCursor2, 2);
                String string4 = sqlCursor2.getString(3);
                Long lJ = uf0.j(string4, sqlCursor2, 4);
                String string5 = sqlCursor2.getString(5);
                String strJ3 = cb0.j(string5, sqlCursor2, 6);
                Long l2 = sqlCursor2.getLong(7);
                Long lE = cb0.e(l2, sqlCursor2, 8);
                Super_pass_application_table.Adapter adapter = ((Super_pass_application_tableQueries) obj2).b;
                Object objG = cb0.g(sqlCursor2, 9, adapter.f2014a);
                Object objF = cb0.f(sqlCursor2, 10, adapter.b);
                String string6 = sqlCursor2.getString(11);
                PassApplicationActionRequired passApplicationActionRequired = string6 != null ? (PassApplicationActionRequired) adapter.c.a(string6) : null;
                String string7 = sqlCursor2.getString(12);
                String strJ4 = cb0.j(string7, sqlCursor2, 13);
                String string8 = sqlCursor2.getString(14);
                Intrinsics.f(string8);
                Object objG2 = cb0.g(sqlCursor2, 15, adapter.d);
                String string9 = sqlCursor2.getString(16);
                String strJ5 = cb0.j(string9, sqlCursor2, 17);
                String string10 = sqlCursor2.getString(18);
                Long lJ2 = uf0.j(string10, sqlCursor2, 19);
                Double d = sqlCursor2.getDouble(20);
                String string11 = sqlCursor2.getString(21);
                String string12 = sqlCursor2.getString(22);
                List list3 = string12 != null ? (List) adapter.e.a(string12) : null;
                String string13 = sqlCursor2.getString(23);
                List list4 = list3;
                List list5 = string13 != null ? (List) adapter.f.a(string13) : null;
                String string14 = sqlCursor2.getString(24);
                List list6 = list5;
                List list7 = string14 != null ? (List) adapter.g.a(string14) : null;
                String string15 = sqlCursor2.getString(25);
                return functionN.invoke(strI2, string3, strJ2, string4, lJ, string5, strJ3, l2, lE, objG, objF, passApplicationActionRequired, string7, strJ4, string8, objG2, string9, strJ5, string10, lJ2, d, string11, list4, list6, list7, string15 != null ? (RefundInfoEntityModel) adapter.h.a(string15) : null);
            default:
                Super_pass_application_table super_pass_application_table = (Super_pass_application_table) obj3;
                Super_pass_application_tableQueries super_pass_application_tableQueries = (Super_pass_application_tableQueries) obj2;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, super_pass_application_table.f2013a);
                execute.bindString(1, super_pass_application_table.b);
                execute.bindString(2, super_pass_application_table.c);
                execute.bindString(3, super_pass_application_table.d);
                execute.d(4, Long.valueOf(super_pass_application_table.e));
                execute.bindString(5, super_pass_application_table.f);
                execute.bindString(6, super_pass_application_table.g);
                execute.d(7, Long.valueOf(super_pass_application_table.h));
                execute.d(8, Long.valueOf(super_pass_application_table.i));
                execute.bindString(9, (String) super_pass_application_tableQueries.b.f2014a.encode(super_pass_application_table.j));
                Super_pass_application_table.Adapter adapter2 = super_pass_application_tableQueries.b;
                execute.bindString(10, (String) adapter2.b.encode(super_pass_application_table.k));
                PassApplicationActionRequired passApplicationActionRequired2 = super_pass_application_table.l;
                execute.bindString(11, passApplicationActionRequired2 != null ? (String) adapter2.c.encode(passApplicationActionRequired2) : null);
                execute.bindString(12, super_pass_application_table.m);
                execute.bindString(13, super_pass_application_table.n);
                execute.bindString(14, super_pass_application_table.o);
                execute.bindString(15, (String) adapter2.d.encode(super_pass_application_table.p));
                execute.bindString(16, super_pass_application_table.q);
                execute.bindString(17, super_pass_application_table.r);
                execute.bindString(18, super_pass_application_table.s);
                execute.d(19, Long.valueOf(super_pass_application_table.t));
                execute.c(20, super_pass_application_table.u);
                execute.bindString(21, super_pass_application_table.v);
                List list8 = super_pass_application_table.w;
                execute.bindString(22, list8 != null ? (String) adapter2.e.encode(list8) : null);
                List list9 = super_pass_application_table.x;
                execute.bindString(23, list9 != null ? (String) adapter2.f.encode(list9) : null);
                List list10 = super_pass_application_table.y;
                execute.bindString(24, list10 != null ? (String) adapter2.g.encode(list10) : null);
                RefundInfoEntityModel refundInfoEntityModel = super_pass_application_table.z;
                execute.bindString(25, refundInfoEntityModel != null ? (String) adapter2.h.encode(refundInfoEntityModel) : null);
                return unit;
        }
    }
}
