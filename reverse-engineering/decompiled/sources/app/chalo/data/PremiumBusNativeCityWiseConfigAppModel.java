package app.chalo.data;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.nt0;
import defpackage.pk0;
import defpackage.t10;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/PremiumBusNativeCityWiseConfigAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusNativeCityWiseConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2378a;
    public final boolean b;
    public final int c;
    public final int d;
    public final PremiumBusCityWisePollingConfigAppModel e;
    public final List f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final List n;
    public final int o;
    public final int p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/PremiumBusNativeCityWiseConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/PremiumBusNativeCityWiseConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusNativeCityWiseConfigAppModel> serializer() {
            return PremiumBusNativeCityWiseConfigAppModel$$serializer.f2379a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nt0(11)), null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new nt0(12)), null, null};
    }

    public /* synthetic */ PremiumBusNativeCityWiseConfigAppModel(int i, String str, boolean z, int i2, int i3, PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel, List list, String str2, boolean z2, String str3, String str4, int i4, int i5, String str5, List list2, int i6, int i7) {
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.b(PremiumBusNativeCityWiseConfigAppModel$$serializer.f2379a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f2378a = str;
        this.b = z;
        this.c = i2;
        this.d = i3;
        this.e = premiumBusCityWisePollingConfigAppModel;
        this.f = list;
        this.g = str2;
        this.h = z2;
        this.i = str3;
        this.j = str4;
        this.k = i4;
        this.l = i5;
        this.m = str5;
        this.n = list2;
        if ((i & 16384) == 0) {
            this.o = 80;
        } else {
            this.o = i6;
        }
        if ((i & 32768) == 0) {
            this.p = 80;
        } else {
            this.p = i7;
        }
    }

    public final boolean a(int i) {
        return this.b && i <= this.d && this.c <= i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusNativeCityWiseConfigAppModel)) {
            return false;
        }
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = (PremiumBusNativeCityWiseConfigAppModel) obj;
        return Intrinsics.d(this.f2378a, premiumBusNativeCityWiseConfigAppModel.f2378a) && this.b == premiumBusNativeCityWiseConfigAppModel.b && this.c == premiumBusNativeCityWiseConfigAppModel.c && this.d == premiumBusNativeCityWiseConfigAppModel.d && Intrinsics.d(this.e, premiumBusNativeCityWiseConfigAppModel.e) && Intrinsics.d(this.f, premiumBusNativeCityWiseConfigAppModel.f) && Intrinsics.d(this.g, premiumBusNativeCityWiseConfigAppModel.g) && this.h == premiumBusNativeCityWiseConfigAppModel.h && Intrinsics.d(this.i, premiumBusNativeCityWiseConfigAppModel.i) && Intrinsics.d(this.j, premiumBusNativeCityWiseConfigAppModel.j) && this.k == premiumBusNativeCityWiseConfigAppModel.k && this.l == premiumBusNativeCityWiseConfigAppModel.l && Intrinsics.d(this.m, premiumBusNativeCityWiseConfigAppModel.m) && Intrinsics.d(this.n, premiumBusNativeCityWiseConfigAppModel.n) && this.o == premiumBusNativeCityWiseConfigAppModel.o && this.p == premiumBusNativeCityWiseConfigAppModel.p;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (((((((this.f2378a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31)) * 31;
        List list = this.f;
        int iE = (nf1.e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.g) + (this.h ? 1231 : 1237)) * 31;
        String str = this.i;
        int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.k) * 31) + this.l) * 31;
        String str3 = this.m;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.n;
        return ((((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.o) * 31) + this.p;
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("PremiumBusNativeCityWiseConfigAppModel(city=", this.f2378a, ", isEnabled=", ", minAppVer=", this.b);
        hq0.p(this.c, this.d, ", maxAppVer=", ", pollingConstants=", sbM);
        sbM.append(this.e);
        sbM.append(", airportExpressStops=");
        sbM.append(this.f);
        sbM.append(", iconUrl=");
        t10.s(this.g, ", shouldShowNewPremiumBusCard=", ", supportContactNumber=", sbM, this.h);
        cb0.t(sbM, this.i, ", landingScreenImageUrl=", this.j, ", stopCountAfterDropToConsiderForTripEnd=");
        hq0.p(this.k, this.l, ", totalRoutesToShowOnLandingScreen=", ", userCancellationAndReschedulePolicyWebUrl=", sbM);
        pk0.w(this.m, ", passSavingFaqs=", ", rideConsumptionPercentageForRenewal=", sbM, this.n);
        return xs.h(this.o, this.p, ", timeConsumptionPercentageForRenewal=", ")", sbM);
    }

    public PremiumBusNativeCityWiseConfigAppModel(String str, PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel, List list) {
        this.f2378a = str;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = premiumBusCityWisePollingConfigAppModel;
        this.f = list;
        this.g = "";
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = 3;
        this.m = null;
        this.n = null;
        this.o = 80;
        this.p = 80;
    }
}
