package app.chalo.ncmc.data.cardtransactions;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardPassPurchaseTransactionAppModel implements CardTransaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6170a;
    public final long b;
    public final CardTransactionFareInfoAppModel c;
    public final String d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final String j;
    public final int k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardPassPurchaseTransactionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardPassPurchaseTransactionAppModel> serializer() {
            return CardPassPurchaseTransactionAppModel$$serializer.f6171a;
        }
    }

    public /* synthetic */ CardPassPurchaseTransactionAppModel(int i, String str, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel, String str2, String str3, Long l, Integer num, Integer num2, Integer num3, String str4, int i2) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(CardPassPurchaseTransactionAppModel$$serializer.f6171a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f6170a = str;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = num;
        this.h = num2;
        this.i = num3;
        this.j = str4;
        this.k = i2;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoAppModel getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6204a() {
        return this.f6170a;
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
        if (!(obj instanceof CardPassPurchaseTransactionAppModel)) {
            return false;
        }
        CardPassPurchaseTransactionAppModel cardPassPurchaseTransactionAppModel = (CardPassPurchaseTransactionAppModel) obj;
        return Intrinsics.d(this.f6170a, cardPassPurchaseTransactionAppModel.f6170a) && this.b == cardPassPurchaseTransactionAppModel.b && Intrinsics.d(this.c, cardPassPurchaseTransactionAppModel.c) && Intrinsics.d(this.d, cardPassPurchaseTransactionAppModel.d) && Intrinsics.d(this.e, cardPassPurchaseTransactionAppModel.e) && Intrinsics.d(this.f, cardPassPurchaseTransactionAppModel.f) && Intrinsics.d(this.g, cardPassPurchaseTransactionAppModel.g) && Intrinsics.d(this.h, cardPassPurchaseTransactionAppModel.h) && Intrinsics.d(this.i, cardPassPurchaseTransactionAppModel.i) && Intrinsics.d(this.j, cardPassPurchaseTransactionAppModel.j) && this.k == cardPassPurchaseTransactionAppModel.k;
    }

    public final int hashCode() {
        int iHashCode = this.f6170a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel = this.c;
        int iHashCode2 = (i + (cardTransactionFareInfoAppModel == null ? 0 : cardTransactionFareInfoAppModel.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.j;
        return ((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "CardPassPurchaseTransactionAppModel(transactionId=", this.f6170a, ", transactionTime=");
        sbM.append(", fareInfo=");
        sbM.append(this.c);
        sbM.append(", categoryName=");
        sbM.append(this.d);
        sbM.append(", name=");
        sbM.append(this.e);
        sbM.append(", expiryTime=");
        sbM.append(this.f);
        sbM.append(", remainingTrips=");
        sbM.append(this.g);
        sbM.append(", maxPricePerTrip=");
        sbM.append(this.h);
        sbM.append(", maxTripsPerDay=");
        sbM.append(this.i);
        sbM.append(", productType=");
        sbM.append(this.j);
        return t10.k(sbM, ", totalTrips=", this.k, ")");
    }

    public CardPassPurchaseTransactionAppModel(String transactionId, long j, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel, String str, String str2, Long l, Integer num, Integer num2, Integer num3, String str3, int i) {
        Intrinsics.i(transactionId, "transactionId");
        this.f6170a = transactionId;
        this.b = j;
        this.c = cardTransactionFareInfoAppModel;
        this.d = str;
        this.e = str2;
        this.f = l;
        this.g = num;
        this.h = num2;
        this.i = num3;
        this.j = str3;
        this.k = i;
    }
}
