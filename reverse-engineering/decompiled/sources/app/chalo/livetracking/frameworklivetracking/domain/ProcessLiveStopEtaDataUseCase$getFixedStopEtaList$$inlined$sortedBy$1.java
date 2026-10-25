package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketEtaResponseAppModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ProcessLiveStopEtaDataUseCase$getFixedStopEtaList$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Long.valueOf(((RealtimeSocketEtaResponseAppModel) obj).b), Long.valueOf(((RealtimeSocketEtaResponseAppModel) obj2).b));
    }
}
