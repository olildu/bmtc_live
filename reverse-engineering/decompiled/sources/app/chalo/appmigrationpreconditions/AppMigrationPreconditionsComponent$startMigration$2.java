package app.chalo.appmigrationpreconditions;

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
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$startMigration$2", f = "AppMigrationPreconditionsComponent.kt", l = {140, 142, 159}, m = "invokeSuspend", v = 1)
final class AppMigrationPreconditionsComponent$startMigration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppMigrationPreconditionsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMigrationPreconditionsComponent$startMigration$2(AppMigrationPreconditionsComponent appMigrationPreconditionsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = appMigrationPreconditionsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppMigrationPreconditionsComponent$startMigration$2 appMigrationPreconditionsComponent$startMigration$2 = new AppMigrationPreconditionsComponent$startMigration$2(this.this$0, continuation);
        appMigrationPreconditionsComponent$startMigration$2.L$0 = obj;
        return appMigrationPreconditionsComponent$startMigration$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppMigrationPreconditionsComponent$startMigration$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent.F0(r2, r10, r9, r24) == r1) goto L37;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x009e, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0100 -> B:39:0x0103). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$startMigration$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
