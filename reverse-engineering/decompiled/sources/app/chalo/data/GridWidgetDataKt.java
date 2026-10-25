package app.chalo.data;

import app.chalo.providers.iconassetprovider.IconType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GridWidgetDataKt {
    public static final ArrayList a(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ChaloTextDataKt.b(((ChaloTextDataAppModel) it.next()).f));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ChaloTextDataKt.b(((ChaloTextWithBackgroundData) it.next()).h));
        }
        return arrayList;
    }

    public static final ChaloTextWithBackgroundData c(ChaloTextDataAppModel chaloTextDataAppModel, IconType iconType, IconType iconType2, BackgroundShape backgroundShape) {
        Intrinsics.i(chaloTextDataAppModel, "<this>");
        BackgroundAppModel backgroundAppModel = chaloTextDataAppModel.f2335a;
        return new ChaloTextWithBackgroundData(backgroundAppModel.f2311a, backgroundShape, backgroundAppModel.c, iconType2, chaloTextDataAppModel.c, iconType, chaloTextDataAppModel.e, chaloTextDataAppModel.f);
    }
}
