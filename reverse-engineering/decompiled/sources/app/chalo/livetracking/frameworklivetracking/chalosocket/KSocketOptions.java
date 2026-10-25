package app.chalo.livetracking.frameworklivetracking.chalosocket;

import app.chalo.network.config.KPlatformSocketConfig;
import defpackage.i71;
import defpackage.nf1;
import defpackage.pk0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/chalosocket/KSocketOptions;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KSocketOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4218a;
    public final long b;
    public final double c;
    public final String d;
    public final LinkedHashMap e;
    public final Long f;
    public final List g;
    public final KPlatformSocketConfig h;

    public KSocketOptions(long j, long j2, double d, String path, LinkedHashMap linkedHashMap, Long l, List list, KPlatformSocketConfig kPlatformSocketConfig) {
        Intrinsics.i(path, "path");
        this.f4218a = j;
        this.b = j2;
        this.c = d;
        this.d = path;
        this.e = linkedHashMap;
        this.f = l;
        this.g = list;
        this.h = kPlatformSocketConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KSocketOptions)) {
            return false;
        }
        KSocketOptions kSocketOptions = (KSocketOptions) obj;
        return this.f4218a == kSocketOptions.f4218a && this.b == kSocketOptions.b && Double.compare(this.c, kSocketOptions.c) == 0 && Intrinsics.d(this.d, kSocketOptions.d) && this.e.equals(kSocketOptions.e) && Intrinsics.d(this.f, kSocketOptions.f) && Intrinsics.d(this.g, kSocketOptions.g) && Intrinsics.d(this.h, kSocketOptions.h);
    }

    public final int hashCode() {
        long j = this.f4218a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        int iHashCode = (this.e.hashCode() + nf1.e((i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.d)) * 31;
        Long l = this.f;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        KPlatformSocketConfig kPlatformSocketConfig = this.h;
        return iHashCode3 + (kPlatformSocketConfig != null ? kPlatformSocketConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f4218a, "KSocketOptions(reconnectionDelay=", ", reconnectionDelayMax=");
        sbG.append(this.b);
        pk0.z(sbG, ", randomizationFactor=", this.c, ", path=");
        sbG.append(this.d);
        sbG.append(", query=");
        sbG.append(this.e);
        sbG.append(", timeout=");
        sbG.append(this.f);
        sbG.append(", transports=");
        sbG.append(this.g);
        sbG.append(", platformConfig=");
        sbG.append(this.h);
        sbG.append(")");
        return sbG.toString();
    }
}
