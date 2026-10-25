package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentMainContractKt;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModel;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.pendingrecharge.PendingRechargeDataState;
import app.chalo.onboarding.languageselection.LanguageSelectionDataState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.QRScreenLayoutInfo;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsState;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import io.ktor.http.CookieKt;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class va implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19817a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ va(boolean z, int i) {
        this.f19817a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19817a;
        boolean z = true;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo = currentState.b;
                QRScreenLayoutInfo qRScreenLayoutInfoA = bleValidationLayoutInfo != null ? QRScreenLayoutInfo.a(bleValidationLayoutInfo.c, false, null, false, 6) : null;
                return BleValidationState.a(currentState, BleValidationLayoutType.NEARBY_DEVICES_FULL_SCREEN_EXPLAINER, qRScreenLayoutInfoA != null ? BleValidationLayoutInfo.a(bleValidationLayoutInfo, null, QRScreenLayoutInfo.a(qRScreenLayoutInfoA, false, null, z2, 3), 3) : null, null, null, null, false, null, false, null, null, 4092);
            case 1:
                BleValidationState currentState2 = (BleValidationState) obj;
                Intrinsics.i(currentState2, "currentState");
                return BleValidationState.a(currentState2, null, null, null, null, null, false, null, this.b, null, null, 3967);
            case 2:
                ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloCardInfoViewState.a(it, null, null, this.b, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 3:
                Pair it2 = (Pair) obj;
                Set set = CookieKt.f16771a;
                Intrinsics.i(it2, "it");
                if (z2 && StringsKt.a0((String) it2.d(), "$", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                HomeScreenFragmentViewState it3 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it3, "it");
                return HomeScreenFragmentViewState.a(it3, null, null, null, null, null, null, null, null, null, null, null, null, this.b, 16383);
            case 5:
                InstantTicketWalletAccessState it4 = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it4, "it");
                return InstantTicketWalletAccessState.a(it4, null, false, false, null, null, false, null, null, false, this.b, null, false, false, 7679);
            case 6:
                return InstantTicketWalletAccessState.a((InstantTicketWalletAccessState) obj, null, false, false, null, null, false, null, null, false, false, null, false, this.b, 4095);
            case 7:
                return InstantTicketWalletAccessState.a((InstantTicketWalletAccessState) obj, null, false, false, null, null, false, null, null, false, false, null, this.b, false, 6143);
            case 8:
                LanguageSelectionDataState it5 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it5, "it");
                return LanguageSelectionDataState.a(it5, this.b, null, false, false, null, null, null, null, 254);
            case 9:
                MTicketTripInfoDataState it6 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it6, "it");
                return MTicketTripInfoDataState.a(it6, null, null, null, null, null, false, null, Boolean.valueOf(z2), null, 751);
            case 10:
                OfflineCardRechargeViewState it7 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it7, "it");
                return OfflineCardRechargeViewState.a(it7, null, null, null, null, null, null, null, null, null, this.b, false, false, false, null, null, false, false, null, 2096639);
            case 11:
                PaymentDataState it8 = (PaymentDataState) obj;
                Intrinsics.i(it8, "it");
                return PaymentDataState.a(it8, null, false, null, false, null, null, false, null, null, null, PaymentMainContractKt.c(it8.l, z2), false, false, false, null, false, null, 2095103);
            case 12:
                PendingRechargeDataState currentState3 = (PendingRechargeDataState) obj;
                Intrinsics.i(currentState3, "currentState");
                return PendingRechargeDataState.a(currentState3, z2, null, false, 6);
            case 13:
                ProductSelectionDataState it9 = (ProductSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return ProductSelectionDataState.a(it9, null, false, false, null, null, this.b, null, null, null, 959);
            case 14:
                Map scanAndPayProperties = (Map) obj;
                Intrinsics.i(scanAndPayProperties, "$this$scanAndPayProperties");
                scanAndPayProperties.put("scanAndPayEntryType", "cameraqr");
                scanAndPayProperties.put("permissionsAlreadyGranted", Boolean.valueOf(z2));
                return Unit.f17538a;
            case 15:
                RouteDetailsDataState routeDetailsDataState = (RouteDetailsDataState) obj;
                return RouteDetailsDataState.a(routeDetailsDataState, false, null, null, null, null, null, null, null, null, null, null, RouteDetailsMapUiModel.a(routeDetailsDataState.m, null, z2, null, 5), null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -4097, 127);
            case 16:
                return StopBasedRouteSearchViewState.a((StopBasedRouteSearchViewState) obj, null, null, null, this.b, false, null, false, null, null, null, null, null, null, null, 16375);
            case 17:
                StopTripPlannerResultsDataState it10 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it10, "it");
                return StopTripPlannerResultsDataState.a(it10, null, null, null, null, null, null, null, null, null, null, null, false, null, this.b, null, false, null, 491519);
            case 18:
                return TimePickerKt.ToggleItem$lambda$49$lambda$48(z2, (SemanticsPropertyReceiver) obj);
            case 19:
                return WalletAllTransactionsState.a((WalletAllTransactionsState) obj, null, null, false, false, null, false, this.b, 127);
            case 20:
                return WalletAllTransactionsState.a((WalletAllTransactionsState) obj, null, null, false, false, null, false, this.b, 127);
            case 21:
                WalletLoadBalanceEnterAmountDataState it11 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(it11, "it");
                return WalletLoadBalanceEnterAmountDataState.a(it11, false, false, null, null, null, 0L, null, null, null, null, null, null, 0, this.b, 16383);
            default:
                return WalletTransactionSummaryState.a((WalletTransactionSummaryState) obj, null, null, null, null, null, null, null, null, false, false, false, false, null, 0L, !z2, 16383);
        }
    }
}
