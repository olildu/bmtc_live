package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigSubCategoryApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigSubCategoryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8615a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigSubCategoryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigSubCategoryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductConfigSubCategoryApiResponseModel> serializer() {
            return SuperPassProductConfigSubCategoryApiResponseModel$$serializer.f8616a;
        }
    }

    public /* synthetic */ SuperPassProductConfigSubCategoryApiResponseModel(int i, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, Boolean bool3) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(SuperPassProductConfigSubCategoryApiResponseModel$$serializer.f8616a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f8615a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductConfigSubCategoryApiResponseModel)) {
            return false;
        }
        SuperPassProductConfigSubCategoryApiResponseModel superPassProductConfigSubCategoryApiResponseModel = (SuperPassProductConfigSubCategoryApiResponseModel) obj;
        return Intrinsics.d(this.f8615a, superPassProductConfigSubCategoryApiResponseModel.f8615a) && Intrinsics.d(this.b, superPassProductConfigSubCategoryApiResponseModel.b) && Intrinsics.d(this.c, superPassProductConfigSubCategoryApiResponseModel.c) && Intrinsics.d(this.d, superPassProductConfigSubCategoryApiResponseModel.d) && Intrinsics.d(this.e, superPassProductConfigSubCategoryApiResponseModel.e) && Intrinsics.d(this.f, superPassProductConfigSubCategoryApiResponseModel.f) && Intrinsics.d(this.g, superPassProductConfigSubCategoryApiResponseModel.g) && Intrinsics.d(this.h, superPassProductConfigSubCategoryApiResponseModel.h) && Intrinsics.d(this.i, superPassProductConfigSubCategoryApiResponseModel.i) && Intrinsics.d(this.j, superPassProductConfigSubCategoryApiResponseModel.j);
    }

    public final int hashCode() {
        String str = this.f8615a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassProductConfigSubCategoryApiResponseModel(id=", this.f8615a, ", name=", this.b, ", infoNote=");
        gf.v(this.d, this.c, ", isActive=", ", isVisible=", sbE);
        hq0.t(this.e, ", plansTitle=", this.f, ", additionalInfo=", sbE);
        cb0.t(sbE, this.g, ", announcement=", this.h, ", inactiveReason=");
        sbE.append(this.i);
        sbE.append(", hideSpecialFeatureTags=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
