package app.chalo.features.chaloconfig.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$retrieveValueFromDatastoreSynchronously$1", f = "ChaloConfigRepositoryImpl.kt", l = {179, 179}, m = "invokeSuspend", v = 1)
final class ChaloConfigRepositoryImpl$retrieveValueFromDatastoreSynchronously$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ String $localeSpecificKey;
    int label;
    final /* synthetic */ ChaloConfigRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloConfigRepositoryImpl$retrieveValueFromDatastoreSynchronously$1(ChaloConfigRepositoryImpl chaloConfigRepositoryImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloConfigRepositoryImpl;
        this.$localeSpecificKey = str;
        this.$key = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloConfigRepositoryImpl$retrieveValueFromDatastoreSynchronously$1(this.this$0, this.$localeSpecificKey, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloConfigRepositoryImpl$retrieveValueFromDatastoreSynchronously$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L41
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl r5 = r4.this$0
            app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource r5 = r5.f2631a
            java.lang.String r1 = r4.$localeSpecificKey
            r4.label = r3
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 != r0) goto L2e
            goto L40
        L2e:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L43
            app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl r5 = r4.this$0
            app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource r5 = r5.f2631a
            java.lang.String r1 = r4.$key
            r4.label = r2
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            java.lang.String r5 = (java.lang.String) r5
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl$retrieveValueFromDatastoreSynchronously$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
