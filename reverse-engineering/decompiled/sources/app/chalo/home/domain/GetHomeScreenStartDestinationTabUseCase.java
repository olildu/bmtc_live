package app.chalo.home.domain;

import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetHomeScreenStartDestinationTabUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetHomeScreenStartDestinationTabUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f3039a;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase b;
    public final AdjustManager c;

    public GetHomeScreenStartDestinationTabUseCase(CoroutineContextProvider coroutineContextProvider, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, AdjustManager adjustManager) {
        this.f3039a = coroutineContextProvider;
        this.b = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.c = adjustManager;
    }

    public final Object a(DestinationTabType destinationTabType, Continuation continuation) {
        return destinationTabType != null ? destinationTabType : BuildersKt.g(this.f3039a.b(), new GetHomeScreenStartDestinationTabUseCase$invoke$2(this, null), continuation);
    }
}
