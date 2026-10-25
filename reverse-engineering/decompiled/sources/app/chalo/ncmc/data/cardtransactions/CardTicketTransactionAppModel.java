package app.chalo.ncmc.data.cardtransactions;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.t10;
import defpackage.xe;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionAppModel;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardTicketTransactionAppModel implements CardTransaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(21)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6178a;
    public final long b;
    public final CardTransactionFareInfoAppModel c;
    public final CardTicketPaymentMode d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTicketTransactionAppModel> serializer() {
            return CardTicketTransactionAppModel$$serializer.f6179a;
        }
    }

    public /* synthetic */ CardTicketTransactionAppModel(int i, String str, long j2, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel, CardTicketPaymentMode cardTicketPaymentMode, String str2, String str3, String str4, String str5, String str6) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(CardTicketTransactionAppModel$$serializer.f6179a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f6178a = str;
        this.b = j2;
        this.c = cardTransactionFareInfoAppModel;
        this.d = cardTicketPaymentMode;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoAppModel getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransaction
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6204a() {
        return this.f6178a;
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
        if (!(obj instanceof CardTicketTransactionAppModel)) {
            return false;
        }
        CardTicketTransactionAppModel cardTicketTransactionAppModel = (CardTicketTransactionAppModel) obj;
        return Intrinsics.d(this.f6178a, cardTicketTransactionAppModel.f6178a) && this.b == cardTicketTransactionAppModel.b && Intrinsics.d(this.c, cardTicketTransactionAppModel.c) && this.d == cardTicketTransactionAppModel.d && Intrinsics.d(this.e, cardTicketTransactionAppModel.e) && Intrinsics.d(this.f, cardTicketTransactionAppModel.f) && Intrinsics.d(this.g, cardTicketTransactionAppModel.g) && Intrinsics.d(this.h, cardTicketTransactionAppModel.h) && Intrinsics.d(this.i, cardTicketTransactionAppModel.i);
    }

    public final int hashCode() {
        int iHashCode = this.f6178a.hashCode() * 31;
        long j2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        CardTicketPaymentMode cardTicketPaymentMode = this.d;
        int iHashCode3 = (iHashCode2 + (cardTicketPaymentMode == null ? 0 : cardTicketPaymentMode.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "CardTicketTransactionAppModel(transactionId=", this.f6178a, ", transactionTime=");
        sbM.append(", fareInfo=");
        sbM.append(this.c);
        sbM.append(", paymentMode=");
        sbM.append(this.d);
        cb0.t(sbM, ", conductorId=", this.e, ", vehicleNo=", this.f);
        cb0.t(sbM, ", routeName=", this.g, ", startStopName=", this.h);
        return z40.h(sbM, ", endStopName=", this.i, ")");
    }

    public CardTicketTransactionAppModel(String transactionId, long j2, CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel, CardTicketPaymentMode cardTicketPaymentMode, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.i(transactionId, "transactionId");
        this.f6178a = transactionId;
        this.b = j2;
        this.c = cardTransactionFareInfoAppModel;
        this.d = cardTicketPaymentMode;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }
}
