package defpackage;

import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.multimodalticket.ui.GroupTicketPassengerSelectionDataState;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewDataState;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19181a;
    public final /* synthetic */ Map b;

    public /* synthetic */ r60(int i, Map map) {
        this.f19181a = i;
        this.b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        Collection collectionValues;
        switch (this.f19181a) {
            case 0:
                GroupTicketLegSelectionDataState it = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it, "it");
                Map map = this.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), GroupTicketPassengerSelectionDataState.a((GroupTicketPassengerSelectionDataState) entry.getValue(), false, 0, false, false, 29));
                }
                return GroupTicketLegSelectionDataState.a(it, null, false, null, null, null, linkedHashMap, 0, null, 223);
            case 1:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, null, null, false, false, false, this.b, false, null, 1835007);
            case 2:
                StopTripPlannerResultsDataState it2 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it2, "it");
                return StopTripPlannerResultsDataState.a(it2, null, null, null, null, null, this.b, null, null, null, null, null, false, null, false, null, false, null, 524255);
            default:
                SuperPassProofOverviewDataState it3 = (SuperPassProofOverviewDataState) obj;
                Intrinsics.i(it3, "it");
                Map map2 = this.b;
                if (map2 == null || (collectionValues = map2.values()) == null) {
                    z = it3.k;
                } else {
                    Collection collection = collectionValues;
                    z = true;
                    if (!collection.isEmpty()) {
                        Iterator it4 = collection.iterator();
                        while (it4.hasNext()) {
                            if (((ProofUploadDetails) it4.next()).d != ProofUploadStatus.UPLOAD_SUCCESSFUL) {
                                z = false;
                            }
                        }
                    }
                }
                return SuperPassProofOverviewDataState.a(it3, false, false, false, null, false, null, null, null, map2, false, z, false, false, false, null, 31487);
        }
    }
}
