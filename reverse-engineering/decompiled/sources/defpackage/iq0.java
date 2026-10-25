package defpackage;

import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.ui.screen.payment.CheckoutRestoredState;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.payment.PaymentViewIntent;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CheckoutCardArgs;
import app.chalo.scenes.args.CheckoutInaiArgs;
import app.chalo.scenes.args.CheckoutNetBankingArgs;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.scenes.args.CheckoutUpiArgs;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.uistate.text.StyledTextClickHandler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17083a;
    public final /* synthetic */ PaymentMainComponent b;

    public /* synthetic */ iq0(PaymentMainComponent paymentMainComponent, int i) {
        this.f17083a = i;
        this.b = paymentMainComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17083a) {
            case 0:
                PaymentMainComponent paymentMainComponent = this.b;
                paymentMainComponent.H.b(new ChaloNavigationRequest.Navigate(new CheckoutPostPaymentArgs(paymentMainComponent.k.c), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.CheckoutPaymentMain, true), 3), null, 4));
                return Unit.f17538a;
            case 1:
                PaymentMainComponent paymentMainComponent2 = this.b;
                paymentMainComponent2.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent2.k)));
                return Unit.f17538a;
            case 2:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutUpiArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 3:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutWalletArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 4:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutNetBankingArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 5:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutCardArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 6:
                PaymentMainComponent paymentMainComponent3 = this.b;
                paymentMainComponent3.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent3.k)));
                return Unit.f17538a;
            case 7:
                this.b.s1(PaymentViewIntent.PermissionDialogPositiveButtonClicked.f1566a);
                return Unit.f17538a;
            case 8:
                this.b.s1(PaymentViewIntent.PermissionDialogNegativeButtonClicked.f1565a);
                return Unit.f17538a;
            case 9:
                this.b.s1(PaymentViewIntent.ProceedWithChaloPayModeIntent.f1570a);
                return Unit.f17538a;
            case 10:
                this.b.s1(PaymentViewIntent.HandleChaloWalletBlockedOkayClickedIntent.f1555a);
                return Unit.f17538a;
            case 11:
                this.b.s1(PaymentViewIntent.DismissPaymentBottomsheetIntent.f1552a);
                return Unit.f17538a;
            case 12:
                this.b.s1(PaymentViewIntent.InAppUpiSmsPermissionBottomSheetOkayClicked.f1558a);
                return Unit.f17538a;
            case 13:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutRazorpayArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 14:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutInaiArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 15:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutPhonePeArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 16:
                this.b.s1(PaymentViewIntent.LoadPaymentMethodsIntent.f1561a);
                return Unit.f17538a;
            case 17:
                this.b.H.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
                return Unit.f17538a;
            case 18:
                PaymentMainComponent paymentMainComponent4 = this.b;
                paymentMainComponent4.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent4.k)));
                return Unit.f17538a;
            case 19:
                this.b.H.b(new ChaloNavigationRequest.Navigate(CheckoutUpiArgs.INSTANCE, null, null, 6));
                return Unit.f17538a;
            case 20:
                this.b.s1(PaymentViewIntent.SeeMoreUpiAppsCtaClicked.f1572a);
                return Unit.f17538a;
            case 21:
                this.b.s1(PaymentViewIntent.DismissPaymentBottomsheetIntent.f1552a);
                return Unit.f17538a;
            case 22:
                this.b.s1(PaymentViewIntent.UPIManagementClicked.f1574a);
                return Unit.f17538a;
            case 23:
                jq0 jq0Var = new jq0(11);
                PaymentMainComponent paymentMainComponent5 = this.b;
                paymentMainComponent5.E0(jq0Var);
                paymentMainComponent5.r1(null);
                return Unit.f17538a;
            case 24:
                PaymentMainComponent paymentMainComponent6 = this.b;
                paymentMainComponent6.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent6.k)));
                return Unit.f17538a;
            case 25:
                final PaymentMainComponent paymentMainComponent7 = this.b;
                return new StyledTextClickHandler() { // from class: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$tncStyledTextClickHandler$2$1
                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    public final void a() {
                        paymentMainComponent7.s1(PaymentViewIntent.ChaloPayBottomsheetTnCClicked.f1550a);
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: b */
                    public final String getF10090a() {
                        return ((PaymentDataState) paymentMainComponent7.f.getValue()).t;
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: getTag */
                    public final String getF10085a() {
                        return "URL";
                    }
                };
            case 26:
                PaymentMainComponent paymentMainComponent8 = this.b;
                CheckoutProductData f1363a = paymentMainComponent8.l.getF1363a();
                CheckoutPaymentDataResolver checkoutPaymentDataResolver = paymentMainComponent8.m;
                CheckoutPaymentData c = checkoutPaymentDataResolver.getC();
                PaymentInfoState paymentInfoState = (PaymentInfoState) checkoutPaymentDataResolver.getF().getValue();
                SelectedPaymentInstrumentData selectedPaymentInstrumentData = paymentInfoState.d;
                if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.CardData) {
                    selectedPaymentInstrumentData = null;
                } else if (!(selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.NetBankingData) && !(selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.UpiData.IntentFlow) && !(selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.WalletData) && selectedPaymentInstrumentData != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return new CheckoutRestoredState(c, f1363a, PaymentInfoState.a(paymentInfoState, null, null, null, selectedPaymentInstrumentData, false, false, null, null, false, null, 2039));
            case 27:
                PaymentMainComponent paymentMainComponent9 = this.b;
                paymentMainComponent9.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent9.k)));
                return Unit.f17538a;
            case 28:
                PaymentMainComponent paymentMainComponent10 = this.b;
                paymentMainComponent10.H.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(paymentMainComponent10.k)));
                return Unit.f17538a;
            default:
                PaymentMainComponent paymentMainComponent11 = this.b;
                paymentMainComponent11.H.b(new ChaloNavigationRequest.Navigate(new CheckoutPostPaymentArgs(paymentMainComponent11.k.c), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.CheckoutPaymentMain, true), 3), null, 4));
                return Unit.f17538a;
        }
    }
}
