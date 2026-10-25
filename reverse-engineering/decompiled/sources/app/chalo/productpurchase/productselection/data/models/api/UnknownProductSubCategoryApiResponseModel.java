package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.cb0;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductSubCategoryApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UnknownProductSubCategoryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f8623a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductSubCategoryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductSubCategoryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UnknownProductSubCategoryApiResponseModel> serializer() {
            return UnknownProductSubCategoryApiResponseModel$$serializer.f8624a;
        }
    }

    public /* synthetic */ UnknownProductSubCategoryApiResponseModel(int i, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(UnknownProductSubCategoryApiResponseModel$$serializer.f8624a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8623a = bool;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bool2;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductSubCategoryApiResponseModel)) {
            return false;
        }
        UnknownProductSubCategoryApiResponseModel unknownProductSubCategoryApiResponseModel = (UnknownProductSubCategoryApiResponseModel) obj;
        return Intrinsics.d(this.f8623a, unknownProductSubCategoryApiResponseModel.f8623a) && Intrinsics.d(this.b, unknownProductSubCategoryApiResponseModel.b) && Intrinsics.d(this.c, unknownProductSubCategoryApiResponseModel.c) && Intrinsics.d(this.d, unknownProductSubCategoryApiResponseModel.d) && Intrinsics.d(this.e, unknownProductSubCategoryApiResponseModel.e) && Intrinsics.d(this.f, unknownProductSubCategoryApiResponseModel.f) && Intrinsics.d(this.g, unknownProductSubCategoryApiResponseModel.g);
    }

    public final int hashCode() {
        Boolean bool = this.f8623a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownProductSubCategoryApiResponseModel(isVisible=");
        sb.append(this.f8623a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        cb0.t(sb, this.c, ", infoNote=", this.d, ", announcement=");
        gf.v(this.f, this.e, ", isActive=", ", inactiveReason=", sb);
        return vo1.p(sb, this.g, ")");
    }
}
