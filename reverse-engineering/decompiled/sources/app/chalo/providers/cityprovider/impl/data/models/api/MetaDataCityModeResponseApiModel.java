package app.chalo.providers.cityprovider.impl.data.models.api;

import defpackage.dd;
import defpackage.sg0;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityModeResponseApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetaDataCityModeResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sg0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8846a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityModeResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityModeResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetaDataCityModeResponseApiModel> serializer() {
            return MetaDataCityModeResponseApiModel$$serializer.f8847a;
        }
    }

    public /* synthetic */ MetaDataCityModeResponseApiModel(List list, int i, String str, String str2) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.b(MetaDataCityModeResponseApiModel$$serializer.f8847a.getDescriptor(), i, 5);
            throw null;
        }
        this.f8846a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaDataCityModeResponseApiModel)) {
            return false;
        }
        MetaDataCityModeResponseApiModel metaDataCityModeResponseApiModel = (MetaDataCityModeResponseApiModel) obj;
        return Intrinsics.d(this.f8846a, metaDataCityModeResponseApiModel.f8846a) && Intrinsics.d(this.b, metaDataCityModeResponseApiModel.b) && Intrinsics.d(this.c, metaDataCityModeResponseApiModel.c);
    }

    public final int hashCode() {
        String str = this.f8846a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return xs.l(dd.e("MetaDataCityModeResponseApiModel(mode=", this.f8846a, ", imageUrl=", this.b, ", agencies="), this.c, ")");
    }
}
