package app.chalo.home.ui.regularbus;

import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.homescreen.data.model.app.RegularBusPageSectionType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewState;", "RegularBusDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusContractKt {
    public static final RegularBusPageFeature a(RegularBusPageSectionType regularBusPageSectionType) {
        RegularBusPageFeature next;
        Intrinsics.i(regularBusPageSectionType, "<this>");
        Iterator<RegularBusPageFeature> it = RegularBusPageFeature.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.getFeatureType(), regularBusPageSectionType.getSectionType()));
        RegularBusPageFeature regularBusPageFeature = next;
        return regularBusPageFeature == null ? RegularBusPageFeature.UNKNOWN : regularBusPageFeature;
    }
}
