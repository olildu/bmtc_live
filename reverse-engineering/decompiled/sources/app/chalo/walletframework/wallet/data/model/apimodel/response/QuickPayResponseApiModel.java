package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/QuickPayResponseApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPayResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10987a;
    public final Long b;
    public final String c;
    public final Long d;
    public final int e;
    public final long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/QuickPayResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/QuickPayResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPayResponseApiModel> serializer() {
            return QuickPayResponseApiModel$$serializer.f10988a;
        }
    }

    public /* synthetic */ QuickPayResponseApiModel(int i, int i2, Long l, String str, Long l2, int i3, long j) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(QuickPayResponseApiModel$$serializer.f10988a.getDescriptor(), i, 63);
            throw null;
        }
        this.f10987a = i2;
        this.b = l;
        this.c = str;
        this.d = l2;
        this.e = i3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayResponseApiModel)) {
            return false;
        }
        QuickPayResponseApiModel quickPayResponseApiModel = (QuickPayResponseApiModel) obj;
        return this.f10987a == quickPayResponseApiModel.f10987a && Intrinsics.d(this.b, quickPayResponseApiModel.b) && Intrinsics.d(this.c, quickPayResponseApiModel.c) && Intrinsics.d(this.d, quickPayResponseApiModel.d) && this.e == quickPayResponseApiModel.e && this.f == quickPayResponseApiModel.f;
    }

    public final int hashCode() {
        int i = this.f10987a * 31;
        Long l = this.b;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode3 = (((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.e) * 31;
        long j = this.f;
        return iHashCode3 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickPayResponseApiModel(amount=");
        sb.append(this.f10987a);
        sb.append(", activationDuration=");
        sb.append(this.b);
        sb.append(", transactionId=");
        cb0.r(this.d, this.c, ", transactionTime=", ", status=", sb);
        sb.append(this.e);
        sb.append(", expiryTime=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
