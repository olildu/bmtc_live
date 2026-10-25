package app.chalo.reportproblem;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.home.data.model.app.response.AutoLinkDeviceIdResponseAppModel;
import app.chalo.home.domain.AutoLinkDeviceIdUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.g11;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.reportproblem.ReportProblemComponent$handleReclaimRequestDialogPositiveBtnClicked$2", f = "ReportProblemComponent.kt", l = {140, 148, 154}, m = "invokeSuspend", v = 1)
final class ReportProblemComponent$handleReclaimRequestDialogPositiveBtnClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ReportProblemComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportProblemComponent$handleReclaimRequestDialogPositiveBtnClicked$2(ReportProblemComponent reportProblemComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = reportProblemComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReportProblemComponent$handleReclaimRequestDialogPositiveBtnClicked$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReportProblemComponent$handleReclaimRequestDialogPositiveBtnClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        ChaloUseCaseResult chaloUseCaseResult2;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AutoLinkDeviceIdUseCase autoLinkDeviceIdUseCase = this.this$0.l;
            this.label = 1;
            obj = autoLinkDeviceIdUseCase.b(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.SHORT);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
            chaloUseCaseResult = chaloUseCaseResult2;
            this.this$0.E0(new vw0(chaloUseCaseResult, 26));
            ReportProblemComponent reportProblemComponent = this.this$0;
            AnalyticsContract.DefaultImpls.a(reportProblemComponent.p, "auto reclaim passes response", "ReportProblemFeature", MapsKt.h(new Pair("isDeviceAutoLinked", Boolean.valueOf(((ReportProblemDataState) reportProblemComponent.f.getValue()).h))), null, false, 24);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((AutoLinkDeviceIdResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f2949a) {
                InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0.q;
                this.L$0 = chaloUseCaseResult;
                this.label = 3;
                if (InitiateProductHistorySyncCallUseCase.h(initiateProductHistorySyncCallUseCase, null, false, this, 3) != coroutineSingletons) {
                    chaloUseCaseResult2 = chaloUseCaseResult;
                    chaloUseCaseResult = chaloUseCaseResult2;
                }
            }
            this.this$0.E0(new vw0(chaloUseCaseResult, 26));
            ReportProblemComponent reportProblemComponent2 = this.this$0;
            AnalyticsContract.DefaultImpls.a(reportProblemComponent2.p, "auto reclaim passes response", "ReportProblemFeature", MapsKt.h(new Pair("isDeviceAutoLinked", Boolean.valueOf(((ReportProblemDataState) reportProblemComponent2.f.getValue()).h))), null, false, 24);
            return Unit.f17538a;
        }
        this.this$0.E0(new g11(18));
        ReportProblemComponent reportProblemComponent3 = this.this$0;
        KotlinToastManager kotlinToastManager2 = reportProblemComponent3.o;
        this.L$0 = kotlinToastManager2;
        this.label = 2;
        obj = reportProblemComponent3.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
        if (obj != coroutineSingletons) {
            kotlinToastManager = kotlinToastManager2;
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.SHORT);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
