package app.chalo.ridefeedback.domain;

import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/DismissRideFeedbackPromptUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DismissRideFeedbackPromptUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9076a;

    public DismissRideFeedbackPromptUseCase(RideFeedbackRepository rideFeedbackRepository) {
        this.f9076a = rideFeedbackRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ArrayList arrayList, ContinuationImpl continuationImpl) {
        DismissRideFeedbackPromptUseCase$invoke$1 dismissRideFeedbackPromptUseCase$invoke$1;
        String str3;
        String str4;
        Iterator it;
        if (continuationImpl instanceof DismissRideFeedbackPromptUseCase$invoke$1) {
            dismissRideFeedbackPromptUseCase$invoke$1 = (DismissRideFeedbackPromptUseCase$invoke$1) continuationImpl;
            int i = dismissRideFeedbackPromptUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dismissRideFeedbackPromptUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                dismissRideFeedbackPromptUseCase$invoke$1 = new DismissRideFeedbackPromptUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            dismissRideFeedbackPromptUseCase$invoke$1 = new DismissRideFeedbackPromptUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = dismissRideFeedbackPromptUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dismissRideFeedbackPromptUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            str3 = str;
            str4 = str2;
            it = CollectionsKt.z(arrayList).iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) dismissRideFeedbackPromptUseCase$invoke$1.L$2;
            String str5 = (String) dismissRideFeedbackPromptUseCase$invoke$1.L$1;
            String str6 = (String) dismissRideFeedbackPromptUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            str4 = str5;
            str3 = str6;
        }
        DismissRideFeedbackPromptUseCase$invoke$1 dismissRideFeedbackPromptUseCase$invoke$2 = dismissRideFeedbackPromptUseCase$invoke$1;
        while (it.hasNext()) {
            String str7 = (String) it.next();
            RideFeedbackFillStatus rideFeedbackFillStatus = RideFeedbackFillStatus.DISMISSED;
            dismissRideFeedbackPromptUseCase$invoke$2.L$0 = str3;
            dismissRideFeedbackPromptUseCase$invoke$2.L$1 = str4;
            dismissRideFeedbackPromptUseCase$invoke$2.L$2 = it;
            dismissRideFeedbackPromptUseCase$invoke$2.label = 1;
            if (this.f9076a.c(str7, rideFeedbackFillStatus, str3, str4, dismissRideFeedbackPromptUseCase$invoke$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
