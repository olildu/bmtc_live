package app.chalo.appmigrationpreconditions.orchestrator;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.capacitorDataMigration.models.CapacitorMigrationResult;
import app.chalo.constants.Source;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/appmigrationpreconditions/orchestrator/IosMigrationFlowOrchestrator;", "Lapp/chalo/appmigrationpreconditions/orchestrator/MigrationFlowOrchestrator;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IosMigrationFlowOrchestrator implements MigrationFlowOrchestrator {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/appmigrationpreconditions/orchestrator/IosMigrationFlowOrchestrator$Companion;", "", "", "CONFIG_FETCH_STARTED_TIMEOUT_MS", "J", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final ChaloUseCaseResult c(IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator, ContinuationImpl continuationImpl) {
        IosMigrationFlowOrchestrator$performHomeScreenConfig$1 iosMigrationFlowOrchestrator$performHomeScreenConfig$1;
        iosMigrationFlowOrchestrator.getClass();
        if (continuationImpl instanceof IosMigrationFlowOrchestrator$performHomeScreenConfig$1) {
            iosMigrationFlowOrchestrator$performHomeScreenConfig$1 = (IosMigrationFlowOrchestrator$performHomeScreenConfig$1) continuationImpl;
            int i = iosMigrationFlowOrchestrator$performHomeScreenConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iosMigrationFlowOrchestrator$performHomeScreenConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                iosMigrationFlowOrchestrator$performHomeScreenConfig$1 = new IosMigrationFlowOrchestrator$performHomeScreenConfig$1(iosMigrationFlowOrchestrator, continuationImpl);
            }
        } else {
            iosMigrationFlowOrchestrator$performHomeScreenConfig$1 = new IosMigrationFlowOrchestrator$performHomeScreenConfig$1(iosMigrationFlowOrchestrator, continuationImpl);
        }
        Object obj = iosMigrationFlowOrchestrator$performHomeScreenConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = iosMigrationFlowOrchestrator$performHomeScreenConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return new ChaloUseCaseResult.Success(Unit.f17538a);
        }
        ResultKt.b(obj);
        if (((HomeScreenConfigAppModel) obj) == null) {
            return new ChaloUseCaseResult.Failure("Homescreen config fetch failed");
        }
        iosMigrationFlowOrchestrator$performHomeScreenConfig$1.label = 2;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator
    public final Object a(CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        IosMigrationFlowOrchestrator$performMigration$1 iosMigrationFlowOrchestrator$performMigration$1;
        if (continuationImpl instanceof IosMigrationFlowOrchestrator$performMigration$1) {
            iosMigrationFlowOrchestrator$performMigration$1 = (IosMigrationFlowOrchestrator$performMigration$1) continuationImpl;
            int i = iosMigrationFlowOrchestrator$performMigration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iosMigrationFlowOrchestrator$performMigration$1.label = i - Integer.MIN_VALUE;
            } else {
                iosMigrationFlowOrchestrator$performMigration$1 = new IosMigrationFlowOrchestrator$performMigration$1(this, continuationImpl);
            }
        } else {
            iosMigrationFlowOrchestrator$performMigration$1 = new IosMigrationFlowOrchestrator$performMigration$1(this, continuationImpl);
        }
        Object objC = iosMigrationFlowOrchestrator$performMigration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = iosMigrationFlowOrchestrator$performMigration$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                iosMigrationFlowOrchestrator$performMigration$1.label = 1;
                throw null;
            }
            if (i2 == 1) {
                ResultKt.b(objC);
                CapacitorMigrationResult capacitorMigrationResult = (CapacitorMigrationResult) objC;
                AnalyticsContractImplKt.b(null, "ios capacitor migration result", Source.APP_MIGRATION_PRECONDITION_SCREEN, MapsKt.i(new Pair("result", String.valueOf(capacitorMigrationResult.f1190a)), new Pair("error message", String.valueOf(capacitorMigrationResult.e))), false, 24);
                throw null;
            }
            if (i2 == 2) {
                ResultKt.b(objC);
                iosMigrationFlowOrchestrator$performMigration$1.label = 3;
                throw null;
            }
            if (i2 == 3) {
                ResultKt.b(objC);
                iosMigrationFlowOrchestrator$performMigration$1.label = 4;
                objC = CoroutineScopeKt.c(new IosMigrationFlowOrchestrator$performRequiredConfigFetch$2((List) objC, this, null), iosMigrationFlowOrchestrator$performMigration$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return (ChaloUseCaseResult) objC;
        } catch (Exception unused) {
            throw null;
        }
    }

    @Override // app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator
    public final Object b() {
        new IosMigrationFlowOrchestrator$afterSuccessfulMigration$2(1, null);
        throw null;
    }
}
