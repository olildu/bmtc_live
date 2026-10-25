package app.chalo.premiumbus.data;

import defpackage.b3;
import defpackage.cb0;
import defpackage.d;
import defpackage.jg1;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassUiPropertiesAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassUiPropertiesAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6973a;
    public final List b;
    public final SuperPassUserDetailsAppModel c;
    public final Map d;
    public final long e;
    public final FareInfoAppModel f;
    public final String g;
    public final String h;
    public final ProductBrandingAppModel i;
    public final String j;
    public final double k;
    public final String l;
    public final int m;
    public final boolean n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassUiPropertiesAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/SuperPassUiPropertiesAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassUiPropertiesAppModel> serializer() {
            return SuperPassUiPropertiesAppModel$$serializer.f6974a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new jg1(13)), null, LazyKt.a(lazyThreadSafetyMode, new jg1(14)), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ SuperPassUiPropertiesAppModel(int i, int i2, List list, SuperPassUserDetailsAppModel superPassUserDetailsAppModel, Map map, long j, FareInfoAppModel fareInfoAppModel, String str, String str2, ProductBrandingAppModel productBrandingAppModel, String str3, double d, String str4, int i3, boolean z) {
        if (15359 != (i & 15359)) {
            PluginExceptionsKt.b(SuperPassUiPropertiesAppModel$$serializer.f6974a.getDescriptor(), i, 15359);
            throw null;
        }
        this.f6973a = i2;
        this.b = list;
        this.c = superPassUserDetailsAppModel;
        this.d = map;
        this.e = j;
        this.f = fareInfoAppModel;
        this.g = str;
        this.h = str2;
        this.i = productBrandingAppModel;
        this.j = str3;
        this.k = (i & 1024) == 0 ? -1.0d : d;
        this.l = str4;
        this.m = i3;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUiPropertiesAppModel)) {
            return false;
        }
        SuperPassUiPropertiesAppModel superPassUiPropertiesAppModel = (SuperPassUiPropertiesAppModel) obj;
        return this.f6973a == superPassUiPropertiesAppModel.f6973a && Intrinsics.d(this.b, superPassUiPropertiesAppModel.b) && Intrinsics.d(this.c, superPassUiPropertiesAppModel.c) && Intrinsics.d(this.d, superPassUiPropertiesAppModel.d) && this.e == superPassUiPropertiesAppModel.e && Intrinsics.d(this.f, superPassUiPropertiesAppModel.f) && Intrinsics.d(this.g, superPassUiPropertiesAppModel.g) && Intrinsics.d(this.h, superPassUiPropertiesAppModel.h) && Intrinsics.d(this.i, superPassUiPropertiesAppModel.i) && Intrinsics.d(this.j, superPassUiPropertiesAppModel.j) && Double.compare(this.k, superPassUiPropertiesAppModel.k) == 0 && Intrinsics.d(this.l, superPassUiPropertiesAppModel.l) && this.m == superPassUiPropertiesAppModel.m && this.n == superPassUiPropertiesAppModel.n;
    }

    public final int hashCode() {
        int iF = d.f(this.d, (this.c.hashCode() + r30.b(this.f6973a * 31, 31, this.b)) * 31, 31);
        long j = this.e;
        int iE = nf1.e((this.i.hashCode() + nf1.e(nf1.e((this.f.hashCode() + ((iF + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j);
        long jDoubleToLongBits = Double.doubleToLongBits(this.k);
        return ((nf1.e((iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.l) + this.m) * 31) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassUiPropertiesAppModel(numOfDays=");
        sb.append(this.f6973a);
        sb.append(", specialFeatures=");
        sb.append(this.b);
        sb.append(", superPassUserDetails=");
        sb.append(this.c);
        sb.append(", proofs=");
        sb.append(this.d);
        sb.append(", bookingTime=");
        sb.append(this.e);
        sb.append(", fareInfo=");
        sb.append(this.f);
        cb0.t(sb, ", passName=", this.g, ", categoryName=", this.h);
        sb.append(", productBranding=");
        sb.append(this.i);
        sb.append(", fareMappingDisplayName=");
        sb.append(this.j);
        pk0.z(sb, ", maxPricePerTrip=", this.k, ", configId=");
        cb0.o(this.m, this.l, ", fareMappingId=", ", markAsUnlimited=", sb);
        return b3.g(")", sb, this.n);
    }

    public SuperPassUiPropertiesAppModel(int i, List specialFeatures, SuperPassUserDetailsAppModel superPassUserDetailsAppModel, LinkedHashMap linkedHashMap, long j, FareInfoAppModel fareInfoAppModel, String passName, String categoryName, ProductBrandingAppModel productBrandingAppModel, String fareMappingDisplayName, double d, String configId, int i2, boolean z) {
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(passName, "passName");
        Intrinsics.i(categoryName, "categoryName");
        Intrinsics.i(fareMappingDisplayName, "fareMappingDisplayName");
        Intrinsics.i(configId, "configId");
        this.f6973a = i;
        this.b = specialFeatures;
        this.c = superPassUserDetailsAppModel;
        this.d = linkedHashMap;
        this.e = j;
        this.f = fareInfoAppModel;
        this.g = passName;
        this.h = categoryName;
        this.i = productBrandingAppModel;
        this.j = fareMappingDisplayName;
        this.k = d;
        this.l = configId;
        this.m = i2;
        this.n = z;
    }
}
