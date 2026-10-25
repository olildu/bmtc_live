package app.chalo.multimodalticket.validation;

import app.chalo.multimodalticket.data.model.MultiModalGroupTicketPassengerDetails;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import defpackage.gd0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationModelKt {
    public static final MultiModalGroupTicketValidationModel a(MultiModalGroupTicketAppModel multiModalGroupTicketAppModel) {
        String str = multiModalGroupTicketAppModel.c;
        String str2 = multiModalGroupTicketAppModel.d;
        String str3 = multiModalGroupTicketAppModel.f5874a;
        int i = (int) multiModalGroupTicketAppModel.f;
        long j = multiModalGroupTicketAppModel.k;
        String str4 = multiModalGroupTicketAppModel.b;
        MultiModalGroupTicketStatus multiModalGroupTicketStatus = multiModalGroupTicketAppModel.g;
        List<MultiModalGroupTicketPassengerDetails> list = multiModalGroupTicketAppModel.n;
        int iG = MapsKt.g(CollectionsKt.v(list, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (MultiModalGroupTicketPassengerDetails multiModalGroupTicketPassengerDetails : list) {
            Pair pair = new Pair(multiModalGroupTicketPassengerDetails.b, Integer.valueOf(multiModalGroupTicketPassengerDetails.c));
            linkedHashMap.put(pair.d(), pair.e());
        }
        return new MultiModalGroupTicketValidationModel(str, str2, str3, i, j, str4, multiModalGroupTicketStatus, new gd0(multiModalGroupTicketAppModel, 18), linkedHashMap);
    }
}
