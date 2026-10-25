package app.chalo.livetracking.provider.tracking.model;

import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopLiveEtaAppModelKt {
    public static final StopLiveEtaUiModel a(StopLiveEtaAppModel stopLiveEtaAppModel, TimeUtilsContract timeUtilsContract) {
        Intrinsics.i(stopLiveEtaAppModel, "<this>");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        if (stopLiveEtaAppModel.equals(StopLiveEtaAppModel.AllBusPassed.f4371a)) {
            return StopLiveEtaUiModel.AllBusPassedStop.f4375a;
        }
        if (!(stopLiveEtaAppModel instanceof StopLiveEtaAppModel.EstimatedEta)) {
            if (!(stopLiveEtaAppModel instanceof StopLiveEtaAppModel.FixedEta)) {
                if (stopLiveEtaAppModel.equals(StopLiveEtaAppModel.NotAvailable.f4374a)) {
                    return StopLiveEtaUiModel.NotAvailable.f4377a;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<FixedEtaAppModel> list = ((StopLiveEtaAppModel.FixedEta) stopLiveEtaAppModel).f4373a;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (FixedEtaAppModel fixedEtaAppModel : list) {
                Intrinsics.i(fixedEtaAppModel, "<this>");
                arrayList.add(new FixedStopEtaUiModel(TrackingUtils.a(fixedEtaAppModel.f4367a, timeUtilsContract), fixedEtaAppModel.b, fixedEtaAppModel.c, fixedEtaAppModel.d));
            }
            return new StopLiveEtaUiModel.WithEtaAvailable.FixedEta(arrayList);
        }
        ArrayList arrayList2 = ((StopLiveEtaAppModel.EstimatedEta) stopLiveEtaAppModel).f4372a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            EstimatedEtaAppModel estimatedEtaAppModel = (EstimatedEtaAppModel) obj;
            Intrinsics.i(estimatedEtaAppModel, "<this>");
            arrayList3.add(new EstimatedStopEtaUiModel(TrackingUtils.a(estimatedEtaAppModel.f4365a, timeUtilsContract), TrackingUtils.a(estimatedEtaAppModel.b, timeUtilsContract), estimatedEtaAppModel.d, estimatedEtaAppModel.c));
        }
        return new StopLiveEtaUiModel.WithEtaAvailable.EstimatedEta(arrayList3);
    }
}
