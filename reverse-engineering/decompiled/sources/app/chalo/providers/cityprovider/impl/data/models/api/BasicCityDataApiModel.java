package app.chalo.providers.cityprovider.impl.data.models.api;

import defpackage.a9;
import defpackage.gf;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/BasicCityDataApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BasicCityDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a9(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f8834a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/BasicCityDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/BasicCityDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BasicCityDataApiModel> serializer() {
            return BasicCityDataApiModel$$serializer.f8835a;
        }
    }

    public /* synthetic */ BasicCityDataApiModel(int i, Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, List list) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.b(BasicCityDataApiModel$$serializer.f8835a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f8834a = null;
        } else {
            this.f8834a = bool;
        }
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCityDataApiModel)) {
            return false;
        }
        BasicCityDataApiModel basicCityDataApiModel = (BasicCityDataApiModel) obj;
        return Intrinsics.d(this.f8834a, basicCityDataApiModel.f8834a) && Intrinsics.d(this.b, basicCityDataApiModel.b) && Intrinsics.d(this.c, basicCityDataApiModel.c) && Intrinsics.d(this.d, basicCityDataApiModel.d) && Intrinsics.d(this.e, basicCityDataApiModel.e) && Intrinsics.d(this.f, basicCityDataApiModel.f);
    }

    public final int hashCode() {
        Boolean bool = this.f8834a;
        int iE = nf1.e(nf1.e((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, this.c);
        Boolean bool2 = this.d;
        int iHashCode = (iE + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode2 = (iHashCode + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasicCityDataApiModel(isBetaMode=");
        sb.append(this.f8834a);
        sb.append(", cityDisplayName=");
        sb.append(this.b);
        sb.append(", cityId=");
        gf.v(this.d, this.c, ", isComingSoon=", ", isDisabled=", sb);
        sb.append(this.e);
        sb.append(", polyBound=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
