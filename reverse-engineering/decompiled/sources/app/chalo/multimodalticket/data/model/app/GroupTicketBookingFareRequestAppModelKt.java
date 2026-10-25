package app.chalo.multimodalticket.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketStopDetailsApiModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketBookingFareRequestAppModelKt {
    public static final GroupTicketStopDetailsApiModel a(StopAppModel stopAppModel) {
        Intrinsics.i(stopAppModel, "<this>");
        String str = stopAppModel.f1727a;
        String str2 = stopAppModel.b;
        String str3 = stopAppModel.f;
        if (str3 == null || str3.length() <= 0) {
            str3 = null;
        }
        return new GroupTicketStopDetailsApiModel(str, str2, str3);
    }
}
