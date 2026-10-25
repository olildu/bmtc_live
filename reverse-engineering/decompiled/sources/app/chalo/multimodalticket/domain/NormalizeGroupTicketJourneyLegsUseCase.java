package app.chalo.multimodalticket.domain;

import app.chalo.providers.CoroutineContextProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/domain/NormalizeGroupTicketJourneyLegsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NormalizeGroupTicketJourneyLegsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f5899a;

    public NormalizeGroupTicketJourneyLegsUseCase(CoroutineContextProvider coroutineContextProvider) {
        this.f5899a = coroutineContextProvider;
    }

    public final Object a(List list, Continuation continuation) {
        return BuildersKt.g(this.f5899a.getDefault(), new NormalizeGroupTicketJourneyLegsUseCase$invoke$2(list, this, null), continuation);
    }
}
