package app.chalo.productpurchase.passpurchase.data.models.api.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/models/api/request/PassProps;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassProps {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8322a;
    public final String b;
    public final int c;
    public final double d;
    public final long e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/models/api/request/PassProps$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/data/models/api/request/PassProps;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassProps> serializer() {
            return PassProps$$serializer.f8323a;
        }
    }

    public /* synthetic */ PassProps(int i, String str, String str2, int i2, double d, long j, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PassProps$$serializer.f8323a.getDescriptor(), i, 31);
            throw null;
        }
        this.f8322a = str;
        this.b = str2;
        this.c = i2;
        this.d = d;
        this.e = j;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassProps)) {
            return false;
        }
        PassProps passProps = (PassProps) obj;
        return Intrinsics.d(this.f8322a, passProps.f8322a) && Intrinsics.d(this.b, passProps.b) && this.c == passProps.c && Double.compare(this.d, passProps.d) == 0 && this.e == passProps.e && Intrinsics.d(this.f, passProps.f) && Intrinsics.d(this.g, passProps.g) && Intrinsics.d(this.h, passProps.h) && Intrinsics.d(this.i, passProps.i) && Intrinsics.d(this.j, passProps.j) && Intrinsics.d(this.k, passProps.k) && Intrinsics.d(this.l, passProps.l);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f8322a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        int i = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long j = this.e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        Boolean bool = this.f;
        int iHashCode = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassProps(categoryId=", this.f8322a, ", configurationId=", this.b, ", fmId=");
        sbE.append(this.c);
        sbE.append(", passFare=");
        sbE.append(this.d);
        xs.r(this.e, ", passStartDate=", ", isRenew=", sbE);
        hq0.t(this.f, ", passId=", this.g, ", startStopId=", sbE);
        cb0.t(sbE, this.h, ", startStopName=", this.i, ", endStopId=");
        cb0.t(sbE, this.j, ", endStopName=", this.k, ", routeId=");
        return vo1.p(sbE, this.l, ")");
    }

    public PassProps(String categoryId, String configurationId, int i, double d, long j, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.i(categoryId, "categoryId");
        Intrinsics.i(configurationId, "configurationId");
        this.f8322a = categoryId;
        this.b = configurationId;
        this.c = i;
        this.d = d;
        this.e = j;
        this.f = bool;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }
}
