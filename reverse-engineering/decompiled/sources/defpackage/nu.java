package defpackage;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.platform.InspectorInfo;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutViewIntent;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsIntent;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerValue;
import app.chalo.login.ui.options.LoginOptionsIntent;
import app.chalo.ncmc.ui.entercarddetails.CardNumberFieldType;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsIntent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeIntent;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nu implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18544a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nu(Function1 function1, int i) {
        this.f18544a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        Object objA;
        Throwable th;
        int i = this.f18544a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(CustomUrlCheckoutViewIntent.WebViewCreated.f1469a);
                return unit;
            case 1:
                DrawerValue it2 = (DrawerValue) it;
                Intrinsics.i(it2, "it");
                return new DrawerState(it2, function1);
            case 2:
                return androidx.compose.material3.DrawerState.Companion.Saver$lambda$1(function1, (androidx.compose.material3.DrawerValue) it);
            case 3:
                String it3 = (String) it;
                Intrinsics.i(it3, "it");
                function1.invoke(new EnterCardDetailsIntent.OnAmountEnteredIntentEnter(it3, CardNumberFieldType.CARD_NUMBER));
                return unit;
            case 4:
                String it4 = (String) it;
                Intrinsics.i(it4, "it");
                function1.invoke(new EnterCardDetailsIntent.OnAmountEnteredIntentEnter(it4, CardNumberFieldType.RE_ENTER_CARD_NUMBER));
                return unit;
            case 5:
                Throwable th2 = (Throwable) it;
                int i2 = ExceptionsConstructorKt.f17870a;
                try {
                    th = (Throwable) function1.invoke(th2);
                    boolean zD = Intrinsics.d(th2.getMessage(), th.getMessage());
                    objA = th;
                    if (!zD && !Intrinsics.d(th.getMessage(), th2.toString())) {
                        objA = th;
                        objA = null;
                    }
                } catch (Throwable th3) {
                    objA = ResultKt.a(th3);
                }
                objA = th;
                return (Throwable) (objA instanceof Result.Failure ? null : objA);
            case 6:
                String it5 = (String) it;
                Intrinsics.i(it5, "it");
                function1.invoke(new FareDetailsIntent.IncreasePassengerCountClicked(it5));
                return unit;
            case 7:
                String it6 = (String) it;
                Intrinsics.i(it6, "it");
                function1.invoke(new FareDetailsIntent.DecreasePassengerCountClicked(it6));
                return unit;
            case 8:
                String it7 = (String) it;
                Intrinsics.i(it7, "it");
                function1.invoke(new FareDetailsIntent.OnPassengerCategorySelectedIntent(it7));
                return unit;
            case 9:
                function1.invoke(new HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetUserCommentChangedIntent((String) it));
                return unit;
            case 10:
                NavigationTabAppModel navTab = (NavigationTabAppModel) it;
                Intrinsics.i(navTab, "navTab");
                if ((navTab instanceof NavigationTabAppModel.ChaloBusTab) || (navTab instanceof NavigationTabAppModel.HomeTab) || (navTab instanceof NavigationTabAppModel.MyTicketsTab) || (navTab instanceof NavigationTabAppModel.RegularBusTab)) {
                    function1.invoke(new HomeScreenFragmentViewIntent.SelectBottomNavTab(navTab));
                } else {
                    if (!(navTab instanceof NavigationTabAppModel.SearchTab)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function1.invoke(new HomeScreenFragmentViewIntent.HomeScreenBottomNavSearchTabClickedIntent(navTab.f3761a.d.name()));
                }
                return unit;
            case 11:
                CrashlyticsLog it8 = (CrashlyticsLog) it;
                Intrinsics.i(it8, "it");
                function1.invoke(new HomeScreenViewIntent.OnCrashLoggingRequired(it8));
                return unit;
            case 12:
                CrashlyticsLog it9 = (CrashlyticsLog) it;
                Intrinsics.i(it9, "it");
                function1.invoke(new HomeScreenViewIntent.OnCrashLoggingRequired(it9));
                return unit;
            case 13:
                String searchBarTitle = (String) it;
                Intrinsics.i(searchBarTitle, "searchBarTitle");
                function1.invoke(new HomeScreenViewIntent.ChaloSearchBarClickedIntent(searchBarTitle));
                return unit;
            case 14:
                FocusState focusState = (FocusState) it;
                Intrinsics.i(focusState, "focusState");
                function1.invoke(Boolean.valueOf(focusState.isFocused()));
                return unit;
            case 15:
                function1.invoke(new LoginOptionsIntent.PhoneNumberFieldFocusChangeIntent(((Boolean) it).booleanValue()));
                return unit;
            case 16:
                return MapSaverKt.mapSaver$lambda$1(function1, (List) it);
            case 17:
                String it10 = (String) it;
                Intrinsics.i(it10, "it");
                StringBuilder sb = new StringBuilder();
                int length = it10.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = it10.charAt(i3);
                    if (Character.isLetter(cCharAt) || CharsKt.d(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                function1.invoke(new MinKycDetailsIntent.FullNameEnteredIntent(sb.toString()));
                return unit;
            case 18:
                function1.invoke(new MinKycDetailsIntent.FocusChanged(((Boolean) it).booleanValue()));
                return unit;
            case 19:
                Intrinsics.i(it, "it");
                function1.invoke(it);
                return unit;
            case 20:
                String it11 = (String) it;
                Intrinsics.i(it11, "it");
                function1.invoke(new NCMCOnlineRechargeIntent.AmountEnteredIntentOnlineRecharge(it11));
                return unit;
            case 21:
                ChaloMapCameraPositionStateData it12 = (ChaloMapCameraPositionStateData) it;
                Intrinsics.i(it12, "it");
                function1.invoke(new NearbyStopsMapIntent.MapCameraPositionStateChangedIntent(it12));
                return unit;
            case 22:
                MapCameraUpdate it13 = (MapCameraUpdate) it;
                Intrinsics.i(it13, "it");
                function1.invoke(new NearbyStopsMapIntent.OnMapCameraUpdateLoadedIntent(it13));
                return unit;
            case 23:
                NearbyStopAndTripsUiModel stopAndTripsUiModel = (NearbyStopAndTripsUiModel) it;
                Intrinsics.i(stopAndTripsUiModel, "stopAndTripsUiModel");
                function1.invoke(new NearbyStopsMapIntent.StopNameClicked(stopAndTripsUiModel));
                return unit;
            case 24:
                NearbyStopAndTripsUiModel it14 = (NearbyStopAndTripsUiModel) it;
                Intrinsics.i(it14, "it");
                function1.invoke(new NearbyStopsMapIntent.SeeAllBusesClickedIntent(it14));
                return unit;
            case 25:
                List it15 = (List) it;
                Intrinsics.i(it15, "it");
                function1.invoke(new NewPremiumBusReserveTicketActivationIntent.OpenPassengerAllocatedSeatsDialog(it15));
                return unit;
            case 26:
                function1.invoke(new NewPremiumBusReserveTicketActivationIntent.PBStopImageClickedIntent(((Integer) it).intValue(), NewPremiumReserveTicketDetailsScreenType.PRE_VALIDATION));
                return unit;
            case 27:
                function1.invoke(new NewPremiumBusReserveTicketActivationIntent.ToggleTrafficViewClicked(((Boolean) it).booleanValue()));
                return unit;
            case 28:
                String it16 = (String) it;
                Intrinsics.i(it16, "it");
                function1.invoke(new OfflineCardRechargeIntent.RechargeAmountEntered(it16));
                return unit;
            default:
                return OffsetKt.offset$lambda$0(function1, (InspectorInfo) it);
        }
    }
}
