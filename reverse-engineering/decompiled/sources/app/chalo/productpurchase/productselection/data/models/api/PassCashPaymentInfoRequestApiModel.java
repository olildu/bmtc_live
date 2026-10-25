package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassCashPaymentInfoRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassCashPaymentInfoRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8593a;
    public final String b;
    public final boolean c;
    public final String d;
    public final int e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassCashPaymentInfoRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassCashPaymentInfoRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassCashPaymentInfoRequestApiModel> serializer() {
            return PassCashPaymentInfoRequestApiModel$$serializer.f8594a;
        }
    }

    public PassCashPaymentInfoRequestApiModel(int i, String passId, String userId, String str, String deviceId) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(deviceId, "deviceId");
        this.f8593a = passId;
        this.b = userId;
        this.c = false;
        this.d = str;
        this.e = i;
        this.f = deviceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCashPaymentInfoRequestApiModel)) {
            return false;
        }
        PassCashPaymentInfoRequestApiModel passCashPaymentInfoRequestApiModel = (PassCashPaymentInfoRequestApiModel) obj;
        return Intrinsics.d(this.f8593a, passCashPaymentInfoRequestApiModel.f8593a) && Intrinsics.d(this.b, passCashPaymentInfoRequestApiModel.b) && this.c == passCashPaymentInfoRequestApiModel.c && Intrinsics.d(this.d, passCashPaymentInfoRequestApiModel.d) && this.e == passCashPaymentInfoRequestApiModel.e && Intrinsics.d(this.f, passCashPaymentInfoRequestApiModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((nf1.e((nf1.e(this.f8593a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31, 31, this.d) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassCashPaymentInfoRequestApiModel(passId=", this.f8593a, ", userId=", this.b, ", failCashRoutePass=");
        pk0.x(", city=", this.d, ", appVer=", sbE, this.c);
        sbE.append(this.e);
        sbE.append(", deviceId=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public /* synthetic */ PassCashPaymentInfoRequestApiModel(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(PassCashPaymentInfoRequestApiModel$$serializer.f8594a.getDescriptor(), i, 63);
            throw null;
        }
        this.f8593a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = i2;
        this.f = str4;
    }
}
