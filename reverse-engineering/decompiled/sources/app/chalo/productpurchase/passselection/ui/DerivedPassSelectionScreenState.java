package app.chalo.productpurchase.passselection.ui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/DerivedPassSelectionScreenState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DerivedPassSelectionScreenState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8524a;
    public final LinkedHashMap b;
    public final PassSelectionScreenType c;

    public DerivedPassSelectionScreenState(HashMap map, LinkedHashMap linkedHashMap, PassSelectionScreenType passSelectionScreenType) {
        this.f8524a = map;
        this.b = linkedHashMap;
        this.c = passSelectionScreenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedPassSelectionScreenState)) {
            return false;
        }
        DerivedPassSelectionScreenState derivedPassSelectionScreenState = (DerivedPassSelectionScreenState) obj;
        return this.f8524a.equals(derivedPassSelectionScreenState.f8524a) && this.b.equals(derivedPassSelectionScreenState.b) && this.c.equals(derivedPassSelectionScreenState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f8524a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DerivedPassSelectionScreenState(masterBookablePassConfigMap=" + this.f8524a + ", sortedCategoryIdCategoryMap=" + this.b + ", screenType=" + this.c + ")";
    }
}
