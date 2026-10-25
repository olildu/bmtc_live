package app.chalo.capacitorDataMigration.migrationManager;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.capacitorDataMigration.dataFetcher.CapacitorDataFetchResult;
import app.chalo.capacitorDataMigration.models.CapacitorMigrationResult;
import app.chalo.capacitorDataMigration.models.MigrationResult;
import app.chalo.constants.Source;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.vo1;
import defpackage.we;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.datetime.Clock;
import kotlinx.datetime.Instant;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/capacitorDataMigration/models/CapacitorMigrationResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.capacitorDataMigration.migrationManager.CapacitorDataMigrationManager$executeMigration$2", f = "CapacitorDataMigrationManager.kt", l = {56, 72, EACTags.HISTORICAL_BYTES, TsExtractor.TS_STREAM_TYPE_DVBSUBS, 92, 160, 177, ComposerKt.reuseKey, 210, 221, 246}, m = "invokeSuspend", v = 1)
final class CapacitorDataMigrationManager$executeMigration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CapacitorMigrationResult>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CapacitorDataMigrationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapacitorDataMigrationManager$executeMigration$2(CapacitorDataMigrationManager capacitorDataMigrationManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = capacitorDataMigrationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CapacitorDataMigrationManager$executeMigration$2 capacitorDataMigrationManager$executeMigration$2 = new CapacitorDataMigrationManager$executeMigration$2(this.this$0, continuation);
        capacitorDataMigrationManager$executeMigration$2.L$0 = obj;
        return capacitorDataMigrationManager$executeMigration$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CapacitorDataMigrationManager$executeMigration$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0324  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[Catch: Exception -> 0x004c, LOOP:0: B:17:0x006c->B:19:0x0072, LOOP_END, TryCatch #0 {Exception -> 0x004c, blocks: (B:9:0x0046, B:16:0x005d, B:17:0x006c, B:19:0x0072, B:20:0x007f, B:24:0x0088, B:28:0x008f, B:36:0x00b6, B:37:0x00c6, B:33:0x00a1, B:39:0x00d3, B:40:0x00e0, B:42:0x00e6, B:43:0x00f8, B:45:0x0129, B:51:0x0146, B:52:0x0153, B:54:0x0159, B:55:0x0174, B:57:0x0196, B:64:0x01b4, B:66:0x021e, B:67:0x0234, B:68:0x0235, B:69:0x0247, B:60:0x01a0, B:61:0x01a4, B:63:0x01aa, B:48:0x0133, B:50:0x013d, B:71:0x0256, B:74:0x026f, B:75:0x0282, B:100:0x0303, B:101:0x0312, B:14:0x0059, B:34:0x00a4, B:35:0x00b5), top: B:110:0x0011, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:91:0x02db  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objA;
        LinkedHashMap linkedHashMap;
        Instant instantA;
        Map map;
        CoroutineScope coroutineScope2;
        Instant instant;
        int i;
        CapacitorDataFetchResult capacitorDataFetchResult;
        Map map2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Clock.System system = Clock.System.f17926a;
        try {
            try {
                switch (i2) {
                    case 0:
                        ResultKt.b(obj);
                        CapacitorDataMigrationManager capacitorDataMigrationManager = this.this$0;
                        int i3 = CapacitorDataMigrationManager.f1189a;
                        capacitorDataMigrationManager.getClass();
                        throw null;
                    case 1:
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.b(obj);
                        if (Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                            CapacitorDataMigrationManager capacitorDataMigrationManager2 = this.this$0;
                            int i4 = CapacitorDataMigrationManager.f1189a;
                            capacitorDataMigrationManager2.getClass();
                            AnalyticsContractImplKt.b(null, "ios capacitor migration skipped", Source.APP_MIGRATION_PRECONDITION_SCREEN, vo1.s("reason", "already_completed"), false, 24);
                            throw null;
                        }
                        CapacitorDataMigrationManager capacitorDataMigrationManager3 = this.this$0;
                        this.L$0 = coroutineScope;
                        this.label = 2;
                        objA = CapacitorDataMigrationManager.a(capacitorDataMigrationManager3, this);
                        if (objA != coroutineSingletons) {
                            if (!((Boolean) objA).booleanValue()) {
                                CapacitorDataMigrationManager capacitorDataMigrationManager4 = this.this$0;
                                int i5 = CapacitorDataMigrationManager.f1189a;
                                capacitorDataMigrationManager4.getClass();
                                AnalyticsContractImplKt.b(null, "ios capacitor migration skipped", Source.APP_MIGRATION_PRECONDITION_SCREEN, vo1.s("reason", "threshold_reached"), false, 24);
                                throw null;
                            }
                            linkedHashMap = new LinkedHashMap();
                            instantA = system.a();
                            CapacitorDataMigrationManager capacitorDataMigrationManager5 = this.this$0;
                            try {
                                this.L$0 = coroutineScope;
                                this.L$1 = linkedHashMap;
                                this.L$2 = instantA;
                                this.label = 4;
                                CapacitorDataMigrationManager.b(capacitorDataMigrationManager5, this);
                                if (Unit.f17538a != coroutineSingletons) {
                                    map = linkedHashMap;
                                    coroutineScope2 = coroutineScope;
                                    instant = instantA;
                                    CapacitorDataMigrationManager capacitorDataMigrationManager6 = this.this$0;
                                    int i6 = CapacitorDataMigrationManager.f1189a;
                                    capacitorDataMigrationManager6.getClass();
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = map;
                                    this.L$2 = instant;
                                    this.label = 5;
                                    throw null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                map = linkedHashMap;
                                coroutineScope2 = coroutineScope;
                                instant = instantA;
                                ResultKt.a(th);
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.b(obj);
                        objA = obj;
                        if (!((Boolean) objA).booleanValue()) {
                            CapacitorDataMigrationManager capacitorDataMigrationManager7 = this.this$0;
                            int i7 = CapacitorDataMigrationManager.f1189a;
                            capacitorDataMigrationManager7.getClass();
                            AnalyticsContractImplKt.b(null, "ios capacitor migration skipped", Source.APP_MIGRATION_PRECONDITION_SCREEN, vo1.s("reason", "threshold_reached"), false, 24);
                            throw null;
                        }
                        linkedHashMap = new LinkedHashMap();
                        instantA = system.a();
                        CapacitorDataMigrationManager capacitorDataMigrationManager8 = this.this$0;
                        this.L$0 = coroutineScope;
                        this.L$1 = linkedHashMap;
                        this.L$2 = instantA;
                        this.label = 4;
                        CapacitorDataMigrationManager.b(capacitorDataMigrationManager8, this);
                        if (Unit.f17538a != coroutineSingletons) {
                            map = linkedHashMap;
                            coroutineScope2 = coroutineScope;
                            instant = instantA;
                            CapacitorDataMigrationManager capacitorDataMigrationManager9 = this.this$0;
                            int i8 = CapacitorDataMigrationManager.f1189a;
                            capacitorDataMigrationManager9.getClass();
                            this.L$0 = coroutineScope2;
                            this.L$1 = map;
                            this.L$2 = instant;
                            this.label = 5;
                            throw null;
                        }
                        return coroutineSingletons;
                    case 3:
                        ResultKt.b(obj);
                        return new CapacitorMigrationResult(true, (CapacitorDataFetchResult) null, (Map) null, (String) null, 30);
                    case 4:
                        instant = (Instant) this.L$2;
                        map = (Map) this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        try {
                            ResultKt.b(obj);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            ResultKt.a(th);
                        }
                        CapacitorDataMigrationManager capacitorDataMigrationManager10 = this.this$0;
                        int i9 = CapacitorDataMigrationManager.f1189a;
                        capacitorDataMigrationManager10.getClass();
                        this.L$0 = coroutineScope2;
                        this.L$1 = map;
                        this.L$2 = instant;
                        this.label = 5;
                        throw null;
                    case 5:
                        ResultKt.b(obj);
                        CapacitorDataMigrationManager capacitorDataMigrationManager11 = this.this$0;
                        int i10 = CapacitorDataMigrationManager.f1189a;
                        capacitorDataMigrationManager11.getClass();
                        Source source = Source.APP_MIGRATION_PRECONDITION_SCREEN;
                        ((CapacitorDataFetchResult) obj).getClass();
                        throw null;
                    case 6:
                        String str = (String) this.L$2;
                        CapacitorDataFetchResult capacitorDataFetchResult2 = (CapacitorDataFetchResult) this.L$1;
                        ResultKt.b(obj);
                        return new CapacitorMigrationResult(false, capacitorDataFetchResult2, (Map) null, str, 12);
                    case 7:
                        Instant instant2 = (Instant) this.L$1;
                        Map map3 = (Map) this.L$0;
                        ResultKt.b(obj);
                        for (Pair pair : (List) obj) {
                            map3.put(pair.d(), pair.e());
                        }
                        long jA = system.a().a(instant2);
                        String message = "Base migrations completed in " + Duration.k(jA);
                        Intrinsics.i(message, "message");
                        CapacitorDataMigrationManager.c(this.this$0, map3);
                        Collection collectionValues = map3.values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            Iterator it2 = collectionValues.iterator();
                            if (it2.hasNext()) {
                                ((MigrationResult) it2.next()).getClass();
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : map3.entrySet()) {
                            ((MigrationResult) entry.getValue()).getClass();
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                        Pair pair2 = new Pair("total", new Integer(map3.values().size()));
                        Collection collectionValues2 = map3.values();
                        if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                            Iterator it3 = collectionValues2.iterator();
                            while (it3.hasNext()) {
                                ((MigrationResult) it3.next()).getClass();
                            }
                        }
                        LinkedHashMap linkedHashMapK = MapsKt.k(pair2, new Pair(FirebaseAnalytics.Param.SUCCESS, new Integer(0)), new Pair("failed", new Integer(linkedHashMap2.size())), new Pair("failedMigrations", CollectionsKt.O(linkedHashMap2.keySet(), null, null, null, new we(0), 31)), new Pair(TypedValues.TransitionType.S_DURATION, new Long(Duration.e(jA))));
                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                        if (!it4.hasNext()) {
                            this.this$0.getClass();
                            AnalyticsContractImplKt.b(null, "ios capacitor migration execute", Source.APP_MIGRATION_PRECONDITION_SCREEN, linkedHashMapK, false, 24);
                            throw null;
                        }
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        Objects.toString(entry2.getKey());
                        ((MigrationResult) entry2.getValue()).getClass();
                        throw null;
                    case 8:
                        int i11 = this.I$0;
                        CapacitorDataFetchResult capacitorDataFetchResult3 = (CapacitorDataFetchResult) this.L$1;
                        Map map4 = (Map) this.L$0;
                        ResultKt.b(obj);
                        CapacitorDataMigrationManager capacitorDataMigrationManager12 = this.this$0;
                        int i12 = CapacitorDataMigrationManager.f1189a;
                        capacitorDataMigrationManager12.getClass();
                        this.L$0 = map4;
                        this.L$1 = capacitorDataFetchResult3;
                        this.I$0 = i11;
                        this.label = 9;
                        throw null;
                    case 9:
                        i = this.I$0;
                        capacitorDataFetchResult = (CapacitorDataFetchResult) this.L$1;
                        map2 = (Map) this.L$0;
                        ResultKt.b(obj);
                        CapacitorDataFetchResult capacitorDataFetchResult4 = capacitorDataFetchResult;
                        Map map5 = map2;
                        Collection collectionValues3 = map5.values();
                        arrayList = new ArrayList();
                        it = collectionValues3.iterator();
                        while (it.hasNext()) {
                            ((MigrationResult) it.next()).getClass();
                            CollectionsKt.i(null, arrayList);
                        }
                        if (arrayList.isEmpty()) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = arrayList;
                        }
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return new CapacitorMigrationResult(z, capacitorDataFetchResult4, map5, arrayList2, (String) null);
                    case 10:
                        i = this.I$0;
                        capacitorDataFetchResult = (CapacitorDataFetchResult) this.L$1;
                        map2 = (Map) this.L$0;
                        ResultKt.b(obj);
                        CapacitorDataFetchResult capacitorDataFetchResult5 = capacitorDataFetchResult;
                        Map map6 = map2;
                        Collection collectionValues4 = map6.values();
                        arrayList = new ArrayList();
                        it = collectionValues4.iterator();
                        while (it.hasNext()) {
                            ((MigrationResult) it.next()).getClass();
                            CollectionsKt.i(null, arrayList);
                        }
                        if (arrayList.isEmpty()) {
                            arrayList2 = arrayList;
                        } else {
                            arrayList2 = null;
                        }
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return new CapacitorMigrationResult(z, capacitorDataFetchResult5, map6, arrayList2, (String) null);
                    case 11:
                        Exception exc = (Exception) this.L$1;
                        Map map7 = (Map) this.L$0;
                        ResultKt.b(obj);
                        return new CapacitorMigrationResult(false, (CapacitorDataFetchResult) null, map7, vo1.m("Critical error: ", exc.getMessage()), 10);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                CapacitorDataMigrationManager capacitorDataMigrationManager13 = this.this$0;
                int i13 = CapacitorDataMigrationManager.f1189a;
                capacitorDataMigrationManager13.getClass();
                new CapacitorMigrationException(e.getMessage(), e);
                throw null;
            }
        } catch (Exception e2) {
            CapacitorDataMigrationManager capacitorDataMigrationManager14 = this.this$0;
            int i14 = CapacitorDataMigrationManager.f1189a;
            capacitorDataMigrationManager14.getClass();
            new CapacitorCleanupException(e2.getMessage(), e2);
            throw null;
        }
    }
}
