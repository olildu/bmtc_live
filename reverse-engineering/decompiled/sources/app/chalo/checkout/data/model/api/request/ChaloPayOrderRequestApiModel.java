package app.chalo.checkout.data.model.api.request;

import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/ChaloPayOrderRequestApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloPayOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1242a;
    public final int b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/ChaloPayOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/request/ChaloPayOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloPayOrderRequestApiModel> serializer() {
            return ChaloPayOrderRequestApiModel$$serializer.f1243a;
        }
    }

    public /* synthetic */ ChaloPayOrderRequestApiModel(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(ChaloPayOrderRequestApiModel$$serializer.f1243a.getDescriptor(), i, 15);
            throw null;
        }
        this.f1242a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayOrderRequestApiModel)) {
            return false;
        }
        ChaloPayOrderRequestApiModel chaloPayOrderRequestApiModel = (ChaloPayOrderRequestApiModel) obj;
        return Intrinsics.d(this.f1242a, chaloPayOrderRequestApiModel.f1242a) && this.b == chaloPayOrderRequestApiModel.b && Intrinsics.d(this.c, chaloPayOrderRequestApiModel.c) && Intrinsics.d(this.d, chaloPayOrderRequestApiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(((this.f1242a.hashCode() * 31) + this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return r30.i(xs.m(this.b, "ChaloPayOrderRequestApiModel(chaloOrderId=", this.f1242a, ", providerId=", ", city="), this.c, ", walletId=", this.d, ")");
    }

    public ChaloPayOrderRequestApiModel(String chaloOrderId, int i, String str, String walletId) {
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        Intrinsics.i(walletId, "walletId");
        this.f1242a = chaloOrderId;
        this.b = i;
        this.c = str;
        this.d = walletId;
    }
}
