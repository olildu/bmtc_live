package app.chalo.home.ui.chalobus;

import app.chalo.homescreen.data.model.app.ChaloBusPageSectionType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewState;", "ChaloBusDataState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusContractKt {
    public static final ChaloBusPageFeature a(ChaloBusPageSectionType chaloBusPageSectionType) {
        ChaloBusPageFeature next;
        Intrinsics.i(chaloBusPageSectionType, "<this>");
        Iterator<ChaloBusPageFeature> it = ChaloBusPageFeature.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.getFeatureType(), chaloBusPageSectionType.getSectionType()));
        ChaloBusPageFeature chaloBusPageFeature = next;
        return chaloBusPageFeature == null ? ChaloBusPageFeature.UNKNOWN : chaloBusPageFeature;
    }
}
