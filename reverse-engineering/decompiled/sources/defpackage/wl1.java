package defpackage;

import android.webkit.WebView;
import app.chalo.compose.webview.KWebView;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.productsummary.ui.ticket.ProductSummaryBannerCtaType;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.productsummary.ui.ticket.TicketSummaryScreenType;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.ui.UserProfileFormIntent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountIntent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceIntent;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19941a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wl1(Function1 function1, int i) {
        this.f19941a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19941a) {
            case 0:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.invoke(new TripPlannerResultIntent.RecentTripClickedIntent(it));
                return Unit.f17538a;
            case 1:
                String it2 = (String) obj;
                Intrinsics.i(it2, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it2));
                return Unit.f17538a;
            case 2:
                ProductSummaryBannerCtaType it3 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it3, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it3));
                return Unit.f17538a;
            case 3:
                ProductSummaryBannerCtaType it4 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it4, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it4));
                return Unit.f17538a;
            case 4:
                String it5 = (String) obj;
                Intrinsics.i(it5, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it5));
                return Unit.f17538a;
            case 5:
                String it6 = (String) obj;
                Intrinsics.i(it6, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it6));
                return Unit.f17538a;
            case 6:
                ProductSummaryBannerCtaType it7 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it7, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it7));
                return Unit.f17538a;
            case 7:
                String it8 = (String) obj;
                Intrinsics.i(it8, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it8));
                return Unit.f17538a;
            case 8:
                ChaloUserBookingType it9 = (ChaloUserBookingType) obj;
                Intrinsics.i(it9, "it");
                this.b.invoke(new TicketSummaryIntent.OnSupportClicked(it9));
                return Unit.f17538a;
            case 9:
                ProductSummaryBannerCtaType it10 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it10, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it10));
                return Unit.f17538a;
            case 10:
                String it11 = (String) obj;
                Intrinsics.i(it11, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it11));
                return Unit.f17538a;
            case 11:
                ChaloUserBookingType it12 = (ChaloUserBookingType) obj;
                Intrinsics.i(it12, "it");
                this.b.invoke(new TicketSummaryIntent.OnSupportClicked(it12));
                return Unit.f17538a;
            case 12:
                ProductSummaryBannerCtaType it13 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it13, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it13));
                return Unit.f17538a;
            case 13:
                TicketSummaryScreenType screenType = (TicketSummaryScreenType) obj;
                Intrinsics.i(screenType, "screenType");
                return UiEventHandler.Companion.a(new cm1(2, this.b, screenType));
            case 14:
                String it14 = (String) obj;
                Intrinsics.i(it14, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it14));
                return Unit.f17538a;
            case 15:
                ProductSummaryBannerCtaType it15 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it15, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it15));
                return Unit.f17538a;
            case 16:
                String it16 = (String) obj;
                Intrinsics.i(it16, "it");
                this.b.invoke(new TicketSummaryIntent.OnImageClickIntent(it16));
                return Unit.f17538a;
            case 17:
                ProductSummaryBannerCtaType it17 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it17, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it17));
                return Unit.f17538a;
            case 18:
                ProductSummaryBannerCtaType it18 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it18, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it18));
                return Unit.f17538a;
            case 19:
                ProductSummaryBannerCtaType it19 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it19, "it");
                this.b.invoke(new TicketSummaryIntent.OnBannerCtaClickIntent(it19));
                return Unit.f17538a;
            case 20:
                String newValue = (String) obj;
                Intrinsics.i(newValue, "newValue");
                this.b.invoke(new UserProfileFormIntent.AgeEntered(newValue));
                return Unit.f17538a;
            case 21:
                Gender it20 = (Gender) obj;
                Intrinsics.i(it20, "it");
                this.b.invoke(new UserProfileFormIntent.GenderSelected(it20));
                return Unit.f17538a;
            case 22:
                String newValue2 = (String) obj;
                Intrinsics.i(newValue2, "newValue");
                this.b.invoke(new UserProfileFormIntent.NameEntered(newValue2));
                return Unit.f17538a;
            case 23:
                String newValue3 = (String) obj;
                Intrinsics.i(newValue3, "newValue");
                this.b.invoke(new UserProfileFormIntent.EmailIdEntered(newValue3));
                return Unit.f17538a;
            case 24:
                WalletTransactionUiModel it21 = (WalletTransactionUiModel) obj;
                Intrinsics.i(it21, "it");
                this.b.invoke(new WalletAllTransactionsIntent.SingleTransactionClicked(it21));
                return Unit.f17538a;
            case 25:
                PromotionCardItem it22 = (PromotionCardItem) obj;
                Intrinsics.i(it22, "it");
                this.b.invoke(new WalletBalanceIntent.BannerClickedIntent(it22));
                return Unit.f17538a;
            case 26:
                WalletTransactionUiModel it23 = (WalletTransactionUiModel) obj;
                Intrinsics.i(it23, "it");
                this.b.invoke(new WalletBalanceIntent.TransactionClicked(it23));
                return Unit.f17538a;
            case 27:
                String amount = (String) obj;
                Intrinsics.i(amount, "amount");
                this.b.invoke(new WalletLoadBalanceEnterAmountIntent.AmountEnteredIntent(amount));
                return Unit.f17538a;
            case 28:
                PromotionCardItem it24 = (PromotionCardItem) obj;
                Intrinsics.i(it24, "it");
                this.b.invoke(new WalletLoadBalanceEnterAmountIntent.BannerClickedIntent(it24));
                return Unit.f17538a;
            default:
                WebView webView = (WebView) obj;
                KWebView kWebView = webView != null ? new KWebView(webView) : null;
                Function1 function1 = this.b;
                if (function1 != null) {
                    function1.invoke(kWebView);
                }
                return Unit.f17538a;
        }
    }
}
