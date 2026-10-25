package defpackage;

import app.chalo.electricitybill.ui.ebillamount.EBillAmountDataState;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryDataState;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.instantticket.data.model.app.response.FetchMobileTicketFareResponseAppModel;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.kyc.min.data.models.appmodels.MinKycRegisterAppModel;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModelKt;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.ui.options.LoginOptionsDataState;
import app.chalo.login.ui.otp.LoginOtpEnterDataState;
import app.chalo.login.ui.userconsent.UserConsentDataState;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryDataState;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.domain.CardValidationAppModel;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ondc.model.api.OndcTicketConfiguration;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationDataState;
import app.chalo.productbooking.pickstop.PickStopDataState;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceDialogType;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import app.chalo.walletframework.wallet.domain.model.WalletLoadBalanceConfigAndRechargeOrderCombined;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20106a;
    public final /* synthetic */ ChaloUseCaseResult.Success b;

    public /* synthetic */ yg(ChaloUseCaseResult.Success success, int i) {
        this.f20106a = i;
        this.b = success;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20106a) {
            case 0:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, (PremiumPassSavingsInfo) this.b.f10419a, null, null, null, null, false, null, false, null, null, null, null, 268369919);
            case 1:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, (String) this.b.f10419a, false, null, false, null, false, null, false, 8355839);
            case 2:
                ChaloCardRechargeAmountViewState it = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloCardRechargeAmountViewState.a(it, null, null, null, null, null, 0L, null, null, null, null, false, false, null, null, null, null, ((CreateOrderResponseAppModel) this.b.f10419a).b, false, null, 1835007);
            case 3:
                return EBillPaymentConfirmationDataState.a((EBillPaymentConfirmationDataState) obj, false, false, null, (CreateOrderResponseAppModel) this.b.f10419a, false, 22);
            case 4:
                EBillAmountDataState it2 = (EBillAmountDataState) obj;
                Intrinsics.i(it2, "it");
                return EBillAmountDataState.a(it2, true, null, (String) this.b.f10419a, null, 2);
            case 5:
                return ElectricityPaymentHistoryDataState.a((ElectricityPaymentHistoryDataState) obj, false, (List) this.b.f10419a, null, null, false, 28);
            case 6:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, (ChaloCardRechargeConfigAppModel) this.b.f10419a, null, null, null, false, false, false, false, false, null, false, 3326);
            case 7:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, "", ((CardValidationAppModel) this.b.f10419a).c, false, false, false, false, false, null, false, 4039);
            case 8:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, true, null, null, null, false, false, null, false, null, null, false, ((FetchMobileTicketFareResponseAppModel) this.b.f10419a).d, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -131113, 31);
            case 9:
                GroupTicketSummaryDataState it3 = (GroupTicketSummaryDataState) obj;
                Intrinsics.i(it3, "it");
                return GroupTicketSummaryDataState.a(it3, null, null, (GroupTicketSummaryResponseAppModel) this.b.f10419a, null, false, false, false, false, false, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE);
            case 10:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, (String) this.b.f10419a, null, null, null, false, false, 32695);
            case 11:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, (String) this.b.f10419a, null, null, null, 1855);
            case 12:
                MetroLandingScreenDataState it4 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it4, "it");
                OndcTicketConfiguration ondcTicketConfiguration = (OndcTicketConfiguration) this.b.f10419a;
                return MetroLandingScreenDataState.a(it4, false, ondcTicketConfiguration.f6728a, ondcTicketConfiguration.d, null, null, null, null, null, null, null, null, null, null, 8185);
            case 13:
                MinKycOtpDataState it5 = (MinKycOtpDataState) obj;
                Intrinsics.i(it5, "it");
                return MinKycOtpDataState.a(it5, null, null, null, false, false, 0L, false, null, null, ((MinKycRegisterAppModel) this.b.f10419a).f4102a, null, null, 14335);
            case 14:
                return MinKycOtpDataState.a((MinKycOtpDataState) obj, null, null, null, false, false, 0L, false, null, null, ((MinKycRegisterAppModel) this.b.f10419a).f4102a, null, null, 14191);
            case 15:
                return PickRouteLocationDataState.a((PickRouteLocationDataState) obj, false, false, (List) this.b.f10419a, null, SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN, null, null, null, false, false, null, 1961);
            case 16:
                return PickStopDataState.a((PickStopDataState) obj, null, false, (List) this.b.f10419a, null, 25);
            case 17:
                PremiumBusProductModificationReasonsViewState it6 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusProductModificationReasonsViewState.a(it6, (List) this.b.f10419a, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65214);
            case 18:
                return PremiumReserveTicketPostBookingActionState.a((PremiumReserveTicketPostBookingActionState) obj, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.SeeMoreOptions((List) this.b.f10419a), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 19:
                RouteDetailsDataState it7 = (RouteDetailsDataState) obj;
                Intrinsics.i(it7, "it");
                return RouteDetailsDataState.a(it7, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, RouteDetailsMapUiModelKt.a(it7.B, StopEtaStatus.FETCHING_SUCCESS_AND_IN_PROGRESS, (StopEtaUiModel) this.b.f10419a), null, false, false, null, null, false, null, false, null, false, -268435457, 127);
            case 20:
                StopBasedMetroLandingScreenDataState it8 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it8, "it");
                return StopBasedMetroLandingScreenDataState.a(it8, null, false, null, null, null, null, (List) this.b.f10419a, null, null, null, null, null, null, 8125);
            case 21:
                StopBasedRouteSearchViewState it9 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it9, "it");
                OndcTicketConfiguration ondcTicketConfiguration2 = (OndcTicketConfiguration) this.b.f10419a;
                return StopBasedRouteSearchViewState.a(it9, null, null, null, false, false, null, false, null, null, null, ondcTicketConfiguration2.f6728a, ondcTicketConfiguration2.d, null, null, 13311);
            case 22:
                UserConsentDataState it10 = (UserConsentDataState) obj;
                Intrinsics.i(it10, "it");
                DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel = (DpdpaUserConsentsInfoAppModel) this.b.f10419a;
                return UserConsentDataState.a(it10, null, dpdpaUserConsentsInfoAppModel.d, dpdpaUserConsentsInfoAppModel.c, false, null, false, true, false, 161);
            default:
                WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined = (WalletLoadBalanceConfigAndRechargeOrderCombined) this.b.f10419a;
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, new WalletLoadBalanceDialogType.TncDialog(walletLoadBalanceConfigAndRechargeOrderCombined.f11095a), null, walletLoadBalanceConfigAndRechargeOrderCombined, null, 0, false, 30206);
        }
    }
}
