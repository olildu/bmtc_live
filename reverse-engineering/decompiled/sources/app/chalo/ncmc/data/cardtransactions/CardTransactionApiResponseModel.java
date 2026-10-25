package app.chalo.ncmc.data.cardtransactions;

import defpackage.xe;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardTransactionApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6181a;
    public final TransactionPages b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTransactionApiResponseModel> serializer() {
            return CardTransactionApiResponseModel$$serializer.f6182a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new xe(22)), null, LazyKt.a(lazyThreadSafetyMode, new xe(23))};
    }

    public /* synthetic */ CardTransactionApiResponseModel(int i, List list, TransactionPages transactionPages, List list2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(CardTransactionApiResponseModel$$serializer.f6182a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6181a = list;
        this.b = transactionPages;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionApiResponseModel)) {
            return false;
        }
        CardTransactionApiResponseModel cardTransactionApiResponseModel = (CardTransactionApiResponseModel) obj;
        return Intrinsics.d(this.f6181a, cardTransactionApiResponseModel.f6181a) && Intrinsics.d(this.b, cardTransactionApiResponseModel.b) && Intrinsics.d(this.c, cardTransactionApiResponseModel.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f6181a.hashCode() * 31)) * 31;
        List list = this.c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransactionApiResponseModel(transactions=");
        sb.append(this.f6181a);
        sb.append(", pagination=");
        sb.append(this.b);
        sb.append(", unsyncedRecharges=");
        return xs.l(sb, this.c, ")");
    }
}
