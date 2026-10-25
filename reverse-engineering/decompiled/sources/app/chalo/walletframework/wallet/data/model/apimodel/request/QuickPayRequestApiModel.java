package app.chalo.walletframework.wallet.data.model.apimodel.request;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/QuickPayRequestApiModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPayRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10967a;
    public final long b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/request/QuickPayRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/request/QuickPayRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPayRequestApiModel> serializer() {
            return QuickPayRequestApiModel$$serializer.f10968a;
        }
    }

    public /* synthetic */ QuickPayRequestApiModel(int i, Long l, long j, int i2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(QuickPayRequestApiModel$$serializer.f10968a.getDescriptor(), i, 7);
            throw null;
        }
        this.f10967a = l;
        this.b = j;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayRequestApiModel)) {
            return false;
        }
        QuickPayRequestApiModel quickPayRequestApiModel = (QuickPayRequestApiModel) obj;
        return Intrinsics.d(this.f10967a, quickPayRequestApiModel.f10967a) && this.b == quickPayRequestApiModel.b && this.c == quickPayRequestApiModel.c;
    }

    public final int hashCode() {
        Long l = this.f10967a;
        int iHashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickPayRequestApiModel(activationDuration=");
        sb.append(this.f10967a);
        sb.append(", expiryTime=");
        sb.append(this.b);
        return t10.k(sb, ", amount=", this.c, ")");
    }

    public QuickPayRequestApiModel(Long l, long j, int i) {
        this.f10967a = l;
        this.b = j;
        this.c = i;
    }
}
