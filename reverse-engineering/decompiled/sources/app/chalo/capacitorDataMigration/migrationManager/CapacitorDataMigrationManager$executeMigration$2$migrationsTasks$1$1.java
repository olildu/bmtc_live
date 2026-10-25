package app.chalo.capacitorDataMigration.migrationManager;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.capacitorDataMigration.dataFetcher.CapacitorDataResult;
import app.chalo.capacitorDataMigration.migrators.CapacitorMigrator;
import app.chalo.capacitorDataMigration.models.MigrationResult;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lapp/chalo/capacitorDataMigration/models/MigrationResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.capacitorDataMigration.migrationManager.CapacitorDataMigrationManager$executeMigration$2$migrationsTasks$1$1", f = "CapacitorDataMigrationManager.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 1)
final class CapacitorDataMigrationManager$executeMigration$2$migrationsTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends String, ? extends MigrationResult>>, Object> {
    final /* synthetic */ CapacitorDataResult $capacitorDataResult;
    final /* synthetic */ int $index;
    final /* synthetic */ CapacitorMigrator $migrator;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapacitorDataMigrationManager$executeMigration$2$migrationsTasks$1$1(CapacitorMigrator capacitorMigrator, int i, CapacitorDataResult capacitorDataResult, Continuation continuation) {
        super(2, continuation);
        this.$migrator = capacitorMigrator;
        this.$index = i;
        this.$capacitorDataResult = capacitorDataResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CapacitorDataMigrationManager$executeMigration$2$migrationsTasks$1$1(this.$migrator, this.$index, this.$capacitorDataResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CapacitorDataMigrationManager$executeMigration$2$migrationsTasks$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            String strF = Reflection.a(this.$migrator.getClass()).f();
            if (strF == null) {
                strF = vo1.j(this.$index + 1, "Migrator");
            }
            CapacitorMigrator capacitorMigrator = this.$migrator;
            this.L$0 = strF;
            this.label = 1;
            Object objA = capacitorMigrator.a();
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strF;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        return new Pair(str, (MigrationResult) obj);
    }
}
