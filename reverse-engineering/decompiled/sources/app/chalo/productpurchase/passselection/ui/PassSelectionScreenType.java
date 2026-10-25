package app.chalo.productpurchase.passselection.ui;

import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import defpackage.d;
import defpackage.kn0;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType;", "", "SubCategorySelection", "PassSelection", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType$PassSelection;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType$SubCategorySelection;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassSelectionScreenType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType$PassSelection;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassSelection extends PassSelectionScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8546a;
        public final Map b;
        public final Map c;
        public final SuperPassProductConfigSubCategoryResponseAppModel d;
        public final String e;
        public final Lazy f;

        public PassSelection(String selectedSubCatId, Map map, Map map2, SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel, String str) {
            Intrinsics.i(selectedSubCatId, "selectedSubCatId");
            this.f8546a = selectedSubCatId;
            this.b = map;
            this.c = map2;
            this.d = superPassProductConfigSubCategoryResponseAppModel;
            this.e = str;
            this.f = LazyKt.b(new kn0(this, 6));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassSelection)) {
                return false;
            }
            PassSelection passSelection = (PassSelection) obj;
            return Intrinsics.d(this.f8546a, passSelection.f8546a) && Intrinsics.d(this.b, passSelection.b) && Intrinsics.d(this.c, passSelection.c) && Intrinsics.d(this.d, passSelection.d) && Intrinsics.d(this.e, passSelection.e);
        }

        public final int hashCode() {
            int iF = d.f(this.c, d.f(this.b, this.f8546a.hashCode() * 31, 31), 31);
            SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel = this.d;
            int iHashCode = (iF + (superPassProductConfigSubCategoryResponseAppModel == null ? 0 : superPassProductConfigSubCategoryResponseAppModel.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PassSelection(selectedSubCatId=");
            sb.append(this.f8546a);
            sb.append(", relevantBookablePassConfigMap=");
            sb.append(this.b);
            sb.append(", sortedCategoryIdCategoryMap=");
            sb.append(this.c);
            sb.append(", productSubCategory=");
            sb.append(this.d);
            sb.append(", productSocialValidationUrl=");
            return vo1.p(sb, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType$SubCategorySelection;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubCategorySelection extends PassSelectionScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f8547a;

        public SubCategorySelection(LinkedHashMap linkedHashMap) {
            this.f8547a = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubCategorySelection) && this.f8547a.equals(((SubCategorySelection) obj).f8547a);
        }

        public final int hashCode() {
            return this.f8547a.hashCode();
        }

        public final String toString() {
            return "SubCategorySelection(visibleProductSubCategoryMap=" + this.f8547a + ")";
        }
    }
}
