package app.chalo.usecase;

import app.chalo.features.productsync.model.app.HistoryResponseAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/features/productsync/model/app/HistoryResponseAppModel;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$makeHistoryCall$1", f = "InitiateProductHistorySyncCallUseCase.kt", l = {ModuleDescriptor.MODULE_VERSION, 183}, m = "invokeSuspend", v = 1)
final class InitiateProductHistorySyncCallUseCase$makeHistoryCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<HistoryResponseAppModel, Exception>>, Object> {
    final /* synthetic */ String $cityName;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateProductHistorySyncCallUseCase$makeHistoryCall$1(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initiateProductHistorySyncCallUseCase;
        this.$cityName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitiateProductHistorySyncCallUseCase$makeHistoryCall$1(this.this$0, this.$cityName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InitiateProductHistorySyncCallUseCase$makeHistoryCall$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Exception {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L10
            goto L5c
        L10:
            r6 = move-exception
            goto L64
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r5.L$0
            app.chalo.productdatasync.repository.IProductDataSyncRepository r3 = (app.chalo.productdatasync.repository.IProductDataSyncRepository) r3
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L10
            goto L40
        L26:
            kotlin.ResultKt.b(r6)
            app.chalo.usecase.InitiateProductHistorySyncCallUseCase r6 = r5.this$0     // Catch: java.lang.Exception -> L10
            app.chalo.productdatasync.repository.IProductDataSyncRepository r1 = r6.f10202a     // Catch: java.lang.Exception -> L10
            java.lang.String r4 = r5.$cityName     // Catch: java.lang.Exception -> L10
            app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase r6 = r6.n     // Catch: java.lang.Exception -> L10
            r5.L$0 = r1     // Catch: java.lang.Exception -> L10
            r5.L$1 = r4     // Catch: java.lang.Exception -> L10
            r5.label = r3     // Catch: java.lang.Exception -> L10
            java.lang.Object r6 = r6.a(r5)     // Catch: java.lang.Exception -> L10
            if (r6 != r0) goto L3e
            goto L5b
        L3e:
            r3 = r1
            r1 = r4
        L40:
            app.chalo.data.PremiumBusNativeCityWiseConfigAppModel r6 = (app.chalo.data.PremiumBusNativeCityWiseConfigAppModel) r6     // Catch: java.lang.Exception -> L10
            app.chalo.usecase.InitiateProductHistorySyncCallUseCase r4 = r5.this$0     // Catch: java.lang.Exception -> L10
            app.chalo.contract.BasicInfoContract r4 = r4.c     // Catch: java.lang.Exception -> L10
            int r4 = r4.h()     // Catch: java.lang.Exception -> L10
            boolean r6 = r6.a(r4)     // Catch: java.lang.Exception -> L10
            r4 = 0
            r5.L$0 = r4     // Catch: java.lang.Exception -> L10
            r5.L$1 = r4     // Catch: java.lang.Exception -> L10
            r5.label = r2     // Catch: java.lang.Exception -> L10
            java.lang.Object r6 = r3.a(r1, r5, r6)     // Catch: java.lang.Exception -> L10
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            app.chalo.features.productsync.model.app.HistoryResponseAppModel r6 = (app.chalo.features.productsync.model.app.HistoryResponseAppModel) r6     // Catch: java.lang.Exception -> L10
            app.chalo.utils.ChaloUseCaseResult$Success r0 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: java.lang.Exception -> L10
            r0.<init>(r6)     // Catch: java.lang.Exception -> L10
            return r0
        L64:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L6e
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r0.<init>(r6)
            return r0
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$makeHistoryCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
