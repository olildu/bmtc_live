package defpackage;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.unit.Density;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.compose.utils.SafeFocusRequesterKt;
import app.chalo.constants.Source;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.core.Premium_reserve_trip_tableQueries;
import app.chalo.core.TicketQueries;
import app.chalo.data.ProductBookingBranding;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiStateTracker;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.TimeTableUiModel;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultScreenData;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsectionType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerTabType;
import app.chalo.livetracking.ui.routedetailsscreen.TimeTableSectionsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.onboarding.splash.ui.SplashScreenKt$GenericSplashAnimation$targetValues$1$1;
import app.chalo.premiumbus.data.PremiumBusSlotListScreenData;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListDataState;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListViewIntent;
import app.chalo.productactivation.ui.ProductActivationDataState;
import app.chalo.productactivation.ui.ProductActivationIntent;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.domain.MPassVerificationTimingDetails;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedIntent;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassBasicUserInfoSectionUIState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusDataState;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusIntent;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModel;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.routeselection.ui.RouteSelectionBottomSheetType;
import app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rw0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19249a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rw0(int i, Object obj, Object obj2, Object obj3) {
        this.f19249a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RegularBusUnifiedAdUiState regularBusUnifiedAdUiState;
        LazyListScope lazyListScope;
        int i = this.f19249a;
        final int size = 0;
        Unit unit = Unit.f17538a;
        final int i2 = 1;
        LinkedHashMap linkedHashMapU = null;
        LinkedHashMap linkedHashMapU2 = null;
        Object obj2 = null;
        ArrayList arrayList = null;
        Integer numValueOf = null;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl = (PremiumReserveTicketPostBookingActionHandlerImpl) obj5;
                StopLiveEtaUiModel stopLiveEtaUiModel = (StopLiveEtaUiModel) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                PremiumReserveTicketPostBookingActionState it = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it, "it");
                PremiumBusLiveTrackingState premiumBusLiveTrackingState = it.r;
                return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, (premiumReserveTicketPostBookingActionHandlerImpl.U() || !(stopLiveEtaUiModel instanceof StopLiveEtaUiModel.AllBusPassedStop)) ? premiumBusLiveTrackingState.f7408a : EmptyList.f17557a, arrayList2, null, null, null, 124) : null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 1:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) ((Premium_reserve_ticket_tableQueries) obj5).b.f1986a.encode((PremiumReserveTicketStatus) obj4));
                execute.bindString(1, (String) obj3);
                return unit;
            case 2:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, (String) ((Premium_reserve_trip_tableQueries) obj5).b.f1988a.encode((PremiumBusTripStatus) obj4));
                execute2.bindString(1, (String) obj3);
                return unit;
            case 3:
                ProductActivationIntent.InitializationIntent initializationIntent = (ProductActivationIntent.InitializationIntent) obj3;
                return ProductActivationDataState.a((ProductActivationDataState) obj, (ValidationProduct) obj5, null, null, null, false, ((ProductActivationIntent.InitializationIntent) obj4).g, initializationIntent.h, initializationIntent.i, null, false, initializationIntent.j, null, false, 15134);
            case 4:
                ProductSelectionDataState it2 = (ProductSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return ProductSelectionDataState.a(it2, null, false, false, null, null, false, (AllProductConfigsResponseAppModel) obj5, (List) obj4, (List) ((Ref.ObjectRef) obj3).element, 115);
            case 5:
                ProfileScreenComponent profileScreenComponent = (ProfileScreenComponent) obj4;
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, (List) obj5, null, null, false, profileScreenComponent.p.getF(), profileScreenComponent.p.getG(), false, (String) obj3, false, false, 846);
            case 6:
                RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker = (RegularBusUnifiedAdUiStateTracker) obj5;
                String str = (String) obj4;
                MutableState mutableState = (MutableState) obj3;
                ((Integer) obj).getClass();
                regularBusUnifiedAdUiStateTracker.getClass();
                if (Intrinsics.d(regularBusUnifiedAdUiStateTracker.b, str)) {
                    regularBusUnifiedAdUiStateTracker.c = new RegularBusUnifiedAdUiState(0, 0, false, false);
                    regularBusUnifiedAdUiStateTracker.f3637a.put(str, Boolean.FALSE);
                    regularBusUnifiedAdUiState = regularBusUnifiedAdUiStateTracker.c;
                } else {
                    regularBusUnifiedAdUiState = regularBusUnifiedAdUiStateTracker.c;
                }
                mutableState.setValue(regularBusUnifiedAdUiState);
                return unit;
            case 7:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj5;
                RouteTimeTableUIStateFactory routeTimeTableUIStateFactory = (RouteTimeTableUIStateFactory) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                TimeTableUiModel it3 = (TimeTableUiModel) obj;
                Intrinsics.i(it3, "it");
                Integer num = (Integer) objectRef.element;
                T t = num;
                if (num == null) {
                    routeTimeTableUIStateFactory.getClass();
                    int i3 = it3.b;
                    if (i3 != -1) {
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj6 = arrayList3.get(i4);
                            i4++;
                            size += ((TimeTableSectionsUIState) obj6).b.size() + 1;
                        }
                        numValueOf = Integer.valueOf(size + i3);
                    }
                    t = numValueOf;
                }
                objectRef.element = t;
                return unit;
            case 8:
                return SearchBarDefaults.InputField$lambda$11$lambda$10((String) obj5, (SearchBarState) obj4, (String) obj3, (SemanticsPropertyReceiver) obj);
            case 9:
                return SelectionGesturesKt.mouseSelection$lambda$2((MouseSelectionObserver) obj5, (SelectionAdjustment) obj4, (Ref.BooleanRef) obj3, (PointerInputChange) obj);
            case 10:
                List list = (List) obj4;
                PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel = (PBBulkBookingAvailableSlotsTripAppResponseModel) obj3;
                SlotSelectionListDataState it4 = (SlotSelectionListDataState) obj;
                Intrinsics.i(it4, "it");
                SlotsAvailableForSelection slotsAvailableForSelectionA = SlotsAvailableForSelection.a(((SlotSelectionListViewIntent.OnSlotSelectionClickIntent) obj5).f7926a, true);
                if (list != null) {
                    List<SlotsAvailableForSelection> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                    for (SlotsAvailableForSelection slotsAvailableForSelection : list2) {
                        arrayList.add(SlotsAvailableForSelection.a(slotsAvailableForSelection, Intrinsics.d(slotsAvailableForSelection.f7902a, pBBulkBookingAvailableSlotsTripAppResponseModel)));
                    }
                }
                String toolbarTitle = it4.f7923a;
                Source source = it4.d;
                Intrinsics.i(toolbarTitle, "toolbarTitle");
                Intrinsics.i(source, "source");
                return new SlotSelectionListDataState(toolbarTitle, arrayList, slotsAvailableForSelectionA, source);
            case 11:
                String toolbarTitle2 = (String) obj4;
                Source source2 = (Source) obj3;
                SlotSelectionListDataState slotSelectionListDataState = (SlotSelectionListDataState) obj;
                List list3 = ((PremiumBusSlotListScreenData) obj5).f6961a;
                for (Object obj7 : list3) {
                    if (((SlotsAvailableForSelection) obj7).b) {
                        obj2 = obj7;
                        slotSelectionListDataState.getClass();
                        Intrinsics.i(toolbarTitle2, "toolbarTitle");
                        Intrinsics.i(source2, "source");
                        return new SlotSelectionListDataState(toolbarTitle2, list3, (SlotsAvailableForSelection) obj2, source2);
                    }
                }
                slotSelectionListDataState.getClass();
                Intrinsics.i(toolbarTitle2, "toolbarTitle");
                Intrinsics.i(source2, "source");
                return new SlotSelectionListDataState(toolbarTitle2, list3, (SlotsAvailableForSelection) obj2, source2);
            case 12:
                Animatable animatable = (Animatable) obj5;
                Animatable animatable2 = (Animatable) obj4;
                SplashScreenKt$GenericSplashAnimation$targetValues$1$1 splashScreenKt$GenericSplashAnimation$targetValues$1$1 = (SplashScreenKt$GenericSplashAnimation$targetValues$1$1) obj3;
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.i(graphicsLayer, "$this$graphicsLayer");
                if (((Number) animatable.getValue()).floatValue() == 0.0f) {
                    graphicsLayer.setTranslationY(((Number) animatable2.getValue()).floatValue());
                } else if (splashScreenKt$GenericSplashAnimation$targetValues$1$1 != null) {
                    float f = splashScreenKt$GenericSplashAnimation$targetValues$1$1.f6694a;
                    float fFloatValue = ((Number) animatable.getValue()).floatValue();
                    graphicsLayer.setTranslationX(splashScreenKt$GenericSplashAnimation$targetValues$1$1.b * fFloatValue);
                    graphicsLayer.setTranslationY(((splashScreenKt$GenericSplashAnimation$targetValues$1$1.c + 200.0f) * fFloatValue) - 200.0f);
                    float f2 = ((f - 1.0f) * fFloatValue) + 1.0f;
                    graphicsLayer.setScaleX(f2);
                    graphicsLayer.setScaleY(f2);
                    graphicsLayer.setRotationZ(fFloatValue * 45.0f);
                }
                return unit;
            case 13:
                List list4 = (List) obj5;
                StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent = (StopBasedRouteSearchForProductPurchaseComponent) obj4;
                SearchBarWithActionUIState searchBarWithActionUIState = (SearchBarWithActionUIState) obj3;
                StopBasedRouteSearchViewState it5 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it5, "it");
                StopAppModel stopAppModel = stopBasedRouteSearchForProductPurchaseComponent.B;
                String str2 = stopAppModel != null ? stopAppModel.b : null;
                StopAppModel stopAppModel2 = stopBasedRouteSearchForProductPurchaseComponent.C;
                return StopBasedRouteSearchViewState.a(it5, null, null, null, false, false, new RouteSelectionBottomSheetType.MultipleRouteAvailable(str2, stopAppModel2 != null ? stopAppModel2.b : null, list4), false, null, null, null, null, null, null, searchBarWithActionUIState, 8143);
            case 14:
                StopBasedRouteSearchViewState it6 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it6, "it");
                return StopBasedRouteSearchViewState.a(it6, null, null, null, false, false, null, false, null, ((StopBasedRouteSearchIntent.ViewCreatedIntentBasedRoute) obj5).f9203a, (ProductBookingBranding) obj4, null, null, (UniversalSearchFlowSource) obj3, null, 11519);
            case 15:
                StopTripPlannerResultsDataState stopTripPlannerResultsDataState = (StopTripPlannerResultsDataState) obj;
                StopTripPlannerResultScreenData stopTripPlannerResultScreenData = ((StopTripPlannerResultIntent.InitializationIntent) obj5).f4538a;
                return StopTripPlannerResultsDataState.a(stopTripPlannerResultsDataState, stopTripPlannerResultScreenData.d, stopTripPlannerResultScreenData.c, (StopTripPlannerLocationType) obj4, (StopTripPlannerLocationType) obj3, null, null, null, StopTripPlannerResultsectionType.LOADING, null, StopTripPlannerTabType.DIRECT, null, false, null, false, null, false, null, 522096);
            case 16:
                final SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState = (SuperPassEnterUserDetailsUIState) obj5;
                final Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj4;
                final SafeFocusRequester safeFocusRequester = (SafeFocusRequester) obj3;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                for (final SuperPassBasicUserInfoSectionUIState superPassBasicUserInfoSectionUIState : superPassEnterUserDetailsUIState.b) {
                    TextUIState textUIState = superPassBasicUserInfoSectionUIState.f8411a;
                    if (textUIState != null) {
                        lazyListScope = LazyColumn;
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1855530495, true, new qb1(i2, textUIState, superPassEnterUserDetailsUIState)), 3, null);
                    } else {
                        lazyListScope = LazyColumn;
                    }
                    TextUIState textUIState2 = superPassBasicUserInfoSectionUIState.b;
                    if (textUIState2 != null) {
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-252351178, true, new ob(25, textUIState2, superPassEnterUserDetailsUIState, superPassBasicUserInfoSectionUIState)), 3, null);
                    }
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1729969492, true, new Function3() { // from class: vf1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            int i5 = size;
                            LazyItemScope item = (LazyItemScope) obj8;
                            Composer composer = (Composer) obj9;
                            int iIntValue = ((Integer) obj10).intValue();
                            switch (i5) {
                                case 0:
                                    Intrinsics.i(item, "$this$item");
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1729969492, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:135)");
                                        }
                                        ChaloSpacersKt.a(superPassBasicUserInfoSectionUIState.e.d, composer, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(item, "$this$item");
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-657390773, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:157)");
                                        }
                                        ChaloSpacersKt.a(superPassBasicUserInfoSectionUIState.e.c, composer, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }), 3, null);
                    final List list5 = superPassBasicUserInfoSectionUIState.c;
                    lazyListScope.items(list5.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenKt$SuperPassEnterUserDetailsScreenContent$lambda$0$0$0$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            list5.get(((Number) obj8).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenKt$SuperPassEnterUserDetailsScreenContent$lambda$0$0$0$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                            int i5;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj8;
                            int iIntValue = ((Number) obj9).intValue();
                            Composer composer = (Composer) obj10;
                            int iIntValue2 = ((Number) obj11).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i5 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i5 = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i5 |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(802480018, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                BaseTextFieldUIState baseTextFieldUIState = (BaseTextFieldUIState) list5.get(iIntValue);
                                composer.startReplaceGroup(527547575);
                                composer.startReplaceGroup(432669279);
                                Modifier modifierC = ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassEnterUserDetailsUIState.d.b), superPassBasicUserInfoSectionUIState.e.e);
                                Ref.BooleanRef booleanRef2 = booleanRef;
                                if (booleanRef2.element || !(baseTextFieldUIState instanceof BaseTextFieldUIState.TextFieldUIState)) {
                                    composer.startReplaceGroup(1639437392);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(1639259948);
                                    booleanRef2.element = true;
                                    modifierC = SafeFocusRequesterKt.a(modifierC, safeFocusRequester, composer, 0);
                                    composer.endReplaceGroup();
                                }
                                Modifier modifier = modifierC;
                                composer.endReplaceGroup();
                                BaseChaloTextFieldKt.a(baseTextFieldUIState, modifier, null, null, null, null, composer, 0, 124);
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
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-657390773, true, new Function3() { // from class: vf1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            int i5 = i2;
                            LazyItemScope item = (LazyItemScope) obj8;
                            Composer composer = (Composer) obj9;
                            int iIntValue = ((Integer) obj10).intValue();
                            switch (i5) {
                                case 0:
                                    Intrinsics.i(item, "$this$item");
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1729969492, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:135)");
                                        }
                                        ChaloSpacersKt.a(superPassBasicUserInfoSectionUIState.e.d, composer, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(item, "$this$item");
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-657390773, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:157)");
                                        }
                                        ChaloSpacersKt.a(superPassBasicUserInfoSectionUIState.e.c, composer, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }), 3, null);
                    DividerUIState dividerUIState = superPassBasicUserInfoSectionUIState.d;
                    if (dividerUIState != null) {
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(621642112, true, new sx0(dividerUIState, 22)), 3, null);
                    }
                    LazyColumn = lazyListScope;
                }
                return unit;
            case 17:
                SuperPassPurchaseSharedIntent.CancelProofUploadIntent cancelProofUploadIntent = (SuperPassPurchaseSharedIntent.CancelProofUploadIntent) obj4;
                ProofUploadDetails proofUploadDetails = (ProofUploadDetails) obj3;
                SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) obj;
                List list6 = superPassPurchaseSharedState.o;
                PassApplicationRejectionReasons passApplicationRejectionReasons = superPassPurchaseSharedState.f;
                Map map = superPassPurchaseSharedState.q;
                String str3 = superPassPurchaseSharedState.h.g;
                Set set = SuperPassPurchaseSharedViewModel.G;
                ProofUploadDetails proofUploadDetails2 = (ProofUploadDetails) ((SuperPassPurchaseSharedViewModel) obj5).F0(list6, passApplicationRejectionReasons, map, str3).get(cancelProofUploadIntent.f8346a);
                if (proofUploadDetails2 == null) {
                    proofUploadDetails2 = new ProofUploadDetails((String) null, (BitmapImage) null, (String) null, (ProofUploadStatus) null, 31);
                }
                Map map2 = superPassPurchaseSharedState.p;
                if (map2 != null) {
                    linkedHashMapU2 = MapsKt.u(map2);
                    String str4 = cancelProofUploadIntent.f8346a;
                    if (proofUploadDetails == null) {
                        proofUploadDetails = proofUploadDetails2;
                    }
                    linkedHashMapU2.put(str4, proofUploadDetails);
                }
                return SuperPassPurchaseSharedState.a(superPassPurchaseSharedState, null, null, null, null, null, null, 0L, false, null, linkedHashMapU2, 229375);
            case 18:
                SuperPassPurchaseSharedIntent.UploadProofImageIntent uploadProofImageIntent = (SuperPassPurchaseSharedIntent.UploadProofImageIntent) obj5;
                Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) obj4;
                ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) obj3;
                SuperPassPurchaseSharedState superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) obj;
                Map map3 = superPassPurchaseSharedState2.p;
                ProofUploadDetails proofUploadDetails3 = map3 != null ? (ProofUploadDetails) map3.get(uploadProofImageIntent.f8356a) : null;
                if (!Intrinsics.d(proofUploadDetails3 != null ? proofUploadDetails3.c : null, uploadProofImageIntent.c)) {
                    return superPassPurchaseSharedState2;
                }
                booleanRef2.element = true;
                Map map4 = superPassPurchaseSharedState2.p;
                if (map4 != null) {
                    linkedHashMapU = MapsKt.u(map4);
                    linkedHashMapU.put(uploadProofImageIntent.f8356a, new ProofUploadDetails((String) success.f10419a, uploadProofImageIntent.b, uploadProofImageIntent.c, ProofUploadStatus.UPLOAD_SUCCESSFUL, 16));
                }
                return SuperPassPurchaseSharedState.a(superPassPurchaseSharedState2, null, null, null, null, null, null, 0L, false, null, linkedHashMapU, 229375);
            case 19:
                MPassVerificationTimingDetails timingDetails = (MPassVerificationTimingDetails) obj3;
                String source3 = ((SuperPassVerificationStatusIntent.InitializationIntent) obj4).f8516a.c;
                ((SuperPassVerificationStatusDataState) obj).getClass();
                Intrinsics.i(timingDetails, "timingDetails");
                Intrinsics.i(source3, "source");
                return new SuperPassVerificationStatusDataState((SuperPassApplication) obj5, timingDetails, source3);
            case 20:
                return SwipeToDismissBoxState.Companion.Saver$lambda$1((Density) obj5, (Function1) obj4, (Function1) obj3, (SwipeToDismissBoxValue) obj);
            case 21:
                return TextFieldDelegate.Companion.restartInput$lambda$0((EditProcessor) obj5, (Function1) obj4, (Ref.ObjectRef) obj3, (List) obj);
            case 22:
                return TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$17$lambda$16((TextFieldLabelPosition) obj5, (State) obj4, (MutableState) obj3, (Size) obj);
            case 23:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1((KeyCommand) obj5, (TextFieldKeyInput) obj4, (Ref.BooleanRef) obj3, (TextFieldPreparedSelection) obj);
            case 24:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0((State) obj5, (TextFieldSelectionManager) obj4, (ContextMenuState) obj3, (ContextMenuScope) obj);
            case 25:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3((TextFieldSelectionManager) obj5, (CoroutineScope) obj4, (Context) obj3, (TextContextMenuBuilderScope) obj);
            case 26:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$0((Ref.LongRef) obj5, (TextFieldSelectionState) obj4, (Ref.LongRef) obj3, (Offset) obj);
            case 27:
                return TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures$lambda$0((Function0) obj5, (TextFieldSelectionState) obj4, (Function0) obj3, (Offset) obj);
            case 28:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2((TextFieldSelectionState) obj5, (CoroutineScope) obj4, (Context) obj3, (TextContextMenuBuilderScope) obj);
            default:
                MTicketTripReceipt mTicketTripReceipt = (MTicketTripReceipt) obj5;
                String str5 = (String) obj4;
                TicketQueries ticketQueries = (TicketQueries) obj3;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, mTicketTripReceipt != null ? (String) ticketQueries.b.f.encode(mTicketTripReceipt) : null);
                execute3.bindString(1, str5);
                return unit;
        }
    }
}
