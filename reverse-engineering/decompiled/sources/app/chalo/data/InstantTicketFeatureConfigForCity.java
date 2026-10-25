package app.chalo.data;

import defpackage.ea0;
import defpackage.hq0;
import defpackage.r30;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/InstantTicketFeatureConfigForCity;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketFeatureConfigForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ea0(10)), null};
    public static final InstantTicketFeatureConfigForCity j = new InstantTicketFeatureConfigForCity(EmptyList.f17557a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2350a;
    public final boolean b;
    public final Boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final List g;
    public final boolean h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/InstantTicketFeatureConfigForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/InstantTicketFeatureConfigForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketFeatureConfigForCity> serializer() {
            return InstantTicketFeatureConfigForCity$$serializer.f2351a;
        }
    }

    public InstantTicketFeatureConfigForCity(List blacklistedAppVer) {
        Intrinsics.i(blacklistedAppVer, "blacklistedAppVer");
        this.f2350a = "";
        this.b = false;
        this.c = null;
        this.d = -1;
        this.e = -1;
        this.f = true;
        this.g = blacklistedAppVer;
        this.h = true;
    }

    public final boolean a(int i2) {
        if (!this.b || this.g.contains(Integer.valueOf(i2))) {
            return false;
        }
        int i3 = this.d;
        int i4 = this.e;
        if (i4 == -1) {
            return i2 >= i3;
        }
        return i2 <= i4 && i3 <= i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketFeatureConfigForCity)) {
            return false;
        }
        InstantTicketFeatureConfigForCity instantTicketFeatureConfigForCity = (InstantTicketFeatureConfigForCity) obj;
        return Intrinsics.d(this.f2350a, instantTicketFeatureConfigForCity.f2350a) && this.b == instantTicketFeatureConfigForCity.b && Intrinsics.d(this.c, instantTicketFeatureConfigForCity.c) && this.d == instantTicketFeatureConfigForCity.d && this.e == instantTicketFeatureConfigForCity.e && this.f == instantTicketFeatureConfigForCity.f && Intrinsics.d(this.g, instantTicketFeatureConfigForCity.g) && this.h == instantTicketFeatureConfigForCity.h;
    }

    public final int hashCode() {
        int iHashCode = ((this.f2350a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        Boolean bool = this.c;
        return r30.b((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1231 : 1237)) * 31, 31, this.g) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("InstantTicketFeatureConfigForCity(cityName=", this.f2350a, ", isEnabled=", ", isTitoValidationEnabled=", this.b);
        sbM.append(this.c);
        sbM.append(", minAppVer=");
        sbM.append(this.d);
        sbM.append(", maxAppVer=");
        sbM.append(this.e);
        sbM.append(", isRepurchaseEnabled=");
        sbM.append(this.f);
        sbM.append(", blacklistedAppVer=");
        sbM.append(this.g);
        sbM.append(", isRouteBasedSelection=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ InstantTicketFeatureConfigForCity(int i2, String str, boolean z, Boolean bool, int i3, int i4, boolean z2, List list, boolean z3) {
        if (91 != (i2 & 91)) {
            PluginExceptionsKt.b(InstantTicketFeatureConfigForCity$$serializer.f2351a.getDescriptor(), i2, 91);
            throw null;
        }
        this.f2350a = str;
        this.b = z;
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        this.d = i3;
        this.e = i4;
        if ((i2 & 32) == 0) {
            this.f = true;
        } else {
            this.f = z2;
        }
        this.g = list;
        if ((i2 & 128) == 0) {
            this.h = true;
        } else {
            this.h = z3;
        }
    }
}
