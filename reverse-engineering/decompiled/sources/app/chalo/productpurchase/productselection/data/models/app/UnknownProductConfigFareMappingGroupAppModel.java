package app.chalo.productpurchase.productselection.data.models.app;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/UnknownProductConfigFareMappingGroupAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnknownProductConfigFareMappingGroupAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8649a;
    public final ArrayList b;

    public UnknownProductConfigFareMappingGroupAppModel(String categoryId, ArrayList arrayList) {
        Intrinsics.i(categoryId, "categoryId");
        this.f8649a = categoryId;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductConfigFareMappingGroupAppModel)) {
            return false;
        }
        UnknownProductConfigFareMappingGroupAppModel unknownProductConfigFareMappingGroupAppModel = (UnknownProductConfigFareMappingGroupAppModel) obj;
        return Intrinsics.d(this.f8649a, unknownProductConfigFareMappingGroupAppModel.f8649a) && this.b.equals(unknownProductConfigFareMappingGroupAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8649a.hashCode() * 31);
    }

    public final String toString() {
        return "UnknownProductConfigFareMappingGroupAppModel(categoryId=" + this.f8649a + ", mappings=" + this.b + ")";
    }
}
