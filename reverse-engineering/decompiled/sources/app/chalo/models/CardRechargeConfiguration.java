package app.chalo.models;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xe;
import defpackage.xs;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/CardRechargeConfiguration;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardRechargeConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o = {null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(8)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5575a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final CardRechargeFareInfo g;
    public final ProductBranding h;
    public final List i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/models/CardRechargeConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/CardRechargeConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "REQUIRED_CARD_NO_LENGTH", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardRechargeConfiguration> serializer() {
            return CardRechargeConfiguration$$serializer.f5576a;
        }
    }

    public /* synthetic */ CardRechargeConfiguration(int i, String str, String str2, String str3, String str4, String str5, String str6, CardRechargeFareInfo cardRechargeFareInfo, ProductBranding productBranding, List list, String str7, boolean z, boolean z2, int i2, int i3) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(CardRechargeConfiguration$$serializer.f5576a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f5575a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = cardRechargeFareInfo;
        this.h = productBranding;
        this.i = list;
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = true;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            this.l = true;
        } else {
            this.l = z2;
        }
        if ((i & 4096) == 0) {
            this.m = -1;
        } else {
            this.m = i2;
        }
        if ((i & 8192) == 0) {
            this.n = -1;
        } else {
            this.n = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeConfiguration)) {
            return false;
        }
        CardRechargeConfiguration cardRechargeConfiguration = (CardRechargeConfiguration) obj;
        return Intrinsics.d(this.f5575a, cardRechargeConfiguration.f5575a) && Intrinsics.d(this.b, cardRechargeConfiguration.b) && Intrinsics.d(this.c, cardRechargeConfiguration.c) && Intrinsics.d(this.d, cardRechargeConfiguration.d) && Intrinsics.d(this.e, cardRechargeConfiguration.e) && Intrinsics.d(this.f, cardRechargeConfiguration.f) && Intrinsics.d(this.g, cardRechargeConfiguration.g) && Intrinsics.d(this.h, cardRechargeConfiguration.h) && Intrinsics.d(this.i, cardRechargeConfiguration.i) && Intrinsics.d(this.j, cardRechargeConfiguration.j) && this.k == cardRechargeConfiguration.k && this.l == cardRechargeConfiguration.l && this.m == cardRechargeConfiguration.m && this.n == cardRechargeConfiguration.n;
    }

    public final int hashCode() {
        return ((((((nf1.e(r30.b((this.h.hashCode() + ((this.g.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f5575a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + this.m) * 31) + this.n;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CardRechargeConfiguration(configId=", this.f5575a, ", city=", this.b, ", name=");
        cb0.t(sbE, this.c, ", agency=", this.d, ", productType=");
        cb0.t(sbE, this.e, ", productSubType=", this.f, ", fareInfo=");
        sbE.append(this.g);
        sbE.append(", branding=");
        sbE.append(this.h);
        sbE.append(", terms=");
        cb0.s(", rechargeDelayCopy=", this.j, ", isActive=", sbE, this.i);
        z40.r(sbE, this.k, ", isVisible=", this.l, ", minAppVer=");
        return xs.h(this.m, this.n, ", maxAppVer=", ")", sbE);
    }

    public CardRechargeConfiguration(String configId, String str, String str2, String str3, String str4, String str5, CardRechargeFareInfo cardRechargeFareInfo, ProductBranding productBranding, List terms, String str6, boolean z, int i, int i2) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(terms, "terms");
        this.f5575a = configId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = cardRechargeFareInfo;
        this.h = productBranding;
        this.i = terms;
        this.j = str6;
        this.k = z;
        this.l = true;
        this.m = i;
        this.n = i2;
    }
}
