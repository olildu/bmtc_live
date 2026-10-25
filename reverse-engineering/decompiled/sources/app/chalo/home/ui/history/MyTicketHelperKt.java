package app.chalo.home.ui.history;

import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.GridWidgetDataKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyTicketHelperKt {
    public static final ChaloTextWithBackgroundData a(ChaloTextDataAppModel chaloTextDataAppModel) {
        if (chaloTextDataAppModel == null) {
            return new ChaloTextWithBackgroundData();
        }
        return GridWidgetDataKt.c(chaloTextDataAppModel, chaloTextDataAppModel.d, chaloTextDataAppModel.b, chaloTextDataAppModel.f2335a.b.getShape());
    }
}
