package app.chalo.ads;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1", f = "NativeInlineAdTemplates.kt", l = {}, m = "invokeSuspend", v = 1)
final class NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<IntSize> $measuredSize$delegate;
    final /* synthetic */ MutableState<Boolean> $mediaReady$delegate;
    final /* synthetic */ int $minSizePx;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onMediaSizeResolved;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1(MutableState mutableState, int i, Function2 function2, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$measuredSize$delegate = mutableState;
        this.$minSizePx = i;
        this.$onMediaSizeResolved = function2;
        this.$mediaReady$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1(this.$measuredSize$delegate, this.$minSizePx, this.$onMediaSizeResolved, this.$mediaReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1 nativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1 = (NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        nativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        IntSize value = this.$measuredSize$delegate.getValue();
        if (value != null) {
            int i3 = this.$minSizePx;
            Function2<Integer, Integer, Unit> function2 = this.$onMediaSizeResolved;
            MutableState<Boolean> mutableState = this.$mediaReady$delegate;
            long jM7449unboximpl = value.m7449unboximpl();
            if (!mutableState.getValue().booleanValue() && (i = (int) (jM7449unboximpl >> 32)) >= i3 && (i2 = (int) (jM7449unboximpl & BodyPartID.bodyIdMax)) >= i3) {
                mutableState.setValue(Boolean.TRUE);
                function2.invoke(new Integer(i), new Integer(i2));
            }
        }
        return Unit.f17538a;
    }
}
