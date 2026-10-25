package app.chalo.home.domain;

import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/HomeDestinationTabType/DestinationTabType;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.GetHomeScreenStartDestinationTabUseCase$invoke$2", f = "GetHomeScreenStartDestinationTabUseCase.kt", l = {23}, m = "invokeSuspend", v = 1)
final class GetHomeScreenStartDestinationTabUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DestinationTabType>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GetHomeScreenStartDestinationTabUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHomeScreenStartDestinationTabUseCase$invoke$2(GetHomeScreenStartDestinationTabUseCase getHomeScreenStartDestinationTabUseCase, Continuation continuation) {
        super(2, continuation);
        this.this$0 = getHomeScreenStartDestinationTabUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetHomeScreenStartDestinationTabUseCase$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GetHomeScreenStartDestinationTabUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            String str2 = (String) this.this$0.c.d().get("[Adjust]Campaign");
            GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase = this.this$0.b;
            this.L$0 = str2;
            this.label = 1;
            Object objA = getMiscellaneousCityWiseFlagsConfigUseCase.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        String str3 = (String) ((MiscellaneousCityWiseConfigForCity) obj).k.get(str);
        if (str3 == null) {
            return null;
        }
        DestinationTabType.INSTANCE.getClass();
        return DestinationTabType.Companion.a(str3);
    }
}
