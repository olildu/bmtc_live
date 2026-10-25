package app.chalo.userprofile.domain;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.domain.ConvertBitmapImageToByteArrayUseCase", f = "ConvertBitmapImageToByteArrayUseCase.kt", l = {13}, m = "invoke", v = 1)
final class ConvertBitmapImageToByteArrayUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConvertBitmapImageToByteArrayUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertBitmapImageToByteArrayUseCase$invoke$1(ConvertBitmapImageToByteArrayUseCase convertBitmapImageToByteArrayUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = convertBitmapImageToByteArrayUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConvertBitmapImageToByteArrayUseCase$invoke$1 convertBitmapImageToByteArrayUseCase$invoke$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ConvertBitmapImageToByteArrayUseCase convertBitmapImageToByteArrayUseCase = this.this$0;
        convertBitmapImageToByteArrayUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            convertBitmapImageToByteArrayUseCase$invoke$1 = this;
        } else {
            convertBitmapImageToByteArrayUseCase$invoke$1 = new ConvertBitmapImageToByteArrayUseCase$invoke$1(convertBitmapImageToByteArrayUseCase, this);
        }
        Object objG = convertBitmapImageToByteArrayUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertBitmapImageToByteArrayUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            DefaultScheduler defaultScheduler = convertBitmapImageToByteArrayUseCase.f10321a.getDefault();
            ConvertBitmapImageToByteArrayUseCase$invoke$2 convertBitmapImageToByteArrayUseCase$invoke$2 = new ConvertBitmapImageToByteArrayUseCase$invoke$2(null, null);
            convertBitmapImageToByteArrayUseCase$invoke$1.label = 1;
            objG = BuildersKt.g(defaultScheduler, convertBitmapImageToByteArrayUseCase$invoke$2, convertBitmapImageToByteArrayUseCase$invoke$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        Intrinsics.h(objG, "withContext(...)");
        return objG;
    }
}
