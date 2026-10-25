package app.chalo.checkout.domain.checkoutitem;

import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.chalopay.WalletStatusForUI;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/domain/checkoutitem/ChaloPayCheckoutItemHelper;", "", "ChaloPayItemMetaData", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloPayCheckoutItemHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloPayCheckoutItemHelper f1384a = new ChaloPayCheckoutItemHelper();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/checkoutitem/ChaloPayCheckoutItemHelper$ChaloPayItemMetaData;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloPayItemMetaData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletStatusForUI f1385a;
        public final long b;
        public final boolean c;
        public final boolean d;

        public ChaloPayItemMetaData(WalletStatusForUI walletStatusForUI, long j, boolean z, boolean z2) {
            this.f1385a = walletStatusForUI;
            this.b = j;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloPayItemMetaData)) {
                return false;
            }
            ChaloPayItemMetaData chaloPayItemMetaData = (ChaloPayItemMetaData) obj;
            return this.f1385a == chaloPayItemMetaData.f1385a && this.b == chaloPayItemMetaData.b && this.c == chaloPayItemMetaData.c && this.d == chaloPayItemMetaData.d;
        }

        public final int hashCode() {
            WalletStatusForUI walletStatusForUI = this.f1385a;
            int iHashCode = walletStatusForUI == null ? 0 : walletStatusForUI.hashCode();
            long j = this.b;
            return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return "ChaloPayItemMetaData(walletStatusForUI=" + this.f1385a + ", walletBalance=" + this.b + ", isAnyChaloPayTransactionDone=" + this.c + ", isLoadingWalletData=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1386a;

        static {
            int[] iArr = new int[WalletStatusForUI.values().length];
            try {
                iArr[WalletStatusForUI.WALLET_NOT_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatusForUI.NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatusForUI.WALLET_BLOCKED_BACKEND_RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStatusForUI.WALLET_BLOCKED_APP_RECLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletStatusForUI.WALLET_BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletStatusForUI.INTERNET_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletStatusForUI.ACTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletStatusForUI.INSUFFICIENT_BALANCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WalletStatusForUI.FULL_KYC_NEEDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WalletStatusForUI.API_FETCH_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f1386a = iArr;
        }
    }

    public static Object b(WalletStatusForUI walletStatusForUI, long j, StringProvider stringProvider, CurrencyFeature currencyFeature, ContinuationImpl continuationImpl) {
        switch (walletStatusForUI == null ? -1 : WhenMappings.f1386a[walletStatusForUI.ordinal()]) {
            case -1:
                return "";
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return stringProvider.b(StringEnum.WALLET_NOT_ACTIVE, new Object[0], continuationImpl);
            case 2:
                return stringProvider.b(StringEnum.LOGIN_TO_CONTINUE, new Object[0], continuationImpl);
            case 3:
            case 4:
            case 5:
                return stringProvider.b(StringEnum.WALLET_BLOCKED, new Object[0], continuationImpl);
            case 6:
                return stringProvider.b(StringEnum.INTERNET_ERROR, new Object[0], continuationImpl);
            case 7:
                return stringProvider.b(StringEnum.CHECKOUT_AMOUNT, new Object[]{currencyFeature.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)}, continuationImpl);
            case 8:
                return stringProvider.b(StringEnum.INSUFFICIENT_BALANCE_AMOUNT, new Object[]{currencyFeature.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)}, continuationImpl);
            case 9:
                return stringProvider.b(StringEnum.NEED_FULL_KYC, new Object[0], continuationImpl);
            case 10:
                return stringProvider.b(StringEnum.UNABLE_TO_FETCH_WALLET, new Object[0], continuationImpl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(StringProvider stringProvider, CurrencyFeature currencyFeature, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ChaloPayItemMetaData chaloPayItemMetaData, ContinuationImpl continuationImpl) {
        ChaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1 chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1;
        ChaloPayItemMetaData chaloPayItemMetaData2;
        StringProvider stringProvider2;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2;
        CurrencyFeature currencyFeature2;
        PaymentLogo.Icon icon;
        int i;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel3;
        String str;
        PaymentLogo.Icon icon2;
        int i2;
        boolean z;
        String str2;
        String str3;
        String str4;
        boolean z2;
        if (continuationImpl instanceof ChaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1) {
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1 = (ChaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1) continuationImpl;
            int i3 = chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1.label = i3 - Integer.MIN_VALUE;
            } else {
                chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1 = new ChaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1(this, continuationImpl);
            }
        } else {
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1 = new ChaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1(this, continuationImpl);
        }
        ChaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1 chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2 = chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$1;
        Object obj = chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            PaymentLogo.Icon icon3 = new PaymentLogo.Icon(IconType.WALLET_INTRODUCTION);
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$0 = stringProvider;
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$1 = currencyFeature;
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$2 = paymentDisplayDetailsAppModel;
            chaloPayItemMetaData2 = chaloPayItemMetaData;
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$3 = chaloPayItemMetaData2;
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$4 = icon3;
            chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.label = 1;
            Object objB = stringProvider.b(StringEnum.CHALO_WALLET, new Object[0], chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2);
            if (objB != coroutineSingletons) {
                stringProvider2 = stringProvider;
                paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel;
                currencyFeature2 = currencyFeature;
                icon = icon3;
                obj = objB;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            PaymentLogo.Icon icon4 = (PaymentLogo.Icon) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$4;
            ChaloPayItemMetaData chaloPayItemMetaData3 = (ChaloPayItemMetaData) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$3;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel4 = (PaymentDisplayDetailsAppModel) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$2;
            CurrencyFeature currencyFeature3 = (CurrencyFeature) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$1;
            StringProvider stringProvider3 = (StringProvider) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$0;
            ResultKt.b(obj);
            currencyFeature2 = currencyFeature3;
            stringProvider2 = stringProvider3;
            icon = icon4;
            chaloPayItemMetaData2 = chaloPayItemMetaData3;
            paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel4;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.I$0;
            String str5 = (String) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$4;
            PaymentLogo.Icon icon5 = (PaymentLogo.Icon) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$3;
            ChaloPayItemMetaData chaloPayItemMetaData4 = (ChaloPayItemMetaData) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$2;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel5 = (PaymentDisplayDetailsAppModel) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$1;
            stringProvider2 = (StringProvider) chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$0;
            ResultKt.b(obj);
            str = str5;
            paymentDisplayDetailsAppModel3 = paymentDisplayDetailsAppModel5;
            chaloPayItemMetaData2 = chaloPayItemMetaData4;
            icon2 = icon5;
        }
        String str6 = (String) obj;
        z = chaloPayItemMetaData2.c;
        str2 = paymentDisplayDetailsAppModel3.c;
        if (str2 != null || str2.length() == 0) {
            if (z) {
                str3 = null;
            } else {
                str4 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloPayCheckoutItemHelper$getLabel$1(stringProvider2, null));
            }
            String str7 = paymentDisplayDetailsAppModel3.d;
            boolean z3 = chaloPayItemMetaData2.d;
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem(new PaymentUiItem(icon2, str, z2, str3, str6, str7, Boolean.valueOf(z3)));
        }
        str4 = paymentDisplayDetailsAppModel3.c;
        str3 = str4;
        String str8 = paymentDisplayDetailsAppModel3.d;
        boolean z4 = chaloPayItemMetaData2.d;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem(new PaymentUiItem(icon2, str, z2, str3, str6, str8, Boolean.valueOf(z4)));
        String str9 = (String) obj;
        if (paymentDisplayDetailsAppModel2.b) {
            WalletStatusForUI walletStatusForUI = chaloPayItemMetaData2.f1385a;
            switch (walletStatusForUI == null ? -1 : WhenMappings.f1386a[walletStatusForUI.ordinal()]) {
                case -1:
                case 2:
                    i = 0;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i = 1;
                    break;
            }
        } else {
            i = 0;
        }
        WalletStatusForUI walletStatusForUI2 = chaloPayItemMetaData2.f1385a;
        long j = chaloPayItemMetaData2.b;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$0 = stringProvider2;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$1 = paymentDisplayDetailsAppModel2;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$2 = chaloPayItemMetaData2;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$3 = icon;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.L$4 = str9;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.I$0 = i;
        chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2.label = 2;
        Object objB2 = b(walletStatusForUI2, j, stringProvider2, currencyFeature2, chaloPayCheckoutItemHelper$getChaloPayCheckoutItem$2);
        if (objB2 != coroutineSingletons) {
            paymentDisplayDetailsAppModel3 = paymentDisplayDetailsAppModel2;
            str = str9;
            obj = objB2;
            icon2 = icon;
            i2 = i;
            String str10 = (String) obj;
            z = chaloPayItemMetaData2.c;
            str2 = paymentDisplayDetailsAppModel3.c;
            if (str2 != null) {
                if (z) {
                    str4 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloPayCheckoutItemHelper$getLabel$1(stringProvider2, null));
                    str3 = str4;
                } else {
                    str3 = null;
                }
            } else if (z) {
                str4 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloPayCheckoutItemHelper$getLabel$1(stringProvider2, null));
                str3 = str4;
            } else {
                str3 = null;
            }
            String str11 = paymentDisplayDetailsAppModel3.d;
            boolean z5 = chaloPayItemMetaData2.d;
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem(new PaymentUiItem(icon2, str, z2, str3, str10, str11, Boolean.valueOf(z5)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(StringProvider stringProvider, CurrencyFeature currencyFeature, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ChaloPayItemMetaData chaloPayItemMetaData, ContinuationImpl continuationImpl) {
        ChaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1 chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1;
        StringProvider stringProvider2;
        ChaloPayItemMetaData chaloPayItemMetaData2;
        CurrencyFeature currencyFeature2;
        PaymentLogo paymentLogo;
        int i;
        String str;
        PaymentLogo paymentLogo2;
        ChaloPayItemMetaData chaloPayItemMetaData3;
        int i2;
        boolean z;
        String str2;
        String str3;
        String str4;
        boolean z2;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel;
        if (continuationImpl instanceof ChaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1) {
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1 = (ChaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1) continuationImpl;
            int i3 = chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1.label = i3 - Integer.MIN_VALUE;
            } else {
                chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1 = new ChaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1(this, continuationImpl);
            }
        } else {
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1 = new ChaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1(this, continuationImpl);
        }
        ChaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1 chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2 = chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$1;
        Object objB = chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.label;
        if (i4 == 0) {
            ResultKt.b(objB);
            String str5 = paymentDisplayDetailsAppModel2.f;
            PaymentLogo url = str5 != null ? new PaymentLogo.Url(str5) : new PaymentLogo.Icon(IconType.WALLET_INTRODUCTION);
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$0 = stringProvider;
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$1 = currencyFeature;
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$2 = paymentDisplayDetailsAppModel2;
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$3 = chaloPayItemMetaData;
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$4 = url;
            chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.label = 1;
            objB = stringProvider.b(StringEnum.CHALO_WALLET, new Object[0], chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2);
            if (objB != coroutineSingletons) {
                stringProvider2 = stringProvider;
                chaloPayItemMetaData2 = chaloPayItemMetaData;
                currencyFeature2 = currencyFeature;
                paymentLogo = url;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            PaymentLogo paymentLogo3 = (PaymentLogo) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$4;
            ChaloPayItemMetaData chaloPayItemMetaData4 = (ChaloPayItemMetaData) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$3;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel3 = (PaymentDisplayDetailsAppModel) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$2;
            CurrencyFeature currencyFeature3 = (CurrencyFeature) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$1;
            stringProvider2 = (StringProvider) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$0;
            ResultKt.b(objB);
            paymentLogo = paymentLogo3;
            chaloPayItemMetaData2 = chaloPayItemMetaData4;
            paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel3;
            currencyFeature2 = currencyFeature3;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.I$0;
            String str6 = (String) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$4;
            PaymentLogo paymentLogo4 = (PaymentLogo) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$3;
            chaloPayItemMetaData3 = (ChaloPayItemMetaData) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$2;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel4 = (PaymentDisplayDetailsAppModel) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$1;
            StringProvider stringProvider3 = (StringProvider) chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$0;
            ResultKt.b(objB);
            stringProvider2 = stringProvider3;
            str = str6;
            paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel4;
            paymentLogo2 = paymentLogo4;
        }
        String str7 = (String) objB;
        z = chaloPayItemMetaData3.c;
        str2 = paymentDisplayDetailsAppModel2.c;
        if (str2 != null || str2.length() == 0) {
            if (z) {
                str3 = null;
            } else {
                str4 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloPayCheckoutItemHelper$getLabel$1(stringProvider2, null));
            }
            String str8 = paymentDisplayDetailsAppModel2.d;
            boolean z3 = chaloPayItemMetaData3.d;
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem(new PaymentUiItem(paymentLogo2, str, z2, str3, str7, str8, Boolean.valueOf(z3)));
        }
        str4 = paymentDisplayDetailsAppModel2.c;
        str3 = str4;
        String str9 = paymentDisplayDetailsAppModel2.d;
        boolean z4 = chaloPayItemMetaData3.d;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem(new PaymentUiItem(paymentLogo2, str, z2, str3, str7, str9, Boolean.valueOf(z4)));
        String str10 = (String) objB;
        if (paymentDisplayDetailsAppModel2.b) {
            WalletStatusForUI walletStatusForUI = chaloPayItemMetaData2.f1385a;
            switch (walletStatusForUI == null ? -1 : WhenMappings.f1386a[walletStatusForUI.ordinal()]) {
                case -1:
                case 2:
                    i = 0;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i = 1;
                    break;
            }
        } else {
            i = 0;
        }
        WalletStatusForUI walletStatusForUI2 = chaloPayItemMetaData2.f1385a;
        long j = chaloPayItemMetaData2.b;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$0 = stringProvider2;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$1 = paymentDisplayDetailsAppModel2;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$2 = chaloPayItemMetaData2;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$3 = paymentLogo;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.L$4 = str10;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.I$0 = i;
        chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2.label = 2;
        Object objB2 = b(walletStatusForUI2, j, stringProvider2, currencyFeature2, chaloPayCheckoutItemHelper$getClosedLoopWalletPayCheckoutItem$2);
        if (objB2 != coroutineSingletons) {
            str = str10;
            objB = objB2;
            paymentLogo2 = paymentLogo;
            chaloPayItemMetaData3 = chaloPayItemMetaData2;
            i2 = i;
            String str11 = (String) objB;
            z = chaloPayItemMetaData3.c;
            str2 = paymentDisplayDetailsAppModel2.c;
            if (str2 != null) {
                if (z) {
                    str4 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloPayCheckoutItemHelper$getLabel$1(stringProvider2, null));
                    str3 = str4;
                } else {
                    str3 = null;
                }
            } else if (z) {
                str4 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new ChaloPayCheckoutItemHelper$getLabel$1(stringProvider2, null));
                str3 = str4;
            } else {
                str3 = null;
            }
            String str12 = paymentDisplayDetailsAppModel2.d;
            boolean z5 = chaloPayItemMetaData3.d;
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem(new PaymentUiItem(paymentLogo2, str, z2, str3, str11, str12, Boolean.valueOf(z5)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1 chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1;
        if (continuationImpl instanceof ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1) {
            chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1 = (ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1) continuationImpl;
            int i = chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1 = new ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1(this, continuationImpl);
            }
        } else {
            chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1 = new ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1(this, continuationImpl);
        }
        Object objV = chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            String strM = userProfileDetailsProvider.m();
            if (strM == null) {
                strM = "";
            }
            final Flow flowW = walletTypeIdentifier != null ? walletRepository.w(strM, walletTypeIdentifier) : walletRepository.l(strM);
            Flow<Boolean> flow = new Flow<Boolean>() { // from class: app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f1388a;

                    /* JADX INFO: renamed from: app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.checkout.domain.checkoutitem.ChaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$$inlined$map$1$2", f = "ChaloPayCheckoutItemHelper.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f1388a = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            List list = (List) obj;
                            boolean z = false;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    if (((WalletTransactionAppModel) it.next()).b == WalletTransactionType.CHALO_PAY) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            anonymousClass1.label = 1;
                            if (this.f1388a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flowW.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1.label = 1;
            objV = FlowKt.v(flow, chaloPayCheckoutItemHelper$isAnyChaloPayTransactionDone$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Boolean bool = (Boolean) objV;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
