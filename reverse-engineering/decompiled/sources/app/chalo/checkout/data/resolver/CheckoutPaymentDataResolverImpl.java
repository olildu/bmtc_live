package app.chalo.checkout.data.resolver;

import androidx.media3.common.PlaybackException;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.product.CheckoutProductDataResolver;
import app.chalo.checkout.domain.GetInaiCheckoutUseCase;
import app.chalo.checkout.domain.InaiCheckoutCreationError;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout;
import app.chalo.checkout.paymentprovider.inai.InaiSdkConfig;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.models.CheckoutPaymentProvider;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/data/resolver/CheckoutPaymentDataResolverImpl;", "Lapp/chalo/checkout/data/resolver/CheckoutPaymentDataResolver;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutPaymentDataResolverImpl implements CheckoutPaymentDataResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetInaiCheckoutUseCase f1352a;
    public final CheckoutProductDataResolver b;
    public CheckoutPaymentData c = new CheckoutPaymentData(new CheckoutOrderData("", "", "", "", "", "", "", "", "", "", null), new CheckoutUserDetails("", ""), "", new OrderPaymentProviderInfoAppModel.ProviderConfigAppModel(CheckoutPaymentProvider.UNKNOWN, null, "", "", null, null), null);
    public final MutableStateFlow d;
    public InaiCheckoutInstanceResult e;
    public final StateFlow f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/resolver/CheckoutPaymentDataResolverImpl$Companion;", "", "", "NO_PAYMENT_ID", "Ljava/lang/String;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1353a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutPaymentProvider.INAI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f1353a = iArr;
            int[] iArr2 = new int[CheckoutProductType.values().length];
            try {
                iArr2[CheckoutProductType.WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CheckoutProductType.SUPER_PASS_RIDE_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CheckoutProductType.SUPER_PASS_MAGIC_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CheckoutProductType.ELECTRICITY_BILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CheckoutProductType.CARD_RECHARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CheckoutProductType.NCMC.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CheckoutProductType.INSTANT_TICKET.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CheckoutProductType.PREMIUM_RESERVE_TICKET.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CheckoutProductType.METRO_TICKET.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CheckoutProductType.M_TICKET.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CheckoutProductType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CheckoutProductType.ONDC_METRO_TICKET.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CheckoutProductType.ONDC_TICKET.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CheckoutProductType.MULTI_MODAL_GROUP_TICKET.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            b = iArr2;
        }
    }

    public CheckoutPaymentDataResolverImpl(GetInaiCheckoutUseCase getInaiCheckoutUseCase, CheckoutProductDataResolver checkoutProductDataResolver) {
        this.f1352a = getInaiCheckoutUseCase;
        this.b = checkoutProductDataResolver;
        EmptyList emptyList = EmptyList.f17557a;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PaymentInfoState(new PaymentMethodsAppModel("", emptyList, emptyList), null, "", null, false, false, null, null, false, CustomUrlPaymentStatus.NONE, new JusPayPaymentDetails()));
        this.d = mutableStateFlowA;
        this.e = InaiCheckoutInstanceResult.NotInitialised.f1355a;
        this.f = FlowKt.c(mutableStateFlowA);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final PaymentMethodsAppModel H() {
        return ((PaymentInfoState) this.f.getValue()).f1361a;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void I(List installedUpiAppList) {
        MutableStateFlow mutableStateFlow;
        Object value;
        PaymentInfoState paymentInfoState;
        String str;
        ArrayList arrayList;
        Intrinsics.i(installedUpiAppList, "installedUpiAppList");
        do {
            mutableStateFlow = this.d;
            value = mutableStateFlow.getValue();
            paymentInfoState = (PaymentInfoState) value;
            PaymentMethodsAppModel paymentMethodsAppModel = paymentInfoState.f1361a;
            str = paymentMethodsAppModel.f1317a;
            List<PaymentMethodOptionsAppModel> list = paymentMethodsAppModel.b;
            arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (PaymentMethodOptionsAppModel upi : list) {
                if (upi instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) {
                    upi = new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI(((PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) upi).c, installedUpiAppList);
                }
                arrayList.add(upi);
            }
        } while (!mutableStateFlow.c(value, PaymentInfoState.a(paymentInfoState, new PaymentMethodsAppModel(str, arrayList, paymentInfoState.f1361a.c), null, null, null, false, false, null, null, false, null, 2046)));
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void K(CheckoutOrderData orderData) {
        ChaloUseCaseResult failure;
        InaiCheckoutInstanceResult failure2;
        Intrinsics.i(orderData, "orderData");
        GetInaiCheckoutUseCase getInaiCheckoutUseCase = this.f1352a;
        try {
            failure = new ChaloUseCaseResult.Success(getInaiCheckoutUseCase.f1374a.a(new InaiSdkConfig(orderData.f2689a, orderData.i, orderData.e)));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Something went wrong while creating Inai SDK";
            }
            failure = new ChaloUseCaseResult.Failure(new InaiCheckoutCreationError(message));
        }
        if (failure instanceof ChaloUseCaseResult.Success) {
            failure2 = new InaiCheckoutInstanceResult.Success((InaiSdkCheckout) ((ChaloUseCaseResult.Success) failure).f10419a);
        } else {
            if (!(failure instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            failure2 = new InaiCheckoutInstanceResult.Failure(((InaiCheckoutCreationError) ((ChaloUseCaseResult.Failure) failure).f10418a).f1380a);
        }
        this.e = failure2;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void M(String newUrl) {
        Intrinsics.i(newUrl, "newUrl");
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            String str = newUrl;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, null, false, false, str, null, false, null, 1983))) {
                return;
            } else {
                newUrl = str;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void N(PaymentInfoState savedPaymentInfo) {
        Intrinsics.i(savedPaymentInfo, "savedPaymentInfo");
        this.d.setValue(savedPaymentInfo);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    /* JADX INFO: renamed from: P, reason: from getter */
    public final StateFlow getF() {
        return this.f;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void R(CheckoutPaymentData savedPaymentData) {
        Intrinsics.i(savedPaymentData, "savedPaymentData");
        this.c = savedPaymentData;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean T() {
        return ((PaymentInfoState) this.f.getValue()).i;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void U(String str) {
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            String str2 = str;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, null, false, false, null, str2, false, null, 1919))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void Z(boolean z) {
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, null, false, false, null, null, z2, null, 1791))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean b0() {
        switch (WhenMappings.f1353a[this.c.d.f5657a.ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean c0() {
        Object next;
        Iterator it = ((PaymentInfoState) this.f.getValue()).f1361a.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((PaymentMethodOptionsAppModel) next) instanceof PaymentMethodOptionsAppModel.JuspayTurboUpi));
        PaymentMethodOptionsAppModel paymentMethodOptionsAppModel = (PaymentMethodOptionsAppModel) next;
        if (paymentMethodOptionsAppModel != null) {
            return paymentMethodOptionsAppModel.getC().b;
        }
        return false;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void d0(String str) {
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            String str2 = str;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, str2, null, null, false, false, null, null, false, null, 2045))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void j0(PaymentMethodsAppModel paymentMethodData) {
        Intrinsics.i(paymentMethodData, "paymentMethodData");
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            PaymentMethodsAppModel paymentMethodsAppModel = paymentMethodData;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, paymentMethodsAppModel, null, null, null, false, false, null, null, false, null, 2046))) {
                return;
            } else {
                paymentMethodData = paymentMethodsAppModel;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void l0(boolean z) {
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, null, z2, false, null, null, false, null, 2031))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void m0(String methodCode) {
        Intrinsics.i(methodCode, "methodCode");
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            String str = methodCode;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, str, null, false, false, null, null, false, null, 2043))) {
                return;
            } else {
                methodCode = str;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void n(CheckoutPaymentData paymentData) {
        Intrinsics.i(paymentData, "paymentData");
        this.c = paymentData;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean q() {
        switch (WhenMappings.f1353a[this.c.d.f5657a.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 8:
                return true;
            case 2:
                switch (WhenMappings.b[this.b.a().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        return true;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 5:
            case 6:
            case 7:
            case 9:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void t(SelectedPaymentInstrumentData selectedPaymentInstrumentData) {
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            SelectedPaymentInstrumentData selectedPaymentInstrumentData2 = selectedPaymentInstrumentData;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, selectedPaymentInstrumentData2, false, true, null, null, false, null, PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED))) {
                return;
            } else {
                selectedPaymentInstrumentData = selectedPaymentInstrumentData2;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    /* JADX INFO: renamed from: u, reason: from getter */
    public final CheckoutPaymentData getC() {
        return this.c;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    /* JADX INFO: renamed from: w, reason: from getter */
    public final InaiCheckoutInstanceResult getE() {
        return this.e;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void y(CustomUrlPaymentStatus status) {
        Intrinsics.i(status, "status");
        while (true) {
            MutableStateFlow mutableStateFlow = this.d;
            Object value = mutableStateFlow.getValue();
            CustomUrlPaymentStatus customUrlPaymentStatus = status;
            if (mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, null, false, false, null, null, false, customUrlPaymentStatus, 1535))) {
                return;
            } else {
                status = customUrlPaymentStatus;
            }
        }
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void z() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.d;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, PaymentInfoState.a((PaymentInfoState) value, null, null, null, null, false, false, null, null, false, null, 2015)));
    }
}
