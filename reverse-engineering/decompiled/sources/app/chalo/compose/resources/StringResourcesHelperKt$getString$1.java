package app.chalo.compose.resources;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import java.util.Arrays;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.resources.StringResourcesHelperKt$getString$1", f = "StringResourcesHelper.kt", l = {57}, m = "invokeSuspend", v = 1)
final class StringResourcesHelperKt$getString$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ List<Object> $formatArgs;
    final /* synthetic */ StringEnum $stringEnum;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringResourcesHelperKt$getString$1(StringEnum stringEnum, List list, Continuation continuation) {
        super(2, continuation);
        this.$stringEnum = stringEnum;
        this.$formatArgs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StringResourcesHelperKt$getString$1(this.$stringEnum, this.$formatArgs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StringResourcesHelperKt$getString$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        StringProvider stringProvider = (StringProvider) StringResourcesHelper.f1910a.getValue();
        StringEnum stringEnum = this.$stringEnum;
        Object[] array = this.$formatArgs.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
        this.label = 1;
        Object objB = stringProvider.b(stringEnum, objArrCopyOf, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
