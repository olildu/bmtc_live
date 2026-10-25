package app.chalo.providers.cityprovider.impl.data.models.api;

import defpackage.cb0;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsRequestApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetaDataPropsRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8850a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataPropsRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetaDataPropsRequestApiModel> serializer() {
            return MetaDataPropsRequestApiModel$$serializer.f8851a;
        }
    }

    public /* synthetic */ MetaDataPropsRequestApiModel(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(MetaDataPropsRequestApiModel$$serializer.f8851a.getDescriptor(), i, 63);
            throw null;
        }
        this.f8850a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = i3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaDataPropsRequestApiModel)) {
            return false;
        }
        MetaDataPropsRequestApiModel metaDataPropsRequestApiModel = (MetaDataPropsRequestApiModel) obj;
        return Intrinsics.d(this.f8850a, metaDataPropsRequestApiModel.f8850a) && Intrinsics.d(this.b, metaDataPropsRequestApiModel.b) && Intrinsics.d(this.c, metaDataPropsRequestApiModel.c) && this.d == metaDataPropsRequestApiModel.d && this.e == metaDataPropsRequestApiModel.e && Intrinsics.d(this.f, metaDataPropsRequestApiModel.f);
    }

    public final int hashCode() {
        String str = this.f8850a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetaDataPropsRequestApiModel(userDistinctId=", this.f8850a, ", city=", this.b, ", aModel=");
        cb0.o(this.d, this.c, ", versionCode=", ", osVersion=", sbE);
        sbE.append(this.e);
        sbE.append(", language=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
