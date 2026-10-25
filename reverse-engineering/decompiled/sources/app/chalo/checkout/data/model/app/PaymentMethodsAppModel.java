package app.chalo.checkout.data.model.app;

import defpackage.q7;
import defpackage.r30;
import defpackage.xp0;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodsAppModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentMethodsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1317a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentMethodsAppModel> serializer() {
            return PaymentMethodsAppModel$$serializer.f1318a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new xp0(24)), LazyKt.a(lazyThreadSafetyMode, new xp0(25))};
    }

    public /* synthetic */ PaymentMethodsAppModel(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PaymentMethodsAppModel$$serializer.f1318a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1317a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsAppModel)) {
            return false;
        }
        PaymentMethodsAppModel paymentMethodsAppModel = (PaymentMethodsAppModel) obj;
        return Intrinsics.d(this.f1317a, paymentMethodsAppModel.f1317a) && Intrinsics.d(this.b, paymentMethodsAppModel.b) && Intrinsics.d(this.c, paymentMethodsAppModel.c);
    }

    public final int hashCode() {
        String str = this.f1317a;
        return this.c.hashCode() + r30.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(q7.h("PaymentMethodsAppModel(paymentMethodErrorCopy=", this.f1317a, ", paymentMethodOptions=", ", preferredPaymentMethods=", this.b), this.c, ")");
    }

    public PaymentMethodsAppModel(String str, List paymentMethodOptions, List preferredPaymentMethods) {
        Intrinsics.i(paymentMethodOptions, "paymentMethodOptions");
        Intrinsics.i(preferredPaymentMethods, "preferredPaymentMethods");
        this.f1317a = str;
        this.b = paymentMethodOptions;
        this.c = preferredPaymentMethods;
    }
}
