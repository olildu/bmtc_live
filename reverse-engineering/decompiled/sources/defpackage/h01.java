package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TimePickerDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.retain.RetainedValuesStoreRegistry;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.UserSelfReviewComposableKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.common.InlineUnifiedAdLoadedSize;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiStateTracker;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenKt;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel;
import app.chalo.instantticket.ui.routeselection.RouteSelectionViewState;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionComposableKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.login.ui.userconsent.UserConsentScreenKt;
import app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreenUIKt;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenViewState;
import app.chalo.ncmc.ui.landing.SelectedCardDetailsUiModel;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.premiumbus.compose.TitleWithVerticalCardsSheetContentKt;
import app.chalo.quickpay.ui.tripamount.QuickpayConfirmationBottomSheetContentUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayConfirmationBottomSheetUISpecs;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.routeselection.ui.RouteSelectionBottomSheetType;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt;
import app.chalo.routeselection.ui.compose.StopBasedRouteSearchForProductPurchaseScreenKt;
import app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.usecase.FeedbackData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h01 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15780a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h01(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f15780a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0402  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InlineUnifiedAdLoadedSize inlineUnifiedAdLoadedSize;
        RegularBusUnifiedAdUiState regularBusUnifiedAdUiState;
        switch (this.f15780a) {
            case 0:
                ((Integer) obj2).getClass();
                QuickpayTripAmountScreenKt.b((QuickpayConfirmationBottomSheetContentUIState) this.c, (QuickpayConfirmationBottomSheetUISpecs) this.d, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                RegularBusScreenKt.a((RegularBusComponent) this.c, (RegularBusScreenConfigAppModel) this.d, (HomeScreenInfoHelper) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.j((RegularBusViewState) this.c, (ScrollState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.i((RegularBusViewState) this.c, (Function1) this.d, (List) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 4:
                RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker = (RegularBusUnifiedAdUiStateTracker) this.c;
                String str = (String) this.d;
                MutableState mutableState = (MutableState) this.e;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue2 > 0) {
                    if (iIntValue <= 0) {
                        iIntValue = this.b;
                    }
                    if (iIntValue <= 0) {
                        inlineUnifiedAdLoadedSize = null;
                    } else {
                        inlineUnifiedAdLoadedSize = new InlineUnifiedAdLoadedSize(iIntValue, iIntValue2);
                    }
                } else {
                    inlineUnifiedAdLoadedSize = null;
                }
                if (inlineUnifiedAdLoadedSize != null) {
                    int i = inlineUnifiedAdLoadedSize.f3380a;
                    int i2 = inlineUnifiedAdLoadedSize.b;
                    regularBusUnifiedAdUiStateTracker.getClass();
                    if (Intrinsics.d(regularBusUnifiedAdUiStateTracker.b, str)) {
                        RegularBusUnifiedAdUiState regularBusUnifiedAdUiState2 = regularBusUnifiedAdUiStateTracker.c;
                        boolean z = regularBusUnifiedAdUiState2.b;
                        if (z) {
                            regularBusUnifiedAdUiState = regularBusUnifiedAdUiState2;
                        } else {
                            if (i < 0) {
                                i = 0;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            regularBusUnifiedAdUiStateTracker.c = new RegularBusUnifiedAdUiState(i, i2, true, z);
                            regularBusUnifiedAdUiStateTracker.f3637a.put(str, Boolean.FALSE);
                            regularBusUnifiedAdUiState = regularBusUnifiedAdUiStateTracker.c;
                        }
                    } else {
                        regularBusUnifiedAdUiState = regularBusUnifiedAdUiStateTracker.c;
                    }
                    mutableState.setValue(regularBusUnifiedAdUiState);
                }
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.d((List) this.c, (Density) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                RegularBusStopNearbyTripsCardKt.l((NearbyStopAndTripsUiModel) this.c, (Function1) this.d, (Function2) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                RegularBusStopNearbyTripsCardKt.f((String) this.c, (String) this.d, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 8:
                return RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider$lambda$0((RetainedValuesStoreRegistry) this.c, this.d, (Function2) this.e, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                ((Integer) obj2).intValue();
                RouteDetailsScreenKt.a((RouteDetailsViewState) this.c, (Function1) this.d, (BottomSheetScaffoldState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                RouteDetailsStopAndMapScreenKt.b((RouteDetailsViewTypeUIState.MainScreen) this.c, (BottomSheetScaffoldState) this.d, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                RouteSelectionBottomSheetKt.d((RouteSelectionBottomSheetType) this.c, (SearchBarWithActionUIState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                RouteSelectionBottomSheetKt.a((RouteSelectionBottomSheetType.MultipleRouteAvailable) this.c, (SearchBarWithActionUIState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                RouteSelectionComposableKt.c((RouteSelectionViewState) this.c, (Function1) this.d, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                return SegmentedButtonKt.SegmentedButtonContent$lambda$15((Function2) this.c, (Function2) this.d, (PaddingValues) this.e, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                ((Integer) obj2).getClass();
                SingleCardDetailsScreenKt.c((Modifier) this.e, (SelectedCardDetailsUiModel) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                StopBasedMetroLandingScreenUIKt.b((StopBasedMetroLandingScreenViewState) this.c, (SheetState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                StopBasedMetroLandingScreenUIKt.a((Modifier) this.e, (StopBasedMetroLandingScreenViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                StopBasedRouteSearchForProductPurchaseScreenKt.a((Modifier) this.e, (StopBasedRouteSearchViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                StopBasedRouteSearchForProductPurchaseScreenKt.d((StopBasedRouteSearchViewState) this.c, (Function1) this.d, (SheetState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                return TextLinkScope.StyleAnnotation$lambda$1((TextLinkScope) this.c, (Object[]) this.d, (Function1) this.e, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return TimePickerDialogKt.TimePickerCustomLayout$lambda$3((Function2) this.c, (Function2) this.d, (Function3) this.e, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 22:
                ((Integer) obj2).intValue();
                TitleWithVerticalCardsSheetContentKt.a((String) this.c, (List) this.d, (Function4) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.a((SheetState) this.c, (TitoRideDetailsViewState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.c((String) this.c, (String) this.d, (TITOStopInfoEtaState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                TripPlannerDetailsScreenKt.i((BottomSheetScaffoldState) this.c, (TripPlannerDetailsState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                Function1 function1 = (Function1) this.c;
                TripPlannerLegUiModel.Bus bus = (TripPlannerLegUiModel.Bus) this.d;
                String str2 = (String) this.e;
                Composer composer = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1079704683, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsBusLegSection.<anonymous> (TripPlannerDetailsScreen.kt:558)");
                    }
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 11, null);
                    int i3 = this.b;
                    TripPlannerDetailsBusLegCardKt.g(function1, bus, str2, i3, pk0.d("PL_Trip_Itinerary_Leg_", i3, modifierM788paddingqDBjuR0$default), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                TripPlannerResultsScreenKt.p((RecentTripAppModel) this.c, (Function0) this.d, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).getClass();
                UserConsentScreenKt.e((ChaloColorToken) this.c, (CircularProgressIndicatorUIState) this.d, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                UserSelfReviewComposableKt.a((FeedbackData) this.c, (Function1) this.d, (List) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ h01(int i, RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker, String str, MutableState mutableState) {
        this.f15780a = 4;
        this.b = i;
        this.c = regularBusUnifiedAdUiStateTracker;
        this.d = str;
        this.e = mutableState;
    }

    public /* synthetic */ h01(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.f15780a = i2;
        this.e = modifier;
        this.c = obj;
        this.d = function1;
        this.b = i;
    }
}
