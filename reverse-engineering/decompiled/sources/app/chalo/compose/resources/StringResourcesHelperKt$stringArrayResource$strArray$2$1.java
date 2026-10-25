package app.chalo.compose.resources;

import androidx.compose.runtime.MutableState;
import app.chalo.providers.stringprovider.StringArrayEnum;
import app.chalo.providers.stringprovider.StringProvider;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.resources.StringResourcesHelperKt$stringArrayResource$strArray$2$1", f = "StringResourcesHelper.kt", l = {47}, m = "invokeSuspend", v = 1)
final class StringResourcesHelperKt$stringArrayResource$strArray$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<String>> $state;
    final /* synthetic */ StringArrayEnum $stringArrayEnum;
    final /* synthetic */ StringProvider $stringProvider;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringResourcesHelperKt$stringArrayResource$strArray$2$1(MutableState mutableState, StringProvider stringProvider, StringArrayEnum stringArrayEnum, Continuation continuation) {
        super(2, continuation);
        this.$state = mutableState;
        this.$stringProvider = stringProvider;
        this.$stringArrayEnum = stringArrayEnum;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StringResourcesHelperKt$stringArrayResource$strArray$2$1(this.$state, this.$stringProvider, this.$stringArrayEnum, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StringResourcesHelperKt$stringArrayResource$strArray$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MutableState<List<String>> mutableState2 = this.$state;
            StringProvider stringProvider = this.$stringProvider;
            StringArrayEnum stringArrayEnum = this.$stringArrayEnum;
            this.L$0 = mutableState2;
            this.label = 1;
            Object objA = stringProvider.a(stringArrayEnum, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutableState = mutableState2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.b(obj);
        }
        mutableState.setValue(obj);
        return Unit.f17538a;
    }
}
