package app.chalo.electricitybill.data.model.apimodel.request;

import androidx.browser.customtabs.CustomTabsCallback;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/request/PaymentProps;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentProps {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2530a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/request/PaymentProps$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/request/PaymentProps;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentProps> serializer() {
            return PaymentProps$$serializer.f2531a;
        }
    }

    public PaymentProps() {
        this.f2530a = "v1";
        this.b = CustomTabsCallback.ONLINE_EXTRAS_KEY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentProps)) {
            return false;
        }
        PaymentProps paymentProps = (PaymentProps) obj;
        return Intrinsics.d(this.f2530a, paymentProps.f2530a) && Intrinsics.d(this.b, paymentProps.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2530a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("PaymentProps(lpVer=", this.f2530a, ", paymentType=", this.b, ")");
    }

    public /* synthetic */ PaymentProps(int i, String str, String str2) {
        this.f2530a = (i & 1) == 0 ? "v1" : str;
        if ((i & 2) == 0) {
            this.b = CustomTabsCallback.ONLINE_EXTRAS_KEY;
        } else {
            this.b = str2;
        }
    }
}
