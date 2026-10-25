package app.chalo.models.productbooking.productcapability;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/ProductCapabilitiesApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductCapabilitiesApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final ProductCapabilitiesApiModel g = new ProductCapabilitiesApiModel(new CapabilitiesApiModel(BookingFlowType.ROUTE_BASED.getFlowType(), EmptyList.f17557a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5675a;
    public final String b;
    public final String c;
    public final String d;
    public final CapabilitiesApiModel e;
    public final OperationalHoursApiModel f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/ProductCapabilitiesApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/productbooking/productcapability/ProductCapabilitiesApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductCapabilitiesApiModel> serializer() {
            return ProductCapabilitiesApiModel$$serializer.f5676a;
        }
    }

    public /* synthetic */ ProductCapabilitiesApiModel(int i, String str, String str2, String str3, String str4, CapabilitiesApiModel capabilitiesApiModel, OperationalHoursApiModel operationalHoursApiModel) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(ProductCapabilitiesApiModel$$serializer.f5676a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5675a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = capabilitiesApiModel;
        this.f = operationalHoursApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCapabilitiesApiModel)) {
            return false;
        }
        ProductCapabilitiesApiModel productCapabilitiesApiModel = (ProductCapabilitiesApiModel) obj;
        return Intrinsics.d(this.f5675a, productCapabilitiesApiModel.f5675a) && Intrinsics.d(this.b, productCapabilitiesApiModel.b) && Intrinsics.d(this.c, productCapabilitiesApiModel.c) && Intrinsics.d(this.d, productCapabilitiesApiModel.d) && Intrinsics.d(this.e, productCapabilitiesApiModel.e) && Intrinsics.d(this.f, productCapabilitiesApiModel.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f5675a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        OperationalHoursApiModel operationalHoursApiModel = this.f;
        return iHashCode + (operationalHoursApiModel == null ? 0 : operationalHoursApiModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductCapabilitiesApiModel(city=", this.f5675a, ", productType=", this.b, ", productSubType=");
        cb0.t(sbE, this.c, ", agency=", this.d, ", capabilities=");
        sbE.append(this.e);
        sbE.append(", operationalHours=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public ProductCapabilitiesApiModel(CapabilitiesApiModel capabilitiesApiModel) {
        this.f5675a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = capabilitiesApiModel;
        this.f = null;
    }
}
