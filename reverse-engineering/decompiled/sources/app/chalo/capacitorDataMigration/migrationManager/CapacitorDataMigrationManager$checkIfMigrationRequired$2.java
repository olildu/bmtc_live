package app.chalo.capacitorDataMigration.migrationManager;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.capacitorDataMigration.migrationManager.CapacitorDataMigrationManager$checkIfMigrationRequired$2", f = "CapacitorDataMigrationManager.kt", l = {288, 298, 300, 314, 324, 337}, m = "invokeSuspend", v = 1)
final class CapacitorDataMigrationManager$checkIfMigrationRequired$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CapacitorDataMigrationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapacitorDataMigrationManager$checkIfMigrationRequired$2(CapacitorDataMigrationManager capacitorDataMigrationManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = capacitorDataMigrationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CapacitorDataMigrationManager$checkIfMigrationRequired$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CapacitorDataMigrationManager$checkIfMigrationRequired$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x0016, B:12:0x0021, B:13:0x003b, B:28:0x007f, B:29:0x008b), top: B:38:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    ResultKt.b(obj);
                    CapacitorDataMigrationManager capacitorDataMigrationManager = this.this$0;
                    int i = CapacitorDataMigrationManager.f1189a;
                    capacitorDataMigrationManager.getClass();
                    throw null;
                case 1:
                    ResultKt.b(obj);
                    bool = (Boolean) obj;
                    if (Intrinsics.d(bool, Boolean.TRUE)) {
                        CapacitorDataMigrationManager.d(this.this$0, "already_completed");
                        throw null;
                    }
                    CapacitorDataMigrationManager capacitorDataMigrationManager2 = this.this$0;
                    this.L$0 = bool;
                    this.label = 2;
                    obj = CapacitorDataMigrationManager.a(capacitorDataMigrationManager2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        CapacitorDataMigrationManager.d(this.this$0, "threshold_reached");
                        throw null;
                    }
                    if (Intrinsics.d(bool, Boolean.FALSE)) {
                        CapacitorDataMigrationManager.d(this.this$0, "previous_failed");
                        throw null;
                    }
                    CapacitorDataMigrationManager capacitorDataMigrationManager3 = this.this$0;
                    int i2 = CapacitorDataMigrationManager.f1189a;
                    capacitorDataMigrationManager3.getClass();
                    this.L$0 = null;
                    this.label = 4;
                    throw null;
                case 2:
                    bool = (Boolean) this.L$0;
                    ResultKt.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        CapacitorDataMigrationManager.d(this.this$0, "threshold_reached");
                        throw null;
                    }
                    if (Intrinsics.d(bool, Boolean.FALSE)) {
                        CapacitorDataMigrationManager.d(this.this$0, "previous_failed");
                        throw null;
                    }
                    CapacitorDataMigrationManager capacitorDataMigrationManager4 = this.this$0;
                    int i3 = CapacitorDataMigrationManager.f1189a;
                    capacitorDataMigrationManager4.getClass();
                    this.L$0 = null;
                    this.label = 4;
                    throw null;
                case 3:
                    ResultKt.b(obj);
                    return Boolean.FALSE;
                case 4:
                    ResultKt.b(obj);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    CapacitorDataMigrationManager.d(this.this$0, "hasData: " + zBooleanValue);
                    throw null;
                case 5:
                    ResultKt.b(obj);
                    return false;
                case 6:
                    ResultKt.b(obj);
                    return false;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            vo1.x("Error checking migration requirement: ", e.getMessage(), "message");
            CapacitorDataMigrationManager capacitorDataMigrationManager5 = this.this$0;
            int i4 = CapacitorDataMigrationManager.f1189a;
            capacitorDataMigrationManager5.getClass();
            new CapacitorCheckException(e.getMessage(), e);
            throw null;
        }
    }
}
