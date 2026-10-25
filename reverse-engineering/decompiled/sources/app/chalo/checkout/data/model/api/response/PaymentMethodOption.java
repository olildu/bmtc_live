package app.chalo.checkout.data.model.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xp0;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/response/PaymentMethodOption;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentMethodOption {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] m = {null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(9)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1262a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final PaymentMethodOptionMetaData f;
    public final String g;
    public final Integer h;
    public final List i;
    public final String j;
    public final String k;
    public final ProviderDetails l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/response/PaymentMethodOption$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/response/PaymentMethodOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentMethodOption> serializer() {
            return PaymentMethodOption$$serializer.f1263a;
        }
    }

    public /* synthetic */ PaymentMethodOption(int i, String str, String str2, boolean z, boolean z2, String str3, PaymentMethodOptionMetaData paymentMethodOptionMetaData, String str4, Integer num, List list, String str5, String str6, ProviderDetails providerDetails) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.b(PaymentMethodOption$$serializer.f1263a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f1262a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = paymentMethodOptionMetaData;
        this.g = str4;
        this.h = num;
        this.i = list;
        this.j = str5;
        this.k = str6;
        this.l = providerDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodOption)) {
            return false;
        }
        PaymentMethodOption paymentMethodOption = (PaymentMethodOption) obj;
        return Intrinsics.d(this.f1262a, paymentMethodOption.f1262a) && Intrinsics.d(this.b, paymentMethodOption.b) && this.c == paymentMethodOption.c && this.d == paymentMethodOption.d && Intrinsics.d(this.e, paymentMethodOption.e) && Intrinsics.d(this.f, paymentMethodOption.f) && Intrinsics.d(this.g, paymentMethodOption.g) && Intrinsics.d(this.h, paymentMethodOption.h) && Intrinsics.d(this.i, paymentMethodOption.i) && Intrinsics.d(this.j, paymentMethodOption.j) && Intrinsics.d(this.k, paymentMethodOption.k) && Intrinsics.d(this.l, paymentMethodOption.l);
    }

    public final int hashCode() {
        String str = this.f1262a;
        int iE = (((nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaymentMethodOptionMetaData paymentMethodOptionMetaData = this.f;
        int iE2 = nf1.e((iHashCode + (paymentMethodOptionMetaData == null ? 0 : paymentMethodOptionMetaData.hashCode())) * 31, 31, this.g);
        Integer num = this.h;
        int iHashCode2 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ProviderDetails providerDetails = this.l;
        return iHashCode5 + (providerDetails != null ? providerDetails.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PaymentMethodOption(description=", this.f1262a, ", id=", this.b, ", isActive=");
        z40.r(sbE, this.c, ", isVisible=", this.d, ", label=");
        sbE.append(this.e);
        sbE.append(", metaData=");
        sbE.append(this.f);
        sbE.append(", name=");
        xs.u(this.h, this.g, ", order=", ", paymentInstruments=", sbE);
        cb0.s(", warning=", this.j, ", logoUrl=", sbE, this.i);
        sbE.append(this.k);
        sbE.append(", providerDetails=");
        sbE.append(this.l);
        sbE.append(")");
        return sbE.toString();
    }
}
