package app.chalo.validation.superpass;

import app.chalo.superpass.data.models.entities.SuperPass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SuperPassProductValidationModelKt$toSuperPassProductValidationModel$3 extends FunctionReferenceImpl implements Function1<Continuation<? super Long>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPass) this.receiver).d((Continuation) obj);
    }
}
