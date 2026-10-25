package app.chalo.features.checkout;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/checkout/CheckoutOrderData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutOrderData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2689a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/checkout/CheckoutOrderData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/checkout/CheckoutOrderData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutOrderData> serializer() {
            return CheckoutOrderData$$serializer.f2690a;
        }
    }

    public /* synthetic */ CheckoutOrderData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(CheckoutOrderData$$serializer.f2690a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f2689a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutOrderData)) {
            return false;
        }
        CheckoutOrderData checkoutOrderData = (CheckoutOrderData) obj;
        return Intrinsics.d(this.f2689a, checkoutOrderData.f2689a) && Intrinsics.d(this.b, checkoutOrderData.b) && Intrinsics.d(this.c, checkoutOrderData.c) && Intrinsics.d(this.d, checkoutOrderData.d) && Intrinsics.d(this.e, checkoutOrderData.e) && Intrinsics.d(this.f, checkoutOrderData.f) && Intrinsics.d(this.g, checkoutOrderData.g) && Intrinsics.d(this.h, checkoutOrderData.h) && Intrinsics.d(this.i, checkoutOrderData.i) && Intrinsics.d(this.j, checkoutOrderData.j) && Intrinsics.d(this.k, checkoutOrderData.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f2689a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iE2 = nf1.e(nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str3 = this.k;
        return iE2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CheckoutOrderData(orderId=", this.f2689a, ", chaloOrderId=", this.b, ", amount=");
        cb0.t(sbE, this.c, ", currency=", this.d, ", countryId=");
        cb0.t(sbE, this.e, ", customerId=", this.f, ", accountId=");
        cb0.t(sbE, this.g, ", transactionId=", this.h, ", paymentProviderKey=");
        cb0.t(sbE, this.i, ", paymentProviderMerchantKey=", this.j, ", productConfigId=");
        return vo1.p(sbE, this.k, ")");
    }

    public CheckoutOrderData(String orderId, String chaloOrderId, String amount, String currency, String countryId, String str, String str2, String transactionId, String str3, String str4, String str5) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        Intrinsics.i(amount, "amount");
        Intrinsics.i(currency, "currency");
        Intrinsics.i(countryId, "countryId");
        Intrinsics.i(transactionId, "transactionId");
        this.f2689a = orderId;
        this.b = chaloOrderId;
        this.c = amount;
        this.d = currency;
        this.e = countryId;
        this.f = str;
        this.g = str2;
        this.h = transactionId;
        this.i = str3;
        this.j = str4;
        this.k = str5;
    }
}
