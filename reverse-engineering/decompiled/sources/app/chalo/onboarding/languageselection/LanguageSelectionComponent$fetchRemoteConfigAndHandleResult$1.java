package app.chalo.onboarding.languageselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageselection.LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1", f = "LanguageSelectionComponent.kt", l = {373, 374, 382}, m = "invokeSuspend", v = 1)
final class LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceFetch;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LanguageSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1(LanguageSelectionComponent languageSelectionComponent, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = languageSelectionComponent;
        this.$forceFetch = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1 languageSelectionComponent$fetchRemoteConfigAndHandleResult$1 = new LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1(this.this$0, this.$forceFetch, continuation);
        languageSelectionComponent$fetchRemoteConfigAndHandleResult$1.L$0 = obj;
        return languageSelectionComponent$fetchRemoteConfigAndHandleResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (app.chalo.onboarding.languageselection.LanguageSelectionComponent.F0(r9, r8) == r0) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.languageselection.LanguageSelectionComponent$fetchRemoteConfigAndHandleResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
