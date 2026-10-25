package app.chalo.productbooking.common.data.models.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.hq0;
import defpackage.nx0;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigCategoryAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigCategoryAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nx0(3)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8201a;
    public final Integer b;
    public final String c;
    public final List d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigCategoryAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigCategoryAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigCategoryAppModel> serializer() {
            return ProductConfigCategoryAppModel$$serializer.f8202a;
        }
    }

    public /* synthetic */ ProductConfigCategoryAppModel(int i, String str, Integer num, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(ProductConfigCategoryAppModel$$serializer.f8202a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f8201a = str;
        this.b = num;
        this.c = str2;
        this.d = list;
        this.e = bool;
        this.f = bool2;
        this.g = bool3;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigCategoryAppModel)) {
            return false;
        }
        ProductConfigCategoryAppModel productConfigCategoryAppModel = (ProductConfigCategoryAppModel) obj;
        return Intrinsics.d(this.f8201a, productConfigCategoryAppModel.f8201a) && Intrinsics.d(this.b, productConfigCategoryAppModel.b) && Intrinsics.d(this.c, productConfigCategoryAppModel.c) && Intrinsics.d(this.d, productConfigCategoryAppModel.d) && Intrinsics.d(this.e, productConfigCategoryAppModel.e) && Intrinsics.d(this.f, productConfigCategoryAppModel.f) && Intrinsics.d(this.g, productConfigCategoryAppModel.g) && Intrinsics.d(this.h, productConfigCategoryAppModel.h) && Intrinsics.d(this.i, productConfigCategoryAppModel.i);
    }

    public final int hashCode() {
        int iHashCode = this.f8201a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductConfigCategoryAppModel(id=");
        sb.append(this.f8201a);
        sb.append(", pos=");
        sb.append(this.b);
        sb.append(", name=");
        pk0.w(this.c, ", proofs=", ", isActive=", sb, this.d);
        hq0.u(sb, this.e, ", isRenewable=", this.f, ", verification=");
        hq0.t(this.g, ", infoNote=", this.h, ", info=", sb);
        return vo1.p(sb, this.i, ")");
    }

    public ProductConfigCategoryAppModel(String id, Integer num, String str, List list, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3) {
        Intrinsics.i(id, "id");
        this.f8201a = id;
        this.b = num;
        this.c = str;
        this.d = list;
        this.e = bool;
        this.f = bool2;
        this.g = bool3;
        this.h = str2;
        this.i = str3;
    }
}
