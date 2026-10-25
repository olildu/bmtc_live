package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.reportproblem.ReportProblemFeatureData;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.legacy.RegularBusValidationScreen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleReportProblemIntent$1", f = "MultiProductValidationComponent.kt", l = {456, 459}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$handleReportProblemIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$handleReportProblemIntent$1(MultiProductValidationComponent multiProductValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$handleReportProblemIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$handleReportProblemIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MultiProductValidationData multiProductValidationData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            multiProductValidationData = ((MultiProductValidationDataState) this.this$0.f.getValue()).f10691a;
            if (multiProductValidationData != null) {
                ProductValidationAnalyticManager productValidationAnalyticManagerG0 = MultiProductValidationComponent.G0(this.this$0);
                this.L$0 = multiProductValidationData;
                this.label = 1;
                if (productValidationAnalyticManagerG0.G(multiProductValidationData, this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        multiProductValidationData = (MultiProductValidationData) this.L$0;
        ResultKt.b(obj);
        ReportProblemFeatureData reportProblemFeatureDataA = this.this$0.M0().getE().a(multiProductValidationData, RegularBusValidationScreen.QR_SCREEN);
        IReportProblemFeature iReportProblemFeature = this.this$0.p;
        this.L$0 = null;
        this.label = 2;
        return iReportProblemFeature.g(reportProblemFeatureDataA, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
