package app.chalo.quickpay.validation;

import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.hz0;
import defpackage.nf1;
import defpackage.py;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/quickpay/validation/QuickPayReceiptInfo;", "", "Companion", "$serializer", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPayReceiptInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8906a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final RouteNamingSchemeType g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/validation/QuickPayReceiptInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/quickpay/validation/QuickPayReceiptInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPayReceiptInfo> serializer() {
            return QuickPayReceiptInfo$$serializer.f8907a;
        }
    }

    public /* synthetic */ QuickPayReceiptInfo(int i, Long l, String str, Long l2, String str2, String str3, String str4, RouteNamingSchemeType routeNamingSchemeType) {
        if ((i & 1) == 0) {
            this.f8906a = null;
        } else {
            this.f8906a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = RouteNamingSchemeType.DEFAULT;
        } else {
            this.g = routeNamingSchemeType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayReceiptInfo)) {
            return false;
        }
        QuickPayReceiptInfo quickPayReceiptInfo = (QuickPayReceiptInfo) obj;
        return Intrinsics.d(this.f8906a, quickPayReceiptInfo.f8906a) && Intrinsics.d(this.b, quickPayReceiptInfo.b) && Intrinsics.d(this.c, quickPayReceiptInfo.c) && Intrinsics.d(this.d, quickPayReceiptInfo.d) && Intrinsics.d(this.e, quickPayReceiptInfo.e) && Intrinsics.d(this.f, quickPayReceiptInfo.f) && this.g == quickPayReceiptInfo.g;
    }

    public final int hashCode() {
        Long l = this.f8906a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iE = nf1.e(nf1.e((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return this.g.hashCode() + ((iE + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickPayReceiptInfo(expiryTime=");
        sb.append(this.f8906a);
        sb.append(", transactionId=");
        sb.append(this.b);
        sb.append(", amount=");
        py.t(this.c, ", toStopId=", this.d, ", toStopName=", sb);
        cb0.t(sb, this.e, ", via=", this.f, ", routeNamingSchemeType=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
