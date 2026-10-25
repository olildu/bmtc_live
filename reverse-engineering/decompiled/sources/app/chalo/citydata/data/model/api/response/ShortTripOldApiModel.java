package app.chalo.citydata.data.model.api.response;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import defpackage.z61;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/ShortTripOldApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ShortTripOldApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new z61(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1691a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/ShortTripOldApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/ShortTripOldApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ShortTripOldApiModel> serializer() {
            return ShortTripOldApiModel$$serializer.f1692a;
        }
    }

    public /* synthetic */ ShortTripOldApiModel(List list, int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ShortTripOldApiModel$$serializer.f1692a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1691a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortTripOldApiModel)) {
            return false;
        }
        ShortTripOldApiModel shortTripOldApiModel = (ShortTripOldApiModel) obj;
        return Intrinsics.d(this.f1691a, shortTripOldApiModel.f1691a) && Intrinsics.d(this.b, shortTripOldApiModel.b) && Intrinsics.d(this.c, shortTripOldApiModel.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1691a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return xs.l(dd.e("ShortTripOldApiModel(lastStopId=", this.f1691a, ", firstStopId=", this.b, ", timeTable="), this.c, ")");
    }
}
