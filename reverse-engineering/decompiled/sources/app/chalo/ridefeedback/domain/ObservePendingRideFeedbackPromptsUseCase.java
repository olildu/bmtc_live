package app.chalo.ridefeedback.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/ObservePendingRideFeedbackPromptsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObservePendingRideFeedbackPromptsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9080a;
    public final BasicInfoContract b;

    public ObservePendingRideFeedbackPromptsUseCase(RideFeedbackRepository rideFeedbackRepository, BasicInfoContract basicInfoContract) {
        this.f9080a = rideFeedbackRepository;
        this.b = basicInfoContract;
    }
}
