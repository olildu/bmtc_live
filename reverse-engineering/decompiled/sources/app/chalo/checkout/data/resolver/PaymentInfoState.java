package app.chalo.checkout.data.resolver;

import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.xp0;
import defpackage.z40;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/resolver/PaymentInfoState;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentInfoState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethodsAppModel f1361a;
    public final String b;
    public final String c;
    public final SelectedPaymentInstrumentData d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final CustomUrlPaymentStatus j;
    public final JusPayPaymentDetails k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/resolver/PaymentInfoState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/resolver/PaymentInfoState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentInfoState> serializer() {
            return PaymentInfoState$$serializer.f1362a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new xp0(6)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new xp0(7)), null};
    }

    public /* synthetic */ PaymentInfoState(int i, PaymentMethodsAppModel paymentMethodsAppModel, String str, String str2, SelectedPaymentInstrumentData selectedPaymentInstrumentData, boolean z, boolean z2, String str3, String str4, boolean z3, CustomUrlPaymentStatus customUrlPaymentStatus, JusPayPaymentDetails jusPayPaymentDetails) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(PaymentInfoState$$serializer.f1362a.getDescriptor(), i, 1);
            throw null;
        }
        this.f1361a = paymentMethodsAppModel;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = selectedPaymentInstrumentData;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
        if ((i & 512) == 0) {
            this.j = CustomUrlPaymentStatus.NONE;
        } else {
            this.j = customUrlPaymentStatus;
        }
        if ((i & 1024) == 0) {
            this.k = new JusPayPaymentDetails();
        } else {
            this.k = jusPayPaymentDetails;
        }
    }

    public static PaymentInfoState a(PaymentInfoState paymentInfoState, PaymentMethodsAppModel paymentMethodsAppModel, String str, String str2, SelectedPaymentInstrumentData selectedPaymentInstrumentData, boolean z, boolean z2, String str3, String str4, boolean z3, CustomUrlPaymentStatus customUrlPaymentStatus, int i) {
        if ((i & 1) != 0) {
            paymentMethodsAppModel = paymentInfoState.f1361a;
        }
        PaymentMethodsAppModel paymentMethodsData = paymentMethodsAppModel;
        if ((i & 2) != 0) {
            str = paymentInfoState.b;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = paymentInfoState.c;
        }
        String selectedCheckoutPaymentMethodCode = str2;
        SelectedPaymentInstrumentData selectedPaymentInstrumentData2 = (i & 8) != 0 ? paymentInfoState.d : selectedPaymentInstrumentData;
        boolean z4 = (i & 16) != 0 ? paymentInfoState.e : z;
        boolean z5 = (i & 32) != 0 ? paymentInfoState.f : z2;
        String str6 = (i & 64) != 0 ? paymentInfoState.g : str3;
        String str7 = (i & 128) != 0 ? paymentInfoState.h : str4;
        boolean z6 = (i & 256) != 0 ? paymentInfoState.i : z3;
        CustomUrlPaymentStatus customPaymentUrlStatus = (i & 512) != 0 ? paymentInfoState.j : customUrlPaymentStatus;
        JusPayPaymentDetails juspayPaymentDetails = paymentInfoState.k;
        paymentInfoState.getClass();
        Intrinsics.i(paymentMethodsData, "paymentMethodsData");
        Intrinsics.i(selectedCheckoutPaymentMethodCode, "selectedCheckoutPaymentMethodCode");
        Intrinsics.i(customPaymentUrlStatus, "customPaymentUrlStatus");
        Intrinsics.i(juspayPaymentDetails, "juspayPaymentDetails");
        return new PaymentInfoState(paymentMethodsData, str5, selectedCheckoutPaymentMethodCode, selectedPaymentInstrumentData2, z4, z5, str6, str7, z6, customPaymentUrlStatus, juspayPaymentDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfoState)) {
            return false;
        }
        PaymentInfoState paymentInfoState = (PaymentInfoState) obj;
        return Intrinsics.d(this.f1361a, paymentInfoState.f1361a) && Intrinsics.d(this.b, paymentInfoState.b) && Intrinsics.d(this.c, paymentInfoState.c) && Intrinsics.d(this.d, paymentInfoState.d) && this.e == paymentInfoState.e && this.f == paymentInfoState.f && Intrinsics.d(this.g, paymentInfoState.g) && Intrinsics.d(this.h, paymentInfoState.h) && this.i == paymentInfoState.i && this.j == paymentInfoState.j && Intrinsics.d(this.k, paymentInfoState.k);
    }

    public final int hashCode() {
        int iHashCode = this.f1361a.hashCode() * 31;
        String str = this.b;
        int iE = nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        SelectedPaymentInstrumentData selectedPaymentInstrumentData = this.d;
        int iHashCode2 = (((((iE + (selectedPaymentInstrumentData == null ? 0 : selectedPaymentInstrumentData.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return this.k.hashCode() + ((this.j.hashCode() + ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.i ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInfoState(paymentMethodsData=");
        sb.append(this.f1361a);
        sb.append(", paymentAppName=");
        sb.append(this.b);
        sb.append(", selectedCheckoutPaymentMethodCode=");
        sb.append(this.c);
        sb.append(", selectedPaymentInstrumentData=");
        sb.append(this.d);
        sb.append(", isChaloPaySelectedFromWalletScreen=");
        z40.r(sb, this.e, ", freshSelectedPaymentMethodDataReceived=", this.f, ", lazyPayUrl=");
        cb0.t(sb, this.g, ", paymentTransactionId=", this.h, ", isPaymentInitiated=");
        sb.append(this.i);
        sb.append(", customPaymentUrlStatus=");
        sb.append(this.j);
        sb.append(", juspayPaymentDetails=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public PaymentInfoState(PaymentMethodsAppModel paymentMethodsAppModel, String str, String str2, SelectedPaymentInstrumentData selectedPaymentInstrumentData, boolean z, boolean z2, String str3, String str4, boolean z3, CustomUrlPaymentStatus customPaymentUrlStatus, JusPayPaymentDetails jusPayPaymentDetails) {
        Intrinsics.i(customPaymentUrlStatus, "customPaymentUrlStatus");
        this.f1361a = paymentMethodsAppModel;
        this.b = str;
        this.c = str2;
        this.d = selectedPaymentInstrumentData;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = str4;
        this.i = z3;
        this.j = customPaymentUrlStatus;
        this.k = jusPayPaymentDetails;
    }
}
