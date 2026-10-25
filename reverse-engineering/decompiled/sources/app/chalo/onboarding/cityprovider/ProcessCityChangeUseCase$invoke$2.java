package app.chalo.onboarding.cityprovider;

import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult;", "currentCity", "Lapp/chalo/providers/cityprovider/impl/data/models/app/CityAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase$invoke$2", f = "ProcessCityChangeUseCase.kt", l = {31, 32, 37}, m = "invokeSuspend", v = 1)
final class ProcessCityChangeUseCase$invoke$2 extends SuspendLambda implements Function3<FlowCollector<? super CityChangeProcessResult>, CityAppModel, Continuation<? super Unit>, Object> {
    final /* synthetic */ CityAppModel $cityBefore;
    final /* synthetic */ CityAppModel $selectedCity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ProcessCityChangeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCityChangeUseCase$invoke$2(ProcessCityChangeUseCase processCityChangeUseCase, CityAppModel cityAppModel, CityAppModel cityAppModel2, Continuation continuation) {
        super(3, continuation);
        this.$selectedCity = cityAppModel;
        this.this$0 = processCityChangeUseCase;
        this.$cityBefore = cityAppModel2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CityAppModel cityAppModel = this.$selectedCity;
        ProcessCityChangeUseCase$invoke$2 processCityChangeUseCase$invoke$2 = new ProcessCityChangeUseCase$invoke$2(this.this$0, cityAppModel, this.$cityBefore, (Continuation) obj3);
        processCityChangeUseCase$invoke$2.L$0 = (FlowCollector) obj;
        processCityChangeUseCase$invoke$2.L$1 = (CityAppModel) obj2;
        return processCityChangeUseCase$invoke$2.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[PHI: r1
      0x0072: PHI (r1v11 kotlinx.coroutines.flow.FlowCollector) = (r1v10 kotlinx.coroutines.flow.FlowCollector), (r1v15 kotlinx.coroutines.flow.FlowCollector) binds: [B:23:0x006f, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.b(r8)
            goto L84
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L72
        L25:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L56
        L2d:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            java.lang.Object r1 = r7.L$1
            app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r1 = (app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) r1
            app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r6 = r7.$selectedCity
            java.lang.String r6 = r6.f8854a
            if (r1 == 0) goto L41
            java.lang.String r1 = r1.f8854a
            goto L42
        L41:
            r1 = r5
        L42:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r6, r1)
            if (r1 == 0) goto L84
            r7.L$0 = r8
            r7.label = r4
            app.chalo.onboarding.cityprovider.CityChangeProcessResult$InProgress r1 = app.chalo.onboarding.cityprovider.CityChangeProcessResult.InProgress.f6607a
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L55
            goto L83
        L55:
            r1 = r8
        L56:
            app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase r8 = r7.this$0
            app.chalo.onboarding.cityprovider.PostCityChangeOperationExecutor r8 = r8.c
            app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r4 = r7.$selectedCity
            java.lang.String r4 = r4.f8854a
            app.chalo.onboarding.cityprovider.PostCityChangeOperation$Companion r6 = app.chalo.onboarding.cityprovider.PostCityChangeOperation.INSTANCE
            r6.getClass()
            kotlin.enums.EnumEntries r6 = app.chalo.onboarding.cityprovider.PostCityChangeOperation.getEntries()
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.b(r4, r6, r7)
            if (r8 != r0) goto L72
            goto L83
        L72:
            app.chalo.onboarding.cityprovider.CityChangeProcessResult$CityUpdated r8 = new app.chalo.onboarding.cityprovider.CityChangeProcessResult$CityUpdated
            app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r3 = r7.$selectedCity
            r8.<init>(r3)
            r7.L$0 = r5
            r7.label = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L84
        L83:
            return r0
        L84:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
