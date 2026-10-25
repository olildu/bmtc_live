package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.gf;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.tf1;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigCategoryApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigCategoryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(3)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8611a;
    public final Integer b;
    public final String c;
    public final List d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigCategoryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/SuperPassProductConfigCategoryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductConfigCategoryApiResponseModel> serializer() {
            return SuperPassProductConfigCategoryApiResponseModel$$serializer.f8612a;
        }
    }

    public /* synthetic */ SuperPassProductConfigCategoryApiResponseModel(int i, String str, Integer num, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, String str5) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(SuperPassProductConfigCategoryApiResponseModel$$serializer.f8612a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f8611a = str;
        this.b = num;
        this.c = str2;
        this.d = list;
        this.e = bool;
        this.f = bool2;
        this.g = bool3;
        this.h = str3;
        this.i = str4;
        this.j = bool4;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductConfigCategoryApiResponseModel)) {
            return false;
        }
        SuperPassProductConfigCategoryApiResponseModel superPassProductConfigCategoryApiResponseModel = (SuperPassProductConfigCategoryApiResponseModel) obj;
        return Intrinsics.d(this.f8611a, superPassProductConfigCategoryApiResponseModel.f8611a) && Intrinsics.d(this.b, superPassProductConfigCategoryApiResponseModel.b) && Intrinsics.d(this.c, superPassProductConfigCategoryApiResponseModel.c) && Intrinsics.d(this.d, superPassProductConfigCategoryApiResponseModel.d) && Intrinsics.d(this.e, superPassProductConfigCategoryApiResponseModel.e) && Intrinsics.d(this.f, superPassProductConfigCategoryApiResponseModel.f) && Intrinsics.d(this.g, superPassProductConfigCategoryApiResponseModel.g) && Intrinsics.d(this.h, superPassProductConfigCategoryApiResponseModel.h) && Intrinsics.d(this.i, superPassProductConfigCategoryApiResponseModel.i) && Intrinsics.d(this.j, superPassProductConfigCategoryApiResponseModel.j) && Intrinsics.d(this.k, superPassProductConfigCategoryApiResponseModel.k);
    }

    public final int hashCode() {
        String str = this.f8611a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str5 = this.k;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassProductConfigCategoryApiResponseModel(id=");
        sb.append(this.f8611a);
        sb.append(", pos=");
        sb.append(this.b);
        sb.append(", name=");
        pk0.w(this.c, ", proofs=", ", isActive=", sb, this.d);
        hq0.u(sb, this.e, ", isRenewable=", this.f, ", verification=");
        hq0.t(this.g, ", infoNote=", this.h, ", inactiveReason=", sb);
        gf.v(this.j, this.i, ", isVisible=", ", info=", sb);
        return vo1.p(sb, this.k, ")");
    }
}
