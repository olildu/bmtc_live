package app.chalo.checkout.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vr0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PreferredPaymentMethodsAppModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PreferredPaymentMethodsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1320a;
    public final String b;
    public final CheckoutPaymentMethod c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PreferredPaymentMethodsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PreferredPaymentMethodsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PreferredPaymentMethodsAppModel> serializer() {
            return PreferredPaymentMethodsAppModel$$serializer.f1321a;
        }
    }

    public /* synthetic */ PreferredPaymentMethodsAppModel(int i, String str, String str2, CheckoutPaymentMethod checkoutPaymentMethod) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PreferredPaymentMethodsAppModel$$serializer.f1321a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1320a = str;
        this.b = str2;
        this.c = checkoutPaymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferredPaymentMethodsAppModel)) {
            return false;
        }
        PreferredPaymentMethodsAppModel preferredPaymentMethodsAppModel = (PreferredPaymentMethodsAppModel) obj;
        return Intrinsics.d(this.f1320a, preferredPaymentMethodsAppModel.f1320a) && Intrinsics.d(this.b, preferredPaymentMethodsAppModel.b) && Intrinsics.d(this.c, preferredPaymentMethodsAppModel.c);
    }

    public final int hashCode() {
        String str = this.f1320a;
        return this.c.hashCode() + nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PreferredPaymentMethodsAppModel(methodDetails=", this.f1320a, ", paymentInstrumentName=", this.b, ", checkoutPaymentMethod=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }

    public PreferredPaymentMethodsAppModel(String str, String paymentInstrumentName, CheckoutPaymentMethod checkoutPaymentMethod) {
        Intrinsics.i(paymentInstrumentName, "paymentInstrumentName");
        Intrinsics.i(checkoutPaymentMethod, "checkoutPaymentMethod");
        this.f1320a = str;
        this.b = paymentInstrumentName;
        this.c = checkoutPaymentMethod;
    }
}
