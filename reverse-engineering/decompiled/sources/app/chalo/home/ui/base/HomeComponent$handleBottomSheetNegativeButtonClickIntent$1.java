package app.chalo.home.ui.base;

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
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleBottomSheetNegativeButtonClickIntent$1", f = "HomeComponent.kt", l = {1592, 1623, 1627, 1636}, m = "invokeSuspend", v = 1)
final class HomeComponent$handleBottomSheetNegativeButtonClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent $intent;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$handleBottomSheetNegativeButtonClickIntent$1(HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent bottomSheetNegativeButtonClickIntent, HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = bottomSheetNegativeButtonClickIntent;
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$handleBottomSheetNegativeButtonClickIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$handleBottomSheetNegativeButtonClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r10.a(r9) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011f, code lost:
    
        if (r10.s(r1, r9) == r0) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$handleBottomSheetNegativeButtonClickIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
