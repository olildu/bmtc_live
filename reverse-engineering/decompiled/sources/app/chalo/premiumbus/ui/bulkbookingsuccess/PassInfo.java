package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassStatusAppModel;
import app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.to0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PassInfo;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7491a;
    public final String b;
    public final long c;
    public final SuperPassStatusAppModel d;
    public final int e;
    public final int f;
    public final SuperPassTripPreferencesAppModel g;
    public final List h;
    public final List i;
    public final SuperPassSubTypes j;
    public final int k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PassInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PassInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassInfo> serializer() {
            return PassInfo$$serializer.f7492a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new to0(17)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new to0(18)), LazyKt.a(lazyThreadSafetyMode, new to0(19)), LazyKt.a(lazyThreadSafetyMode, new to0(20)), null};
    }

    public /* synthetic */ PassInfo(int i, String str, String str2, long j, SuperPassStatusAppModel superPassStatusAppModel, int i2, int i3, SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel, List list, List list2, SuperPassSubTypes superPassSubTypes, int i4) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(PassInfo$$serializer.f7492a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f7491a = str;
        this.b = str2;
        this.c = j;
        this.d = superPassStatusAppModel;
        this.e = i2;
        this.f = i3;
        this.g = superPassTripPreferencesAppModel;
        this.h = list;
        this.i = list2;
        this.j = superPassSubTypes;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassInfo)) {
            return false;
        }
        PassInfo passInfo = (PassInfo) obj;
        return Intrinsics.d(this.f7491a, passInfo.f7491a) && Intrinsics.d(this.b, passInfo.b) && this.c == passInfo.c && this.d == passInfo.d && this.e == passInfo.e && this.f == passInfo.f && Intrinsics.d(this.g, passInfo.g) && Intrinsics.d(this.h, passInfo.h) && Intrinsics.d(this.i, passInfo.i) && this.j == passInfo.j && this.k == passInfo.k;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f7491a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return ((this.j.hashCode() + r30.b(r30.b((this.g.hashCode() + ((((((this.d.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31, 31, this.h), 31, this.i)) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassInfo(passName=", this.f7491a, ", configId=", this.b, ", passValidity=");
        sbE.append(this.c);
        sbE.append(", passStatus=");
        sbE.append(this.d);
        z40.o(this.e, this.f, ", remainingTrips=", ", totalTrips=", sbE);
        sbE.append(", tripPreference=");
        sbE.append(this.g);
        sbE.append(", specialFeatures=");
        sbE.append(this.h);
        sbE.append(", termsAndConditions=");
        sbE.append(this.i);
        sbE.append(", productSubType=");
        sbE.append(this.j);
        return t10.k(sbE, ", fareMappingId=", this.k, ")");
    }

    public PassInfo(String passName, String configId, long j, SuperPassStatusAppModel superPassStatusAppModel, int i, int i2, SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel, List specialFeatures, List termsAndConditions, SuperPassSubTypes productSubType, int i3) {
        Intrinsics.i(passName, "passName");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(termsAndConditions, "termsAndConditions");
        Intrinsics.i(productSubType, "productSubType");
        this.f7491a = passName;
        this.b = configId;
        this.c = j;
        this.d = superPassStatusAppModel;
        this.e = i;
        this.f = i2;
        this.g = superPassTripPreferencesAppModel;
        this.h = specialFeatures;
        this.i = termsAndConditions;
        this.j = productSubType;
        this.k = i3;
    }
}
