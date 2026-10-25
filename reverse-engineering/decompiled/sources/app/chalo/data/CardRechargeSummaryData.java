package app.chalo.data;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xe;
import defpackage.xs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/CardRechargeSummaryData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeSummaryData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2333a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final CardRechargePaymentStatus j;
    public final CardRechargeStatus k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/CardRechargeSummaryData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/CardRechargeSummaryData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeSummaryData> serializer() {
            return CardRechargeSummaryData$$serializer.f2334a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new Lazy[]{null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new xe(15)), LazyKt.a(lazyThreadSafetyMode, new xe(16))};
    }

    public /* synthetic */ CardRechargeSummaryData(int i, String str, String str2, long j, String str3, long j2, String str4, String str5, String str6, String str7, CardRechargePaymentStatus cardRechargePaymentStatus, CardRechargeStatus cardRechargeStatus) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(CardRechargeSummaryData$$serializer.f2334a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f2333a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = cardRechargePaymentStatus;
        this.k = cardRechargeStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeSummaryData)) {
            return false;
        }
        CardRechargeSummaryData cardRechargeSummaryData = (CardRechargeSummaryData) obj;
        return Intrinsics.d(this.f2333a, cardRechargeSummaryData.f2333a) && Intrinsics.d(this.b, cardRechargeSummaryData.b) && this.c == cardRechargeSummaryData.c && Intrinsics.d(this.d, cardRechargeSummaryData.d) && this.e == cardRechargeSummaryData.e && Intrinsics.d(this.f, cardRechargeSummaryData.f) && Intrinsics.d(this.g, cardRechargeSummaryData.g) && Intrinsics.d(this.h, cardRechargeSummaryData.h) && Intrinsics.d(this.i, cardRechargeSummaryData.i) && this.j == cardRechargeSummaryData.j && this.k == cardRechargeSummaryData.k;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2333a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int iE2 = nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d);
        long j2 = this.e;
        return this.k.hashCode() + ((this.j.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((iE2 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CardRechargeSummaryData(transactionId=", this.f2333a, ", cardNumber=", this.b, ", rechargeAmount=");
        dd.k(this.c, ", paymentMode=", this.d, sbE);
        xs.r(this.e, ", paymentTime=", ", city=", sbE);
        cb0.t(sbE, this.f, ", agency=", this.g, ", productName=");
        cb0.t(sbE, this.h, ", rechargeDelayCopy=", this.i, ", paymentStatus=");
        sbE.append(this.j);
        sbE.append(", rechargeStatus=");
        sbE.append(this.k);
        sbE.append(")");
        return sbE.toString();
    }

    public CardRechargeSummaryData(String transactionId, String cardNumber, long j, String paymentMode, long j2, String city, String agency, String productName, String rechargeDelayCopy, CardRechargePaymentStatus paymentStatus, CardRechargeStatus rechargeStatus) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(city, "city");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(rechargeDelayCopy, "rechargeDelayCopy");
        Intrinsics.i(paymentStatus, "paymentStatus");
        Intrinsics.i(rechargeStatus, "rechargeStatus");
        this.f2333a = transactionId;
        this.b = cardNumber;
        this.c = j;
        this.d = paymentMode;
        this.e = j2;
        this.f = city;
        this.g = agency;
        this.h = productName;
        this.i = rechargeDelayCopy;
        this.j = paymentStatus;
        this.k = rechargeStatus;
    }
}
