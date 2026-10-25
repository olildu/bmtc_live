package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl$invoke$3", f = "GenerateQRCodeForValidationHelperImpl.kt", l = {52}, m = "invokeSuspend", v = 1)
final class GenerateQRCodeForValidationHelperImpl$invoke$3 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ ProductValidationData $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateQRCodeForValidationHelperImpl$invoke$3(ProductValidationData productValidationData, Continuation continuation) {
        super(1, continuation);
        this.$data = productValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GenerateQRCodeForValidationHelperImpl$invoke$3(this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((GenerateQRCodeForValidationHelperImpl$invoke$3) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

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
        ProductValidationData productValidationData = this.$data;
        this.label = 1;
        Object objV = productValidationData.v(this);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
