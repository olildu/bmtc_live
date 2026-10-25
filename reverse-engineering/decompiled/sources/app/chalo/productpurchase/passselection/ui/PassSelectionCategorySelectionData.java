package app.chalo.productpurchase.passselection.ui;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productpurchase.passselection.ui.PassSelectionCategorySelectionData;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionCategorySelectionData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassSelectionCategorySelectionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassProductConfigCategoryResponseAppModel f8531a;
    public final List b;
    public final Lazy c;
    public final Lazy d;

    public PassSelectionCategorySelectionData(SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel, List relevantBookableConfigList) {
        Intrinsics.i(relevantBookableConfigList, "relevantBookableConfigList");
        this.f8531a = superPassProductConfigCategoryResponseAppModel;
        this.b = relevantBookableConfigList;
        final int i = 0;
        this.c = LazyKt.b(new Function0(this) { // from class: mp0
            public final /* synthetic */ PassSelectionCategorySelectionData b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        List list = this.b.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((BookableSuperPassConfiguration) obj).c()) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    default:
                        List list2 = this.b.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!((BookableSuperPassConfiguration) obj2).c()) {
                                arrayList2.add(obj2);
                            }
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.d = LazyKt.b(new Function0(this) { // from class: mp0
            public final /* synthetic */ PassSelectionCategorySelectionData b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List list = this.b.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((BookableSuperPassConfiguration) obj).c()) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    default:
                        List list2 = this.b.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!((BookableSuperPassConfiguration) obj2).c()) {
                                arrayList2.add(obj2);
                            }
                        }
                        return arrayList2;
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSelectionCategorySelectionData)) {
            return false;
        }
        PassSelectionCategorySelectionData passSelectionCategorySelectionData = (PassSelectionCategorySelectionData) obj;
        return Intrinsics.d(this.f8531a, passSelectionCategorySelectionData.f8531a) && Intrinsics.d(this.b, passSelectionCategorySelectionData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8531a.hashCode() * 31);
    }

    public final String toString() {
        return "PassSelectionCategorySelectionData(category=" + this.f8531a + ", relevantBookableConfigList=" + this.b + ")";
    }
}
