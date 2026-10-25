package app.chalo.productbooking.pickroutelocation;

import app.chalo.instantticket.domain.FetchRouteDetailsLiveUseCase;
import app.chalo.livetracking.universalsearch.domain.AutoCompleteSearchFilter;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.ir0;
import defpackage.yg;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent$handleRouteSearchedIntent$3", f = "PickRouteLocationComponent.kt", l = {148, 150}, m = "invokeSuspend", v = 1)
final class PickRouteLocationComponent$handleRouteSearchedIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PickRouteLocationIntent.RouteSearchedIntent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PickRouteLocationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickRouteLocationComponent$handleRouteSearchedIntent$3(PickRouteLocationComponent pickRouteLocationComponent, PickRouteLocationIntent.RouteSearchedIntent routeSearchedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pickRouteLocationComponent;
        this.$intent = routeSearchedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickRouteLocationComponent$handleRouteSearchedIntent$3 pickRouteLocationComponent$handleRouteSearchedIntent$3 = new PickRouteLocationComponent$handleRouteSearchedIntent$3(this.this$0, this.$intent, continuation);
        pickRouteLocationComponent$handleRouteSearchedIntent$3.L$0 = obj;
        return pickRouteLocationComponent$handleRouteSearchedIntent$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PickRouteLocationComponent$handleRouteSearchedIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        ChaloUseCaseResult chaloUseCaseResult;
        boolean zEquals;
        Unit unit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.b(300L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            coroutineScope = coroutineScope3;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        CoroutineScopeKt.d(coroutineScope2);
        zEquals = ((PickRouteLocationDataState) this.this$0.f.getValue()).f.equals(this.$intent.f8283a);
        unit = Unit.f17538a;
        if (!zEquals) {
            return unit;
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            this.this$0.E0(new ir0(20));
            return unit;
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 15));
        return unit;
        CoroutineScopeKt.d(coroutineScope);
        PickRouteLocationComponent pickRouteLocationComponent = this.this$0;
        FetchRouteDetailsLiveUseCase fetchRouteDetailsLiveUseCase = pickRouteLocationComponent.l;
        String str = this.$intent.f8283a;
        AutoCompleteSearchFilter autoCompleteSearchFilter = AutoCompleteSearchFilter.ROUTES;
        boolean z = ((PickRouteLocationDataState) pickRouteLocationComponent.f.getValue()).i;
        this.L$0 = coroutineScope;
        this.label = 2;
        Object objA = fetchRouteDetailsLiveUseCase.a(str, autoCompleteSearchFilter, z, this);
        if (objA != coroutineSingletons) {
            coroutineScope2 = coroutineScope;
            obj = objA;
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            CoroutineScopeKt.d(coroutineScope2);
            zEquals = ((PickRouteLocationDataState) this.this$0.f.getValue()).f.equals(this.$intent.f8283a);
            unit = Unit.f17538a;
            if (!zEquals) {
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                this.this$0.E0(new ir0(20));
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 15));
            return unit;
        }
        return coroutineSingletons;
    }
}
