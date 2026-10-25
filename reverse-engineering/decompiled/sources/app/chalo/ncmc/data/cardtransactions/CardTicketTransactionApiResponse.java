package app.chalo.ncmc.data.cardtransactions;

import defpackage.cb0;
import defpackage.vo1;
import defpackage.xe;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionApiResponse;", "Lapp/chalo/ncmc/data/cardtransactions/CardTransactionApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardTicketTransactionApiResponse implements CardTransactionApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(20)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6176a;
    public final Long b;
    public final CardTransactionFareInfoApiResponse c;
    public final CardTicketPaymentMode d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/cardtransactions/CardTicketTransactionApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTicketTransactionApiResponse> serializer() {
            return CardTicketTransactionApiResponse$$serializer.f6177a;
        }
    }

    public /* synthetic */ CardTicketTransactionApiResponse(int i, String str, Long l, CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse, CardTicketPaymentMode cardTicketPaymentMode, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f6176a = null;
        } else {
            this.f6176a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cardTransactionFareInfoApiResponse;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cardTicketPaymentMode;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardTransactionFareInfoApiResponse getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6176a() {
        return this.f6176a;
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTicketTransactionApiResponse)) {
            return false;
        }
        CardTicketTransactionApiResponse cardTicketTransactionApiResponse = (CardTicketTransactionApiResponse) obj;
        return Intrinsics.d(this.f6176a, cardTicketTransactionApiResponse.f6176a) && Intrinsics.d(this.b, cardTicketTransactionApiResponse.b) && Intrinsics.d(this.c, cardTicketTransactionApiResponse.c) && this.d == cardTicketTransactionApiResponse.d && Intrinsics.d(this.e, cardTicketTransactionApiResponse.e) && Intrinsics.d(this.f, cardTicketTransactionApiResponse.f) && Intrinsics.d(this.g, cardTicketTransactionApiResponse.g) && Intrinsics.d(this.h, cardTicketTransactionApiResponse.h) && Intrinsics.d(this.i, cardTicketTransactionApiResponse.i);
    }

    public final int hashCode() {
        String str = this.f6176a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = this.c;
        int iHashCode3 = (iHashCode2 + (cardTransactionFareInfoApiResponse == null ? 0 : cardTransactionFareInfoApiResponse.hashCode())) * 31;
        CardTicketPaymentMode cardTicketPaymentMode = this.d;
        int iHashCode4 = (iHashCode3 + (cardTicketPaymentMode == null ? 0 : cardTicketPaymentMode.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse
    public final /* bridge */ boolean isValid() {
        return CardTransactionApiResponse.DefaultImpls.a(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTicketTransactionApiResponse(transactionId=");
        sb.append(this.f6176a);
        sb.append(", transactionTime=");
        sb.append(this.b);
        sb.append(", fareInfo=");
        sb.append(this.c);
        sb.append(", paymentMode=");
        sb.append(this.d);
        sb.append(", conductorId=");
        cb0.t(sb, this.e, ", vehicleNo=", this.f, ", routeName=");
        cb0.t(sb, this.g, ", startStopName=", this.h, ", endStopName=");
        return vo1.p(sb, this.i, ")");
    }
}
