package app.chalo.utils;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.superpass.data.models.entities.SuperPassActivationTimestampMapHelper;
import app.chalo.superpass.utils.ChaloConfigUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.datetime.Clock;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/UtilsKT;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UtilsKT implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UtilsKT f10442a;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;

    static {
        final UtilsKT utilsKT = new UtilsKT();
        f10442a = utilsKT;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<CityProvider>() { // from class: app.chalo.utils.UtilsKT$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10443a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CityProvider.class), null, null);
            }
        });
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<BasicInfoContract>() { // from class: app.chalo.utils.UtilsKT$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10444a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BasicInfoContract.class), null, null);
            }
        });
        d = LazyKt.a(lazyThreadSafetyMode, new Function0<TimeUtilsContract>() { // from class: app.chalo.utils.UtilsKT$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10445a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(TimeUtilsContract.class), null, null);
            }
        });
        e = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.utils.UtilsKT$special$$inlined$inject$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10446a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        UtilsKT$getSuperPassLastActivationTimeStamp$1 utilsKT$getSuperPassLastActivationTimeStamp$1;
        if (continuationImpl instanceof UtilsKT$getSuperPassLastActivationTimeStamp$1) {
            utilsKT$getSuperPassLastActivationTimeStamp$1 = (UtilsKT$getSuperPassLastActivationTimeStamp$1) continuationImpl;
            int i = utilsKT$getSuperPassLastActivationTimeStamp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                utilsKT$getSuperPassLastActivationTimeStamp$1.label = i - Integer.MIN_VALUE;
            } else {
                utilsKT$getSuperPassLastActivationTimeStamp$1 = new UtilsKT$getSuperPassLastActivationTimeStamp$1(this, continuationImpl);
            }
        } else {
            utilsKT$getSuperPassLastActivationTimeStamp$1 = new UtilsKT$getSuperPassLastActivationTimeStamp$1(this, continuationImpl);
        }
        Object objV = utilsKT$getSuperPassLastActivationTimeStamp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = utilsKT$getSuperPassLastActivationTimeStamp$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = ((LocalDataStore) SuperPassActivationTimestampMapHelper.f9561a.getValue()).e(PreferencesKeys.stringKey(str));
            utilsKT$getSuperPassLastActivationTimeStamp$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, utilsKT$getSuperPassLastActivationTimeStamp$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str2 = (String) objV;
        return new Long(str2 != null ? Long.parseLong(str2) : -1L);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        UtilsKT$isToday$1 utilsKT$isToday$1;
        UtilsKT utilsKT;
        ?? r0 = d;
        if (continuationImpl instanceof UtilsKT$isToday$1) {
            utilsKT$isToday$1 = (UtilsKT$isToday$1) continuationImpl;
            int i = utilsKT$isToday$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                utilsKT$isToday$1.label = i - Integer.MIN_VALUE;
            } else {
                utilsKT$isToday$1 = new UtilsKT$isToday$1(this, continuationImpl);
            }
        } else {
            utilsKT$isToday$1 = new UtilsKT$isToday$1(this, continuationImpl);
        }
        Object objC = utilsKT$isToday$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = utilsKT$isToday$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objC);
            BasicInfoContract basicInfoContract = (BasicInfoContract) c.getValue();
            utilsKT$isToday$1.L$0 = this;
            utilsKT$isToday$1.J$0 = j;
            utilsKT$isToday$1.label = 1;
            objC = basicInfoContract.c(utilsKT$isToday$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            utilsKT = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = utilsKT$isToday$1.J$0;
            utilsKT = (UtilsKT) utilsKT$isToday$1.L$0;
            ResultKt.b(objC);
        }
        long jLongValue = ((Number) objC).longValue();
        utilsKT.getClass();
        try {
            TimeZone.Companion companion = TimeZone.INSTANCE;
            String strB = ((TimeUtilsContract) r0.getValue()).b();
            companion.getClass();
            TimeZone timeZoneA = TimeZone.Companion.a(strB);
            Instant.INSTANCE.getClass();
            LocalDateTime localDateTimeC = TimeZoneKt.c(Instant.Companion.a(j), timeZoneA);
            LocalDateTime localDateTimeC2 = TimeZoneKt.c(Instant.Companion.a(jLongValue), timeZoneA);
            if (localDateTimeC.o() != localDateTimeC2.o() || localDateTimeC.j() != localDateTimeC2.j() || localDateTimeC.c() != localDateTimeC2.c()) {
                z = false;
            }
        } catch (Exception e2) {
            ((CrashlyticsLogger) e.getValue()).i(e2);
            TimeZone.Companion companion2 = TimeZone.INSTANCE;
            String strB2 = ((TimeUtilsContract) r0.getValue()).b();
            companion2.getClass();
            TimeZone timeZoneA2 = TimeZone.Companion.a(strB2);
            Instant.INSTANCE.getClass();
            LocalDateTime localDateTimeC3 = TimeZoneKt.c(Instant.Companion.a(j), timeZoneA2);
            LocalDateTime localDateTimeC4 = TimeZoneKt.c(Clock.System.f17926a.a(), timeZoneA2);
            if (localDateTimeC3.o() != localDateTimeC4.o() || localDateTimeC3.j() != localDateTimeC4.j() || localDateTimeC3.c() != localDateTimeC4.c()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    public final Object c(ArrayList arrayList, List list, ContinuationImpl continuationImpl) {
        UtilsKT$mergeRides$1 utilsKT$mergeRides$1;
        String str;
        List list2;
        List list3;
        long j;
        long jLongValue;
        Ref.LongRef longRef;
        Long l;
        long jLongValue2;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        ArrayList arrayList3;
        int size;
        int i;
        Object obj;
        List list4 = arrayList;
        List list5 = list;
        if (continuationImpl instanceof UtilsKT$mergeRides$1) {
            utilsKT$mergeRides$1 = (UtilsKT$mergeRides$1) continuationImpl;
            int i2 = utilsKT$mergeRides$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                utilsKT$mergeRides$1.label = i2 - Integer.MIN_VALUE;
            } else {
                utilsKT$mergeRides$1 = new UtilsKT$mergeRides$1(this, continuationImpl);
            }
        } else {
            utilsKT$mergeRides$1 = new UtilsKT$mergeRides$1(this, continuationImpl);
        }
        Object objC = utilsKT$mergeRides$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = utilsKT$mergeRides$1.label;
        if (i3 == 0) {
            ResultKt.b(objC);
            if (list4.isEmpty()) {
                return list5;
            }
            if (list5.isEmpty()) {
                return list4;
            }
            CityAppModel cityAppModel = (CityAppModel) ((CityProvider) b.getValue()).b().getValue();
            if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                str = "";
            }
            ChaloConfigUtils chaloConfigUtils = ChaloConfigUtils.f9611a;
            utilsKT$mergeRides$1.L$0 = list4;
            utilsKT$mergeRides$1.L$1 = list5;
            utilsKT$mergeRides$1.label = 1;
            objC = chaloConfigUtils.c(str, utilsKT$mergeRides$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            List list6 = (List) utilsKT$mergeRides$1.L$1;
            List list7 = (List) utilsKT$mergeRides$1.L$0;
            ResultKt.b(objC);
            list5 = list6;
            list4 = list7;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = utilsKT$mergeRides$1.J$0;
            list3 = (List) utilsKT$mergeRides$1.L$1;
            list2 = (List) utilsKT$mergeRides$1.L$0;
            ResultKt.b(objC);
        }
        jLongValue = ((Number) objC).longValue();
        List list8 = list2;
        List listU0 = CollectionsKt.u0(list8);
        longRef = new Ref.LongRef();
        l = (Long) CollectionsKt.U(list8);
        if (l != null) {
            jLongValue2 = l.longValue();
        } else {
            jLongValue2 = -1;
        }
        longRef.element = jLongValue2;
        if (jLongValue2 != -1) {
            longRef.element = jLongValue2 + 10000;
        }
        List listU1 = CollectionsKt.u0(list3);
        arrayList2 = new ArrayList();
        z = false;
        z2 = false;
        for (Object obj2 : listU1) {
            if (z2) {
                arrayList2.add(obj2);
            } else if (((Number) obj2).longValue() <= jLongValue - j) {
                arrayList2.add(obj2);
                z2 = true;
            }
        }
        arrayList3 = new ArrayList();
        size = arrayList2.size();
        i = 0;
        while (i < size) {
            obj = arrayList2.get(i);
            i++;
            if (z) {
                arrayList3.add(obj);
            } else if (((Number) obj).longValue() <= longRef.element) {
                arrayList3.add(obj);
                z = true;
            }
        }
        return CollectionsKt.c0(arrayList3, listU0);
        long jLongValue3 = ((Number) objC).longValue();
        BasicInfoContract basicInfoContract = (BasicInfoContract) c.getValue();
        utilsKT$mergeRides$1.L$0 = list4;
        utilsKT$mergeRides$1.L$1 = list5;
        utilsKT$mergeRides$1.J$0 = jLongValue3;
        utilsKT$mergeRides$1.label = 2;
        objC = basicInfoContract.c(utilsKT$mergeRides$1);
        if (objC != coroutineSingletons) {
            list2 = list4;
            list3 = list5;
            j = jLongValue3;
            jLongValue = ((Number) objC).longValue();
            List list9 = list2;
            List listU2 = CollectionsKt.u0(list9);
            longRef = new Ref.LongRef();
            l = (Long) CollectionsKt.U(list9);
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = -1;
            }
            longRef.element = jLongValue2;
            if (jLongValue2 != -1) {
                longRef.element = jLongValue2 + 10000;
            }
            List listU3 = CollectionsKt.u0(list3);
            arrayList2 = new ArrayList();
            z = false;
            z2 = false;
            while (r3.hasNext()) {
                if (z2) {
                    arrayList2.add(obj2);
                } else if (((Number) obj2).longValue() <= jLongValue - j) {
                    arrayList2.add(obj2);
                    z2 = true;
                }
            }
            arrayList3 = new ArrayList();
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                obj = arrayList2.get(i);
                i++;
                if (z) {
                    arrayList3.add(obj);
                } else if (((Number) obj).longValue() <= longRef.element) {
                    arrayList3.add(obj);
                    z = true;
                }
            }
            return CollectionsKt.c0(arrayList3, listU2);
        }
        return coroutineSingletons;
    }
}
