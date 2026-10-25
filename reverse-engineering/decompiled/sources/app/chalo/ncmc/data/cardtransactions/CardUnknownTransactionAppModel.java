package app.chalo.ncmc.data.cardtransactions;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardUnknownTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardUnknownTransactionAppModel implements CardTransaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6204a;
    public final long b;
    public final CardTransactionFareInfoAppModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardUnknownTransactionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardUnknownTransactionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardUnknownTransactionAppModel> serializer() {
            return CardUnknownTransactionAppModel$$serializer.f6205a;
        }
    }

    public /* synthetic */ CardUnknownTransactionAppModel(int i, String str, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(CardUnknownTransactionAppModel$$serializer.f6205a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6204a = str;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoAppModel getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6204a() {
        return this.f6204a;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUnknownTransactionAppModel)) {
            return false;
        }
        CardUnknownTransactionAppModel cardUnknownTransactionAppModel = (CardUnknownTransactionAppModel) obj;
        return Intrinsics.d(this.f6204a, cardUnknownTransactionAppModel.f6204a) && this.b == cardUnknownTransactionAppModel.b && Intrinsics.d(this.c, cardUnknownTransactionAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6204a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "CardUnknownTransactionAppModel(transactionId=", this.f6204a, ", transactionTime=");
        sbM.append(", fareInfo=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }

    public CardUnknownTransactionAppModel(String transactionId, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel) {
        Intrinsics.i(transactionId, "transactionId");
        this.f6204a = transactionId;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
    }
}
