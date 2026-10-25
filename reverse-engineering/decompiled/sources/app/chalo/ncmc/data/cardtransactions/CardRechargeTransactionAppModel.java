package app.chalo.ncmc.data.cardtransactions;

import defpackage.t10;
import defpackage.xe;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeTransactionAppModel implements CardTransaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6174a;
    public final long b;
    public final CardTransactionFareInfoAppModel c;
    public final CardRechargePaymentMode d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardRechargeTransactionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeTransactionAppModel> serializer() {
            return CardRechargeTransactionAppModel$$serializer.f6175a;
        }
    }

    public /* synthetic */ CardRechargeTransactionAppModel(int i, String str, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel, CardRechargePaymentMode cardRechargePaymentMode) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CardRechargeTransactionAppModel$$serializer.f6175a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6174a = str;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
        this.d = cardRechargePaymentMode;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoAppModel getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6204a() {
        return this.f6174a;
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
        if (!(obj instanceof CardRechargeTransactionAppModel)) {
            return false;
        }
        CardRechargeTransactionAppModel cardRechargeTransactionAppModel = (CardRechargeTransactionAppModel) obj;
        return Intrinsics.d(this.f6174a, cardRechargeTransactionAppModel.f6174a) && this.b == cardRechargeTransactionAppModel.b && Intrinsics.d(this.c, cardRechargeTransactionAppModel.c) && this.d == cardRechargeTransactionAppModel.d;
    }

    public final int hashCode() {
        int iHashCode = this.f6174a.hashCode() * 31;
        long j = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        CardRechargePaymentMode cardRechargePaymentMode = this.d;
        return iHashCode2 + (cardRechargePaymentMode == null ? 0 : cardRechargePaymentMode.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "CardRechargeTransactionAppModel(transactionId=", this.f6174a, ", transactionTime=");
        sbM.append(", fareInfo=");
        sbM.append(this.c);
        sbM.append(", paymentMode=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public CardRechargeTransactionAppModel(String transactionId, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel, CardRechargePaymentMode cardRechargePaymentMode) {
        Intrinsics.i(transactionId, "transactionId");
        this.f6174a = transactionId;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
        this.d = cardRechargePaymentMode;
    }
}
