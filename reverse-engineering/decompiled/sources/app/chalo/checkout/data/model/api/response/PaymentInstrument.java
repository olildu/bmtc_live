package app.chalo.checkout.data.model.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/response/PaymentInstrument;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentInstrument {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1260a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/response/PaymentInstrument$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/response/PaymentInstrument;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentInstrument> serializer() {
            return PaymentInstrument$$serializer.f1261a;
        }
    }

    public /* synthetic */ PaymentInstrument(int i, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(PaymentInstrument$$serializer.f1261a.getDescriptor(), i, 255);
            throw null;
        }
        this.f1260a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInstrument)) {
            return false;
        }
        PaymentInstrument paymentInstrument = (PaymentInstrument) obj;
        return Intrinsics.d(this.f1260a, paymentInstrument.f1260a) && Intrinsics.d(this.b, paymentInstrument.b) && this.c == paymentInstrument.c && this.d == paymentInstrument.d && Intrinsics.d(this.e, paymentInstrument.e) && Intrinsics.d(this.f, paymentInstrument.f) && Intrinsics.d(this.g, paymentInstrument.g) && Intrinsics.d(this.h, paymentInstrument.h);
    }

    public final int hashCode() {
        String str = this.f1260a;
        int iE = (((nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        int iE2 = nf1.e((iE + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int iHashCode = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PaymentInstrument(description=", this.f1260a, ", id=", this.b, ", isActive=");
        z40.r(sbE, this.c, ", isVisible=", this.d, ", label=");
        cb0.t(sbE, this.e, ", name=", this.f, ", warning=");
        return r30.i(sbE, this.g, ", logoUrl=", this.h, ")");
    }
}
