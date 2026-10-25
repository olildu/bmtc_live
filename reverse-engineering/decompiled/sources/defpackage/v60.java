package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.retain.LocalRetainedValuesStoreKt;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.home.HomeScreenDialogType;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetupKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.LivePassengerIndicatorBottomSheetKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCtaUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusNumberContainerUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryListItemUiState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.LivePassengerIndicatorBottomSheetContentUIState;
import app.chalo.livetracking.ui.routedetailsscreen.LiveSeatAvailabilityBottomCtaContainer;
import app.chalo.livetracking.ui.routedetailsscreen.SeatAvailabilityLevelWithInfoUIState;
import app.chalo.locationdisclaimer.LocationDisclaimerHeaderUIState;
import app.chalo.locationdisclaimer.ui.compose.LocationDisclaimerScreenKt;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.options.LoginSupportedCountryDialogUIState;
import app.chalo.login.ui.options.SupportedCountryItemUIState;
import app.chalo.login.ui.otp.LoginOtpEnterUIState;
import app.chalo.login.ui.otp.LoginOtpScreenKt;
import app.chalo.metro.ui.landing.compose.components.LineSelectionBottomSheetContentKt;
import app.chalo.metro.ui.landing.uistate.LineSelectionBottomSheetUIState;
import app.chalo.metro.ui.landing.uistate.LineSelectionItemUIState;
import app.chalo.mticket.ui.passengerselection.MTicketFareBreakupUIState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerItemUIState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerLayoutUIState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionScreenKt;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIState;
import app.chalo.mticket.ui.passengerselection.MTicketRouteDetailsUIState;
import app.chalo.mticket.ui.passengerselection.TitleAndDescSpaceBetweenUIState;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketJourneyOverviewUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketsSectionUiState;
import app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionBottomSheetComposableKt;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionItemUIState;
import app.chalo.onboarding.languageselection.LanguageUiState;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19807a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v60(int i, int i2, Modifier modifier, Object obj) {
        this.f19807a = i2;
        this.d = obj;
        this.b = modifier;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19807a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                GroupTicketPassengerSelectionBottomSheetComposableKt.d((Modifier) obj3, (GroupTicketPassengerSelectionItemUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                GroupTicketSummaryScreenKt.g((Modifier) obj3, (GroupTicketsSectionUiState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                GroupTicketSummaryScreenKt.c((Modifier) obj3, (GroupTicketJourneyOverviewUiState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 3:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.g((HomeComponent.TabComponentEntry) obj3, (HomeScreenInfoHelper) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 4:
                ((Integer) obj2).intValue();
                HomeTabScaffoldKt.c((HomeScreenDialogType) obj3, (Function1) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 5:
                ((Integer) obj2).intValue();
                HomeTabScaffoldKt.a((Function1) obj3, (PremiumBusInAppCommunicationBottomSheetData) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                InstantTicketWalletAccessSideEffectSetupKt.a((SheetState) obj3, (InstantTicketWalletAccessComponent) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                ItineraryConnectedLegsRowUIKt.a((Modifier) obj3, (ItineraryListItemUiState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                ItinerarySingleLegCardKt.c((Modifier) obj3, (BusNumberContainerUIState.BusNumberAndCtaUiState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 9:
                ((Integer) obj2).getClass();
                ItinerarySingleLegCardKt.a((Modifier) obj3, (BusInfoCtaUiState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 10:
                TripPlannerLegUiModel.Metro metro = (TripPlannerLegUiModel.Metro) obj3;
                String str = (String) obj4;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1001390493, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyTripPlannerDetailsMetroLegSection.<anonymous> (JourneyDetailsBottomSheet.kt:158)");
                    }
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 11, null);
                    int i3 = this.c;
                    JourneyDetailsBottomSheetKt.f(metro, str, i3, pk0.d("PL_Trip_Itinerary_Leg_", i3, modifierM788paddingqDBjuR0$default), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                ProvidableCompositionLocal providableCompositionLocal = KoinApplicationKt.f18813a;
                KoinApplicationKt.a((Koin) obj3, (Function2) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 12:
                ((Integer) obj2).getClass();
                LanguageSelectionScreenKt.a((Modifier) obj3, (LanguageUiState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 13:
                return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$0((LazyLayoutItemProvider) obj3, i2, obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                ((Integer) obj2).getClass();
                LineSelectionBottomSheetContentKt.b((Modifier) obj3, (LineSelectionBottomSheetUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 15:
                ((Integer) obj2).getClass();
                LineSelectionBottomSheetContentKt.c((Modifier) obj3, (LineSelectionItemUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 16:
                ((Integer) obj2).getClass();
                LivePassengerIndicatorBottomSheetKt.a((LivePassengerIndicatorBottomSheetContentUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                LivePassengerIndicatorBottomSheetKt.b((LiveSeatAvailabilityBottomCtaContainer) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                LivePassengerIndicatorBottomSheetKt.c((Modifier) obj3, (SeatAvailabilityLevelWithInfoUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 19:
                return LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider$lambda$2((RetainedValuesStore) obj3, (Function2) obj4, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                ((Integer) obj2).getClass();
                LocationDisclaimerScreenKt.b((Modifier) obj3, (LocationDisclaimerHeaderUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 21:
                ((Integer) obj2).getClass();
                LoginOptionsScreenKt.g((Modifier) obj3, (SupportedCountryItemUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                LoginOptionsScreenKt.f((Modifier) obj3, (LoginSupportedCountryDialogUIState) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 23:
                ((Integer) obj2).intValue();
                LoginOtpScreenKt.d((LoginOtpEnterUIState) obj3, (FocusRequester) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 24:
                ((Integer) obj2).intValue();
                MTicketPassengerSelectionScreenKt.f((MTicketPassengerSelectionUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 25:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.i((MTicketRouteDetailsUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 26:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.e((MTicketPassengerLayoutUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 27:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.j((TitleAndDescSpaceBetweenUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.d((MTicketPassengerItemUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
            default:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.a((MTicketFareBreakupUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return unit;
        }
    }

    public /* synthetic */ v60(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i) {
        this.f19807a = 13;
        this.b = lazyLayoutItemProvider;
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ v60(Object obj, Object obj2, int i, int i2) {
        this.f19807a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
