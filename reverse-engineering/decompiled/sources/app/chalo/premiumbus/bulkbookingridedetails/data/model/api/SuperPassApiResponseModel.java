package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.jf1;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/SuperPassApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] L;
    public final String A;
    public final TripPreferencesApiResponseModel B;
    public final int C;
    public final int D;
    public final int E;
    public final Boolean F;
    public final Boolean G;
    public final List H;
    public final Integer I;
    public final Integer J;
    public final List K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6882a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;
    public final List l;
    public final UserProfile m;
    public final long n;
    public final FareInfo o;
    public final String p;
    public final String q;
    public final Branding r;
    public final String s;
    public final String t;
    public final String u;
    public final int v;
    public final long w;
    public final boolean x;
    public final boolean y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/SuperPassApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/SuperPassApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassApiResponseModel> serializer() {
            return SuperPassApiResponseModel$$serializer.f6883a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        L = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new jf1(24)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new jf1(25)), null, null, LazyKt.a(lazyThreadSafetyMode, new jf1(26))};
    }

    public /* synthetic */ SuperPassApiResponseModel(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, String str8, int i3, List list, UserProfile userProfile, long j3, FareInfo fareInfo, String str9, String str10, Branding branding, String str11, String str12, String str13, int i4, long j4, boolean z, boolean z2, String str14, String str15, TripPreferencesApiResponseModel tripPreferencesApiResponseModel, int i5, int i6, int i7, Boolean bool, Boolean bool2, List list2, Integer num, Integer num2, List list3) {
        if ((31 != (i2 & 31)) || (-1 != i)) {
            PluginExceptionsKt.a(new int[]{i, i2}, new int[]{-1, 31}, SuperPassApiResponseModel$$serializer.f6883a.getDescriptor());
            throw null;
        }
        this.f6882a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = j;
        this.i = j2;
        this.j = str8;
        this.k = i3;
        this.l = list;
        this.m = userProfile;
        this.n = j3;
        this.o = fareInfo;
        this.p = str9;
        this.q = str10;
        this.r = branding;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = i4;
        this.w = j4;
        this.x = z;
        this.y = z2;
        this.z = str14;
        this.A = str15;
        this.B = tripPreferencesApiResponseModel;
        this.C = i5;
        this.D = i6;
        this.E = i7;
        this.F = bool;
        this.G = bool2;
        this.H = list2;
        this.I = num;
        this.J = num2;
        this.K = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassApiResponseModel)) {
            return false;
        }
        SuperPassApiResponseModel superPassApiResponseModel = (SuperPassApiResponseModel) obj;
        return Intrinsics.d(this.f6882a, superPassApiResponseModel.f6882a) && Intrinsics.d(this.b, superPassApiResponseModel.b) && Intrinsics.d(this.c, superPassApiResponseModel.c) && Intrinsics.d(this.d, superPassApiResponseModel.d) && Intrinsics.d(this.e, superPassApiResponseModel.e) && Intrinsics.d(this.f, superPassApiResponseModel.f) && Intrinsics.d(this.g, superPassApiResponseModel.g) && this.h == superPassApiResponseModel.h && this.i == superPassApiResponseModel.i && Intrinsics.d(this.j, superPassApiResponseModel.j) && this.k == superPassApiResponseModel.k && Intrinsics.d(this.l, superPassApiResponseModel.l) && Intrinsics.d(this.m, superPassApiResponseModel.m) && this.n == superPassApiResponseModel.n && Intrinsics.d(this.o, superPassApiResponseModel.o) && Intrinsics.d(this.p, superPassApiResponseModel.p) && Intrinsics.d(this.q, superPassApiResponseModel.q) && Intrinsics.d(this.r, superPassApiResponseModel.r) && Intrinsics.d(this.s, superPassApiResponseModel.s) && Intrinsics.d(this.t, superPassApiResponseModel.t) && Intrinsics.d(this.u, superPassApiResponseModel.u) && this.v == superPassApiResponseModel.v && this.w == superPassApiResponseModel.w && this.x == superPassApiResponseModel.x && this.y == superPassApiResponseModel.y && Intrinsics.d(this.z, superPassApiResponseModel.z) && Intrinsics.d(this.A, superPassApiResponseModel.A) && Intrinsics.d(this.B, superPassApiResponseModel.B) && this.C == superPassApiResponseModel.C && this.D == superPassApiResponseModel.D && this.E == superPassApiResponseModel.E && Intrinsics.d(this.F, superPassApiResponseModel.F) && Intrinsics.d(this.G, superPassApiResponseModel.G) && Intrinsics.d(this.H, superPassApiResponseModel.H) && Intrinsics.d(this.I, superPassApiResponseModel.I) && Intrinsics.d(this.J, superPassApiResponseModel.J) && Intrinsics.d(this.K, superPassApiResponseModel.K);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f6882a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        long j = this.h;
        int i = (iE2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int iHashCode = (this.m.hashCode() + r30.b((nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.j) + this.k) * 31, 31, this.l)) * 31;
        long j3 = this.n;
        int iE3 = (nf1.e(nf1.e(nf1.e((this.r.hashCode() + nf1.e(nf1.e((this.o.hashCode() + ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.p), 31, this.q)) * 31, 31, this.s), 31, this.t), 31, this.u) + this.v) * 31;
        long j4 = this.w;
        int iE4 = nf1.e(nf1.e((((((iE3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.x ? 1231 : 1237)) * 31) + (this.y ? 1231 : 1237)) * 31, 31, this.z), 31, this.A);
        TripPreferencesApiResponseModel tripPreferencesApiResponseModel = this.B;
        int iHashCode2 = (((((((iE4 + (tripPreferencesApiResponseModel == null ? 0 : tripPreferencesApiResponseModel.hashCode())) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31;
        Boolean bool = this.F;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.G;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.H;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.I;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.J;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list2 = this.K;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassApiResponseModel(passId=", this.f6882a, ", productType=", this.b, ", productSubType=");
        cb0.t(sbE, this.c, ", city=", this.d, ", agency=");
        cb0.t(sbE, this.e, ", tone=", this.f, ", qrCode=");
        n21.p(this.h, this.g, ", startTime=", sbE);
        xs.r(this.i, ", expiryTime=", ", status=", sbE);
        cb0.o(this.k, this.j, ", numOfDays=", ", specialFeatures=", sbE);
        sbE.append(this.l);
        sbE.append(", userProfile=");
        sbE.append(this.m);
        sbE.append(", bookingTime=");
        sbE.append(this.n);
        sbE.append(", fareInfo=");
        sbE.append(this.o);
        cb0.t(sbE, ", productName=", this.p, ", categoryName=", this.q);
        sbE.append(", branding=");
        sbE.append(this.r);
        sbE.append(", displayName=");
        sbE.append(this.s);
        cb0.t(sbE, ", configurationId=", this.t, ", categoryId=", this.u);
        sbE.append(", fmId=");
        sbE.append(this.v);
        sbE.append(", verificationExpiryTime=");
        sbE.append(this.w);
        sbE.append(", verificationFlag=");
        sbE.append(this.x);
        sbE.append(", isRenewable=");
        sbE.append(this.y);
        sbE.append(", transactionId=");
        sbE.append(this.z);
        sbE.append(", paymentMode=");
        sbE.append(this.A);
        sbE.append(", tripPreferences=");
        sbE.append(this.B);
        z40.o(this.C, this.D, ", remainingTrips=", ", numOfTrips=", sbE);
        sbE.append(", premiumRidesConsumed=");
        sbE.append(this.E);
        sbE.append(", isHailingAllowed=");
        sbE.append(this.F);
        sbE.append(", checkAppReclaim=");
        sbE.append(this.G);
        sbE.append(", serviceType=");
        sbE.append(this.H);
        sbE.append(", maxPricePerTrip=");
        sbE.append(this.I);
        sbE.append(", maxTripsPerDay=");
        sbE.append(this.J);
        sbE.append(", punches=");
        sbE.append(this.K);
        sbE.append(")");
        return sbE.toString();
    }
}
