package app.chalo.productbooking.common.data.models.api.response;

import defpackage.nx0;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCompleteDetailsListApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigCompleteDetailsListApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductConfigCompleteDetailsApiResponseModel f8153a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCompleteDetailsListApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCompleteDetailsListApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigCompleteDetailsListApiResponseModel> serializer() {
            return ProductConfigCompleteDetailsListApiResponseModel$$serializer.f8154a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new nx0(24)), LazyKt.a(lazyThreadSafetyMode, new nx0(25))};
    }

    public /* synthetic */ ProductConfigCompleteDetailsListApiResponseModel(int i, ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel, List list, List list2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ProductConfigCompleteDetailsListApiResponseModel$$serializer.f8154a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8153a = productConfigCompleteDetailsApiResponseModel;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigCompleteDetailsListApiResponseModel)) {
            return false;
        }
        ProductConfigCompleteDetailsListApiResponseModel productConfigCompleteDetailsListApiResponseModel = (ProductConfigCompleteDetailsListApiResponseModel) obj;
        return Intrinsics.d(this.f8153a, productConfigCompleteDetailsListApiResponseModel.f8153a) && Intrinsics.d(this.b, productConfigCompleteDetailsListApiResponseModel.b) && Intrinsics.d(this.c, productConfigCompleteDetailsListApiResponseModel.c);
    }

    public final int hashCode() {
        ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = this.f8153a;
        int iHashCode = (productConfigCompleteDetailsApiResponseModel == null ? 0 : productConfigCompleteDetailsApiResponseModel.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductConfigCompleteDetailsListApiResponseModel(config=");
        sb.append(this.f8153a);
        sb.append(", displayProps=");
        sb.append(this.b);
        sb.append(", documentProps=");
        return xs.l(sb, this.c, ")");
    }

    public ProductConfigCompleteDetailsListApiResponseModel(ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel, ArrayList arrayList, ArrayList arrayList2) {
        this.f8153a = productConfigCompleteDetailsApiResponseModel;
        this.b = arrayList;
        this.c = arrayList2;
    }
}
