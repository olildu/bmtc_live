package app.chalo.ncmc.data.cardtransactions;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardMerchantTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardMerchantTransactionAppModel implements CardTransaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6166a;
    public final long b;
    public final CardTransactionFareInfoAppModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardMerchantTransactionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardMerchantTransactionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardMerchantTransactionAppModel> serializer() {
            return CardMerchantTransactionAppModel$$serializer.f6167a;
        }
    }

    public /* synthetic */ CardMerchantTransactionAppModel(int i, String str, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(CardMerchantTransactionAppModel$$serializer.f6167a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6166a = str;
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
        return this.f6166a;
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
        if (!(obj instanceof CardMerchantTransactionAppModel)) {
            return false;
        }
        CardMerchantTransactionAppModel cardMerchantTransactionAppModel = (CardMerchantTransactionAppModel) obj;
        return Intrinsics.d(this.f6166a, cardMerchantTransactionAppModel.f6166a) && this.b == cardMerchantTransactionAppModel.b && Intrinsics.d(this.c, cardMerchantTransactionAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6166a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "CardMerchantTransactionAppModel(transactionId=", this.f6166a, ", transactionTime=");
        sbM.append(", fareInfo=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }

    public CardMerchantTransactionAppModel(String transactionId, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel) {
        Intrinsics.i(transactionId, "transactionId");
        this.f6166a = transactionId;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
    }
}
