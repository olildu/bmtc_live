package app.chalo.appmigrationpreconditions.orchestrator;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.helper.KeyStoreToDatabaseMigrationHelper;
import app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.usecase.ProductHistorySyncErrorType;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appmigrationpreconditions/orchestrator/AndroidMigrationFlowOrchestrator;", "Lapp/chalo/appmigrationpreconditions/orchestrator/MigrationFlowOrchestrator;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidMigrationFlowOrchestrator implements MigrationFlowOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitiateProductHistorySyncCallUseCase f959a;
    public final KeyStoreToDatabaseMigrationHelper b;
    public final CoroutineContextProvider c;
    public final AnalyticsContract d;
    public final CrashlyticsLogger e;

    public AndroidMigrationFlowOrchestrator(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, KeyStoreToDatabaseMigrationHelper keyStoreToDatabaseMigrationHelper, CoroutineContextProvider coroutineContextProvider, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger) {
        this.f959a = initiateProductHistorySyncCallUseCase;
        this.b = keyStoreToDatabaseMigrationHelper;
        this.c = coroutineContextProvider;
        this.d = analyticsContract;
        this.e = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator
    public final Object a(CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        AndroidMigrationFlowOrchestrator$performMigration$1 androidMigrationFlowOrchestrator$performMigration$1;
        AndroidMigrationFlowOrchestrator androidMigrationFlowOrchestrator;
        ChaloUseCaseResult chaloUseCaseResult;
        ProductHistorySyncErrorType productHistorySyncErrorType;
        String str;
        if (continuationImpl instanceof AndroidMigrationFlowOrchestrator$performMigration$1) {
            androidMigrationFlowOrchestrator$performMigration$1 = (AndroidMigrationFlowOrchestrator$performMigration$1) continuationImpl;
            int i = androidMigrationFlowOrchestrator$performMigration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidMigrationFlowOrchestrator$performMigration$1.label = i - Integer.MIN_VALUE;
            } else {
                androidMigrationFlowOrchestrator$performMigration$1 = new AndroidMigrationFlowOrchestrator$performMigration$1(this, continuationImpl);
            }
        } else {
            androidMigrationFlowOrchestrator$performMigration$1 = new AndroidMigrationFlowOrchestrator$performMigration$1(this, continuationImpl);
        }
        Object objC = androidMigrationFlowOrchestrator$performMigration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidMigrationFlowOrchestrator$performMigration$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            androidMigrationFlowOrchestrator$performMigration$1.label = 1;
            objC = c(coroutineScope, androidMigrationFlowOrchestrator$performMigration$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidMigrationFlowOrchestrator = (AndroidMigrationFlowOrchestrator) androidMigrationFlowOrchestrator$performMigration$1.L$0;
            ResultKt.b(objC);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) objC;
        androidMigrationFlowOrchestrator.getClass();
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return ((Boolean) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).booleanValue() ? new ChaloUseCaseResult.Success(Unit.f17538a) : new ChaloUseCaseResult.Failure("History success type with false");
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            throw new NoWhenBranchMatchedException();
        }
        productHistorySyncErrorType = (ProductHistorySyncErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.API) {
            str = ((ProductHistorySyncErrorType.API) productHistorySyncErrorType).b;
            if (str.length() == 0) {
                str = "History error API";
            }
        } else if (Intrinsics.d(productHistorySyncErrorType, ProductHistorySyncErrorType.MTicketDetailsNotAvailable.b)) {
            str = productHistorySyncErrorType.f10215a;
            if (str.length() == 0) {
                str = "History error MTicketDetailsNotAvailable";
            }
        } else if (Intrinsics.d(productHistorySyncErrorType, ProductHistorySyncErrorType.ProductConfigNotAvailable.b)) {
            str = productHistorySyncErrorType.f10215a;
            if (str.length() == 0) {
                str = "History error product config unavailable";
            }
        } else if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.ResponseParsing) {
            str = ((ProductHistorySyncErrorType.ResponseParsing) productHistorySyncErrorType).b;
            if (str.length() == 0) {
                str = "History error ResponseParsing";
            }
        } else if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.Unknown) {
            str = ((ProductHistorySyncErrorType.Unknown) productHistorySyncErrorType).b;
            if (str.length() == 0) {
                str = "History error Unknown";
            }
        } else {
            if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.UserNotLoggedIn) {
                throw new NoWhenBranchMatchedException();
            }
            str = "User id null";
        }
        return new ChaloUseCaseResult.Failure(str);
        if (!((Boolean) objC).booleanValue()) {
            this.e.i(new IllegalStateException("MTicket KVstore migration to table failed"));
        }
        androidMigrationFlowOrchestrator$performMigration$1.L$0 = this;
        androidMigrationFlowOrchestrator$performMigration$1.label = 2;
        objC = InitiateProductHistorySyncCallUseCase.h(this.f959a, Source.APP_MIGRATION_PRECONDITION_SCREEN, false, androidMigrationFlowOrchestrator$performMigration$1, 2);
        if (objC != coroutineSingletons) {
            androidMigrationFlowOrchestrator = this;
            chaloUseCaseResult = (ChaloUseCaseResult) objC;
            androidMigrationFlowOrchestrator.getClass();
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                if (((Boolean) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).booleanValue()) {
                }
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            productHistorySyncErrorType = (ProductHistorySyncErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.API) {
                str = ((ProductHistorySyncErrorType.API) productHistorySyncErrorType).b;
                if (str.length() == 0) {
                    str = "History error API";
                }
            } else if (Intrinsics.d(productHistorySyncErrorType, ProductHistorySyncErrorType.MTicketDetailsNotAvailable.b)) {
                str = productHistorySyncErrorType.f10215a;
                if (str.length() == 0) {
                    str = "History error MTicketDetailsNotAvailable";
                }
            } else if (Intrinsics.d(productHistorySyncErrorType, ProductHistorySyncErrorType.ProductConfigNotAvailable.b)) {
                str = productHistorySyncErrorType.f10215a;
                if (str.length() == 0) {
                    str = "History error product config unavailable";
                }
            } else if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.ResponseParsing) {
                str = ((ProductHistorySyncErrorType.ResponseParsing) productHistorySyncErrorType).b;
                if (str.length() == 0) {
                    str = "History error ResponseParsing";
                }
            } else if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.Unknown) {
                str = ((ProductHistorySyncErrorType.Unknown) productHistorySyncErrorType).b;
                if (str.length() == 0) {
                    str = "History error Unknown";
                }
            } else {
                if (productHistorySyncErrorType instanceof ProductHistorySyncErrorType.UserNotLoggedIn) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "User id null";
            }
            return new ChaloUseCaseResult.Failure(str);
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator
    public final Object b() {
        return SplashNavigationDecision.ToHomeScreen.f6685a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$1 androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1;
        if (continuationImpl instanceof AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$1) {
            androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1 = (AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$1) continuationImpl;
            int i = androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1.label = i - Integer.MIN_VALUE;
            } else {
                androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1 = new AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$1(this, continuationImpl);
            }
        } else {
            androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1 = new AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$1(this, continuationImpl);
        }
        Object objA = androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(objA);
            CoroutineContextProvider coroutineContextProvider = this.c;
            List listS = CollectionsKt.S(BuildersKt.b(coroutineScope, coroutineContextProvider.b(), null, new AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$lastRideInfoMigration$1(this, null), 2), BuildersKt.b(coroutineScope, coroutineContextProvider.b(), null, new AndroidMigrationFlowOrchestrator$performKeyValueStoreMigration$activationInfoMigration$1(this, null), 2));
            androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1.label = 1;
            objA = AwaitKt.a(listS, androidMigrationFlowOrchestrator$performKeyValueStoreMigration$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        List list = (List) objA;
        AnalyticsContractImplKt.b(this.d, "app migration kv to db result", Source.APP_MIGRATION_PRECONDITION_SCREEN, MapsKt.i(new Pair("lastRideInfo", String.valueOf(CollectionsKt.L(0, list))), new Pair("activationInfo", String.valueOf(CollectionsKt.L(1, list)))), false, 24);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = true;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
