package app.chalo.ticketvalidation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketValidationInfoKt {
    public static final ArrayList a(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TicketValidationInfo) obj).f9624a == TicketValidationType.QR_CODE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
