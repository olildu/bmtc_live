package app.chalo.ridefeedback.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.contract.BasicInfoContract;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedback/domain/SyncPremiumBusPendingPrfEntriesUseCase;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncPremiumBusPendingPrfEntriesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9091a;
    public final BasicInfoContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ridefeedback/domain/SyncPremiumBusPendingPrfEntriesUseCase$Companion;", "", "", "TAG", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SyncPremiumBusPendingPrfEntriesUseCase(RideFeedbackRepository rideFeedbackRepository, BasicInfoContract basicInfoContract) {
        this.f9091a = rideFeedbackRepository;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ArrayList arrayList, ContinuationImpl continuationImpl) {
        SyncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1 syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1;
        if (continuationImpl instanceof SyncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1) {
            syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1 = (SyncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1) continuationImpl;
            int i = syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1.label = i - Integer.MIN_VALUE;
            } else {
                syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1 = new SyncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1(this, continuationImpl);
            }
        } else {
            syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1 = new SyncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1(this, continuationImpl);
        }
        Object obj = syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                RideFeedbackRepository rideFeedbackRepository = this.f9091a;
                syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1.label = 1;
                if (rideFeedbackRepository.h(arrayList, str, str2, syncPremiumBusPendingPrfEntriesUseCase$deleteStaleEntries$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ChaloLog.c("SyncPremiumBusPendingPrfEntriesUseCase", "Failed to delete stale PRF entries", e2);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[LOOP:1: B:41:0x00d4->B:42:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        SyncPremiumBusPendingPrfEntriesUseCase$invoke$1 syncPremiumBusPendingPrfEntriesUseCase$invoke$1;
        String str3;
        List list;
        long jLongValue;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i;
        PostRideFeedbackEntity entry;
        String str4 = str;
        String str5 = str2;
        if (continuationImpl instanceof SyncPremiumBusPendingPrfEntriesUseCase$invoke$1) {
            syncPremiumBusPendingPrfEntriesUseCase$invoke$1 = (SyncPremiumBusPendingPrfEntriesUseCase$invoke$1) continuationImpl;
            int i2 = syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1 = new SyncPremiumBusPendingPrfEntriesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            syncPremiumBusPendingPrfEntriesUseCase$invoke$1 = new SyncPremiumBusPendingPrfEntriesUseCase$invoke$1(this, continuationImpl);
        }
        Object objF = syncPremiumBusPendingPrfEntriesUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label;
        Unit unit = Unit.f17538a;
        try {
            if (i3 == 0) {
                ResultKt.b(objF);
                RideFeedbackRepository rideFeedbackRepository = this.f9091a;
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$0 = str4;
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$1 = str5;
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label = 1;
                objF = rideFeedbackRepository.f(str4, str5, syncPremiumBusPendingPrfEntriesUseCase$invoke$1);
                if (objF == obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                String str6 = (String) syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$1;
                String str7 = (String) syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$0;
                ResultKt.b(objF);
                str5 = str6;
                str4 = str7;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(objF);
                    return unit;
                }
                list = (List) syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$2;
                str5 = (String) syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$1;
                str3 = (String) syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$0;
                ResultKt.b(objF);
            }
            jLongValue = ((Number) objF).longValue();
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                entry = (PostRideFeedbackEntity) obj2;
                Intrinsics.i(entry, "entry");
                if (jLongValue - entry.i >= CalendarModelKt.MillisecondsIn24Hours) {
                    arrayList.add(obj2);
                }
            }
            arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                arrayList2.add(((PostRideFeedbackEntity) obj3).f9071a);
            }
            if (!arrayList2.isEmpty()) {
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$0 = null;
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$1 = null;
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$2 = null;
                syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label = 3;
                if (a(str3, str5, arrayList2, syncPremiumBusPendingPrfEntriesUseCase$invoke$1) == obj) {
                    return obj;
                }
            }
            return unit;
            List list2 = (List) objF;
            syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$0 = str4;
            syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$1 = str5;
            syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$2 = list2;
            syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label = 2;
            Object objC = this.b.c(syncPremiumBusPendingPrfEntriesUseCase$invoke$1);
            if (objC != obj) {
                str3 = str4;
                list = list2;
                objF = objC;
                jLongValue = ((Number) objF).longValue();
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    entry = (PostRideFeedbackEntity) obj2;
                    Intrinsics.i(entry, "entry");
                    if (jLongValue - entry.i >= CalendarModelKt.MillisecondsIn24Hours) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    arrayList2.add(((PostRideFeedbackEntity) obj4).f9071a);
                }
                if (!arrayList2.isEmpty()) {
                    syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$0 = null;
                    syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$1 = null;
                    syncPremiumBusPendingPrfEntriesUseCase$invoke$1.L$2 = null;
                    syncPremiumBusPendingPrfEntriesUseCase$invoke$1.label = 3;
                    if (a(str3, str5, arrayList2, syncPremiumBusPendingPrfEntriesUseCase$invoke$1) == obj) {
                    }
                }
                return unit;
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ChaloLog.c("SyncPremiumBusPendingPrfEntriesUseCase", "Failed to fetch pending PRF entries", e2);
            return unit;
        }
    }
}
