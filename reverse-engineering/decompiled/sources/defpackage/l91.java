package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.ResistanceConfig;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUIKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryListItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerResultScreenState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteStopSearchItemUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteStopSearchResultUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.FromStopAndBusIconUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopsListUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SingleStopItemUIState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import app.chalo.onboarding.splash.orchestrator.SplashInitResult;
import app.chalo.onboarding.splash.ui.SplashScreenViewState;
import app.chalo.permissions.models.PermissionState;
import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import app.chalo.productbooking.common.data.models.app.response.TicketBookingFareAppModel;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.domain.MPassVerificationTimingDetails;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedIntent;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewConsentUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewUIState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusDataState;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusIntent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.sos.SosScreenDataState;
import app.chalo.sos.SosScreenIntent;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.userprofile.Gender;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimator;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l91 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18293a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l91(Object obj, int i) {
        this.f18293a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Modifier modifierM825requiredWidth3ABfNKs;
        LinkedHashMap linkedHashMap;
        int i = this.f18293a;
        int i2 = 4;
        int i3 = 3;
        int i4 = 2;
        LinkedHashMap linkedHashMapU = null;
        int i5 = 1;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Modifier conditional = (Modifier) obj;
                Intrinsics.i(conditional, "$this$conditional");
                Float f = ((FromStopAndBusIconUIState) obj2).e.b;
                return (f == null || (modifierM825requiredWidth3ABfNKs = SizeKt.m825requiredWidth3ABfNKs(conditional, Dp.m7278constructorimpl(f.floatValue()))) == null) ? conditional : modifierM825requiredWidth3ABfNKs;
            case 1:
                return SnapshotMutableDoubleStateImpl.component2$lambda$0((SnapshotMutableDoubleStateImpl) obj2, ((Double) obj).doubleValue());
            case 2:
                return SnapshotMutableFloatStateImpl.component2$lambda$0((SnapshotMutableFloatStateImpl) obj2, ((Float) obj).floatValue());
            case 3:
                return SnapshotMutableIntStateImpl.component2$lambda$0((SnapshotMutableIntStateImpl) obj2, ((Integer) obj).intValue());
            case 4:
                return SnapshotMutableLongStateImpl.component2$lambda$0((SnapshotMutableLongStateImpl) obj2, ((Long) obj).longValue());
            case 5:
                return SnapshotMutableStateImpl.component2$lambda$0((SnapshotMutableStateImpl) obj2, obj);
            case 6:
                return SnapshotStateObserver.readObserver$lambda$0((SnapshotStateObserver) obj2, obj);
            case 7:
                SosScreenDataState it = (SosScreenDataState) obj;
                Intrinsics.i(it, "it");
                return SosScreenDataState.a(it, null, null, null, ((SosScreenIntent.SosMessageEnteredIntent) obj2).f9417a, null, false, null, false, 247);
            case 8:
                SosScreenDataState it2 = (SosScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return SosScreenDataState.a(it2, null, null, null, null, null, false, ((SosScreenIntent.InitialisationIntent) obj2).f9412a, false, 191);
            case 9:
                IconType iconType = ((SplashInitResult.ShowAnimation) ((SplashInitResult) obj2)).f6682a;
                Boolean bool = Boolean.FALSE;
                ((SplashScreenViewState) obj).getClass();
                return new SplashScreenViewState(true, iconType, bool);
            case 10:
                StackAnimator stackAnimator = (StackAnimator) obj2;
                Intrinsics.i((Child.Created) obj, "it");
                return stackAnimator;
            case 11:
                ProductConfigForUiAppModel productConfigForUiAppModel = (ProductConfigForUiAppModel) obj2;
                StopBasedMetroLandingScreenDataState it3 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedMetroLandingScreenDataState.a(it3, null, false, productConfigForUiAppModel.f8217a, productConfigForUiAppModel.h, productConfigForUiAppModel.g, null, null, null, null, null, null, null, null, 8161);
            case 12:
                StopBasedMetroLandingScreenDataState it4 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedMetroLandingScreenDataState.a(it4, (TicketBookingFareAppModel) obj2, false, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 13:
                final StopBasedTripPlannerUiState stopBasedTripPlannerUiState = (StopBasedTripPlannerUiState) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1031266879, true, new hb1(stopBasedTripPlannerUiState, 0)), 3, null);
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-900035926, true, new hb1(stopBasedTripPlannerUiState, i5)), 3, null);
                LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1332071477, true, new o4(stopBasedTripPlannerUiState, 14)), 3, null);
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1737823113, true, new hb1(stopBasedTripPlannerUiState, i4)), 3, null);
                TripPlannerResultScreenState.Results results = (TripPlannerResultScreenState.Results) stopBasedTripPlannerUiState.e;
                if (results.d != null) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1001480198, true, new hb1(stopBasedTripPlannerUiState, i3)), 3, null);
                } else {
                    final List list = results.f4629a;
                    final ab1 ab1Var = new ab1(23);
                    LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$lambda$5$0$$inlined$items$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ab1Var.invoke(list.get(((Number) obj3).intValue()));
                        }
                    }, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$lambda$5$0$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            list.get(((Number) obj3).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt$StopTripPlannerResultScreen$lambda$5$0$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            int i6;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            Composer composer = (Composer) obj5;
                            int iIntValue2 = ((Number) obj6).intValue();
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
                                    ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                ItineraryListItemUiState itineraryListItemUiState = (ItineraryListItemUiState) list.get(iIntValue);
                                composer.startReplaceGroup(-1406986091);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                                pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ItineraryConnectedLegsRowUIKt.a(companion, itineraryListItemUiState, composer, 6);
                                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, stopBasedTripPlannerUiState.f4615a.g), composer, 0);
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
                }
                NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState = ((TripPlannerResultScreenState.Results) stopBasedTripPlannerUiState.e).c;
                if (nearbyStopResultsContainerUiState != null) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(422652373, true, new hb1(stopBasedTripPlannerUiState, i2)), 3, null);
                    LazyListScope.CC.m(LazyColumn, "nearby_stops_results_section", null, ComposableLambdaKt.composableLambdaInstance(733666494, true, new sx0(nearbyStopResultsContainerUiState, 16)), 2, null);
                }
                return unit;
            case 14:
                final RouteStopSearchResultUIState routeStopSearchResultUIState = (RouteStopSearchResultUIState) obj2;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                final ArrayList arrayList = routeStopSearchResultUIState.f4887a;
                final i81 i81Var = new i81(7);
                LazyColumn2.items(arrayList.size(), new Function1<Integer, Object>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopListViewKt$StopsResultList$lambda$0$0$$inlined$itemsIndexed$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int iIntValue = ((Number) obj3).intValue();
                        return i81Var.invoke(Integer.valueOf(iIntValue), arrayList.get(iIntValue));
                    }
                }, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopListViewKt$StopsResultList$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        arrayList.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopListViewKt$StopsResultList$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
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
                            RouteStopSearchItemUIState routeStopSearchItemUIState = (RouteStopSearchItemUIState) arrayList.get(iIntValue);
                            composer.startReplaceGroup(1799397413);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = routeStopSearchItemUIState.c;
                            boolean zChangedInstance = composer.changedInstance(uiEventHandler$Companion$fromLambda$1);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                StopListViewKt$StopsResultList$1$1$2$1$1 stopListViewKt$StopsResultList$1$1$2$1$1 = new StopListViewKt$StopsResultList$1$1$2$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                                composer.updateRememberedValue(stopListViewKt$StopsResultList$1$1$2$1$1);
                                objRememberedValue = stopListViewKt$StopsResultList$1$1$2$1$1;
                            }
                            StopListViewKt.c(routeStopSearchItemUIState, ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null), routeStopSearchItemUIState.d), composer, 0);
                            RouteStopSearchResultUIState routeStopSearchResultUIState2 = routeStopSearchResultUIState;
                            if (iIntValue < CollectionsKt.K(routeStopSearchResultUIState2.f4887a)) {
                                composer.startReplaceGroup(1799692439);
                                DividerUIStateKt.a(null, routeStopSearchResultUIState2.b, composer, 0, 1);
                            } else {
                                composer.startReplaceGroup(1797369144);
                            }
                            composer.endReplaceGroup();
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
            case 15:
                StopTripPlannerResultsDataState it5 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it5, "it");
                return StopTripPlannerResultsDataState.a(it5, null, null, null, null, null, null, null, null, null, null, null, false, (StopTripPlannerStopEditTarget) obj2, false, null, false, null, 507903);
            case 16:
                StopTripPlannerTabType stopTripPlannerTabType = (StopTripPlannerTabType) obj2;
                StopTripPlannerResultsDataState it6 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it6, "it");
                Map map = it6.e;
                if (map != null) {
                    LinkedHashMap linkedHashMapU2 = MapsKt.u(map);
                    linkedHashMapU2.remove(stopTripPlannerTabType);
                    linkedHashMap = linkedHashMapU2;
                } else {
                    linkedHashMap = null;
                }
                Map map2 = it6.g;
                if (map2 != null) {
                    linkedHashMapU = MapsKt.u(map2);
                    linkedHashMapU.remove(stopTripPlannerTabType);
                }
                return StopTripPlannerResultsDataState.a(it6, null, null, null, null, linkedHashMap, null, linkedHashMapU, null, null, null, null, false, null, false, null, false, null, 393135);
            case 17:
                final RouteStopsListUIState routeStopsListUIState = (RouteStopsListUIState) obj2;
                LazyListScope LazyColumn3 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn3, "$this$LazyColumn");
                final List list2 = routeStopsListUIState.f4940a;
                LazyColumn3.items(list2.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopsListForRouteDetailsKt$StopsListForRouteDetails_6a0pyJM$lambda$1$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list2.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopsListForRouteDetailsKt$StopsListForRouteDetails_6a0pyJM$lambda$1$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
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
                            SingleStopItemUIState singleStopItemUIState = (SingleStopItemUIState) list2.get(iIntValue);
                            composer.startReplaceGroup(-11986332);
                            IndicationNodeFactory indicationNodeFactoryA = null;
                            RouteStopsListUIState routeStopsListUIState2 = routeStopsListUIState;
                            if (iIntValue == 0) {
                                composer.startReplaceGroup(-11969190);
                                DividerUIStateKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), routeStopsListUIState2.b, composer, 6, 0);
                            } else {
                                composer.startReplaceGroup(-13645794);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierC = ChaloThemeKt.c(Modifier.INSTANCE, routeStopsListUIState2.d.f4939a);
                            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
                            if (singleStopItemUIState.d.c) {
                                composer.startReplaceGroup(-11470215);
                            } else {
                                composer.startReplaceGroup(-1108748330);
                                indicationNodeFactoryA = RippleEffectKt.a(composer);
                            }
                            composer.endReplaceGroup();
                            IndicationNodeFactory indicationNodeFactory = indicationNodeFactoryA;
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = singleStopItemUIState.c;
                            boolean zChangedInstance = composer.changedInstance(uiEventHandler$Companion$fromLambda$1);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                StopsListForRouteDetailsKt$StopsListForRouteDetails$1$1$1$1$1 stopsListForRouteDetailsKt$StopsListForRouteDetails$1$1$1$1$1 = new StopsListForRouteDetailsKt$StopsListForRouteDetails$1$1$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                                composer.updateRememberedValue(stopsListForRouteDetailsKt$StopsListForRouteDetails$1$1$1$1$1);
                                objRememberedValue = stopsListForRouteDetailsKt$StopsListForRouteDetails$1$1$1$1$1;
                            }
                            SingleStopItemKt.c(singleStopItemUIState, ClickableKt.m295clickableO2vRcR0$default(modifierC, mutableInteractionSourceB, indicationNodeFactory, false, null, null, (Function0) ((KFunction) objRememberedValue), 28, null), composer, 0);
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
            case 18:
                LazyListScope LazyColumn4 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn4, "$this$LazyColumn");
                final List list3 = ((SuperPassPassengerSelectionUIState) obj2).c;
                LazyColumn4.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIKt$SuperPassPassengerSelectionContent$lambda$0$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list3.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionUIKt$SuperPassPassengerSelectionContent$lambda$0$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
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
                                ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            PassPassengerSelectionCardUIState passPassengerSelectionCardUIState = (PassPassengerSelectionCardUIState) list3.get(iIntValue);
                            composer.startReplaceGroup(-616050267);
                            SuperPassPassengerSelectionUIKt.a(passPassengerSelectionCardUIState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48);
                            ChaloSpacersKt.a(passPassengerSelectionCardUIState.e, composer, 0);
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
            case 19:
                ((Boolean) obj).getClass();
                ((SuperPassProofOverviewConsentUIState) obj2).c.a();
                return unit;
            case 20:
                LazyListScope LazyColumn5 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn5, "$this$LazyColumn");
                final List list4 = ((SuperPassProofOverviewUIState) obj2).c;
                LazyColumn5.items(list4.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt$SuperPassProofOverviewContent$lambda$0$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list4.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt$SuperPassProofOverviewContent$lambda$0$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
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
                                ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            SuperPassProofItemsUIState superPassProofItemsUIState = (SuperPassProofItemsUIState) list4.get(iIntValue);
                            composer.startReplaceGroup(350333010);
                            if (superPassProofItemsUIState instanceof SuperPassProofItemsUIState.UserNameProof) {
                                composer.startReplaceGroup(350399287);
                                SuperPassProofOverviewScreenKt.c((SuperPassProofItemsUIState.UserNameProof) superPassProofItemsUIState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48);
                                composer.endReplaceGroup();
                            } else {
                                if (!(superPassProofItemsUIState instanceof SuperPassProofItemsUIState.ImageProof)) {
                                    throw pk0.p(composer, 288395729);
                                }
                                composer.startReplaceGroup(350659191);
                                SuperPassProofOverviewScreenKt.a((SuperPassProofItemsUIState.ImageProof) superPassProofItemsUIState, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48);
                                composer.endReplaceGroup();
                            }
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
            case 21:
                SuperPassPurchaseSharedState it7 = (SuperPassPurchaseSharedState) obj;
                Set set = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it7, "it");
                return SuperPassPurchaseSharedState.a(it7, null, null, null, SuperPassUserDetails.b(it7.h, ((SuperPassPurchaseSharedIntent.UpdateUserName) obj2).f8355a, null, null, 0L, 251), null, null, 0L, false, null, null, 262015);
            case 22:
                SuperPassPurchaseSharedState it8 = (SuperPassPurchaseSharedState) obj;
                Set set2 = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it8, "it");
                return SuperPassPurchaseSharedState.a(it8, null, null, null, null, null, Long.valueOf(((SuperPassPurchaseSharedIntent.UpdatePassStartTimeIntent) obj2).f8352a), 0L, false, null, null, 261631);
            case 23:
                SuperPassPurchaseSharedIntent.UpdateUserDetailsAndStartTime updateUserDetailsAndStartTime = (SuperPassPurchaseSharedIntent.UpdateUserDetailsAndStartTime) obj2;
                SuperPassPurchaseSharedState it9 = (SuperPassPurchaseSharedState) obj;
                Set set3 = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it9, "it");
                SuperPassUserDetails superPassUserDetails = it9.h;
                String str = updateUserDetailsAndStartTime.f8354a;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Gender gender = updateUserDetailsAndStartTime.b;
                if (gender == null) {
                    gender = Gender.MALE;
                }
                return SuperPassPurchaseSharedState.a(it9, null, null, null, SuperPassUserDetails.b(superPassUserDetails, str2, gender, updateUserDetailsAndStartTime.c, updateUserDetailsAndStartTime.d, 99), null, Long.valueOf(updateUserDetailsAndStartTime.e), 0L, false, null, null, 261503);
            case 24:
                SuperPassPurchaseSharedState it10 = (SuperPassPurchaseSharedState) obj;
                Set set4 = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it10, "it");
                ((SuperPassPurchaseSharedViewModel) obj2).E.setValue(it10);
                return unit;
            case 25:
                SuperPassPurchaseSharedIntent.UploadProofImageIntent uploadProofImageIntent = (SuperPassPurchaseSharedIntent.UploadProofImageIntent) obj2;
                SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) obj;
                Map map3 = superPassPurchaseSharedState.p;
                if (map3 != null) {
                    linkedHashMapU = MapsKt.u(map3);
                    linkedHashMapU.put(uploadProofImageIntent.f8356a, new ProofUploadDetails("", uploadProofImageIntent.b, uploadProofImageIntent.c, ProofUploadStatus.UPLOADING, 16));
                }
                return SuperPassPurchaseSharedState.a(superPassPurchaseSharedState, null, null, null, null, null, null, 0L, false, null, linkedHashMapU, 229375);
            case 26:
                SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel = (SuperPassUserProofUploadViewModel) obj2;
                int i6 = SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1.WhenMappings.f8512a[((PermissionState) obj).ordinal()];
                if (i6 == 1) {
                    superPassUserProofUploadViewModel.p(new mb1(28));
                } else if (i6 == 2) {
                    superPassUserProofUploadViewModel.p(new mb1(29));
                } else if (i6 != 3 && i6 != 4 && i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
            case 27:
                SuperPassVerificationStatusDataState superPassVerificationStatusDataState = (SuperPassVerificationStatusDataState) obj;
                String source = ((SuperPassVerificationStatusIntent.InitializationIntent) obj2).f8516a.c;
                SuperPassApplication superPassApplication = superPassVerificationStatusDataState.f8515a;
                MPassVerificationTimingDetails timingDetails = superPassVerificationStatusDataState.b;
                Intrinsics.i(timingDetails, "timingDetails");
                Intrinsics.i(source, "source");
                return new SuperPassVerificationStatusDataState(superPassApplication, timingDetails, source);
            case 28:
                SwipeableState swipeableState = (SwipeableState) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                MutableState mutableState = swipeableState.g;
                float fFloatValue2 = ((Number) mutableState.getValue()).floatValue() + fFloatValue;
                float fD = RangesKt.d(fFloatValue2, swipeableState.k, swipeableState.l);
                float f2 = fFloatValue2 - fD;
                swipeableState.e.setValue(Float.valueOf(fD + (((ResistanceConfig) swipeableState.o.getValue()) != null ? (0.0f / 10.0f) * ((float) Math.sin((RangesKt.d(f2 / 0.0f, -1.0f, 1.0f) * 3.1415927f) / 2)) : 0.0f)));
                swipeableState.f.setValue(Float.valueOf(f2));
                mutableState.setValue(Float.valueOf(fFloatValue2));
                return unit;
            default:
                return TextContextMenuModifierKt.collectTextContextMenuData$lambda$0$0((TextContextMenuBuilderScope) obj2, (Function1) obj);
        }
    }
}
