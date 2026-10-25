package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/AllProductConfigsResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AllProductConfigsResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8629a;
    public final List b;
    public final List c;

    public AllProductConfigsResponseAppModel(List list, List list2, List documentProps) {
        Intrinsics.i(documentProps, "documentProps");
        this.f8629a = list;
        this.b = list2;
        this.c = documentProps;
    }

    public static AllProductConfigsResponseAppModel a(AllProductConfigsResponseAppModel allProductConfigsResponseAppModel, ArrayList arrayList) {
        List list = allProductConfigsResponseAppModel.b;
        List documentProps = allProductConfigsResponseAppModel.c;
        Intrinsics.i(documentProps, "documentProps");
        return new AllProductConfigsResponseAppModel(arrayList, list, documentProps);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllProductConfigsResponseAppModel)) {
            return false;
        }
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel = (AllProductConfigsResponseAppModel) obj;
        return Intrinsics.d(this.f8629a, allProductConfigsResponseAppModel.f8629a) && Intrinsics.d(this.b, allProductConfigsResponseAppModel.b) && Intrinsics.d(this.c, allProductConfigsResponseAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f8629a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllProductConfigsResponseAppModel(products=");
        sb.append(this.f8629a);
        sb.append(", displayProps=");
        sb.append(this.b);
        sb.append(", documentProps=");
        return xs.l(sb, this.c, ")");
    }
}
