package app.chalo.checkout.domain.provider;

import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.utility.IRazorPayHelper;
import app.chalo.checkout.utility.InstalledUpiApp;
import app.chalo.checkout.utility.InstalledUpiAppsHelper;
import app.chalo.checkout.utility.InstalledUpiAppsHelperProvider;
import app.chalo.extensions.StringExtsKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/domain/provider/CheckoutItemsProvider;", "Lapp/chalo/checkout/domain/provider/ICheckoutItemsProvider;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutItemsProvider implements ICheckoutItemsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f1395a;
    public final IRazorPayHelper b;
    public final CheckoutPaymentDataResolver c;
    public final InstalledUpiAppsHelperProvider d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/domain/provider/CheckoutItemsProvider$Companion;", "", "", "PAYTM_APP_NAME", "Ljava/lang/String;", "PAYTM_APP_DISPLAY_SUFFIX", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckoutItemsProvider(StringProvider stringProvider, IRazorPayHelper iRazorPayHelper, CheckoutPaymentDataResolver checkoutPaymentDataResolver, InstalledUpiAppsHelperProvider installedUpiAppsHelperProvider) {
        this.f1395a = stringProvider;
        this.b = iRazorPayHelper;
        this.c = checkoutPaymentDataResolver;
        this.d = installedUpiAppsHelperProvider;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.domain.provider.ICheckoutItemsProvider
    public final Object a(PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel netBankingPaymentInstrumentAppModel, ContinuationImpl continuationImpl) {
        CheckoutItemsProvider$getNetBankingCheckoutItem$1 checkoutItemsProvider$getNetBankingCheckoutItem$1;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2;
        String str;
        PaymentLogo.Url url;
        if (continuationImpl instanceof CheckoutItemsProvider$getNetBankingCheckoutItem$1) {
            checkoutItemsProvider$getNetBankingCheckoutItem$1 = (CheckoutItemsProvider$getNetBankingCheckoutItem$1) continuationImpl;
            int i = checkoutItemsProvider$getNetBankingCheckoutItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutItemsProvider$getNetBankingCheckoutItem$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutItemsProvider$getNetBankingCheckoutItem$1 = new CheckoutItemsProvider$getNetBankingCheckoutItem$1(this, continuationImpl);
            }
        } else {
            checkoutItemsProvider$getNetBankingCheckoutItem$1 = new CheckoutItemsProvider$getNetBankingCheckoutItem$1(this, continuationImpl);
        }
        Object obj = checkoutItemsProvider$getNetBankingCheckoutItem$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutItemsProvider$getNetBankingCheckoutItem$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            paymentDisplayDetailsAppModel = netBankingPaymentInstrumentAppModel.f1291a;
            String str2 = paymentDisplayDetailsAppModel.f;
            if (str2 == null || StringsKt.F(str2)) {
                String str3 = netBankingPaymentInstrumentAppModel.d;
                checkoutItemsProvider$getNetBankingCheckoutItem$1.L$0 = paymentDisplayDetailsAppModel;
                checkoutItemsProvider$getNetBankingCheckoutItem$1.label = 1;
                Object objA = this.b.a(str3, checkoutItemsProvider$getNetBankingCheckoutItem$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objA;
                paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel;
            } else {
                str = paymentDisplayDetailsAppModel.f;
            }
            if (str != null) {
                url = new PaymentLogo.Url(str);
            } else {
                url = null;
            }
            PaymentLogo.Url url2 = url;
            String str4 = paymentDisplayDetailsAppModel.f1289a;
            boolean z = paymentDisplayDetailsAppModel.b;
            return new PaymentUiItem(url2, str4, z, paymentDisplayDetailsAppModel.c, paymentDisplayDetailsAppModel.e, e(paymentDisplayDetailsAppModel.d, z), null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paymentDisplayDetailsAppModel2 = (PaymentDisplayDetailsAppModel) checkoutItemsProvider$getNetBankingCheckoutItem$1.L$0;
        ResultKt.b(obj);
        String str5 = (String) obj;
        paymentDisplayDetailsAppModel = paymentDisplayDetailsAppModel2;
        str = str5;
        if (str != null) {
            url = new PaymentLogo.Url(str);
        } else {
            url = null;
        }
        PaymentLogo.Url url3 = url;
        String str6 = paymentDisplayDetailsAppModel.f1289a;
        boolean z2 = paymentDisplayDetailsAppModel.b;
        return new PaymentUiItem(url3, str6, z2, paymentDisplayDetailsAppModel.c, paymentDisplayDetailsAppModel.e, e(paymentDisplayDetailsAppModel.d, z2), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.domain.provider.ICheckoutItemsProvider
    public final Object b(PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel uPIPaymentInstrumentAppModel, ContinuationImpl continuationImpl) {
        CheckoutItemsProvider$getUPiCheckoutItem$1 checkoutItemsProvider$getUPiCheckoutItem$1;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel;
        if (continuationImpl instanceof CheckoutItemsProvider$getUPiCheckoutItem$1) {
            checkoutItemsProvider$getUPiCheckoutItem$1 = (CheckoutItemsProvider$getUPiCheckoutItem$1) continuationImpl;
            int i = checkoutItemsProvider$getUPiCheckoutItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutItemsProvider$getUPiCheckoutItem$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutItemsProvider$getUPiCheckoutItem$1 = new CheckoutItemsProvider$getUPiCheckoutItem$1(this, continuationImpl);
            }
        } else {
            checkoutItemsProvider$getUPiCheckoutItem$1 = new CheckoutItemsProvider$getUPiCheckoutItem$1(this, continuationImpl);
        }
        Object obj = checkoutItemsProvider$getUPiCheckoutItem$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutItemsProvider$getUPiCheckoutItem$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2 = uPIPaymentInstrumentAppModel.f1291a;
            String str = paymentDisplayDetailsAppModel2.f;
            String str2 = uPIPaymentInstrumentAppModel.d;
            boolean z = uPIPaymentInstrumentAppModel.e;
            checkoutItemsProvider$getUPiCheckoutItem$1.L$0 = paymentDisplayDetailsAppModel2;
            checkoutItemsProvider$getUPiCheckoutItem$1.label = 1;
            Object objF = f(str, str2, checkoutItemsProvider$getUPiCheckoutItem$1, z);
            if (objF == obj2) {
                return obj2;
            }
            obj = objF;
            paymentDisplayDetailsAppModel = paymentDisplayDetailsAppModel2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentDisplayDetailsAppModel = (PaymentDisplayDetailsAppModel) checkoutItemsProvider$getUPiCheckoutItem$1.L$0;
            ResultKt.b(obj);
        }
        PaymentLogo paymentLogo = (PaymentLogo) obj;
        String strA = paymentDisplayDetailsAppModel.f1289a;
        if (Intrinsics.d(strA, "paytm")) {
            strA = vo1.A(strA, " UPI");
        }
        boolean z2 = paymentDisplayDetailsAppModel.b;
        return new PaymentUiItem(paymentLogo, strA, z2, paymentDisplayDetailsAppModel.c, paymentDisplayDetailsAppModel.e, e(paymentDisplayDetailsAppModel.d, z2), null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.domain.provider.ICheckoutItemsProvider
    public final Object c(PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel walletPaymentInstrumentAppModel, ContinuationImpl continuationImpl) {
        CheckoutItemsProvider$getWalletCheckoutItem$1 checkoutItemsProvider$getWalletCheckoutItem$1;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel;
        String str;
        PaymentLogo.Url url;
        if (continuationImpl instanceof CheckoutItemsProvider$getWalletCheckoutItem$1) {
            checkoutItemsProvider$getWalletCheckoutItem$1 = (CheckoutItemsProvider$getWalletCheckoutItem$1) continuationImpl;
            int i = checkoutItemsProvider$getWalletCheckoutItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutItemsProvider$getWalletCheckoutItem$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutItemsProvider$getWalletCheckoutItem$1 = new CheckoutItemsProvider$getWalletCheckoutItem$1(this, continuationImpl);
            }
        } else {
            checkoutItemsProvider$getWalletCheckoutItem$1 = new CheckoutItemsProvider$getWalletCheckoutItem$1(this, continuationImpl);
        }
        Object objB = checkoutItemsProvider$getWalletCheckoutItem$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutItemsProvider$getWalletCheckoutItem$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            paymentDisplayDetailsAppModel = walletPaymentInstrumentAppModel.f1291a;
            String str2 = paymentDisplayDetailsAppModel.f;
            if (str2 == null || StringsKt.F(str2)) {
                String str3 = paymentDisplayDetailsAppModel.f1289a;
                checkoutItemsProvider$getWalletCheckoutItem$1.L$0 = paymentDisplayDetailsAppModel;
                checkoutItemsProvider$getWalletCheckoutItem$1.label = 1;
                objB = this.b.b(str3, checkoutItemsProvider$getWalletCheckoutItem$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                str = paymentDisplayDetailsAppModel.f;
            }
            if (str != null) {
                url = new PaymentLogo.Url(str);
            } else {
                url = null;
            }
            PaymentLogo.Url url2 = url;
            String strA = StringExtsKt.a(paymentDisplayDetailsAppModel.f1289a);
            boolean z = paymentDisplayDetailsAppModel.b;
            return new PaymentUiItem(url2, strA, z, paymentDisplayDetailsAppModel.c, paymentDisplayDetailsAppModel.e, e(paymentDisplayDetailsAppModel.d, z), null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paymentDisplayDetailsAppModel = (PaymentDisplayDetailsAppModel) checkoutItemsProvider$getWalletCheckoutItem$1.L$0;
        ResultKt.b(objB);
        str = (String) objB;
        if (str != null) {
            url = new PaymentLogo.Url(str);
        } else {
            url = null;
        }
        PaymentLogo.Url url3 = url;
        String strA2 = StringExtsKt.a(paymentDisplayDetailsAppModel.f1289a);
        boolean z2 = paymentDisplayDetailsAppModel.b;
        return new PaymentUiItem(url3, strA2, z2, paymentDisplayDetailsAppModel.c, paymentDisplayDetailsAppModel.e, e(paymentDisplayDetailsAppModel.d, z2), null);
    }

    @Override // app.chalo.checkout.domain.provider.ICheckoutItemsProvider
    public final PaymentUiItem d(PaymentMethodOptionsAppModel paymentMethodOption) {
        IconType iconType;
        Intrinsics.i(paymentMethodOption, "paymentMethodOption");
        PaymentDisplayDetailsAppModel c = paymentMethodOption.getC();
        boolean z = c.b;
        String str = c.d;
        boolean z2 = paymentMethodOption instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay;
        if (z2) {
            z = ((PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay) paymentMethodOption).d.b && z;
            if (!z) {
                str = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new CheckoutItemsProvider$getPaymentMethodCheckoutItem$1$1(this, null));
            }
        }
        boolean z3 = z;
        if ((paymentMethodOption instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI)) {
            iconType = IconType.UPI;
        } else if ((paymentMethodOption instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet)) {
            iconType = IconType.WALLET_RESIZED;
        } else if ((paymentMethodOption instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking)) {
            iconType = IconType.NETBANKING;
        } else if ((paymentMethodOption instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Card) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Card) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.Card)) {
            iconType = IconType.DEBIT_CARD;
        } else if ((paymentMethodOption instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Cash) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Cash)) {
            iconType = IconType.CASH;
        } else if (z2 || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.LazyPay)) {
            iconType = IconType.LAZY_PAY;
        } else if (paymentMethodOption instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic) {
            iconType = IconType.LOGO_CHALO;
        } else if ((paymentMethodOption instanceof PaymentMethodOptionsAppModel.ChaloPay) || (paymentMethodOption instanceof PaymentMethodOptionsAppModel.ClosedLoopWallet)) {
            iconType = IconType.WALLET_INTRODUCTION;
        } else {
            if (!(paymentMethodOption instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi)) {
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.UPI;
        }
        return new PaymentUiItem(new PaymentLogo.Icon(iconType), c.f1289a, z3, c.c, c.e, e(str, z3), null);
    }

    public final String e(String str, boolean z) {
        if (z || str != null) {
            return str;
        }
        String str2 = ((PaymentInfoState) this.c.P().getValue()).f1361a.f1317a;
        if (str2 != null) {
            return str2;
        }
        return (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new CheckoutItemsProvider$getWarningMsgForItems$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        CheckoutItemsProvider$resolveUpiLogo$1 checkoutItemsProvider$resolveUpiLogo$1;
        InstalledUpiAppsHelper installedUpiAppsHelperB;
        PaymentLogo paymentLogo;
        if (continuationImpl instanceof CheckoutItemsProvider$resolveUpiLogo$1) {
            checkoutItemsProvider$resolveUpiLogo$1 = (CheckoutItemsProvider$resolveUpiLogo$1) continuationImpl;
            int i = checkoutItemsProvider$resolveUpiLogo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutItemsProvider$resolveUpiLogo$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutItemsProvider$resolveUpiLogo$1 = new CheckoutItemsProvider$resolveUpiLogo$1(this, continuationImpl);
            }
        } else {
            checkoutItemsProvider$resolveUpiLogo$1 = new CheckoutItemsProvider$resolveUpiLogo$1(this, continuationImpl);
        }
        Object objB = checkoutItemsProvider$resolveUpiLogo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutItemsProvider$resolveUpiLogo$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (str != null) {
                return new PaymentLogo.Url(str);
            }
            if (z && (installedUpiAppsHelperB = this.d.b()) != null) {
                checkoutItemsProvider$resolveUpiLogo$1.label = 1;
                objB = installedUpiAppsHelperB.b(str2, checkoutItemsProvider$resolveUpiLogo$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new PaymentLogo.Icon(IconType.UPI);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        InstalledUpiApp installedUpiApp = (InstalledUpiApp) objB;
        if (installedUpiApp != null && (paymentLogo = installedUpiApp.c) != null) {
            return paymentLogo;
        }
        return new PaymentLogo.Icon(IconType.UPI);
    }
}
