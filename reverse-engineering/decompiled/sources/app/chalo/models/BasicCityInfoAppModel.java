package app.chalo.models;

import defpackage.a9;
import defpackage.dd;
import defpackage.nf1;
import defpackage.z40;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/BasicCityInfoAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BasicCityInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a9(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5567a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/BasicCityInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/BasicCityInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BasicCityInfoAppModel> serializer() {
            return BasicCityInfoAppModel$$serializer.f5568a;
        }
    }

    public /* synthetic */ BasicCityInfoAppModel(int i, String str, String str2, boolean z, boolean z2, boolean z3, List list) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(BasicCityInfoAppModel$$serializer.f5568a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5567a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCityInfoAppModel)) {
            return false;
        }
        BasicCityInfoAppModel basicCityInfoAppModel = (BasicCityInfoAppModel) obj;
        return Intrinsics.d(this.f5567a, basicCityInfoAppModel.f5567a) && Intrinsics.d(this.b, basicCityInfoAppModel.b) && this.c == basicCityInfoAppModel.c && this.d == basicCityInfoAppModel.d && this.e == basicCityInfoAppModel.e && Intrinsics.d(this.f, basicCityInfoAppModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((((nf1.e(this.f5567a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BasicCityInfoAppModel(cityId=", this.f5567a, ", cityName=", this.b, ", isBetaCity=");
        z40.r(sbE, this.c, ", isComingSoon=", this.d, ", isCityDiscontinued=");
        sbE.append(this.e);
        sbE.append(", polyBounds=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public BasicCityInfoAppModel(String cityId, String cityName, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(cityName, "cityName");
        this.f5567a = cityId;
        this.b = cityName;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = arrayList;
    }
}
