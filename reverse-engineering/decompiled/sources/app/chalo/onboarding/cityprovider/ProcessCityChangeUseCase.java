package app.chalo.onboarding.cityprovider;

import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/ProcessCityChangeUseCase;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessCityChangeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f6614a;
    public final CityChangeOperationTracker b;
    public final PostCityChangeOperationExecutor c;

    public ProcessCityChangeUseCase(CityProvider cityProvider, CityChangeOperationTracker cityChangeOperationTracker, PostCityChangeOperationExecutor postCityChangeOperationExecutor) {
        this.f6614a = cityProvider;
        this.b = cityChangeOperationTracker;
        this.c = postCityChangeOperationExecutor;
    }

    public final ChannelFlowTransformLatest a(CityAppModel selectedCity) {
        Intrinsics.i(selectedCity, "selectedCity");
        CityProvider cityProvider = this.f6614a;
        CityAppModel cityAppModel = (CityAppModel) cityProvider.getE().getValue();
        return FlowKt.H(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(cityProvider.getE(), new ProcessCityChangeUseCase$invoke$1(this, cityAppModel, selectedCity, null)), new ProcessCityChangeUseCase$invoke$2(this, selectedCity, cityAppModel, null));
    }
}
