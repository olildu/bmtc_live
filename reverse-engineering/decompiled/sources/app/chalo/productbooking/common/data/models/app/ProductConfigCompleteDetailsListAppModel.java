package app.chalo.productbooking.common.data.models.app;

import defpackage.nx0;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigCompleteDetailsListAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductConfigCompleteDetailsListAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductConfigCompleteDetailsAppModel f8205a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigCompleteDetailsListAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigCompleteDetailsListAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductConfigCompleteDetailsListAppModel> serializer() {
            return ProductConfigCompleteDetailsListAppModel$$serializer.f8206a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new nx0(26)), LazyKt.a(lazyThreadSafetyMode, new nx0(27))};
    }

    public /* synthetic */ ProductConfigCompleteDetailsListAppModel(int i, ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel, List list, List list2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ProductConfigCompleteDetailsListAppModel$$serializer.f8206a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8205a = productConfigCompleteDetailsAppModel;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductConfigCompleteDetailsListAppModel)) {
            return false;
        }
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) obj;
        return Intrinsics.d(this.f8205a, productConfigCompleteDetailsListAppModel.f8205a) && Intrinsics.d(this.b, productConfigCompleteDetailsListAppModel.b) && Intrinsics.d(this.c, productConfigCompleteDetailsListAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f8205a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductConfigCompleteDetailsListAppModel(config=");
        sb.append(this.f8205a);
        sb.append(", displayProps=");
        sb.append(this.b);
        sb.append(", documentProps=");
        return xs.l(sb, this.c, ")");
    }

    public ProductConfigCompleteDetailsListAppModel(ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel, List displayProps, List documentProps) {
        Intrinsics.i(displayProps, "displayProps");
        Intrinsics.i(documentProps, "documentProps");
        this.f8205a = productConfigCompleteDetailsAppModel;
        this.b = displayProps;
        this.c = documentProps;
    }
}
