package app.chalo.home.ui.chalobus;

import androidx.compose.runtime.MutableIntState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusScreenUIKt$ChangingTextAnimation$2$1", f = "ChaloBusScreenUI.kt", l = {1011}, m = "invokeSuspend", v = 1)
final class ChaloBusScreenUIKt$ChangingTextAnimation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $currentIndex$delegate;
    final /* synthetic */ List<String> $textList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusScreenUIKt$ChangingTextAnimation$2$1(List list, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$textList = list;
        this.$currentIndex$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusScreenUIKt$ChangingTextAnimation$2$1 chaloBusScreenUIKt$ChangingTextAnimation$2$1 = new ChaloBusScreenUIKt$ChangingTextAnimation$2$1(this.$textList, this.$currentIndex$delegate, continuation);
        chaloBusScreenUIKt$ChangingTextAnimation$2$1.L$0 = obj;
        return chaloBusScreenUIKt$ChangingTextAnimation$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusScreenUIKt$ChangingTextAnimation$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003c -> B:17:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r7)
            goto L3f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            java.util.List<java.lang.String> r1 = r6.$textList
            int r1 = r1.size()
            if (r1 > r3) goto L2b
            return r2
        L2b:
            r1 = r7
        L2c:
            boolean r7 = kotlinx.coroutines.CoroutineScopeKt.e(r1)
            if (r7 == 0) goto L51
            r6.L$0 = r1
            r6.label = r3
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L3f
            return r0
        L3f:
            androidx.compose.runtime.MutableIntState r7 = r6.$currentIndex$delegate
            int r4 = r7.getIntValue()
            int r4 = r4 + r3
            java.util.List<java.lang.String> r5 = r6.$textList
            int r5 = r5.size()
            int r4 = r4 % r5
            r7.setIntValue(r4)
            goto L2c
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusScreenUIKt$ChangingTextAnimation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
